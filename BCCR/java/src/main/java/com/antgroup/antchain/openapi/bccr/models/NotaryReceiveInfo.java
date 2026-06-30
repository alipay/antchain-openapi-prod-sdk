// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class NotaryReceiveInfo extends TeaModel {
    // 公证书类型
    /**
     * <strong>example:</strong>
     * <p>PAPER:纸质公证书 E-PAPER:电子公证书 BOTH:纸质+电子公证书</p>
     */
    @NameInMap("order_type")
    @Validation(required = true)
    public String orderType;

    // 公证书送达信息
    @NameInMap("receive_info")
    @Validation(required = true)
    public ReceiveInfo receiveInfo;

    // 开票信息
    @NameInMap("invoice_info")
    public NotaryInvoiceInfo invoiceInfo;

    public static NotaryReceiveInfo build(java.util.Map<String, ?> map) throws Exception {
        NotaryReceiveInfo self = new NotaryReceiveInfo();
        return TeaModel.build(map, self);
    }

    public NotaryReceiveInfo setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public NotaryReceiveInfo setReceiveInfo(ReceiveInfo receiveInfo) {
        this.receiveInfo = receiveInfo;
        return this;
    }
    public ReceiveInfo getReceiveInfo() {
        return this.receiveInfo;
    }

    public NotaryReceiveInfo setInvoiceInfo(NotaryInvoiceInfo invoiceInfo) {
        this.invoiceInfo = invoiceInfo;
        return this;
    }
    public NotaryInvoiceInfo getInvoiceInfo() {
        return this.invoiceInfo;
    }

}
