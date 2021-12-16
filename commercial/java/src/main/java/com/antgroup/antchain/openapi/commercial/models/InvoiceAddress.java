// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class InvoiceAddress extends TeaModel {
    // 主键id
    @NameInMap("id")
    public Long id;

    // 用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 收件人
    @NameInMap("addressee")
    @Validation(required = true)
    public String addressee;

    // 地区
    @NameInMap("area")
    @Validation(required = true)
    public String area;

    // 地址
    @NameInMap("address")
    @Validation(required = true)
    public String address;

    // 电话
    @NameInMap("telephone")
    @Validation(required = true)
    public String telephone;

    // 邮编
    @NameInMap("post_code")
    @Validation(required = true)
    public String postCode;

    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 唯一id
    @NameInMap("unique_id")
    public String uniqueId;

    public static InvoiceAddress build(java.util.Map<String, ?> map) throws Exception {
        InvoiceAddress self = new InvoiceAddress();
        return TeaModel.build(map, self);
    }

    public InvoiceAddress setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public InvoiceAddress setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public InvoiceAddress setAddressee(String addressee) {
        this.addressee = addressee;
        return this;
    }
    public String getAddressee() {
        return this.addressee;
    }

    public InvoiceAddress setArea(String area) {
        this.area = area;
        return this;
    }
    public String getArea() {
        return this.area;
    }

    public InvoiceAddress setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public InvoiceAddress setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }
    public String getTelephone() {
        return this.telephone;
    }

    public InvoiceAddress setPostCode(String postCode) {
        this.postCode = postCode;
        return this;
    }
    public String getPostCode() {
        return this.postCode;
    }

    public InvoiceAddress setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public InvoiceAddress setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public InvoiceAddress setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

}
