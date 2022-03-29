// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryAppsUnifiedalarmstatsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 正在告警的所有应用状态
    @NameInMap("app_alarm_status")
    public java.util.List<AppAlarmStats> appAlarmStatus;

    // 总应用数
    @NameInMap("total_app_count")
    public Long totalAppCount;

    // 正在告警的应用数
    @NameInMap("alarm_app_count")
    public Long alarmAppCount;

    public static QueryAppsUnifiedalarmstatsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAppsUnifiedalarmstatsResponse self = new QueryAppsUnifiedalarmstatsResponse();
        return TeaModel.build(map, self);
    }

    public QueryAppsUnifiedalarmstatsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAppsUnifiedalarmstatsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAppsUnifiedalarmstatsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAppsUnifiedalarmstatsResponse setAppAlarmStatus(java.util.List<AppAlarmStats> appAlarmStatus) {
        this.appAlarmStatus = appAlarmStatus;
        return this;
    }
    public java.util.List<AppAlarmStats> getAppAlarmStatus() {
        return this.appAlarmStatus;
    }

    public QueryAppsUnifiedalarmstatsResponse setTotalAppCount(Long totalAppCount) {
        this.totalAppCount = totalAppCount;
        return this;
    }
    public Long getTotalAppCount() {
        return this.totalAppCount;
    }

    public QueryAppsUnifiedalarmstatsResponse setAlarmAppCount(Long alarmAppCount) {
        this.alarmAppCount = alarmAppCount;
        return this;
    }
    public Long getAlarmAppCount() {
        return this.alarmAppCount;
    }

}
