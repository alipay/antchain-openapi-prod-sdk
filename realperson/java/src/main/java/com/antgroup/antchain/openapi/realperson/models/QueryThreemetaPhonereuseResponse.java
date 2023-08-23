// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryThreemetaPhonereuseResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否二次放号
    @NameInMap("phone_reuse")
    public String phoneReuse;

    // 扩展参数
    @NameInMap("extern_info")
    public String externInfo;

    public static QueryThreemetaPhonereuseResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryThreemetaPhonereuseResponse self = new QueryThreemetaPhonereuseResponse();
        return TeaModel.build(map, self);
    }

    public QueryThreemetaPhonereuseResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryThreemetaPhonereuseResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryThreemetaPhonereuseResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryThreemetaPhonereuseResponse setPhoneReuse(String phoneReuse) {
        this.phoneReuse = phoneReuse;
        return this;
    }
    public String getPhoneReuse() {
        return this.phoneReuse;
    }

    public QueryThreemetaPhonereuseResponse setExternInfo(String externInfo) {
        this.externInfo = externInfo;
        return this;
    }
    public String getExternInfo() {
        return this.externInfo;
    }

}
