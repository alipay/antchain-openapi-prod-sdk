// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CheckEpidentityTwometaResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 企业状态。
    @NameInMap("enterprise_status")
    public String enterpriseStatus;

    // 营业期限。
    @NameInMap("open_time")
    public String openTime;

    // 核验是否通过。
    @NameInMap("passed")
    public Boolean passed;

    // 0:核验成功 1:企业信息有误 2:企业非正常营业
    @NameInMap("code")
    public String code;

    public static CheckEpidentityTwometaResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckEpidentityTwometaResponse self = new CheckEpidentityTwometaResponse();
        return TeaModel.build(map, self);
    }

    public CheckEpidentityTwometaResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckEpidentityTwometaResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckEpidentityTwometaResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckEpidentityTwometaResponse setEnterpriseStatus(String enterpriseStatus) {
        this.enterpriseStatus = enterpriseStatus;
        return this;
    }
    public String getEnterpriseStatus() {
        return this.enterpriseStatus;
    }

    public CheckEpidentityTwometaResponse setOpenTime(String openTime) {
        this.openTime = openTime;
        return this;
    }
    public String getOpenTime() {
        return this.openTime;
    }

    public CheckEpidentityTwometaResponse setPassed(Boolean passed) {
        this.passed = passed;
        return this;
    }
    public Boolean getPassed() {
        return this.passed;
    }

    public CheckEpidentityTwometaResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
