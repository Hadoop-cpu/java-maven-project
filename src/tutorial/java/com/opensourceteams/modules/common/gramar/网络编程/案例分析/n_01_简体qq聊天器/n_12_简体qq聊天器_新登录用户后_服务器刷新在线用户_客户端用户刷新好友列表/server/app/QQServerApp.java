package com.opensourceteams.modules.common.gramar.网络编程.案例分析.n_01_简体qq聊天器.n_12_简体qq聊天器_新登录用户后_服务器刷新在线用户_客户端用户刷新好友列表.server.app;


import com.opensourceteams.modules.common.gramar.网络编程.案例分析.n_01_简体qq聊天器.n_12_简体qq聊天器_新登录用户后_服务器刷新在线用户_客户端用户刷新好友列表.server.control.QQServer;

/**
 * 开发者:刘文  Email:372065525@qq.com
 * 16/3/17  上午3:41
 * 功能描述:
 */

public class QQServerApp {

    public static void main(String[] args) {

        QQServer qqServer =  QQServer.getInstance();
        qqServer.start(1234);
        //QQMainWindow qqMainWindow = QQMainWindow.getInstance();

        System.out.println("qq 服务器关闭");

    }
}
