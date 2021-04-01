// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryDidDocSidekeyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 是否需要分页返回
    @NameInMap("need_page")
    public Boolean needPage;

    // 按分页查询
    @NameInMap("page_num")
    public Long pageNum;

    // 前缀+z40_uid
    @NameInMap("side_key")
    @Validation(required = true)
    public String sideKey;

    // 通过外键查询did，需要以下条件之一：
    // 1. 查询者为外键前缀对应的did；
    // 2. 查询者能够提供外键前缀对应的did的授权vc。
    @NameInMap("verifiable_claim")
    public String verifiableClaim;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static QueryDidDocSidekeyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDidDocSidekeyRequest self = new QueryDidDocSidekeyRequest();
        return TeaModel.build(map, self);
    }

    public QueryDidDocSidekeyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDidDocSidekeyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDidDocSidekeyRequest setNeedPage(Boolean needPage) {
        this.needPage = needPage;
        return this;
    }
    public Boolean getNeedPage() {
        return this.needPage;
    }

    public QueryDidDocSidekeyRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryDidDocSidekeyRequest setSideKey(String sideKey) {
        this.sideKey = sideKey;
        return this;
    }
    public String getSideKey() {
        return this.sideKey;
    }

    public QueryDidDocSidekeyRequest setVerifiableClaim(String verifiableClaim) {
        this.verifiableClaim = verifiableClaim;
        return this;
    }
    public String getVerifiableClaim() {
        return this.verifiableClaim;
    }

    public QueryDidDocSidekeyRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
