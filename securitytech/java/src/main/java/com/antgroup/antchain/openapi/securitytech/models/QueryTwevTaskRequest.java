// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryTwevTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 任务ID。和tuid二选一
    @NameInMap("task_id")
    public String taskId;

    // 智能中控ID，和任务ID二选一
    @NameInMap("tuid")
    public String tuid;

    // json，扩展预留
    @NameInMap("extern_info")
    @Validation(required = true)
    public String externInfo;

    public static QueryTwevTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTwevTaskRequest self = new QueryTwevTaskRequest();
        return TeaModel.build(map, self);
    }

    public QueryTwevTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTwevTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryTwevTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public QueryTwevTaskRequest setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public QueryTwevTaskRequest setExternInfo(String externInfo) {
        this.externInfo = externInfo;
        return this;
    }
    public String getExternInfo() {
        return this.externInfo;
    }

}
