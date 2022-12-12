// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_6597a3b2da294170a5de533601288f1d.models;

import com.aliyun.tea.*;

public class PushBlockchainTaxIcmInvoiceinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 上票ISV app_id即secret_id
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // 发票号码	
    @NameInMap("invoice")
    @Validation(required = true)
    public Invoice invoice;

    public static PushBlockchainTaxIcmInvoiceinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        PushBlockchainTaxIcmInvoiceinfoRequest self = new PushBlockchainTaxIcmInvoiceinfoRequest();
        return TeaModel.build(map, self);
    }

    public PushBlockchainTaxIcmInvoiceinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushBlockchainTaxIcmInvoiceinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushBlockchainTaxIcmInvoiceinfoRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public PushBlockchainTaxIcmInvoiceinfoRequest setInvoice(Invoice invoice) {
        this.invoice = invoice;
        return this;
    }
    public Invoice getInvoice() {
        return this.invoice;
    }

}
