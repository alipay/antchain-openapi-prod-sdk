// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class DescribeIcmInvoiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 发票销方税号
    @NameInMap("xfsh")
    @Validation(required = true, maxLength = 30)
    public String xfsh;

    // 发票代码
    @NameInMap("fpdm")
    @Validation(required = true, maxLength = 100)
    public String fpdm;

    // 发票号码
    @NameInMap("fphm")
    @Validation(required = true, maxLength = 100)
    public String fphm;

    public static DescribeIcmInvoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIcmInvoiceRequest self = new DescribeIcmInvoiceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIcmInvoiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DescribeIcmInvoiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DescribeIcmInvoiceRequest setXfsh(String xfsh) {
        this.xfsh = xfsh;
        return this;
    }
    public String getXfsh() {
        return this.xfsh;
    }

    public DescribeIcmInvoiceRequest setFpdm(String fpdm) {
        this.fpdm = fpdm;
        return this;
    }
    public String getFpdm() {
        return this.fpdm;
    }

    public DescribeIcmInvoiceRequest setFphm(String fphm) {
        this.fphm = fphm;
        return this;
    }
    public String getFphm() {
        return this.fphm;
    }

}
