// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class BatchqueryIpGoodsinterestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 商品id
    @NameInMap("ip_id")
    public String ipId;

    // ip名称，支持模糊匹配
    @NameInMap("ip_name")
    public String ipName;

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

    // ip等级
    @NameInMap("ip_level")
    @Validation(required = true)
    public java.util.List<Long> ipLevel;

    // ip类型
    @NameInMap("ip_type")
    @Validation(required = true)
    public java.util.List<String> ipType;

    // 受众人群
    @NameInMap("audience_group")
    @Validation(required = true)
    public java.util.List<String> audienceGroup;

    // 是否需要按照创建时间倒序排序
    @NameInMap("is_create_time_sort_desc")
    @Validation(required = true)
    public Boolean isCreateTimeSortDesc;

    // 是否需要按照pv排序（0:不需要，1:正序，2:倒序），默认选1
    @NameInMap("is_sort_by_pv")
    @Validation(required = true)
    public Long isSortByPv;

    public static BatchqueryIpGoodsinterestRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryIpGoodsinterestRequest self = new BatchqueryIpGoodsinterestRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryIpGoodsinterestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryIpGoodsinterestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchqueryIpGoodsinterestRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public BatchqueryIpGoodsinterestRequest setIpId(String ipId) {
        this.ipId = ipId;
        return this;
    }
    public String getIpId() {
        return this.ipId;
    }

    public BatchqueryIpGoodsinterestRequest setIpName(String ipName) {
        this.ipName = ipName;
        return this;
    }
    public String getIpName() {
        return this.ipName;
    }

    public BatchqueryIpGoodsinterestRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public BatchqueryIpGoodsinterestRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public BatchqueryIpGoodsinterestRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public BatchqueryIpGoodsinterestRequest setIpLevel(java.util.List<Long> ipLevel) {
        this.ipLevel = ipLevel;
        return this;
    }
    public java.util.List<Long> getIpLevel() {
        return this.ipLevel;
    }

    public BatchqueryIpGoodsinterestRequest setIpType(java.util.List<String> ipType) {
        this.ipType = ipType;
        return this;
    }
    public java.util.List<String> getIpType() {
        return this.ipType;
    }

    public BatchqueryIpGoodsinterestRequest setAudienceGroup(java.util.List<String> audienceGroup) {
        this.audienceGroup = audienceGroup;
        return this;
    }
    public java.util.List<String> getAudienceGroup() {
        return this.audienceGroup;
    }

    public BatchqueryIpGoodsinterestRequest setIsCreateTimeSortDesc(Boolean isCreateTimeSortDesc) {
        this.isCreateTimeSortDesc = isCreateTimeSortDesc;
        return this;
    }
    public Boolean getIsCreateTimeSortDesc() {
        return this.isCreateTimeSortDesc;
    }

    public BatchqueryIpGoodsinterestRequest setIsSortByPv(Long isSortByPv) {
        this.isSortByPv = isSortByPv;
        return this;
    }
    public Long getIsSortByPv() {
        return this.isSortByPv;
    }

}
