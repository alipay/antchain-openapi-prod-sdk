// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class BatchqueryIpGoodsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础信息
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // ip名称，支持模糊匹配
    @NameInMap("ip_name")
    public String ipName;

    // 商品状态（0:待上架，1:上架，2:下架）
    @NameInMap("status")
    public Long status;

    // ip的上架渠道
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

    // ip商品归属方的链上id
    @NameInMap("account_id")
    public String accountId;

    // Ip类型
    @NameInMap("ip_type")
    public String ipType;

    // 受众人群
    @NameInMap("audience_group")
    public String audienceGroup;

    // 上架日期开始时间
    @NameInMap("create_begin_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createBeginTime;

    // 创建的结束日期
    @NameInMap("create_end_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createEndTime;

    // 是否需要按照创建时间倒序排序
    @NameInMap("is_create_time_sort_desc")
    @Validation(required = true)
    public Boolean isCreateTimeSortDesc;

    public static BatchqueryIpGoodsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryIpGoodsRequest self = new BatchqueryIpGoodsRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryIpGoodsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryIpGoodsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchqueryIpGoodsRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public BatchqueryIpGoodsRequest setIpName(String ipName) {
        this.ipName = ipName;
        return this;
    }
    public String getIpName() {
        return this.ipName;
    }

    public BatchqueryIpGoodsRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public BatchqueryIpGoodsRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public BatchqueryIpGoodsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public BatchqueryIpGoodsRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public BatchqueryIpGoodsRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public BatchqueryIpGoodsRequest setIpType(String ipType) {
        this.ipType = ipType;
        return this;
    }
    public String getIpType() {
        return this.ipType;
    }

    public BatchqueryIpGoodsRequest setAudienceGroup(String audienceGroup) {
        this.audienceGroup = audienceGroup;
        return this;
    }
    public String getAudienceGroup() {
        return this.audienceGroup;
    }

    public BatchqueryIpGoodsRequest setCreateBeginTime(String createBeginTime) {
        this.createBeginTime = createBeginTime;
        return this;
    }
    public String getCreateBeginTime() {
        return this.createBeginTime;
    }

    public BatchqueryIpGoodsRequest setCreateEndTime(String createEndTime) {
        this.createEndTime = createEndTime;
        return this;
    }
    public String getCreateEndTime() {
        return this.createEndTime;
    }

    public BatchqueryIpGoodsRequest setIsCreateTimeSortDesc(Boolean isCreateTimeSortDesc) {
        this.isCreateTimeSortDesc = isCreateTimeSortDesc;
        return this;
    }
    public Boolean getIsCreateTimeSortDesc() {
        return this.isCreateTimeSortDesc;
    }

}
