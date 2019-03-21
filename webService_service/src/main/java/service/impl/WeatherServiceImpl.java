package service.impl;

import service.api.IWeathereService;

import javax.jws.WebService;

/**
 * @description:
 * @author: fengmenglei
 * @date: 2019/3/21
 */
@WebService
public class WeatherServiceImpl implements IWeathereService {

    @Override
    public String query(String cityName) {
        return null;
    }
}
