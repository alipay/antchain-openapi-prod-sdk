// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aigc.models;

import com.aliyun.tea.*;

public class QueryVideotranslateQuerytaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 任务ID
    @NameInMap("task_id")
    @Validation(required = true)
    public Long taskId;

    // 子任务ID，不传则查询所有子任务
    @NameInMap("sub_task_id")
    public Long subTaskId;

    public static QueryVideotranslateQuerytaskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryVideotranslateQuerytaskRequest self = new QueryVideotranslateQuerytaskRequest();
        return TeaModel.build(map, self);
    }

    public QueryVideotranslateQuerytaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryVideotranslateQuerytaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryVideotranslateQuerytaskRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public QueryVideotranslateQuerytaskRequest setSubTaskId(Long subTaskId) {
        this.subTaskId = subTaskId;
        return this;
    }
    public Long getSubTaskId() {
        return this.subTaskId;
    }

}
