// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class ExecApiSimpleauthmarkRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户号
    @NameInMap("inst_code")
    @Validation(required = true)
    public String instCode;

    // 请求id
    @NameInMap("biz_unique_id")
    @Validation(required = true)
    public String bizUniqueId;

    // 产品类型
    @NameInMap("auth_type")
    @Validation(required = true)
    public String authType;

    // 申请打标的税号
    @NameInMap("identity_id_list")
    @Validation(required = true)
    public java.util.List<IdentityInfo> identityIdList;

    public static ExecApiSimpleauthmarkRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecApiSimpleauthmarkRequest self = new ExecApiSimpleauthmarkRequest();
        return TeaModel.build(map, self);
    }

    public ExecApiSimpleauthmarkRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecApiSimpleauthmarkRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecApiSimpleauthmarkRequest setInstCode(String instCode) {
        this.instCode = instCode;
        return this;
    }
    public String getInstCode() {
        return this.instCode;
    }

    public ExecApiSimpleauthmarkRequest setBizUniqueId(String bizUniqueId) {
        this.bizUniqueId = bizUniqueId;
        return this;
    }
    public String getBizUniqueId() {
        return this.bizUniqueId;
    }

    public ExecApiSimpleauthmarkRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public ExecApiSimpleauthmarkRequest setIdentityIdList(java.util.List<IdentityInfo> identityIdList) {
        this.identityIdList = identityIdList;
        return this;
    }
    public java.util.List<IdentityInfo> getIdentityIdList() {
        return this.identityIdList;
    }

}
