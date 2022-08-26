// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_122342269ba34053ab6e5304d82e7358.models;

import com.aliyun.tea.*;

public class ListBaasOdatsAccesschainAuthorizedRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 自有链链域名
    @NameInMap("owner_domain")
    @Validation(required = true)
    public String ownerDomain;

    // 页码
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 分页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static ListBaasOdatsAccesschainAuthorizedRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBaasOdatsAccesschainAuthorizedRequest self = new ListBaasOdatsAccesschainAuthorizedRequest();
        return TeaModel.build(map, self);
    }

    public ListBaasOdatsAccesschainAuthorizedRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListBaasOdatsAccesschainAuthorizedRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListBaasOdatsAccesschainAuthorizedRequest setOwnerDomain(String ownerDomain) {
        this.ownerDomain = ownerDomain;
        return this;
    }
    public String getOwnerDomain() {
        return this.ownerDomain;
    }

    public ListBaasOdatsAccesschainAuthorizedRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListBaasOdatsAccesschainAuthorizedRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
