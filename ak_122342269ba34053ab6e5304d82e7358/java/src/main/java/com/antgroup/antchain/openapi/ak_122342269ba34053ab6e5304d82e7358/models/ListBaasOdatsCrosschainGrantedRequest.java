// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_122342269ba34053ab6e5304d82e7358.models;

import com.aliyun.tea.*;

public class ListBaasOdatsCrosschainGrantedRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 被授权链的链域名
    @NameInMap("grant_domain")
    @Validation(required = true)
    public String grantDomain;

    // 页码
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 分页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static ListBaasOdatsCrosschainGrantedRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBaasOdatsCrosschainGrantedRequest self = new ListBaasOdatsCrosschainGrantedRequest();
        return TeaModel.build(map, self);
    }

    public ListBaasOdatsCrosschainGrantedRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListBaasOdatsCrosschainGrantedRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListBaasOdatsCrosschainGrantedRequest setGrantDomain(String grantDomain) {
        this.grantDomain = grantDomain;
        return this;
    }
    public String getGrantDomain() {
        return this.grantDomain;
    }

    public ListBaasOdatsCrosschainGrantedRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListBaasOdatsCrosschainGrantedRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
