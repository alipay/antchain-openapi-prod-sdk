// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ListAuthTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 任务名称/任务id/自有id 模糊搜索
    @NameInMap("task_name")
    public String taskName;

    // 页码，默认是0开始
    @NameInMap("page_no")
    @Validation(required = true)
    public Long pageNo;

    // 每页大小，默认是6
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 操作人列表
    @NameInMap("operators")
    public java.util.List<String> operators;

    public static ListAuthTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthTaskRequest self = new ListAuthTaskRequest();
        return TeaModel.build(map, self);
    }

    public ListAuthTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListAuthTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListAuthTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public ListAuthTaskRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListAuthTaskRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAuthTaskRequest setOperators(java.util.List<String> operators) {
        this.operators = operators;
        return this;
    }
    public java.util.List<String> getOperators() {
        return this.operators;
    }

}
