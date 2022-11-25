// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdigital.models;

import com.aliyun.tea.*;

public class OpenAliyunServiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 联盟ID
    @NameInMap("consortium_id")
    @Validation(required = true, minLength = 1)
    public String consortiumId;

    // 蚂蚁链ID
    @NameInMap("bizid")
    @Validation(required = true, minLength = 1)
    public String bizid;

    public static OpenAliyunServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenAliyunServiceRequest self = new OpenAliyunServiceRequest();
        return TeaModel.build(map, self);
    }

    public OpenAliyunServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OpenAliyunServiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OpenAliyunServiceRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public OpenAliyunServiceRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

}
