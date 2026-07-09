// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ExecElectrocarOtataskretryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 重试操作是否成功
    @NameInMap("success")
    public Boolean success;

    // BLE 固件下载地址；4G 通道重试时为空
    @NameInMap("firmware_url")
    public String firmwareUrl;

    // BLE 固件文件大小，单位 B
    @NameInMap("firmware_size")
    public Long firmwareSize;

    // BLE 固件 MD5
    @NameInMap("firmware_md5")
    public String firmwareMd5;

    // 本次任务目标版本号
    @NameInMap("dest_version")
    public String destVersion;

    // BLE 固件分包数据，按端侧传输协议编码后的字符串列表
    @NameInMap("firmware_data")
    public java.util.List<String> firmwareData;

    public static ExecElectrocarOtataskretryResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecElectrocarOtataskretryResponse self = new ExecElectrocarOtataskretryResponse();
        return TeaModel.build(map, self);
    }

    public ExecElectrocarOtataskretryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecElectrocarOtataskretryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecElectrocarOtataskretryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecElectrocarOtataskretryResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ExecElectrocarOtataskretryResponse setFirmwareUrl(String firmwareUrl) {
        this.firmwareUrl = firmwareUrl;
        return this;
    }
    public String getFirmwareUrl() {
        return this.firmwareUrl;
    }

    public ExecElectrocarOtataskretryResponse setFirmwareSize(Long firmwareSize) {
        this.firmwareSize = firmwareSize;
        return this;
    }
    public Long getFirmwareSize() {
        return this.firmwareSize;
    }

    public ExecElectrocarOtataskretryResponse setFirmwareMd5(String firmwareMd5) {
        this.firmwareMd5 = firmwareMd5;
        return this;
    }
    public String getFirmwareMd5() {
        return this.firmwareMd5;
    }

    public ExecElectrocarOtataskretryResponse setDestVersion(String destVersion) {
        this.destVersion = destVersion;
        return this;
    }
    public String getDestVersion() {
        return this.destVersion;
    }

    public ExecElectrocarOtataskretryResponse setFirmwareData(java.util.List<String> firmwareData) {
        this.firmwareData = firmwareData;
        return this;
    }
    public java.util.List<String> getFirmwareData() {
        return this.firmwareData;
    }

}
