// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class ListLibraryTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 知识库ID
    @NameInMap("library_id")
    @Validation(required = true)
    public Long libraryId;

    // 任务类型列表
    @NameInMap("task_type")
    public java.util.List<String> taskType;

    // 任务ID
    @NameInMap("task_id")
    public Long taskId;

    // 页码
    @NameInMap("page_num")
    public String pageNum;

    // 分页大小
    @NameInMap("page_size")
    public String pageSize;

    public static ListLibraryTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLibraryTaskRequest self = new ListLibraryTaskRequest();
        return TeaModel.build(map, self);
    }

    public ListLibraryTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListLibraryTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListLibraryTaskRequest setLibraryId(Long libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public Long getLibraryId() {
        return this.libraryId;
    }

    public ListLibraryTaskRequest setTaskType(java.util.List<String> taskType) {
        this.taskType = taskType;
        return this;
    }
    public java.util.List<String> getTaskType() {
        return this.taskType;
    }

    public ListLibraryTaskRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public ListLibraryTaskRequest setPageNum(String pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public String getPageNum() {
        return this.pageNum;
    }

    public ListLibraryTaskRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
