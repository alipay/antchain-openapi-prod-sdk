// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class CallbackAuthDataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权token
    @NameInMap("authorized_token")
    @Validation(required = true)
    public String authorizedToken;

    // 数据详情 JSONObject
    @NameInMap("data_detail")
    @Validation(required = true)
    public String dataDetail;

    // 授权内容/数据类型
    @NameInMap("data_type")
    @Validation(required = true)
    public String dataType;

    public static CallbackAuthDataRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackAuthDataRequest self = new CallbackAuthDataRequest();
        return TeaModel.build(map, self);
    }

    public CallbackAuthDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackAuthDataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CallbackAuthDataRequest setAuthorizedToken(String authorizedToken) {
        this.authorizedToken = authorizedToken;
        return this;
    }
    public String getAuthorizedToken() {
        return this.authorizedToken;
    }

    public CallbackAuthDataRequest setDataDetail(String dataDetail) {
        this.dataDetail = dataDetail;
        return this;
    }
    public String getDataDetail() {
        return this.dataDetail;
    }

    public CallbackAuthDataRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

}
