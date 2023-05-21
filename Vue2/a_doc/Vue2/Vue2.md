# 一.介绍

Vue 是一个现代 JavaScript 框架提供了有用的设施渐进增强——不像许多其他框架，你可以使用 Vue 增强现有的 HTML。这使你可以使用 Vue 作为 jQuery 等库的直接替代品。

Vue 组件设计成为由管理应用数据的 JavaScript 对象和映射到底层 DOM 结构的 html 模板语法组成的混合体。安装和使用的一些更高级的功能 Vue（如单文件组件或渲染函数），你将需要一个安装了 `node` 和 `npm` 的终端。

环境：

1. NodeJs：Javascript运行环境，不同系统不能直接运行各种编程语言，Runtime类类似于各种国际会议上的同声传译。
2. npm：NodeJs下的包管理器。
3. webpack：是一个用于现代 JavaScript 应用程序的静态模块打包工具。
4. vue-cli：项目脚手架，用于快速生成一个 vue 的项目模板。预先定义好的目录结构及基础代码。

**特点**：

1. **数据绑定**：比如你改变一个输入框 Input 标签的值，会自动同步更新到页面上其他绑定该输入框的组件的值。

2. **组件化**：页面上小到一个按钮都可以是一个单独的文件.vue，这些小组件直接可以像乐高积木一样通过互相引用而组装起来。

   ![1476690177-7476-854231-5eeceaec4c7e80ed](assist/1476690177-7476-854231-5eeceaec4c7e80ed.jpg)

# 二.项目结构

- `build`：项目构建(webpack)相关配置文件，配置参数什么的
  - build.js ：webpack打包配置文件
  - check-versions.js ：检查npm,nodejs版本
  - dev-client.js ：设置环境
  - dev-server.js ：创建express服务器，配置中间件，启动可热重载的服务器，用于开发项目
  - utils.js ：配置资源路径，配置css加载器
  - vue-loader.conf.js ：配置css加载器等
  - webpack.base.conf.js ：webpack基本配置
  - webpack.dev.conf.js ：用于开发的webpack设置
  - webpack.prod.conf.js ：用于打包的webpack设置

- `node_modules`：npm或yarn下载的依赖包
- `dist`：我们打包后生成的文件夹
- `public`：用于存放公共js文件夹、json文件和图片等
- `src`：我们的开发的页面文件所放的文件夹
  - assets：静态资源文件夹，如果图片放在这里是不能通过v-for标签渲染到页面上的
  - components：此项目公共组件
  - router：vueRouter
  - main.js：入口文件
  - App.vue：**根组件**，项目入口组件，我们也可以直接将组件写这里
- `config`：配置目录，包括端口号等。我们初学可以使用默认的。 
  - dev.env.js：开发环境变量
  - index.js：项目配置文件
  - prod.env.js：生产环境变量
  - test.env.js：测试环境变量
- `static`：静态资源目录，如图片、字体等。
- `index.html`：首页，项目入口文件，你可以添加一些 meta 信息或统计代码啥的。
- `package.json`：node配置文件，记载着一些命令和依赖还有简要的项目描述信息
- `.babelrc`：babel配置文件
- `.editorconfig`：编辑器配置
- `.eslintignore`：配置需要或略的路径，一般build、config、dist、test等目录都会配置忽略
- `.eslintrc.js`：配置代码格式风格检查规则
- `.gitignore`：配置git可忽略的文件
- `.postcssrc.js`：css转换工具

在webpack的配置文件里，设置了main.js是入口文件，我们的项目默认访问index.html，这个文件里面`<div id="app"></div>`和App.vue组件里面的容器完美的重合了，也就是把组件挂载到了index页面，然后我们只需要去建设其他组件就好了，在App组件中我们也可以引入，注册，应用其他组件，可以通过路由将其他组件渲染在App组件，这样我们就只需要去关注每个组件的功能完善。

打开 `App.vue` 文件，可以看到由 `<template>`、`<script>` 和 `<style>` 三部分组成，分别包含了组件的模板、脚本和样式相关的内容。所有的单文件组件都是这种类似的基本结构。

- `<template>` 包含了所有的标记结构和组件的展示逻辑。template 可以包含任何合法的 HTML，以及一些我们接下来要讲的 Vue 特定的语法。Vue 模板目前只允许一个根元素。
- `<script>`标签需要默认导出一个 JS 对象。该对象是你在本地注册组件、定义属性、处理本地状态、定义方法等的地方。在构建阶段这个包含 template 模板的对象会被处理和转换成为一个有 render() 函数的 Vue 组件。

# 三.Vue渲染机制

MVVM双向数据绑定：

- model业务层：业务层负责管理数据
- view视图层：视图层负责页面渲染
- view-model绑定层：绑定层负责双向绑定，即视图层操作通过绑定层影响业务数据，业务数据的变化通过绑定层影响视图渲染

![20200906190737368](assist/20200906190737368.png)

# 四.Vue生命周期

Vue实例从创建 到销毁的过程 ，这些过程中会伴随着一些函数的自调用。我们称这些函数为钩子函数

| beforeCreate  | 在实例初始化之后，数据观测和事件配置之前被调用 此时data 和 methods 以及页面的DOM结构都没有初始化   什么都做不了 |
| ------------- | ------------------------------------------------------------ |
| created       | 在实例创建完成后被立即调用此时data 和 methods已经可以使用  但是页面还没有渲染出来 |
| beforeMount   | 在挂载开始之前被调用   此时页面上还看不到真实数据 只是一个模板页面而已 |
| mounted       | el被新创建的vm.$el替换，并挂载到实例上去之后调用该钩子。  数据已经真实渲染到页面上  在这个钩子函数里面我们可以使用一些第三方的插件 |
| beforeUpdate  | 数据更新时调用，发生在虚拟DOM打补丁之前。   页面上数据还是旧的 |
| updated       | 由于数据更改导致的虚拟DOM重新渲染和打补丁，在这之后会调用该钩子。 页面上数据已经替换成最新的 |
| beforeDestroy | 实例销毁之前调用                                             |
| destroyed     | 实例销毁后调用                                               |

![522a15811dbc4a4390a3842b19882bda](assist/522a15811dbc4a4390a3842b19882bda.png)


