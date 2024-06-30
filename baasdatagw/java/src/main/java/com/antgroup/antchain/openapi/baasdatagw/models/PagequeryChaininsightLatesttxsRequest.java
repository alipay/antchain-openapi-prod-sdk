// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class PagequeryChaininsightLatesttxsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 页面大小，默认为5
    @NameInMap("page_size")
    @Validation(maximum = 100)
    public Long pageSize;

    // 页码，默认为1
    @NameInMap("page_no")
    public Long pageNo;

    public static PagequeryChaininsightLatesttxsRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryChaininsightLatesttxsRequest self = new PagequeryChaininsightLatesttxsRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryChaininsightLatesttxsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryChaininsightLatesttxsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryChaininsightLatesttxsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public PagequeryChaininsightLatesttxsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryChaininsightLatesttxsRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

}
