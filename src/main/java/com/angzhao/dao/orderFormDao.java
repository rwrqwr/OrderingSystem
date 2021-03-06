package com.angzhao.dao;

import com.angzhao.entity.orderFormDetailEntity;
import com.angzhao.entity.orderFormEntity;

import java.util.List;

public interface orderFormDao {

    int updateOrderFormStatus(orderFormEntity orderForm);

    orderFormEntity queryOrderFormById(String id);

    orderFormEntity queryWaitPayOrderFormById(String id);

    List<orderFormEntity> queryOrderFormListByUserId(String userId);

    List<orderFormEntity> queryWaitPayOrderFormListByUserId(String userId);

    List<orderFormEntity> queryWaitCommentOrderFormListByUserId(String userId);

    List<orderFormDetailEntity> queryOrderFormDetailByOrderFrom(orderFormEntity orderForm);


}
