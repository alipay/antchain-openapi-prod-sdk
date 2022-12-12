// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_6597a3b2da294170a5de533601288f1d.models;

import com.aliyun.tea.*;

public class PushBlockchainTaxIcmInvoiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 批次号
    @NameInMap("pch")
    @Validation(required = true)
    public String pch;

    // 发票信息（json格式）
    @NameInMap("fpxx")
    @Validation(required = true)
    public String fpxx;

    // 发票类型
    // 01：增值税专用发票
    // 04：增值税普通发票
    // 10：增值税电子普通发票
    @NameInMap("fplx")
    @Validation(required = true)
    public String fplx;

    // 是否是历史数据推送
    @NameInMap("islsp")
    @Validation(required = true)
    public Boolean islsp;

    public static PushBlockchainTaxIcmInvoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        PushBlockchainTaxIcmInvoiceRequest self = new PushBlockchainTaxIcmInvoiceRequest();
        return TeaModel.build(map, self);
    }

    public PushBlockchainTaxIcmInvoiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushBlockchainTaxIcmInvoiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushBlockchainTaxIcmInvoiceRequest setPch(String pch) {
        this.pch = pch;
        return this;
    }
    public String getPch() {
        return this.pch;
    }

    public PushBlockchainTaxIcmInvoiceRequest setFpxx(String fpxx) {
        this.fpxx = fpxx;
        return this;
    }
    public String getFpxx() {
        return this.fpxx;
    }

    public PushBlockchainTaxIcmInvoiceRequest setFplx(String fplx) {
        this.fplx = fplx;
        return this;
    }
    public String getFplx() {
        return this.fplx;
    }

    public PushBlockchainTaxIcmInvoiceRequest setIslsp(Boolean islsp) {
        this.islsp = islsp;
        return this;
    }
    public Boolean getIslsp() {
        return this.islsp;
    }

}
