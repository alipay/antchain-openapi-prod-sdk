// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.pcc.models;

import com.aliyun.tea.*;

public class PagequeryCommodityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 业务产品编码
    @NameInMap("product_code")
    public String productCode;

    // 商品状态
    @NameInMap("status")
    public String status;

    // 页数，不填则默认1
    @NameInMap("page_no")
    public Long pageNo;

    // 每页页数，不填则默认20
    @NameInMap("page_size")
    public Long pageSize;

    public static PagequeryCommodityRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryCommodityRequest self = new PagequeryCommodityRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryCommodityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryCommodityRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public PagequeryCommodityRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PagequeryCommodityRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public PagequeryCommodityRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
