// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryTwevCarRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id（tuid+brandId与orderid条件必填。orderid为空时，tuid+brandId必填。orderId不为空时优先使用orderId）
    @NameInMap("order_id")
    public String orderId;

    // 车辆中控号 （tuid+brandId与orderid条件必填。orderid为空时，tuid+brandId必填。orderId不为空时优先使用orderId）
    @NameInMap("tuid")
    public String tuid;

    // 品牌id（tuid+brandId与orderid条件必填。orderid为空时，tuid+brandId必填。orderId不为空时优先使用orderId）
    @NameInMap("brand_id")
    public String brandId;

    // 预留扩展字段 json
    @NameInMap("extra_info")
    public String extraInfo;

    public static QueryTwevCarRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTwevCarRequest self = new QueryTwevCarRequest();
        return TeaModel.build(map, self);
    }

    public QueryTwevCarRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTwevCarRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryTwevCarRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryTwevCarRequest setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public QueryTwevCarRequest setBrandId(String brandId) {
        this.brandId = brandId;
        return this;
    }
    public String getBrandId() {
        return this.brandId;
    }

    public QueryTwevCarRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

}
