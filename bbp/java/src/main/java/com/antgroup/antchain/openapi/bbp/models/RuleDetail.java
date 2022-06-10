// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bbp.models;

import com.aliyun.tea.*;

public class RuleDetail extends TeaModel {
    // 项目类别
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 领域
    @NameInMap("fie_id")
    @Validation(required = true)
    public String fieId;

    // 级别
    @NameInMap("level")
    @Validation(required = true)
    public String level;

    // 资质
    @NameInMap("qualifications")
    @Validation(required = true)
    public String qualifications;

    // 保定报价
    @NameInMap("price_bd")
    @Validation(required = true)
    public Long priceBd;

    // 离岸价格
    @NameInMap("fob_price")
    @Validation(required = true)
    public Long fobPrice;

    // 离岸价格
    @NameInMap("price_tj")
    @Validation(required = true)
    public Long priceTj;

    // 北京报价
    @NameInMap("price_bj")
    @Validation(required = true)
    public Long priceBj;

    // 最少提供人数
    @NameInMap("numpeople")
    @Validation(required = true)
    public Long numpeople;

    public static RuleDetail build(java.util.Map<String, ?> map) throws Exception {
        RuleDetail self = new RuleDetail();
        return TeaModel.build(map, self);
    }

    public RuleDetail setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public RuleDetail setFieId(String fieId) {
        this.fieId = fieId;
        return this;
    }
    public String getFieId() {
        return this.fieId;
    }

    public RuleDetail setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public RuleDetail setQualifications(String qualifications) {
        this.qualifications = qualifications;
        return this;
    }
    public String getQualifications() {
        return this.qualifications;
    }

    public RuleDetail setPriceBd(Long priceBd) {
        this.priceBd = priceBd;
        return this;
    }
    public Long getPriceBd() {
        return this.priceBd;
    }

    public RuleDetail setFobPrice(Long fobPrice) {
        this.fobPrice = fobPrice;
        return this;
    }
    public Long getFobPrice() {
        return this.fobPrice;
    }

    public RuleDetail setPriceTj(Long priceTj) {
        this.priceTj = priceTj;
        return this;
    }
    public Long getPriceTj() {
        return this.priceTj;
    }

    public RuleDetail setPriceBj(Long priceBj) {
        this.priceBj = priceBj;
        return this;
    }
    public Long getPriceBj() {
        return this.priceBj;
    }

    public RuleDetail setNumpeople(Long numpeople) {
        this.numpeople = numpeople;
        return this;
    }
    public Long getNumpeople() {
        return this.numpeople;
    }

}
