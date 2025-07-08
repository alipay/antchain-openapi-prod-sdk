// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class IdentityData extends TeaModel {
    // 风险等级，枚举值： 0：低风险（打扰率＞10%） 1：中风险（5%＜打扰率≤10%） 2：高风险（打扰率≤5%）
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("is_risk")
    @Validation(required = true)
    public String isRisk;

    // 风险类型，枚举值及对应含义： ● PS：图片被PS篡改 ● SCREEN_PHOTO：屏幕翻拍 ● SCREENSHOT：截屏图片 ● COLOR_PRINT：彩打复印 ● WATERMARK：水印 ● FACE_SIMILAR：人脸相似 ● BACKGROUND_SIMILAR：背景相似 ● SIGNATURE_SIMILAR：证件手写签名相似 格式：以英文逗号分隔，如样例
    /**
     * <strong>example:</strong>
     * <p>PS,SCREEN_PHOTO</p>
     */
    @NameInMap("risk_type")
    @Validation(required = true)
    public String riskType;

    // 附加字段,json格式字符串
    /**
     * <strong>example:</strong>
     * <p>{ &quot;ps_score&quot;: &quot;0.0236&quot;, &quot;screen_photo_score&quot;: &quot;0.1839&quot;}</p>
     */
    @NameInMap("ext_info")
    @Validation(required = true)
    public String extInfo;

    public static IdentityData build(java.util.Map<String, ?> map) throws Exception {
        IdentityData self = new IdentityData();
        return TeaModel.build(map, self);
    }

    public IdentityData setIsRisk(String isRisk) {
        this.isRisk = isRisk;
        return this;
    }
    public String getIsRisk() {
        return this.isRisk;
    }

    public IdentityData setRiskType(String riskType) {
        this.riskType = riskType;
        return this;
    }
    public String getRiskType() {
        return this.riskType;
    }

    public IdentityData setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
