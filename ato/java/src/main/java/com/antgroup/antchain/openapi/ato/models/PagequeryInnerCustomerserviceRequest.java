// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PagequeryInnerCustomerserviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 分页信息
    @NameInMap("page_info")
    @Validation(required = true)
    public PageQuery pageInfo;

    // 处理类型: 商家处理 服务商代处理
    @NameInMap("process_type")
    public String processType;

    // 公司社会统一信息代码
    @NameInMap("merchant_id")
    public String merchantId;

    // 公司名称
    @NameInMap("merchant_name")
    public String merchantName;

    public static PagequeryInnerCustomerserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryInnerCustomerserviceRequest self = new PagequeryInnerCustomerserviceRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryInnerCustomerserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryInnerCustomerserviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryInnerCustomerserviceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public PagequeryInnerCustomerserviceRequest setPageInfo(PageQuery pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageQuery getPageInfo() {
        return this.pageInfo;
    }

    public PagequeryInnerCustomerserviceRequest setProcessType(String processType) {
        this.processType = processType;
        return this;
    }
    public String getProcessType() {
        return this.processType;
    }

    public PagequeryInnerCustomerserviceRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public PagequeryInnerCustomerserviceRequest setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

}
