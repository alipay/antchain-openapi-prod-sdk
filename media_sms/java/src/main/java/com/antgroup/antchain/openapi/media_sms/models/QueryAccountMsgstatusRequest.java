// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.media_sms.models;

import com.aliyun.tea.*;

public class QueryAccountMsgstatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 扩展信息
    @NameInMap("ext_info")
    public String extInfo;

    public static QueryAccountMsgstatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountMsgstatusRequest self = new QueryAccountMsgstatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryAccountMsgstatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAccountMsgstatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAccountMsgstatusRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryAccountMsgstatusRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
