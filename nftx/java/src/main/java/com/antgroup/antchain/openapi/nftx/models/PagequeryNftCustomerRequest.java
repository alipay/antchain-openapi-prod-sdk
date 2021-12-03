// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftx.models;

import com.aliyun.tea.*;

public class PagequeryNftCustomerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 当前页码
    @NameInMap("page")
    @Validation(required = true)
    public Long page;

    // 页长
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 用户手机号或支付宝UID
    @NameInMap("id_no")
    @Validation(required = true)
    public String idNo;

    // 用户ID类型，和id_no对应
    @NameInMap("id_type")
    @Validation(required = true)
    public String idType;

    public static PagequeryNftCustomerRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryNftCustomerRequest self = new PagequeryNftCustomerRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryNftCustomerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryNftCustomerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryNftCustomerRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public PagequeryNftCustomerRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryNftCustomerRequest setIdNo(String idNo) {
        this.idNo = idNo;
        return this;
    }
    public String getIdNo() {
        return this.idNo;
    }

    public PagequeryNftCustomerRequest setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

}
