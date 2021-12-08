// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UpdateChainDataexportTaskResponse extends TeaModel {
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

    public static UpdateChainDataexportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateChainDataexportTaskResponse self = new UpdateChainDataexportTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateChainDataexportTaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateChainDataexportTaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateChainDataexportTaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateChainDataexportTaskResponse setResult(TriggerDTOStructBody result) {
        this.result = result;
        return this;
    }
    public TriggerDTOStructBody getResult() {
        return this.result;
    }

}
