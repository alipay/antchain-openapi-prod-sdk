// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class ConversionDataDTO extends TeaModel {
    // 转化目标类型
    /**
     * <strong>example:</strong>
     * <p>FORMBOOK</p>
     */
    @NameInMap("conversion_type")
    @Validation(required = true)
    public String conversionType;

    // 目标转化量
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("conversion_count")
    @Validation(required = true)
    public Long conversionCount;

    public static ConversionDataDTO build(java.util.Map<String, ?> map) throws Exception {
        ConversionDataDTO self = new ConversionDataDTO();
        return TeaModel.build(map, self);
    }

    public ConversionDataDTO setConversionType(String conversionType) {
        this.conversionType = conversionType;
        return this;
    }
    public String getConversionType() {
        return this.conversionType;
    }

    public ConversionDataDTO setConversionCount(Long conversionCount) {
        this.conversionCount = conversionCount;
        return this;
    }
    public Long getConversionCount() {
        return this.conversionCount;
    }

}
