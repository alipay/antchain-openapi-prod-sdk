// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class DeliveryDetail extends TeaModel {
    // 收件人姓名
    @NameInMap("receiver_name")
    @Validation(maxLength = 32)
    public String receiverName;

    // 收件人手机号
    @NameInMap("receiver_mobile")
    @Validation(maxLength = 32)
    public String receiverMobile;

    // 收件人地址
    @NameInMap("receiver_address")
    @Validation(maxLength = 256)
    public String receiverAddress;

    public static DeliveryDetail build(java.util.Map<String, ?> map) throws Exception {
        DeliveryDetail self = new DeliveryDetail();
        return TeaModel.build(map, self);
    }

    public DeliveryDetail setReceiverName(String receiverName) {
        this.receiverName = receiverName;
        return this;
    }
    public String getReceiverName() {
        return this.receiverName;
    }

    public DeliveryDetail setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
        return this;
    }
    public String getReceiverMobile() {
        return this.receiverMobile;
    }

    public DeliveryDetail setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
        return this;
    }
    public String getReceiverAddress() {
        return this.receiverAddress;
    }

}
