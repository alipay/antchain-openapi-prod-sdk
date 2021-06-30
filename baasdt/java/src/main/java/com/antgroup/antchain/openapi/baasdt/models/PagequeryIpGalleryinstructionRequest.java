// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class PagequeryIpGalleryinstructionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 账户链上ID
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 授权订单ID
    @NameInMap("ip_order_id")
    @Validation(required = true)
    public String ipOrderId;

    // 页码
    @NameInMap("page_number")
    @Validation(required = true)
    public Long pageNumber;

    // 每页数据量大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 数据排序顺序：正序还是倒序。默认按照下载时间排序。
    @NameInMap("order")
    @Validation(required = true)
    public String order;

    public static PagequeryIpGalleryinstructionRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryIpGalleryinstructionRequest self = new PagequeryIpGalleryinstructionRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryIpGalleryinstructionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryIpGalleryinstructionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryIpGalleryinstructionRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public PagequeryIpGalleryinstructionRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public PagequeryIpGalleryinstructionRequest setIpOrderId(String ipOrderId) {
        this.ipOrderId = ipOrderId;
        return this;
    }
    public String getIpOrderId() {
        return this.ipOrderId;
    }

    public PagequeryIpGalleryinstructionRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public PagequeryIpGalleryinstructionRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryIpGalleryinstructionRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

}
