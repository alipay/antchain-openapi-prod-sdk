// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ListIpShopRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // IP商家的链上账户Id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 授权申请的内部编码
    @NameInMap("item_code")
    public String itemCode;

    // 分页下标(从1开始)
    @NameInMap("page_index")
    @Validation(required = true)
    public Long pageIndex;

    // 一页的分页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static ListIpShopRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIpShopRequest self = new ListIpShopRequest();
        return TeaModel.build(map, self);
    }

    public ListIpShopRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListIpShopRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListIpShopRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public ListIpShopRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ListIpShopRequest setItemCode(String itemCode) {
        this.itemCode = itemCode;
        return this;
    }
    public String getItemCode() {
        return this.itemCode;
    }

    public ListIpShopRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public ListIpShopRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
