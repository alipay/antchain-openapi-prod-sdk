// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d7c024d004594db188cee2346b384a48.models;

import com.aliyun.tea.*;

public class QueryAntdigitalMediasmsReplyRequest extends TeaModel {
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

    public static QueryAntdigitalMediasmsReplyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntdigitalMediasmsReplyRequest self = new QueryAntdigitalMediasmsReplyRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntdigitalMediasmsReplyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntdigitalMediasmsReplyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntdigitalMediasmsReplyRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryAntdigitalMediasmsReplyRequest setPhoneNoList(java.util.List<String> phoneNoList) {
        this.phoneNoList = phoneNoList;
        return this;
    }
    public java.util.List<String> getPhoneNoList() {
        return this.phoneNoList;
    }

    public QueryAntdigitalMediasmsReplyRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
