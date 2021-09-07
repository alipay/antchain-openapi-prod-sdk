// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.goodschain.models;

import com.aliyun.tea.*;

public class QueryGoodstemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商品模板id，如果传入这个字段，返回的列表只有一条数据
    @NameInMap("template_id")
    public String templateId;

    // 当前页数
    @NameInMap("current_page")
    public Long currentPage;

    // 每页大小，最大为20
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryGoodstemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGoodstemplateRequest self = new QueryGoodstemplateRequest();
        return TeaModel.build(map, self);
    }

    public QueryGoodstemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryGoodstemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryGoodstemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public QueryGoodstemplateRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryGoodstemplateRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
