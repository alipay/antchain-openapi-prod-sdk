// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class DeviceOrderFail extends TeaModel {
    // 订单id
    /**
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 设备did
    /**
     * <strong>example:</strong>
     * <p>asdfg</p>
     */
    @NameInMap("device_did")
    @Validation(required = true)
    public String deviceDid;

    // 返回code
    /**
     * <strong>example:</strong>
     * <p>Fail</p>
     */
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 失败
    /**
     * <strong>example:</strong>
     * <p>返回信息</p>
     */
    @NameInMap("message")
    @Validation(required = true)
    public String message;

    public static DeviceOrderFail build(java.util.Map<String, ?> map) throws Exception {
        DeviceOrderFail self = new DeviceOrderFail();
        return TeaModel.build(map, self);
    }

    public DeviceOrderFail setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public DeviceOrderFail setDeviceDid(String deviceDid) {
        this.deviceDid = deviceDid;
        return this;
    }
    public String getDeviceDid() {
        return this.deviceDid;
    }

    public DeviceOrderFail setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeviceOrderFail setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
