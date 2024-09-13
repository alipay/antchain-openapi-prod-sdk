// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.media_sms.models;

import com.aliyun.tea.*;

public class QueryReplyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 手机号列表
    @NameInMap("phone_no_list")
    @Validation(required = true)
    public java.util.List<String> phoneNoList;

    // 拓展字段
    @NameInMap("ext_info")
    public String extInfo;

    public static QueryReplyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryReplyRequest self = new QueryReplyRequest();
        return TeaModel.build(map, self);
    }

    public QueryReplyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryReplyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryReplyRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryReplyRequest setPhoneNoList(java.util.List<String> phoneNoList) {
        this.phoneNoList = phoneNoList;
        return this;
    }
    public java.util.List<String> getPhoneNoList() {
        return this.phoneNoList;
    }

    public QueryReplyRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
