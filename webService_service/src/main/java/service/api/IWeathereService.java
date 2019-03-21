package service.api;

import javax.jws.WebService;

/**
 * @description:
 * @author: fengmenglei
 * @date: 2019/3/21
 */
public interface IWeathereService {

    String query(String cityName);
}
