// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class PagequeryIssuerKeyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 当前页码(默认为第一页)
    @NameInMap("page_num")
    @Validation(required = true, minimum = 1)
    public Long pageNum;

    // 页面显示条数(默认10，最小为5)
    @NameInMap("page_size")
    @Validation(required = true, minimum = 5)
    public Long pageSize;

    // 排序字段
    @NameInMap("sort_field")
    public String sortField;

    // 密钥名称
    @NameInMap("key_name")
    public String keyName;

    public static PagequeryIssuerKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryIssuerKeyRequest self = new PagequeryIssuerKeyRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryIssuerKeyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryIssuerKeyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryIssuerKeyRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public PagequeryIssuerKeyRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryIssuerKeyRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public PagequeryIssuerKeyRequest setKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }
    public String getKeyName() {
        return this.keyName;
    }

}
