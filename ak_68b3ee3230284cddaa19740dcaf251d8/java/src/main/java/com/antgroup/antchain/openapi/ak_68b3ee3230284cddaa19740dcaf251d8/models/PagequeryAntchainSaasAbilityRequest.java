// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_68b3ee3230284cddaa19740dcaf251d8.models;

import com.aliyun.tea.*;

public class PagequeryAntchainSaasAbilityRequest extends TeaModel {
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
    @NameInMap("prod_code")
    public String prodCode;

    public static PagequeryAntchainSaasAbilityRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryAntchainSaasAbilityRequest self = new PagequeryAntchainSaasAbilityRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryAntchainSaasAbilityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryAntchainSaasAbilityRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryAntchainSaasAbilityRequest setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public PagequeryAntchainSaasAbilityRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryAntchainSaasAbilityRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public PagequeryAntchainSaasAbilityRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

}
