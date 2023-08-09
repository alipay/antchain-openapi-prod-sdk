// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas.models;

import com.aliyun.tea.*;

public class PagequeryAbilityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 当前页码
    @NameInMap("current")
    @Validation(required = true)
    public Long current;

    // 每页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 用于能力的搜索标签
    @NameInMap("keyword")
    public String keyword;

    // 网关产品码
    @NameInMap("gw_prod_code")
    public String gwProdCode;

    public static PagequeryAbilityRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryAbilityRequest self = new PagequeryAbilityRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryAbilityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryAbilityRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryAbilityRequest setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public PagequeryAbilityRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryAbilityRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public PagequeryAbilityRequest setGwProdCode(String gwProdCode) {
        this.gwProdCode = gwProdCode;
        return this;
    }
    public String getGwProdCode() {
        return this.gwProdCode;
    }

}
