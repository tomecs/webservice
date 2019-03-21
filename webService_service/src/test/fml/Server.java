package fml;

import service.impl.WeatherServiceImpl;

import javax.xml.ws.Endpoint;

/**
 * @description: 服务端
 * @author: fengmenglei
 * @date: 2019/3/21
 */
public class Server {

    public static void main(String[] args) {
        Endpoint.publish("http://192.168.17.10:8078/weather", new WeatherServiceImpl());
        System.out.println("发布成功");
    }

}
