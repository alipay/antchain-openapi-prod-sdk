// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeRouterUserselectResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用户分层信息
    @NameInMap("user_classify_info")
    public UserClassifyInfo userClassifyInfo;

    // json字符串，预留扩展字段
    @NameInMap("ext_info")
    public String extInfo;

    public static QueryDubbridgeRouterUserselectResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeRouterUserselectResponse self = new QueryDubbridgeRouterUserselectResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeRouterUserselectResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeRouterUserselectResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeRouterUserselectResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeRouterUserselectResponse setUserClassifyInfo(UserClassifyInfo userClassifyInfo) {
        this.userClassifyInfo = userClassifyInfo;
        return this;
    }
    public UserClassifyInfo getUserClassifyInfo() {
        return this.userClassifyInfo;
    }

    public QueryDubbridgeRouterUserselectResponse setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
