// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class PagequeryChaininsightAccountmodifytxRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 账户地址
    @NameInMap("hex_address")
    @Validation(required = true)
    public String hexAddress;

    // 页码，默认为1
    @NameInMap("page_no")
    public Long pageNo;

    // 页面大小，默认为10
    @NameInMap("page_size")
    @Validation(maximum = 100)
    public Long pageSize;

    public static PagequeryChaininsightAccountmodifytxRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryChaininsightAccountmodifytxRequest self = new PagequeryChaininsightAccountmodifytxRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryChaininsightAccountmodifytxRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryChaininsightAccountmodifytxRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryChaininsightAccountmodifytxRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public PagequeryChaininsightAccountmodifytxRequest setHexAddress(String hexAddress) {
        this.hexAddress = hexAddress;
        return this;
    }
    public String getHexAddress() {
        return this.hexAddress;
    }

    public PagequeryChaininsightAccountmodifytxRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public PagequeryChaininsightAccountmodifytxRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
