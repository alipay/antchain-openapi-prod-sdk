// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryOperationlogTimelineRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // customer_id
    @NameInMap("customer_id")
    public String customerId;

    // gmt_from
    @NameInMap("gmt_from")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String gmtFrom;

    // gmt_to
    @NameInMap("gmt_to")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String gmtTo;

    // module
    @NameInMap("module")
    public String module;

    // operation_status
    @NameInMap("operation_status")
    public String operationStatus;

    // operation_target
    @NameInMap("operation_target")
    public String operationTarget;

    // operation_type
    @NameInMap("operation_type")
    public String operationType;

    // operator_id
    @NameInMap("operator_id")
    public String operatorId;

    // page_no
    @NameInMap("page_no")
    public Long pageNo;

    // page_size
    @NameInMap("page_size")
    public Long pageSize;

    // status
    @NameInMap("status")
    public String status;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static QueryOperationlogTimelineRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOperationlogTimelineRequest self = new QueryOperationlogTimelineRequest();
        return TeaModel.build(map, self);
    }

    public QueryOperationlogTimelineRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryOperationlogTimelineRequest setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public QueryOperationlogTimelineRequest setGmtFrom(String gmtFrom) {
        this.gmtFrom = gmtFrom;
        return this;
    }
    public String getGmtFrom() {
        return this.gmtFrom;
    }

    public QueryOperationlogTimelineRequest setGmtTo(String gmtTo) {
        this.gmtTo = gmtTo;
        return this;
    }
    public String getGmtTo() {
        return this.gmtTo;
    }

    public QueryOperationlogTimelineRequest setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public QueryOperationlogTimelineRequest setOperationStatus(String operationStatus) {
        this.operationStatus = operationStatus;
        return this;
    }
    public String getOperationStatus() {
        return this.operationStatus;
    }

    public QueryOperationlogTimelineRequest setOperationTarget(String operationTarget) {
        this.operationTarget = operationTarget;
        return this;
    }
    public String getOperationTarget() {
        return this.operationTarget;
    }

    public QueryOperationlogTimelineRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public QueryOperationlogTimelineRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public QueryOperationlogTimelineRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryOperationlogTimelineRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryOperationlogTimelineRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryOperationlogTimelineRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
