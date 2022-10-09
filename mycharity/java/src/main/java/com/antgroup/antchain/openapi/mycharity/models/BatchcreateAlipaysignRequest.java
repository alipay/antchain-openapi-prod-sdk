// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mycharity.models;

import com.aliyun.tea.*;

public class BatchcreateAlipaysignRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 机构id
    @NameInMap("org_id")
    @Validation(required = true, maxLength = 50)
    public String orgId;

    // 代扣签约账号信息列表
    @NameInMap("sign_user_info_list")
    @Validation(required = true)
    public java.util.List<SignUserInfo> signUserInfoList;

    public static BatchcreateAlipaysignRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateAlipaysignRequest self = new BatchcreateAlipaysignRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateAlipaysignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateAlipaysignRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchcreateAlipaysignRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public BatchcreateAlipaysignRequest setSignUserInfoList(java.util.List<SignUserInfo> signUserInfoList) {
        this.signUserInfoList = signUserInfoList;
        return this;
    }
    public java.util.List<SignUserInfo> getSignUserInfoList() {
        return this.signUserInfoList;
    }

}
