// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryAssetInstructionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 资产流水完整信息的json字符串。
    // direction 交易方向:：0正向交易，1反向交易。
    // type 交易类型：0 资产发行；1资产赎回；2资产发放；3资产发放回退；4资产风控调整；5资产过期；6资产支付；7资产支付退款。
    // status流水状态(Complete)；0完成
    @NameInMap("instruction")
    public String instruction;

    public static QueryAssetInstructionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAssetInstructionResponse self = new QueryAssetInstructionResponse();
        return TeaModel.build(map, self);
    }

    public QueryAssetInstructionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAssetInstructionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAssetInstructionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAssetInstructionResponse setInstruction(String instruction) {
        this.instruction = instruction;
        return this;
    }
    public String getInstruction() {
        return this.instruction;
    }

}
