// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdigital.models;

import com.aliyun.tea.*;

public class DetailAliyunServiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 蚂蚁链ID
    @NameInMap("bizid")
    @Validation(required = true, minLength = 1)
    public String bizid;

    public static DetailAliyunServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailAliyunServiceRequest self = new DetailAliyunServiceRequest();
        return TeaModel.build(map, self);
    }

    public DetailAliyunServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DetailAliyunServiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DetailAliyunServiceRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

}
