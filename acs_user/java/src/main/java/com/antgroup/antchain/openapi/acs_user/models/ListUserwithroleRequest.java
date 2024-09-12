// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acs_user.models;

import com.aliyun.tea.*;

public class ListUserwithroleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 产品CODE
    @NameInMap("prod_code")
    public String prodCode;

    // 产品内的角色信息
    @NameInMap("product_role")
    public String productRole;

    // 分页开始序号，默认第一个开始
    @NameInMap("current_page")
    public Long currentPage;

    // 分页大小，未传默认是100
    @NameInMap("page_size")
    public Long pageSize;

    public static ListUserwithroleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserwithroleRequest self = new ListUserwithroleRequest();
        return TeaModel.build(map, self);
    }

    public ListUserwithroleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListUserwithroleRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListUserwithroleRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public ListUserwithroleRequest setProductRole(String productRole) {
        this.productRole = productRole;
        return this;
    }
    public String getProductRole() {
        return this.productRole;
    }

    public ListUserwithroleRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListUserwithroleRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
