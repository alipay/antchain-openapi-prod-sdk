// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class PagequeryIssuerProjectkeyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 密钥ID
    @NameInMap("key_id")
    @Validation(required = true)
    public String keyId;

    // 当前页码(默认为第一页)
    @NameInMap("page_num")
    @Validation(required = true, minimum = 1)
    public Long pageNum;

    // 页面显示条数(默认10，最小为5)
    @NameInMap("page_size")
    @Validation(required = true, maximum = 100, minimum = 5)
    public Long pageSize;

    public static PagequeryIssuerProjectkeyRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryIssuerProjectkeyRequest self = new PagequeryIssuerProjectkeyRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryIssuerProjectkeyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryIssuerProjectkeyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryIssuerProjectkeyRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public PagequeryIssuerProjectkeyRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public PagequeryIssuerProjectkeyRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
