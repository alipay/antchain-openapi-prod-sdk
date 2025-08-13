// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class IotBasicDeviceOrderItem extends TeaModel {
    // 蚂蚁链IoT平台设备唯一ID
    /**
     * <strong>example:</strong>
     * <p>12321321</p>
     */
    @NameInMap("device_did")
    @Validation(required = true)
    public String deviceDid;

    // 设备唯一编号
    /**
     * <strong>example:</strong>
     * <p>12321321</p>
     */
    @NameInMap("device_sn")
    @Validation(required = true)
    public String deviceSn;

    // 设备金额，精确到小数后两位
    /**
     * <strong>example:</strong>
     * <p>234.01</p>
     */
    @NameInMap("payment_amount")
    @Validation(required = true)
    public String paymentAmount;

    public static IotBasicDeviceOrderItem build(java.util.Map<String, ?> map) throws Exception {
        IotBasicDeviceOrderItem self = new IotBasicDeviceOrderItem();
        return TeaModel.build(map, self);
    }

    public IotBasicDeviceOrderItem setDeviceDid(String deviceDid) {
        this.deviceDid = deviceDid;
        return this;
    }
    public String getDeviceDid() {
        return this.deviceDid;
    }

    public IotBasicDeviceOrderItem setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public IotBasicDeviceOrderItem setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
        return this;
    }
    public String getPaymentAmount() {
        return this.paymentAmount;
    }

}
