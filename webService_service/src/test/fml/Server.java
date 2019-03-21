package fml;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.security.JAASLoginInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.apache.cxf.jaxws.handler.logical.LogicalHandlerInInterceptor;
import service.impl.WeatherServiceImpl;

import javax.xml.ws.Endpoint;

/**
 * @description: 服务端
 * @author: fengmenglei
 * @date: 2019/3/21
 */
public class Server {

    public static void main(String[] args) {

        // 设置发布服务的工厂
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
        // 设置服务地址
        factory.setAddress("http://192.168.17.10:8078/ws/");

        // 设置服务类
        factory.setServiceBean(new WeatherServiceImpl());

        // 添加日志输入输出拦截器
        factory.getInInterceptors().add(new JAASLoginInterceptor());
        factory.getOutInterceptors().add(new JAASLoginInterceptor());
        // 发布服务
        factory.create();
        System.out.println("发布成功");
    }

}
