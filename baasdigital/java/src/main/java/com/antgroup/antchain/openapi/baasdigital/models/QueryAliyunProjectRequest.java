// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdigital.models;

import com.aliyun.tea.*;

public class QueryAliyunProjectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 蚂蚁链ID
    @NameInMap("bizid")
    @Validation(required = true, minLength = 1)
    public String bizid;

    // 项目名称
    @NameInMap("name")
    public String name;

    // 项目id
    @NameInMap("project_id")
    public String projectId;

    // 项目状态
    @NameInMap("project_status")
    public String projectStatus;

    // 创建起始日期时间戳
    @NameInMap("start_time")
    public Long startTime;

    // 创建结束时间戳
    @NameInMap("end_time")
    public Long endTime;

    // 分页页码，默认0
    @NameInMap("page_index")
    @Validation(required = true)
    public Long pageIndex;

    // 单页数量，默认10
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static QueryAliyunProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAliyunProjectRequest self = new QueryAliyunProjectRequest();
        return TeaModel.build(map, self);
    }

    public QueryAliyunProjectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAliyunProjectRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAliyunProjectRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public QueryAliyunProjectRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryAliyunProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public QueryAliyunProjectRequest setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
        return this;
    }
    public String getProjectStatus() {
        return this.projectStatus;
    }

    public QueryAliyunProjectRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryAliyunProjectRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryAliyunProjectRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public QueryAliyunProjectRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
