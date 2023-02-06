// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryThreemetaSeconddistributeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // YES：二次放号；NO：不是二次放号；CANCELLED：已销号
    @NameInMap("result")
    public String result;

    // 扩展信息，Map的json格式。
    @NameInMap("extern_info")
    public String externInfo;

    public static QueryThreemetaSeconddistributeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryThreemetaSeconddistributeResponse self = new QueryThreemetaSeconddistributeResponse();
        return TeaModel.build(map, self);
    }

    public QueryThreemetaSeconddistributeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryThreemetaSeconddistributeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryThreemetaSeconddistributeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryThreemetaSeconddistributeResponse setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public QueryThreemetaSeconddistributeResponse setExternInfo(String externInfo) {
        this.externInfo = externInfo;
        return this;
    }
    public String getExternInfo() {
        return this.externInfo;
    }

}
