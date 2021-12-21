// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class BatchqueryIpSellerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础信息
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 不同的平台标识
    @NameInMap("channel_name")
    @Validation(required = true)
    public String channelName;

    // 分页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 分页索引
    @NameInMap("page_index")
    @Validation(required = true)
    public Long pageIndex;

    // 账户链上ID
    @NameInMap("account_id")
    public String accountId;

    // 1 版权方，2 商户
    @NameInMap("role")
    public Long role;

    // 联系人名称
    @NameInMap("contact_name")
    public String contactName;

    // 联系人电话
    @NameInMap("contact_mobile")
    public String contactMobile;

    // 账户状态列表
    @NameInMap("status_list")
    public java.util.List<Long> statusList;

    // 排序
    @NameInMap("sort_order")
    public String sortOrder;

    // 筛选更新时间范围，开始区间
    @NameInMap("create_start_time")
    public Long createStartTime;

    // 筛选更新时间范围，结束区间
    @NameInMap("create_end_time")
    public Long createEndTime;

    // 版权方的用户名称
    @NameInMap("external_user_name")
    public String externalUserName;

    public static BatchqueryIpSellerRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryIpSellerRequest self = new BatchqueryIpSellerRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryIpSellerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryIpSellerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchqueryIpSellerRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public BatchqueryIpSellerRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public BatchqueryIpSellerRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public BatchqueryIpSellerRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public BatchqueryIpSellerRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public BatchqueryIpSellerRequest setRole(Long role) {
        this.role = role;
        return this;
    }
    public Long getRole() {
        return this.role;
    }

    public BatchqueryIpSellerRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public BatchqueryIpSellerRequest setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
        return this;
    }
    public String getContactMobile() {
        return this.contactMobile;
    }

    public BatchqueryIpSellerRequest setStatusList(java.util.List<Long> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<Long> getStatusList() {
        return this.statusList;
    }

    public BatchqueryIpSellerRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public BatchqueryIpSellerRequest setCreateStartTime(Long createStartTime) {
        this.createStartTime = createStartTime;
        return this;
    }
    public Long getCreateStartTime() {
        return this.createStartTime;
    }

    public BatchqueryIpSellerRequest setCreateEndTime(Long createEndTime) {
        this.createEndTime = createEndTime;
        return this;
    }
    public Long getCreateEndTime() {
        return this.createEndTime;
    }

    public BatchqueryIpSellerRequest setExternalUserName(String externalUserName) {
        this.externalUserName = externalUserName;
        return this;
    }
    public String getExternalUserName() {
        return this.externalUserName;
    }

}
