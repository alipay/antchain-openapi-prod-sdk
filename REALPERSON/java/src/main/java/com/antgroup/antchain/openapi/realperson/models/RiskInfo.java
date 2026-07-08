// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class RiskInfo extends TeaModel {
    // 是否为复印件（仅身份证、银行卡含该字段）。0：否，1：是
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("copy")
    public String copy;

    // 是否翻拍（仅身份证含该字段）。0：否，1：是
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("reshoot")
    public String reshoot;

    // normal-识别正常
    // non_idcard-上传的图片中不包含身份证
    // blurred-身份证模糊
    // other_type_card-其他类型证照
    // over_exposure-身份证关键字段反光或过曝
    // over_dark-身份证欠曝（亮度过低）
    // unknown-未知状态
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("image_status")
    public java.util.List<String> imageStatus;

    // 输入参数 risk_info_type=true 时，则返回该字段，判断身份证是否存在风险，返回值：
    // normal-正常身份证；
    // copy-复印件；
    // temporary-临时身份证；
    // screen-翻拍；
    // PS-被PS修改；
    // unknown-其他未知情况
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("risk_type")
    public java.util.List<String> riskType;

    // 图片质量
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("card_quality")
    public CardQuality cardQuality;

    // 证件一致性
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("idcard_number_type")
    public String idcardNumberType;

    public static RiskInfo build(java.util.Map<String, ?> map) throws Exception {
        RiskInfo self = new RiskInfo();
        return TeaModel.build(map, self);
    }

    public RiskInfo setCopy(String copy) {
        this.copy = copy;
        return this;
    }
    public String getCopy() {
        return this.copy;
    }

    public RiskInfo setReshoot(String reshoot) {
        this.reshoot = reshoot;
        return this;
    }
    public String getReshoot() {
        return this.reshoot;
    }

    public RiskInfo setImageStatus(java.util.List<String> imageStatus) {
        this.imageStatus = imageStatus;
        return this;
    }
    public java.util.List<String> getImageStatus() {
        return this.imageStatus;
    }

    public RiskInfo setRiskType(java.util.List<String> riskType) {
        this.riskType = riskType;
        return this;
    }
    public java.util.List<String> getRiskType() {
        return this.riskType;
    }

    public RiskInfo setCardQuality(CardQuality cardQuality) {
        this.cardQuality = cardQuality;
        return this;
    }
    public CardQuality getCardQuality() {
        return this.cardQuality;
    }

    public RiskInfo setIdcardNumberType(String idcardNumberType) {
        this.idcardNumberType = idcardNumberType;
        return this;
    }
    public String getIdcardNumberType() {
        return this.idcardNumberType;
    }

}
