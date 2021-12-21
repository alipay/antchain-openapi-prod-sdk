// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class BatchqueryIpApprovalandchannelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础信息
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // ip的名字
    @NameInMap("ip_name")
    public String ipName;

    // ip的id
    @NameInMap("ip_id")
    public String ipId;

    // 审批状态
    @NameInMap("approval_status")
    public Long approvalStatus;

    // ip类型
    @NameInMap("ip_type")
    public String ipType;

    // 受众人群
    @NameInMap("audience_group")
    public String audienceGroup;

    // 归属账户
    @NameInMap("account_id")
    public String accountId;

    // 版权方别名
    @NameInMap("account_external_name")
    public String accountExternalName;

    // 是否需要按照创建时间倒序排序
    // 
    @NameInMap("is_create_time_sort_desc")
    @Validation(required = true)
    public Boolean isCreateTimeSortDesc;

    // 分页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 分页索引
    @NameInMap("page_index")
    @Validation(required = true)
    public Long pageIndex;

    // 开始时间 
    @NameInMap("create_begin_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createBeginTime;

    // 结束时间
    @NameInMap("create_end_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createEndTime;

    // 渠道名称
    @NameInMap("channel_name")
    public String channelName;

    // 上架渠道，SelfEmployed为上架到自营的渠道，NONLINE为未上架任何渠道
    @NameInMap("online_channel")
    public String onlineChannel;

    public static BatchqueryIpApprovalandchannelRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryIpApprovalandchannelRequest self = new BatchqueryIpApprovalandchannelRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryIpApprovalandchannelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryIpApprovalandchannelRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchqueryIpApprovalandchannelRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public BatchqueryIpApprovalandchannelRequest setIpName(String ipName) {
        this.ipName = ipName;
        return this;
    }
    public String getIpName() {
        return this.ipName;
    }

    public BatchqueryIpApprovalandchannelRequest setIpId(String ipId) {
        this.ipId = ipId;
        return this;
    }
    public String getIpId() {
        return this.ipId;
    }

    public BatchqueryIpApprovalandchannelRequest setApprovalStatus(Long approvalStatus) {
        this.approvalStatus = approvalStatus;
        return this;
    }
    public Long getApprovalStatus() {
        return this.approvalStatus;
    }

    public BatchqueryIpApprovalandchannelRequest setIpType(String ipType) {
        this.ipType = ipType;
        return this;
    }
    public String getIpType() {
        return this.ipType;
    }

    public BatchqueryIpApprovalandchannelRequest setAudienceGroup(String audienceGroup) {
        this.audienceGroup = audienceGroup;
        return this;
    }
    public String getAudienceGroup() {
        return this.audienceGroup;
    }

    public BatchqueryIpApprovalandchannelRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public BatchqueryIpApprovalandchannelRequest setAccountExternalName(String accountExternalName) {
        this.accountExternalName = accountExternalName;
        return this;
    }
    public String getAccountExternalName() {
        return this.accountExternalName;
    }

    public BatchqueryIpApprovalandchannelRequest setIsCreateTimeSortDesc(Boolean isCreateTimeSortDesc) {
        this.isCreateTimeSortDesc = isCreateTimeSortDesc;
        return this;
    }
    public Boolean getIsCreateTimeSortDesc() {
        return this.isCreateTimeSortDesc;
    }

    public BatchqueryIpApprovalandchannelRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public BatchqueryIpApprovalandchannelRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public BatchqueryIpApprovalandchannelRequest setCreateBeginTime(String createBeginTime) {
        this.createBeginTime = createBeginTime;
        return this;
    }
    public String getCreateBeginTime() {
        return this.createBeginTime;
    }

    public BatchqueryIpApprovalandchannelRequest setCreateEndTime(String createEndTime) {
        this.createEndTime = createEndTime;
        return this;
    }
    public String getCreateEndTime() {
        return this.createEndTime;
    }

    public BatchqueryIpApprovalandchannelRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public BatchqueryIpApprovalandchannelRequest setOnlineChannel(String onlineChannel) {
        this.onlineChannel = onlineChannel;
        return this;
    }
    public String getOnlineChannel() {
        return this.onlineChannel;
    }

}
