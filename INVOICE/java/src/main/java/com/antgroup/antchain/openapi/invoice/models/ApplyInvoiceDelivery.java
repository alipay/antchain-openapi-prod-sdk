// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class ApplyInvoiceDelivery extends TeaModel {
    // 寄送类型，如1表示快递，2表示email
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("delivery_type")
    public String deliveryType;

    // 开票人PID
    /**
     * <strong>example:</strong>
     * <p>2088720671581149</p>
     */
    @NameInMap("pid")
    @Validation(required = true)
    public String pid;

    // 收件人名称
    /**
     * <strong>example:</strong>
     * <p>收件人名称</p>
     */
    @NameInMap("name")
    public String name;

    // 电话
    /**
     * <strong>example:</strong>
     * <p>13987654321</p>
     */
    @NameInMap("telephone")
    public String telephone;

    // 国家
    /**
     * <strong>example:</strong>
     * <p>中国</p>
     */
    @NameInMap("country")
    public String country;

    // 省份
    /**
     * <strong>example:</strong>
     * <p>上海市</p>
     */
    @NameInMap("province")
    public String province;

    // 市
    /**
     * <strong>example:</strong>
     * <p>上海市</p>
     */
    @NameInMap("city")
    public String city;

    // 区县
    /**
     * <strong>example:</strong>
     * <p>黄浦区</p>
     */
    @NameInMap("county_district")
    public String countyDistrict;

    // 街道
    /**
     * <strong>example:</strong>
     * <p>街道</p>
     */
    @NameInMap("street")
    public String street;

    // 详细地址
    /**
     * <strong>example:</strong>
     * <p>外马路618号</p>
     */
    @NameInMap("detail_address")
    public String detailAddress;

    // 收件人邮件
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:a@1.com">a@1.com</a></p>
     */
    @NameInMap("email")
    public String email;

    public static ApplyInvoiceDelivery build(java.util.Map<String, ?> map) throws Exception {
        ApplyInvoiceDelivery self = new ApplyInvoiceDelivery();
        return TeaModel.build(map, self);
    }

    public ApplyInvoiceDelivery setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
        return this;
    }
    public String getDeliveryType() {
        return this.deliveryType;
    }

    public ApplyInvoiceDelivery setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public ApplyInvoiceDelivery setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ApplyInvoiceDelivery setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }
    public String getTelephone() {
        return this.telephone;
    }

    public ApplyInvoiceDelivery setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public ApplyInvoiceDelivery setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public ApplyInvoiceDelivery setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public ApplyInvoiceDelivery setCountyDistrict(String countyDistrict) {
        this.countyDistrict = countyDistrict;
        return this;
    }
    public String getCountyDistrict() {
        return this.countyDistrict;
    }

    public ApplyInvoiceDelivery setStreet(String street) {
        this.street = street;
        return this;
    }
    public String getStreet() {
        return this.street;
    }

    public ApplyInvoiceDelivery setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
        return this;
    }
    public String getDetailAddress() {
        return this.detailAddress;
    }

    public ApplyInvoiceDelivery setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

}
