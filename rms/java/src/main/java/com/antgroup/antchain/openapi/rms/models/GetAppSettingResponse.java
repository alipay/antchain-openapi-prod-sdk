// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class GetAppSettingResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // APP配置
    @NameInMap("app_setting")
    public AppSetting appSetting;

    public static GetAppSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppSettingResponse self = new GetAppSettingResponse();
        return TeaModel.build(map, self);
    }

    public GetAppSettingResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetAppSettingResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAppSettingResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetAppSettingResponse setAppSetting(AppSetting appSetting) {
        this.appSetting = appSetting;
        return this;
    }
    public AppSetting getAppSetting() {
        return this.appSetting;
    }

}
