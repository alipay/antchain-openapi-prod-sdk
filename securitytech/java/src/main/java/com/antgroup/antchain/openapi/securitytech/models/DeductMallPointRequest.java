// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class DeductMallPointRequest extends TeaModel {
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

    // 账户ID
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 订单号列表
    @NameInMap("order_id_list")
    @Validation(required = true)
    public java.util.List<String> orderIdList;

    public static DeductMallPointRequest build(java.util.Map<String, ?> map) throws Exception {
        DeductMallPointRequest self = new DeductMallPointRequest();
        return TeaModel.build(map, self);
    }

    public DeductMallPointRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeductMallPointRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeductMallPointRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public DeductMallPointRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public DeductMallPointRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public DeductMallPointRequest setOrderIdList(java.util.List<String> orderIdList) {
        this.orderIdList = orderIdList;
        return this;
    }
    public java.util.List<String> getOrderIdList() {
        return this.orderIdList;
    }

}
