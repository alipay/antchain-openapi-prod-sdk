// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.pcc.models;

import com.aliyun.tea.*;

public class ProductBaseInfo extends TeaModel {
    // 产品码，系统内部识别
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 产品名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 产品英文名称
    @NameInMap("name_en")
    public String nameEn;

    // 产品短码，管理维度识别
    @NameInMap("short_code")
    @Validation(required = true)
    public String shortCode;

    public static ProductBaseInfo build(java.util.Map<String, ?> map) throws Exception {
        ProductBaseInfo self = new ProductBaseInfo();
        return TeaModel.build(map, self);
    }

    public ProductBaseInfo setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ProductBaseInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ProductBaseInfo setNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }
    public String getNameEn() {
        return this.nameEn;
    }

    public ProductBaseInfo setShortCode(String shortCode) {
        this.shortCode = shortCode;
        return this;
    }
    public String getShortCode() {
        return this.shortCode;
    }

}
