// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
// 导入全局样式表
import "./assets/css/global.css"
import "./plugins/element"
// 导入字体图标
import './assets/fonts/iconfont.css'
import axios from 'axios'

Vue.config.productionTip = false
// 挂载axios
Vue.prototype.$http = axios;
// 配置请求的跟路径
axios.defaults.baseURL = 'http://localhost:8888/private/v1/'
// 通过添加axios请求拦截器来添加token，以保证拥有获取数据的权限
axios.interceptors.request.use(config => {
  // console.log(config)
  config.headers.Authorization = window.sessionStorage.getItem('token')
  // 在最后必须 return config
  return config
})

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
