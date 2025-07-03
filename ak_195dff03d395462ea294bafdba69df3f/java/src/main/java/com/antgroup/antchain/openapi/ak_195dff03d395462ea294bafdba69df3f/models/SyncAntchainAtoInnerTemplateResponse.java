// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class SyncAntchainAtoInnerTemplateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 同步后的新模板code
    @NameInMap("target_template_code")
    public String targetTemplateCode;

    // 模板同步上线时(强管控字段)校验结果
    @NameInMap("valid_result")
    public Boolean validResult;

    // 校验结果明细JSONStr
    @NameInMap("valid_field_detail")
    public String validFieldDetail;

    public static SyncAntchainAtoInnerTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncAntchainAtoInnerTemplateResponse self = new SyncAntchainAtoInnerTemplateResponse();
        return TeaModel.build(map, self);
    }

    public SyncAntchainAtoInnerTemplateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SyncAntchainAtoInnerTemplateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SyncAntchainAtoInnerTemplateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SyncAntchainAtoInnerTemplateResponse setTargetTemplateCode(String targetTemplateCode) {
        this.targetTemplateCode = targetTemplateCode;
        return this;
    }
    public String getTargetTemplateCode() {
        return this.targetTemplateCode;
    }

    public SyncAntchainAtoInnerTemplateResponse setValidResult(Boolean validResult) {
        this.validResult = validResult;
        return this;
    }
    public Boolean getValidResult() {
        return this.validResult;
    }

    public SyncAntchainAtoInnerTemplateResponse setValidFieldDetail(String validFieldDetail) {
        this.validFieldDetail = validFieldDetail;
        return this;
    }
    public String getValidFieldDetail() {
        return this.validFieldDetail;
    }

}
