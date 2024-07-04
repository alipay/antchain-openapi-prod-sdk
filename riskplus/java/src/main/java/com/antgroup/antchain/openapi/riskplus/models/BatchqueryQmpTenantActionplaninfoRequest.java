// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class BatchqueryQmpTenantActionplaninfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 渠道类型
    @NameInMap("content_type")
    @Validation(required = true)
    public String contentType;

    // 页码
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 页数
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 分流字段，行业标签区分哈啰流量归属于umkt或qmp
    @NameInMap("industry_tag")
    public String industryTag;

    public static BatchqueryQmpTenantActionplaninfoRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryQmpTenantActionplaninfoRequest self = new BatchqueryQmpTenantActionplaninfoRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryQmpTenantActionplaninfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryQmpTenantActionplaninfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchqueryQmpTenantActionplaninfoRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public BatchqueryQmpTenantActionplaninfoRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public BatchqueryQmpTenantActionplaninfoRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public BatchqueryQmpTenantActionplaninfoRequest setIndustryTag(String industryTag) {
        this.industryTag = industryTag;
        return this;
    }
    public String getIndustryTag() {
        return this.industryTag;
    }

}
