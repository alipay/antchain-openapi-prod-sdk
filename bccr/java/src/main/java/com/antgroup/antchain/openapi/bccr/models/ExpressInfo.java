// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class ExpressInfo extends TeaModel {
    // 材料类型
    /**
     * <strong>example:</strong>
     * <p>PAPER纸质，ELECTRIC电子</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 收件人姓名
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 收件人电话号码
    /**
     * <strong>example:</strong>
     * <p>13000000000</p>
     */
    @NameInMap("phone")
    @Validation(required = true)
    public String phone;

    // 邮箱地址
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:xxx@xx.com">xxx@xx.com</a></p>
     */
    @NameInMap("email")
    @Validation(required = true)
    public String email;

    // 快递名称
    /**
     * <strong>example:</strong>
     * <p>快递名称</p>
     */
    @NameInMap("express_name")
    @Validation(required = true)
    public String expressName;

    // 快递单号
    /**
     * <strong>example:</strong>
     * <p>快递单号</p>
     */
    @NameInMap("tracking_number")
    @Validation(required = true)
    public String trackingNumber;

    // 材料发出时间戳
    @NameInMap("send_time")
    @Validation(required = true)
    public Long sendTime;

    public static ExpressInfo build(java.util.Map<String, ?> map) throws Exception {
        ExpressInfo self = new ExpressInfo();
        return TeaModel.build(map, self);
    }

    public ExpressInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ExpressInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ExpressInfo setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public ExpressInfo setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public ExpressInfo setExpressName(String expressName) {
        this.expressName = expressName;
        return this;
    }
    public String getExpressName() {
        return this.expressName;
    }

    public ExpressInfo setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
        return this;
    }
    public String getTrackingNumber() {
        return this.trackingNumber;
    }

    public ExpressInfo setSendTime(Long sendTime) {
        this.sendTime = sendTime;
        return this;
    }
    public Long getSendTime() {
        return this.sendTime;
    }

}
