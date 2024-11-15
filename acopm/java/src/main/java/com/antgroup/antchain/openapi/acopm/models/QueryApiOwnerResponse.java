// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class QueryApiOwnerResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // buc用户信息
    @NameInMap("buc_user")
    public BucUser bucUser;

    public static QueryApiOwnerResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryApiOwnerResponse self = new QueryApiOwnerResponse();
        return TeaModel.build(map, self);
    }

    public QueryApiOwnerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryApiOwnerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryApiOwnerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryApiOwnerResponse setBucUser(BucUser bucUser) {
        this.bucUser = bucUser;
        return this;
    }
    public BucUser getBucUser() {
        return this.bucUser;
    }

}
