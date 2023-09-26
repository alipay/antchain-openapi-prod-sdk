// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class PullApiSimpleauthmarkRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 调用租户
    @NameInMap("inst_code")
    @Validation(required = true)
    public String instCode;

    // 请求id，用于幂等控制
    @NameInMap("biz_unique_id")
    @Validation(required = true)
    public String bizUniqueId;

    // 产品类型
    @NameInMap("auth_type")
    @Validation(required = true)
    public String authType;

    public static PullApiSimpleauthmarkRequest build(java.util.Map<String, ?> map) throws Exception {
        PullApiSimpleauthmarkRequest self = new PullApiSimpleauthmarkRequest();
        return TeaModel.build(map, self);
    }

    public PullApiSimpleauthmarkRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PullApiSimpleauthmarkRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PullApiSimpleauthmarkRequest setInstCode(String instCode) {
        this.instCode = instCode;
        return this;
    }
    public String getInstCode() {
        return this.instCode;
    }

    public PullApiSimpleauthmarkRequest setBizUniqueId(String bizUniqueId) {
        this.bizUniqueId = bizUniqueId;
        return this;
    }
    public String getBizUniqueId() {
        return this.bizUniqueId;
    }

    public PullApiSimpleauthmarkRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

}
