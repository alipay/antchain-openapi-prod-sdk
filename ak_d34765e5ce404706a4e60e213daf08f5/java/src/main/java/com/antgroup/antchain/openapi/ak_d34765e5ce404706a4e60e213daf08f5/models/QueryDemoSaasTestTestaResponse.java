// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d34765e5ce404706a4e60e213daf08f5.models;

import com.aliyun.tea.*;

public class QueryDemoSaasTestTestaResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 男
    @NameInMap("sex")
    public String sex;

    public static QueryDemoSaasTestTestaResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoSaasTestTestaResponse self = new QueryDemoSaasTestTestaResponse();
        return TeaModel.build(map, self);
    }

    public QueryDemoSaasTestTestaResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDemoSaasTestTestaResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDemoSaasTestTestaResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDemoSaasTestTestaResponse setSex(String sex) {
        this.sex = sex;
        return this;
    }
    public String getSex() {
        return this.sex;
    }

}
