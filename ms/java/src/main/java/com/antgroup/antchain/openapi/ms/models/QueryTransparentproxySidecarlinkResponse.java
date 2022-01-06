// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QueryTransparentproxySidecarlinkResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // sidecar脚本链接
    @NameInMap("data")
    public TransparentProxySidecarScriptLinkVo data;

    public static QueryTransparentproxySidecarlinkResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTransparentproxySidecarlinkResponse self = new QueryTransparentproxySidecarlinkResponse();
        return TeaModel.build(map, self);
    }

    public QueryTransparentproxySidecarlinkResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTransparentproxySidecarlinkResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTransparentproxySidecarlinkResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTransparentproxySidecarlinkResponse setData(TransparentProxySidecarScriptLinkVo data) {
        this.data = data;
        return this;
    }
    public TransparentProxySidecarScriptLinkVo getData() {
        return this.data;
    }

}
