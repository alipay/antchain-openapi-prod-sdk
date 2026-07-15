// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.agorax.models;

import com.aliyun.tea.*;

public class IndustryQualificationInfo extends TeaModel {
    // 商户行业资质类型
    /**
     * <strong>example:</strong>
     * <p>323</p>
     */
    @NameInMap("industry_qualification_type")
    @Validation(required = true)
    public String industryQualificationType;

    // 商户行业资质图片
    /**
     * <strong>example:</strong>
     * <p>20200219192259536bda6664ed60f815</p>
     */
    @NameInMap("industry_qualification_image")
    @Validation(required = true)
    public String industryQualificationImage;

    public static IndustryQualificationInfo build(java.util.Map<String, ?> map) throws Exception {
        IndustryQualificationInfo self = new IndustryQualificationInfo();
        return TeaModel.build(map, self);
    }

    public IndustryQualificationInfo setIndustryQualificationType(String industryQualificationType) {
        this.industryQualificationType = industryQualificationType;
        return this;
    }
    public String getIndustryQualificationType() {
        return this.industryQualificationType;
    }

    public IndustryQualificationInfo setIndustryQualificationImage(String industryQualificationImage) {
        this.industryQualificationImage = industryQualificationImage;
        return this;
    }
    public String getIndustryQualificationImage() {
        return this.industryQualificationImage;
    }

}
