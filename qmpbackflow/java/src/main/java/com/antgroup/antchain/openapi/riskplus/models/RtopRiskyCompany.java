// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RtopRiskyCompany extends TeaModel {
    // 企业ID
    @NameInMap("company_id")
    @Validation(required = true)
    public String companyId;

    // 异动分数
    @NameInMap("change_score")
    @Validation(required = true)
    public String changeScore;

    // 异动程度
    @NameInMap("change_level")
    @Validation(required = true)
    public String changeLevel;

    // 新增企业的时间
    @NameInMap("new_added_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String newAddedTime;

    // 总公司注册地
    @NameInMap("head_register_place")
    @Validation(required = true)
    public String headRegisterPlace;

    // 数据的时间
    @NameInMap("data_time")
    @Validation(required = true)
    public String dataTime;

    public static RtopRiskyCompany build(java.util.Map<String, ?> map) throws Exception {
        RtopRiskyCompany self = new RtopRiskyCompany();
        return TeaModel.build(map, self);
    }

    public RtopRiskyCompany setCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }
    public String getCompanyId() {
        return this.companyId;
    }

    public RtopRiskyCompany setChangeScore(String changeScore) {
        this.changeScore = changeScore;
        return this;
    }
    public String getChangeScore() {
        return this.changeScore;
    }

    public RtopRiskyCompany setChangeLevel(String changeLevel) {
        this.changeLevel = changeLevel;
        return this;
    }
    public String getChangeLevel() {
        return this.changeLevel;
    }

    public RtopRiskyCompany setNewAddedTime(String newAddedTime) {
        this.newAddedTime = newAddedTime;
        return this;
    }
    public String getNewAddedTime() {
        return this.newAddedTime;
    }

    public RtopRiskyCompany setHeadRegisterPlace(String headRegisterPlace) {
        this.headRegisterPlace = headRegisterPlace;
        return this;
    }
    public String getHeadRegisterPlace() {
        return this.headRegisterPlace;
    }

    public RtopRiskyCompany setDataTime(String dataTime) {
        this.dataTime = dataTime;
        return this;
    }
    public String getDataTime() {
        return this.dataTime;
    }

}
