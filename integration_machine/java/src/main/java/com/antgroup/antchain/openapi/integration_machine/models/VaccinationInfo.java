// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.integration_machine.models;

import com.aliyun.tea.*;

public class VaccinationInfo extends TeaModel {
    // 疫苗接种信息：
    // 0:查询失败 
    // 1:未接种
    // 2:已接种一针
    // 3:完成接种
    @NameInMap("vaccination_code")
    public String vaccinationCode;

    // 疫苗接种信息
    @NameInMap("vaccination_desc")
    public String vaccinationDesc;

    // 疫苗接种时间戳（单位：ms）
    @NameInMap("vaccination_timestamp")
    public Long vaccinationTimestamp;

    public static VaccinationInfo build(java.util.Map<String, ?> map) throws Exception {
        VaccinationInfo self = new VaccinationInfo();
        return TeaModel.build(map, self);
    }

    public VaccinationInfo setVaccinationCode(String vaccinationCode) {
        this.vaccinationCode = vaccinationCode;
        return this;
    }
    public String getVaccinationCode() {
        return this.vaccinationCode;
    }

    public VaccinationInfo setVaccinationDesc(String vaccinationDesc) {
        this.vaccinationDesc = vaccinationDesc;
        return this;
    }
    public String getVaccinationDesc() {
        return this.vaccinationDesc;
    }

    public VaccinationInfo setVaccinationTimestamp(Long vaccinationTimestamp) {
        this.vaccinationTimestamp = vaccinationTimestamp;
        return this;
    }
    public Long getVaccinationTimestamp() {
        return this.vaccinationTimestamp;
    }

}
