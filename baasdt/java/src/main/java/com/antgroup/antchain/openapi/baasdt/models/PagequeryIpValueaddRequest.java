// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class PagequeryIpValueaddRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础字段
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 归属账户id
    @NameInMap("account_id")
    public String accountId;

    // 服务名字，模糊匹配
    @NameInMap("service_name")
    public String serviceName;

    // 服务状态（0:待审核 1:审核拒绝 2:上线【审核通过】 3: 下线）
    @NameInMap("status")
    public Long status;

    // 第几页
    @NameInMap("page_index")
    @Validation(required = true)
    public Long pageIndex;

    // 每页长度
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 开始时间
    @NameInMap("begin_create_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String beginCreateTime;

    // 结束时间
    @NameInMap("eng_create_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String engCreateTime;

    public static PagequeryIpValueaddRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryIpValueaddRequest self = new PagequeryIpValueaddRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryIpValueaddRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryIpValueaddRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryIpValueaddRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public PagequeryIpValueaddRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public PagequeryIpValueaddRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public PagequeryIpValueaddRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public PagequeryIpValueaddRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public PagequeryIpValueaddRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryIpValueaddRequest setBeginCreateTime(String beginCreateTime) {
        this.beginCreateTime = beginCreateTime;
        return this;
    }
    public String getBeginCreateTime() {
        return this.beginCreateTime;
    }

    public PagequeryIpValueaddRequest setEngCreateTime(String engCreateTime) {
        this.engCreateTime = engCreateTime;
        return this;
    }
    public String getEngCreateTime() {
        return this.engCreateTime;
    }

}
