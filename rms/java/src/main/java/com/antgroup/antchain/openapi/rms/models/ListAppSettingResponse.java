// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class ListAppSettingResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // APP配置列表
    @NameInMap("app_settings")
    public java.util.List<AppSetting> appSettings;

    public static ListAppSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppSettingResponse self = new ListAppSettingResponse();
        return TeaModel.build(map, self);
    }

    public ListAppSettingResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListAppSettingResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListAppSettingResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListAppSettingResponse setAppSettings(java.util.List<AppSetting> appSettings) {
        this.appSettings = appSettings;
        return this;
    }
    public java.util.List<AppSetting> getAppSettings() {
        return this.appSettings;
    }

}
