// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class SendTaskalarmRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 发出告警的任务名称作为租户
    @NameInMap("alarmname")
    @Validation(required = true)
    public String alarmname;

    // 异常类型作为标题
    @NameInMap("alarmtitle")
    @Validation(required = true)
    public String alarmtitle;

    // 异常的详细描述
    @NameInMap("alarmcontent")
    @Validation(required = true)
    public String alarmcontent;

    public static SendTaskalarmRequest build(java.util.Map<String, ?> map) throws Exception {
        SendTaskalarmRequest self = new SendTaskalarmRequest();
        return TeaModel.build(map, self);
    }

    public SendTaskalarmRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendTaskalarmRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SendTaskalarmRequest setAlarmname(String alarmname) {
        this.alarmname = alarmname;
        return this;
    }
    public String getAlarmname() {
        return this.alarmname;
    }

    public SendTaskalarmRequest setAlarmtitle(String alarmtitle) {
        this.alarmtitle = alarmtitle;
        return this;
    }
    public String getAlarmtitle() {
        return this.alarmtitle;
    }

    public SendTaskalarmRequest setAlarmcontent(String alarmcontent) {
        this.alarmcontent = alarmcontent;
        return this;
    }
    public String getAlarmcontent() {
        return this.alarmcontent;
    }

}
