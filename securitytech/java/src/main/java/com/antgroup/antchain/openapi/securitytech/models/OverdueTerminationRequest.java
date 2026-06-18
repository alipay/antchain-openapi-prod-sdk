// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class OverdueTerminationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 支付宝小程序用户唯一ID
    @NameInMap("open_id")
    @Validation(required = true)
    public String openId;

    // 门店ID
    @NameInMap("store_id")
    @Validation(required = true)
    public String storeId;

    // 天枢分期主订单号
    @NameInMap("biz_order_no")
    @Validation(required = true)
    public String bizOrderNo;

    // OVERDUE_ING	逾期中
    // OVERDUE_RECOVER	逾期恢复
    // OVERDUE_FREEZE	逾期冻结
    // OVERDUE_FREEZE_RECOVER	逾期冻结恢复
    // OVERDUE_TERMINATE_ING	逾期解约中
    // TERMINATED	解约完成
    @NameInMap("event")
    @Validation(required = true)
    public String event;

    public static OverdueTerminationRequest build(java.util.Map<String, ?> map) throws Exception {
        OverdueTerminationRequest self = new OverdueTerminationRequest();
        return TeaModel.build(map, self);
    }

    public OverdueTerminationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OverdueTerminationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OverdueTerminationRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public OverdueTerminationRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public OverdueTerminationRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public OverdueTerminationRequest setEvent(String event) {
        this.event = event;
        return this;
    }
    public String getEvent() {
        return this.event;
    }

}
