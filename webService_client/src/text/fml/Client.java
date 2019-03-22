package fml;

import org.apache.cxf.jaxws.JaxWsClientFactoryBean;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import service.api.IWeathereService;

/**
 * @description: webService 客户端
 * @author: fengmenglei
 * @date: 2019/3/22
 */
public class Client {
    public static void main(String[] args) {
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(IWeathereService.class);
        factory.setAddress("http://192.168.17.10:8078/ws/?wsdl");

        IWeathereService service = (IWeathereService) factory.create();
        // 调用接口
        String cityWeather = service.query("杭州");
        System.out.printf(cityWeather);
    }
}
