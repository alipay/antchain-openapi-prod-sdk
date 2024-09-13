// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.media_sms.models;

import com.aliyun.tea.*;

public class QueryMsgStatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 创建批量发送任务
    // 时返回的批量发送
    // 任务id
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
    public String extInfo;

    public static QueryMsgStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMsgStatusRequest self = new QueryMsgStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryMsgStatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMsgStatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMsgStatusRequest setBatchTaskId(String batchTaskId) {
        this.batchTaskId = batchTaskId;
        return this;
    }
    public String getBatchTaskId() {
        return this.batchTaskId;
    }

    public QueryMsgStatusRequest setPhoneNoList(java.util.List<String> phoneNoList) {
        this.phoneNoList = phoneNoList;
        return this;
    }
    public java.util.List<String> getPhoneNoList() {
        return this.phoneNoList;
    }

    public QueryMsgStatusRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryMsgStatusRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
