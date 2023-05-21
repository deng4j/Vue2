const path = require('path')   //调用路径
const HtmlWebpackPlugin = require('html-webpack-plugin')  //引入打包html的插件

module.exports = {
        mode:"development",
        entry: './src/index.js',    //入口文件
        output: {
          filename: 'main.js',    //输出文件名
          path:path.resolve(__dirname,'./dist') //指定生成的文件目录
        },
        // 插件
        plugins: [
          // html 
          new HtmlWebpackPlugin({
            template:  path.resolve(__dirname, './src/pages/index.html'), //文件模板
            filename:'index.html',  //输出文件名
          }),
        ],
        module: {
          rules: [
            {
              test:/\.css$/,    //css配置
              use: [ 'style-loader', 'css-loader' ]  //注意
            }
          ]
        },
    }