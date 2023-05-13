# Mac安装Vue环境

- 使用brew安装notejs

```shell
brew install node@18 
```

- 查看版本

```shell
node -v
```

- nodejs模块安装目录访问权限

```shell
sudo chmod -R 777 /usr/local/lib/node_modules/
```

- 查看npm版本

npm是随同nodejs一起安装的包管理工具，npm默认的仓库地址为[http://registry.npmjs.org](https://link.zhihu.com/?target=http%3A//registry.npmjs.org/)

```shell
npm -v
```

- 安装淘宝cnpm

淘宝为我们搭建了一个国内的npm服务器，它目前是每隔10分钟将国外npm仓库的所有内容“搬运”回国内的服务器上，这样我们直接访问淘宝的国内服务器就可以了，它的地址是：[https://registry.npm.taobao.org](https://link.zhihu.com/?target=https%3A//registry.npm.taobao.org/)

```shell
npm install -g cnpm --registry=https://registry.npm.taobao.org
```

- 安装webpack

```shell
cnpm install webpack -g
```

- 安装开发环境依赖

```shell
npm i @vue/cli-service
```

- 安装vue脚手架

```shell
cnpm install vue-cli -g
```

# 命令

- vue-cli创建vue项目，使用vue ui图形化界面来进行创建文件以及安装一些我们需要的依赖等。

- webpack创建vue项目（推荐）

```vue
vue init webpack 工程名字<工程名字不能用中文>
```

```vue
? Project name vue2-study  #项目名称
? Project description A Vue.js project #项目描述
? Author 邓志鸿 <1353976012@qq.com> #作者
? Vue build standalone
? Install vue-router? Yes #是否需要vue-router
? Use ESLint to lint your code? No   --是否开启ESLint严格模式
? Set up unit tests No #是否安装单元测试
? Setup e2e tests with Nightwatch? No #是否设置e2e测试
? Should we run `npm install` for you after the project has been created? (recom
mended) npm
```

- 初始化项目，下载依赖生成node_modules目录

```shell
cnpm i
```

- 启动

```shell
npm run dev
```

