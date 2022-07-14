// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.integration_machine.models;

import com.aliyun.tea.*;

public class VaccinationInformation extends TeaModel {
    // 疫苗接种状态(0查询失败 1未接种 2已接种一针 3完成接种)
    @NameInMap("vaccination_status")
    @Validation(required = true)
    public String vaccinationStatus;

    // 疫苗接种时间
    @NameInMap("vaccination_time")
    @Validation(required = true)
    public String vaccinationTime;

    public static VaccinationInformation build(java.util.Map<String, ?> map) throws Exception {
        VaccinationInformation self = new VaccinationInformation();
        return TeaModel.build(map, self);
    }

    public VaccinationInformation setVaccinationStatus(String vaccinationStatus) {
        this.vaccinationStatus = vaccinationStatus;
        return this;
    }
    public String getVaccinationStatus() {
        return this.vaccinationStatus;
    }

    public VaccinationInformation setVaccinationTime(String vaccinationTime) {
        this.vaccinationTime = vaccinationTime;
        return this;
    }
    public String getVaccinationTime() {
        return this.vaccinationTime;
    }

}
