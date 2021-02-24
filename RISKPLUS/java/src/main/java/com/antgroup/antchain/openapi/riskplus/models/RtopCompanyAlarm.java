// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RtopCompanyAlarm extends TeaModel {
    // 预警日期
    @NameInMap("alarm_date")
    @Validation(required = true)
    public String alarmDate;

    // 预警标识，是否需要预警
    @NameInMap("alarm_flag")
    @Validation(required = true)
    public String alarmFlag;

    // 预警序号
    @NameInMap("alarm_idx")
    @Validation(required = true)
    public String alarmIdx;

    // 预警类型
    @NameInMap("alarm_type")
    @Validation(required = true)
    public String alarmType;

    // 企业ID
    @NameInMap("company_id")
    @Validation(required = true)
    public String companyId;

    public static RtopCompanyAlarm build(java.util.Map<String, ?> map) throws Exception {
        RtopCompanyAlarm self = new RtopCompanyAlarm();
        return TeaModel.build(map, self);
    }

    public RtopCompanyAlarm setAlarmDate(String alarmDate) {
        this.alarmDate = alarmDate;
        return this;
    }
    public String getAlarmDate() {
        return this.alarmDate;
    }

    public RtopCompanyAlarm setAlarmFlag(String alarmFlag) {
        this.alarmFlag = alarmFlag;
        return this;
    }
    public String getAlarmFlag() {
        return this.alarmFlag;
    }

    public RtopCompanyAlarm setAlarmIdx(String alarmIdx) {
        this.alarmIdx = alarmIdx;
        return this;
    }
    public String getAlarmIdx() {
        return this.alarmIdx;
    }

    public RtopCompanyAlarm setAlarmType(String alarmType) {
        this.alarmType = alarmType;
        return this;
    }
    public String getAlarmType() {
        return this.alarmType;
    }

    public RtopCompanyAlarm setCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }
    public String getCompanyId() {
        return this.companyId;
    }

}
