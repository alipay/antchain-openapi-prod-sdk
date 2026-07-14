// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class InvoiceMailInfo extends TeaModel {
    // PID，指定发票邮寄地址归属的PID
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("pid")
    @Validation(required = true)
    public String pid;

    // 联系人名字
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 国家
    /**
     * <strong>example:</strong>
     * <p>中国</p>
     */
    @NameInMap("country")
    @Validation(required = true)
    public String country;

    // 收件人邮箱
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:715680094@qq.com">715680094@qq.com</a></p>
     */
    @NameInMap("email")
    @Validation(required = true)
    public String email;

    // 联系人电话
    /**
     * <strong>example:</strong>
     * <p>17797768851</p>
     */
    @NameInMap("telephone")
    public String telephone;

    // 省份
    /**
     * <strong>example:</strong>
     * <p>河南</p>
     */
    @NameInMap("province")
    public String province;

    // 城市
    /**
     * <strong>example:</strong>
     * <p>郑州</p>
     */
    @NameInMap("city")
    public String city;

    // 区/县
    /**
     * <strong>example:</strong>
     * <p>金水区</p>
     */
    @NameInMap("county_district")
    public String countyDistrict;

    // 街道
    /**
     * <strong>example:</strong>
     * <p>良秀路街道</p>
     */
    @NameInMap("street")
    public String street;

    // 详细地址
    /**
     * <strong>example:</strong>
     * <p>良秀路180号</p>
     */
    @NameInMap("detail_address")
    public String detailAddress;

    // BD邮箱
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:715680093@qq.com">715680093@qq.com</a></p>
     */
    @NameInMap("bd_email")
    public String bdEmail;

    public static InvoiceMailInfo build(java.util.Map<String, ?> map) throws Exception {
        InvoiceMailInfo self = new InvoiceMailInfo();
        return TeaModel.build(map, self);
    }

    public InvoiceMailInfo setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public InvoiceMailInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public InvoiceMailInfo setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public InvoiceMailInfo setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public InvoiceMailInfo setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }
    public String getTelephone() {
        return this.telephone;
    }

    public InvoiceMailInfo setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public InvoiceMailInfo setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public InvoiceMailInfo setCountyDistrict(String countyDistrict) {
        this.countyDistrict = countyDistrict;
        return this;
    }
    public String getCountyDistrict() {
        return this.countyDistrict;
    }

    public InvoiceMailInfo setStreet(String street) {
        this.street = street;
        return this;
    }
    public String getStreet() {
        return this.street;
    }

    public InvoiceMailInfo setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
        return this;
    }
    public String getDetailAddress() {
        return this.detailAddress;
    }

    public InvoiceMailInfo setBdEmail(String bdEmail) {
        this.bdEmail = bdEmail;
        return this;
    }
    public String getBdEmail() {
        return this.bdEmail;
    }

}
