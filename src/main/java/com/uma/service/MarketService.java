package com.uma.service;

import com.uma.model.Market;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 期货行情服务接口
 *
 * Created by zhaolu on 2018/3/6.
 */
@RequestMapping(value="/market")
public interface MarketService {

    /**
     * 获得期货历史行情
     *
     * @return
     */
    @RequestMapping(value="/{cycle}/{symbolCode}",method = RequestMethod.GET)
    Market fetchHisMarket(@PathVariable String cycle, @PathVariable String symbolCode);
}
