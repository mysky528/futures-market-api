package com.uma.rest;

import com.uma.model.Market;
import com.uma.service.MarketService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhaolu on 2018/3/6.
 */
@RestController
public class MarketRestServiceImpl implements MarketService {

    @Override
    public Market fetchHisMarket(@PathVariable String cycle,@PathVariable String symbolCode){

        return new Market();
    }
}
