// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class SubmitApiSimpleauthmarkRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 打标之后的结果
    @NameInMap("identity_group_list")
    @Validation(required = true)
    public java.util.List<IdentityIdGroup> identityGroupList;

    // 产品类型
    @NameInMap("auth_type")
    public String authType;

    public static SubmitApiSimpleauthmarkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitApiSimpleauthmarkRequest self = new SubmitApiSimpleauthmarkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitApiSimpleauthmarkRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitApiSimpleauthmarkRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitApiSimpleauthmarkRequest setIdentityGroupList(java.util.List<IdentityIdGroup> identityGroupList) {
        this.identityGroupList = identityGroupList;
        return this;
    }
    public java.util.List<IdentityIdGroup> getIdentityGroupList() {
        return this.identityGroupList;
    }

    public SubmitApiSimpleauthmarkRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

}
