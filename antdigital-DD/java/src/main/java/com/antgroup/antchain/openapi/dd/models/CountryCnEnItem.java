// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class CountryCnEnItem extends TeaModel {
    // 国家字母编号
    /**
     * <strong>example:</strong>
     * <p>CN</p>
     */
    @NameInMap("country_code")
    @Validation(required = true)
    public String countryCode;

    // 国家中文名称
    /**
     * <strong>example:</strong>
     * <p>中国</p>
     */
    @NameInMap("country_cn")
    @Validation(required = true)
    public String countryCn;

    // 国家英文名称
    /**
     * <strong>example:</strong>
     * <p>China</p>
     */
    @NameInMap("country_en")
    @Validation(required = true)
    public String countryEn;

    public static CountryCnEnItem build(java.util.Map<String, ?> map) throws Exception {
        CountryCnEnItem self = new CountryCnEnItem();
        return TeaModel.build(map, self);
    }

    public CountryCnEnItem setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }
    public String getCountryCode() {
        return this.countryCode;
    }

    public CountryCnEnItem setCountryCn(String countryCn) {
        this.countryCn = countryCn;
        return this;
    }
    public String getCountryCn() {
        return this.countryCn;
    }

    public CountryCnEnItem setCountryEn(String countryEn) {
        this.countryEn = countryEn;
        return this;
    }
    public String getCountryEn() {
        return this.countryEn;
    }

}
