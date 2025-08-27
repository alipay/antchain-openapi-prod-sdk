// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class OperateInnerAgreementterminatezfbdirectResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 支付宝是否直接解约
    // true: 直接解约
    // false: 不直接解约
    @NameInMap("zfb_direct_terminate")
    public Boolean zfbDirectTerminate;

    // 判断是否ato处理解约
    // true:是
    // false:否
    @NameInMap("ato_handle")
    public Boolean atoHandle;

    // 解约弹窗文案
    @NameInMap("toast_text")
    public String toastText;

    // 不直接解约场景的跳转地址
    // 1、ato无法解约跳转地址
    // 2、客服小程序解约跳转地址
    @NameInMap("jump_url")
    public String jumpUrl;

    // 解约跳转地址右按钮文案
    @NameInMap("jump_url_text")
    public String jumpUrlText;

    public static OperateInnerAgreementterminatezfbdirectResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateInnerAgreementterminatezfbdirectResponse self = new OperateInnerAgreementterminatezfbdirectResponse();
        return TeaModel.build(map, self);
    }

    public OperateInnerAgreementterminatezfbdirectResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public OperateInnerAgreementterminatezfbdirectResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public OperateInnerAgreementterminatezfbdirectResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public OperateInnerAgreementterminatezfbdirectResponse setZfbDirectTerminate(Boolean zfbDirectTerminate) {
        this.zfbDirectTerminate = zfbDirectTerminate;
        return this;
    }
    public Boolean getZfbDirectTerminate() {
        return this.zfbDirectTerminate;
    }

    public OperateInnerAgreementterminatezfbdirectResponse setAtoHandle(Boolean atoHandle) {
        this.atoHandle = atoHandle;
        return this;
    }
    public Boolean getAtoHandle() {
        return this.atoHandle;
    }

    public OperateInnerAgreementterminatezfbdirectResponse setToastText(String toastText) {
        this.toastText = toastText;
        return this;
    }
    public String getToastText() {
        return this.toastText;
    }

    public OperateInnerAgreementterminatezfbdirectResponse setJumpUrl(String jumpUrl) {
        this.jumpUrl = jumpUrl;
        return this;
    }
    public String getJumpUrl() {
        return this.jumpUrl;
    }

    public OperateInnerAgreementterminatezfbdirectResponse setJumpUrlText(String jumpUrlText) {
        this.jumpUrlText = jumpUrlText;
        return this;
    }
    public String getJumpUrlText() {
        return this.jumpUrlText;
    }

}
