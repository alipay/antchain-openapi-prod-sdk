// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class DeliveryInfo extends TeaModel {
    // 收件人姓名
    @NameInMap("receive_name")
    @Validation(required = true)
    public String receiveName;

    // 联系电话
    @NameInMap("contact")
    @Validation(required = true)
    public String contact;

    // 省（需要接收纸质文件时必填）
    @NameInMap("province")
    public String province;

    // 市（需要接收纸质文件时必填）
    @NameInMap("city")
    public String city;

    // 区（需要接收纸质文件时必填）
    @NameInMap("area")
    public String area;

    // 详细地址（需要接收纸质文件时必填）
    @NameInMap("address")
    public String address;

    // 电子邮箱（需要接收电子文件时必填）
    @NameInMap("email")
    public String email;

    public static DeliveryInfo build(java.util.Map<String, ?> map) throws Exception {
        DeliveryInfo self = new DeliveryInfo();
        return TeaModel.build(map, self);
    }

    public DeliveryInfo setReceiveName(String receiveName) {
        this.receiveName = receiveName;
        return this;
    }
    public String getReceiveName() {
        return this.receiveName;
    }

    public DeliveryInfo setContact(String contact) {
        this.contact = contact;
        return this;
    }
    public String getContact() {
        return this.contact;
    }

    public DeliveryInfo setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public DeliveryInfo setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public DeliveryInfo setArea(String area) {
        this.area = area;
        return this;
    }
    public String getArea() {
        return this.area;
    }

    public DeliveryInfo setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public DeliveryInfo setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

}
