// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.industry.models;

import com.aliyun.tea.*;

public class QualificationInfo extends TeaModel {
    // 商户行业资质类型,  参考https://mif-pub.alipayobjects.com/QualificationType.xlsx
    @NameInMap("industry_qualification_type")
    @Validation(required = true)
    public String industryQualificationType;

    // 商户行业资质图片
    @NameInMap("industry_qualification_image")
    @Validation(required = true)
    public String industryQualificationImage;

    public static QualificationInfo build(java.util.Map<String, ?> map) throws Exception {
        QualificationInfo self = new QualificationInfo();
        return TeaModel.build(map, self);
    }

    public QualificationInfo setIndustryQualificationType(String industryQualificationType) {
        this.industryQualificationType = industryQualificationType;
        return this;
    }
    public String getIndustryQualificationType() {
        return this.industryQualificationType;
    }

    public QualificationInfo setIndustryQualificationImage(String industryQualificationImage) {
        this.industryQualificationImage = industryQualificationImage;
        return this;
    }
    public String getIndustryQualificationImage() {
        return this.industryQualificationImage;
    }

}
