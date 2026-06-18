// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class OverduePoiTerminationRequest extends TeaModel {
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

    // 分期主订单号
    @NameInMap("biz_order_no")
    @Validation(required = true)
    public String bizOrderNo;

    // 逾期事件类型
    @NameInMap("event")
    @Validation(required = true)
    public String event;

    // 渠道Code
    @NameInMap("channel_code")
    @Validation(required = true)
    public String channelCode;

    public static OverduePoiTerminationRequest build(java.util.Map<String, ?> map) throws Exception {
        OverduePoiTerminationRequest self = new OverduePoiTerminationRequest();
        return TeaModel.build(map, self);
    }

    public OverduePoiTerminationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OverduePoiTerminationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OverduePoiTerminationRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public OverduePoiTerminationRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public OverduePoiTerminationRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public OverduePoiTerminationRequest setEvent(String event) {
        this.event = event;
        return this;
    }
    public String getEvent() {
        return this.event;
    }

    public OverduePoiTerminationRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

}
