package service.impl;

import service.api.IWeathereService;

import javax.jws.WebService;

/**
 * @description:
 * @author: fengmenglei
 * @date: 2019/3/21
 */

public class WeatherServiceImpl implements IWeathereService {

    @Override
    public String query(String cityName) {
        return cityName+"你好";
    }
}
