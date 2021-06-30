// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class BatchqueryIpApprovalwithupdateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础字段
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // ip名称
    @NameInMap("ip_name")
    public String ipName;

    // ip的id
    @NameInMap("ip_id")
    public String ipId;

    // ip审批状态 0待审批，1 审批通过，2 审批拒绝
    @NameInMap("approval_status")
    public Long approvalStatus;

    // 分页
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 分页
    @NameInMap("page_index")
    @Validation(required = true)
    public Long pageIndex;

    // ip类型
    @NameInMap("ip_type")
    public String ipType;

    // 受众人群
    @NameInMap("audience_group")
    public String audienceGroup;

    // 开始时间
    @NameInMap("create_begin_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createBeginTime;

    // 结束时间
    @NameInMap("create_end_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createEndTime;

    // 商品的链上租户id	
    @NameInMap("account_id")
    public String accountId;

    // 是否需要按照创建时间倒序排序
    // 
    @NameInMap("is_create_time_sort_desc")
    @Validation(required = true)
    public Boolean isCreateTimeSortDesc;

    public static BatchqueryIpApprovalwithupdateRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryIpApprovalwithupdateRequest self = new BatchqueryIpApprovalwithupdateRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryIpApprovalwithupdateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryIpApprovalwithupdateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchqueryIpApprovalwithupdateRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public BatchqueryIpApprovalwithupdateRequest setIpName(String ipName) {
        this.ipName = ipName;
        return this;
    }
    public String getIpName() {
        return this.ipName;
    }

    public BatchqueryIpApprovalwithupdateRequest setIpId(String ipId) {
        this.ipId = ipId;
        return this;
    }
    public String getIpId() {
        return this.ipId;
    }

    public BatchqueryIpApprovalwithupdateRequest setApprovalStatus(Long approvalStatus) {
        this.approvalStatus = approvalStatus;
        return this;
    }
    public Long getApprovalStatus() {
        return this.approvalStatus;
    }

    public BatchqueryIpApprovalwithupdateRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public BatchqueryIpApprovalwithupdateRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public BatchqueryIpApprovalwithupdateRequest setIpType(String ipType) {
        this.ipType = ipType;
        return this;
    }
    public String getIpType() {
        return this.ipType;
    }

    public BatchqueryIpApprovalwithupdateRequest setAudienceGroup(String audienceGroup) {
        this.audienceGroup = audienceGroup;
        return this;
    }
    public String getAudienceGroup() {
        return this.audienceGroup;
    }

    public BatchqueryIpApprovalwithupdateRequest setCreateBeginTime(String createBeginTime) {
        this.createBeginTime = createBeginTime;
        return this;
    }
    public String getCreateBeginTime() {
        return this.createBeginTime;
    }

    public BatchqueryIpApprovalwithupdateRequest setCreateEndTime(String createEndTime) {
        this.createEndTime = createEndTime;
        return this;
    }
    public String getCreateEndTime() {
        return this.createEndTime;
    }

    public BatchqueryIpApprovalwithupdateRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public BatchqueryIpApprovalwithupdateRequest setIsCreateTimeSortDesc(Boolean isCreateTimeSortDesc) {
        this.isCreateTimeSortDesc = isCreateTimeSortDesc;
        return this;
    }
    public Boolean getIsCreateTimeSortDesc() {
        return this.isCreateTimeSortDesc;
    }

}
