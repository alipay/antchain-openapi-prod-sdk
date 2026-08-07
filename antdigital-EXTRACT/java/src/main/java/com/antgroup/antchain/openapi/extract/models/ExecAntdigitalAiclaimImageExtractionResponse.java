// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.extract.models;

import com.aliyun.tea.*;

public class ExecAntdigitalAiclaimImageExtractionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 材料类型
    @NameInMap("material_type")
    public String materialType;

    // 单据字段内容
    @NameInMap("key_fields")
    public String keyFields;

    public static ExecAntdigitalAiclaimImageExtractionResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecAntdigitalAiclaimImageExtractionResponse self = new ExecAntdigitalAiclaimImageExtractionResponse();
        return TeaModel.build(map, self);
    }

    public ExecAntdigitalAiclaimImageExtractionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecAntdigitalAiclaimImageExtractionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecAntdigitalAiclaimImageExtractionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecAntdigitalAiclaimImageExtractionResponse setMaterialType(String materialType) {
        this.materialType = materialType;
        return this;
    }
    public String getMaterialType() {
        return this.materialType;
    }

    public ExecAntdigitalAiclaimImageExtractionResponse setKeyFields(String keyFields) {
        this.keyFields = keyFields;
        return this;
    }
    public String getKeyFields() {
        return this.keyFields;
    }

}
