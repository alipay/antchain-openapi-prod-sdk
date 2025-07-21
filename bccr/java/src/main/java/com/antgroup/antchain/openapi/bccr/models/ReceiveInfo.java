// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class ReceiveInfo extends TeaModel {
    // 纸质公证书份数
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("copies")
    public Long copies;

    // 公证书类型
    /**
     * <strong>example:</strong>
     * <p>PAPER:纸质公证书 E-PAPER:电子公证书 BOTH:纸质+电子公证书</p>
     */
    @NameInMap("order_type")
    @Validation(required = true)
    public String orderType;

    // 收件人信息
    @NameInMap("delivery_info")
    @Validation(required = true)
    public DeliveryInfo deliveryInfo;

    public static ReceiveInfo build(java.util.Map<String, ?> map) throws Exception {
        ReceiveInfo self = new ReceiveInfo();
        return TeaModel.build(map, self);
    }

    public ReceiveInfo setCopies(Long copies) {
        this.copies = copies;
        return this;
    }
    public Long getCopies() {
        return this.copies;
    }

    public ReceiveInfo setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ReceiveInfo setDeliveryInfo(DeliveryInfo deliveryInfo) {
        this.deliveryInfo = deliveryInfo;
        return this;
    }
    public DeliveryInfo getDeliveryInfo() {
        return this.deliveryInfo;
    }

}
