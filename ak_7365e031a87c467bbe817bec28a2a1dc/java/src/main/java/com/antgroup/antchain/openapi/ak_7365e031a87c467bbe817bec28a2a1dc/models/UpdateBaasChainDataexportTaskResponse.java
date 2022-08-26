// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_7365e031a87c467bbe817bec28a2a1dc.models;

import com.aliyun.tea.*;

public class UpdateBaasChainDataexportTaskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    //  修改导出任务（名称、描述、告警地址）信息结构体
    //   
    @NameInMap("result")
    public TriggerDTOStructBody result;

    public static UpdateBaasChainDataexportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBaasChainDataexportTaskResponse self = new UpdateBaasChainDataexportTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBaasChainDataexportTaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateBaasChainDataexportTaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateBaasChainDataexportTaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateBaasChainDataexportTaskResponse setResult(TriggerDTOStructBody result) {
        this.result = result;
        return this;
    }
    public TriggerDTOStructBody getResult() {
        return this.result;
    }

}
