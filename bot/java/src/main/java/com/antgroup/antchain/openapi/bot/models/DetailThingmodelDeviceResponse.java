// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class DetailThingmodelDeviceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 设备状态
    @NameInMap("status")
    public String status;

    // 设备状态是否可用
    @NameInMap("status_available")
    public Boolean statusAvailable;

    // SDK版本号
    @NameInMap("sdk_version")
    public String sdkVersion;

    // SDK版本号是否可用
    @NameInMap("sdk_version_available")
    public Boolean sdkVersionAvailable;

    public static DetailThingmodelDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailThingmodelDeviceResponse self = new DetailThingmodelDeviceResponse();
        return TeaModel.build(map, self);
    }

    public DetailThingmodelDeviceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailThingmodelDeviceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailThingmodelDeviceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailThingmodelDeviceResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DetailThingmodelDeviceResponse setStatusAvailable(Boolean statusAvailable) {
        this.statusAvailable = statusAvailable;
        return this;
    }
    public Boolean getStatusAvailable() {
        return this.statusAvailable;
    }

    public DetailThingmodelDeviceResponse setSdkVersion(String sdkVersion) {
        this.sdkVersion = sdkVersion;
        return this;
    }
    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public DetailThingmodelDeviceResponse setSdkVersionAvailable(Boolean sdkVersionAvailable) {
        this.sdkVersionAvailable = sdkVersionAvailable;
        return this;
    }
    public Boolean getSdkVersionAvailable() {
        return this.sdkVersionAvailable;
    }

}
