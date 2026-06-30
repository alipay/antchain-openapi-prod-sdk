// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryQmpTenantActionplaninfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 页码
    @NameInMap("page_num")
    public Long pageNum;

    // 页容量
    @NameInMap("page_size")
    public Long pageSize;

    // 渠道code
    @NameInMap("channel_type")
    @Validation(required = true)
    public String channelType;

    // 分流字段，行业标签区分哈啰流量归属于umkt或qmp
    @NameInMap("industry_tag")
    public String industryTag;

    public static QueryQmpTenantActionplaninfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryQmpTenantActionplaninfoRequest self = new QueryQmpTenantActionplaninfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryQmpTenantActionplaninfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryQmpTenantActionplaninfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryQmpTenantActionplaninfoRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryQmpTenantActionplaninfoRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryQmpTenantActionplaninfoRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public QueryQmpTenantActionplaninfoRequest setIndustryTag(String industryTag) {
        this.industryTag = industryTag;
        return this;
    }
    public String getIndustryTag() {
        return this.industryTag;
    }

}
