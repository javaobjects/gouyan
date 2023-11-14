module.exports = {
    devServer: {
        port: 8888
    },
    publicPath:process.env.NODE_ENV === 'production'?'/gouyan-ui':'/',
    chainWebpack: config => {
        // 设置页面标题
        config.plugin('html').tap(args => {
            args[0].title = '狗眼电影后台管理系统'; // 在这里设置你想要的标题
            return args;
        });
    }
}