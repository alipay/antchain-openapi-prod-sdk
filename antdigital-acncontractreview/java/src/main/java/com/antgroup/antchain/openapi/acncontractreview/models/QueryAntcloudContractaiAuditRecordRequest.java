// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acncontractreview.models;

import com.aliyun.tea.*;

public class QueryAntcloudContractaiAuditRecordRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 当前页
    @NameInMap("page_no")
    @Validation(required = true)
    public Long pageNo;

    // 页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 合同名称
    @NameInMap("contract_file_name")
    public String contractFileName;

    // 开始时间
    @NameInMap("create_start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createStartTime;

    // 结束时间
    @NameInMap("create_end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createEndTime;

    // PROCESSING：合同审核任务已提交，正在异步处理中
    // SUCCESS：合同审核已完成，结果可查询
    // FAIL：合同审核过程中发生错误，审核失败
    // FINALIZED：合同已完成定稿操作，生成最终版本
    @NameInMap("status")
    public String status;

    // 创建人id
    @NameInMap("creator_work_no")
    public String creatorWorkNo;

    // 创建人名称
    @NameInMap("creator_name")
    public String creatorName;

    // 基准线库名称
    @NameInMap("baseline_library_name")
    public String baselineLibraryName;

    // 终端客户id
    @NameInMap("end_customer_id")
    public String endCustomerId;

    public static QueryAntcloudContractaiAuditRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudContractaiAuditRecordRequest self = new QueryAntcloudContractaiAuditRecordRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudContractaiAuditRecordRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntcloudContractaiAuditRecordRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryAntcloudContractaiAuditRecordRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryAntcloudContractaiAuditRecordRequest setContractFileName(String contractFileName) {
        this.contractFileName = contractFileName;
        return this;
    }
    public String getContractFileName() {
        return this.contractFileName;
    }

    public QueryAntcloudContractaiAuditRecordRequest setCreateStartTime(String createStartTime) {
        this.createStartTime = createStartTime;
        return this;
    }
    public String getCreateStartTime() {
        return this.createStartTime;
    }

    public QueryAntcloudContractaiAuditRecordRequest setCreateEndTime(String createEndTime) {
        this.createEndTime = createEndTime;
        return this;
    }
    public String getCreateEndTime() {
        return this.createEndTime;
    }

    public QueryAntcloudContractaiAuditRecordRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryAntcloudContractaiAuditRecordRequest setCreatorWorkNo(String creatorWorkNo) {
        this.creatorWorkNo = creatorWorkNo;
        return this;
    }
    public String getCreatorWorkNo() {
        return this.creatorWorkNo;
    }

    public QueryAntcloudContractaiAuditRecordRequest setCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }
    public String getCreatorName() {
        return this.creatorName;
    }

    public QueryAntcloudContractaiAuditRecordRequest setBaselineLibraryName(String baselineLibraryName) {
        this.baselineLibraryName = baselineLibraryName;
        return this;
    }
    public String getBaselineLibraryName() {
        return this.baselineLibraryName;
    }

    public QueryAntcloudContractaiAuditRecordRequest setEndCustomerId(String endCustomerId) {
        this.endCustomerId = endCustomerId;
        return this;
    }
    public String getEndCustomerId() {
        return this.endCustomerId;
    }

}
