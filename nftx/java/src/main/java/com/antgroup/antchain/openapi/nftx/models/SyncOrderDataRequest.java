// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftx.models;

import com.aliyun.tea.*;

public class SyncOrderDataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 接入方的订单号
    @NameInMap("external_order_no")
    @Validation(required = true)
    public String externalOrderNo;

    // 目前支持两种状态 PAID、PAY_CANCEL 
    @NameInMap("external_order_status")
    @Validation(required = true)
    public String externalOrderStatus;

    // 鲸探开放平台订单号
    @NameInMap("open_order_no")
    public String openOrderNo;

    // 鲸探授权的用户加密的uid
    @NameInMap("open_user_id")
    @Validation(required = true)
    public String openUserId;

    // 同步改状态时的事件毫秒时间戳
    @NameInMap("update_time")
    @Validation(required = true)
    public Long updateTime;

    public static SyncOrderDataRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncOrderDataRequest self = new SyncOrderDataRequest();
        return TeaModel.build(map, self);
    }

    public SyncOrderDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncOrderDataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncOrderDataRequest setExternalOrderNo(String externalOrderNo) {
        this.externalOrderNo = externalOrderNo;
        return this;
    }
    public String getExternalOrderNo() {
        return this.externalOrderNo;
    }

    public SyncOrderDataRequest setExternalOrderStatus(String externalOrderStatus) {
        this.externalOrderStatus = externalOrderStatus;
        return this;
    }
    public String getExternalOrderStatus() {
        return this.externalOrderStatus;
    }

    public SyncOrderDataRequest setOpenOrderNo(String openOrderNo) {
        this.openOrderNo = openOrderNo;
        return this;
    }
    public String getOpenOrderNo() {
        return this.openOrderNo;
    }

    public SyncOrderDataRequest setOpenUserId(String openUserId) {
        this.openUserId = openUserId;
        return this;
    }
    public String getOpenUserId() {
        return this.openUserId;
    }

    public SyncOrderDataRequest setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

}
