// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d7c024d004594db188cee2346b384a48.models;

import com.aliyun.tea.*;

public class QueryAntdigitalMediasmsMsgStatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 群发任务id
    @NameInMap("batch_task_id")
    @Validation(required = true)
    public String batchTaskId;

    // 手机号列表
    @NameInMap("phone_no_list")
    @Validation(required = true)
    public java.util.List<String> phoneNoList;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 拓展信息
    @NameInMap("ext_info")
    @Validation(required = true)
    public String extInfo;

    public static QueryAntdigitalMediasmsMsgStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntdigitalMediasmsMsgStatusRequest self = new QueryAntdigitalMediasmsMsgStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntdigitalMediasmsMsgStatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntdigitalMediasmsMsgStatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntdigitalMediasmsMsgStatusRequest setBatchTaskId(String batchTaskId) {
        this.batchTaskId = batchTaskId;
        return this;
    }
    public String getBatchTaskId() {
        return this.batchTaskId;
    }

    public QueryAntdigitalMediasmsMsgStatusRequest setPhoneNoList(java.util.List<String> phoneNoList) {
        this.phoneNoList = phoneNoList;
        return this;
    }
    public java.util.List<String> getPhoneNoList() {
        return this.phoneNoList;
    }

    public QueryAntdigitalMediasmsMsgStatusRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryAntdigitalMediasmsMsgStatusRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
