// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_24b462c17fab4e6998dcceeb37c41789.models;

import com.aliyun.tea.*;

public class QueryDemoTestTestResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    public static QueryDemoTestTestResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoTestTestResponse self = new QueryDemoTestTestResponse();
        return TeaModel.build(map, self);
    }

    public QueryDemoTestTestResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDemoTestTestResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDemoTestTestResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

}
