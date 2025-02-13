// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QuerySimSkuRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备编号
    @NameInMap("device_id")
    @Validation(required = true)
    public String deviceId;

    // 车辆SN，与skuId二选一
    @NameInMap("sn")
    public String sn;

    // sku对外id列表，与sn二选一
    @NameInMap("sku_id_list")
    public java.util.List<String> skuIdList;

    // 登录态token
    @NameInMap("token")
    @Validation(required = true)
    public String token;

    public static QuerySimSkuRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySimSkuRequest self = new QuerySimSkuRequest();
        return TeaModel.build(map, self);
    }

    public QuerySimSkuRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySimSkuRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySimSkuRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public QuerySimSkuRequest setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

    public QuerySimSkuRequest setSkuIdList(java.util.List<String> skuIdList) {
        this.skuIdList = skuIdList;
        return this;
    }
    public java.util.List<String> getSkuIdList() {
        return this.skuIdList;
    }

    public QuerySimSkuRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
