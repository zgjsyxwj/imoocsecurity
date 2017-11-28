package com.imooc.web.async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MockQueue {
    private String placeOrder;
    private String completeOrder;
    Logger logger= LoggerFactory.getLogger(getClass());
    public String getPlaceOrder() {
        return placeOrder;
    }

    public void setPlaceOrder(String placeOrder) throws Exception{
        new Thread(()->{}).start();
       logger.info("接到下单请求");
        Thread.sleep(1000);
        this.completeOrder = placeOrder;
       logger.info("下单请求处理完毕："+placeOrder);
    }

    public String getCompleteOrder() {
        return completeOrder;
    }

    public void setCompleteOrder(String completeOrder) {
        this.completeOrder = completeOrder;
    }
}
