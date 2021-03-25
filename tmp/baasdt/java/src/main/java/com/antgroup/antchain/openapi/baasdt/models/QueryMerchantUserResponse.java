// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryMerchantUserResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 用户完整信息
    // {
    //             "tenant_id": "ZKUA",
    //             "user_id": "331f9b0922f940f464d4b94b5628180408ac305b7fc72d3e40f5b7727d0702fb",
    //             "local_id": "user01",
    //             "did": "",
    //             "vc": "",
    //             "pk": "3280b948a7fa8525c0fbfd47d1df75d7a7ee9f3baedd6964565b42f461dd86732717c4bc4c8203ea2b9b1aeef7b148644babba3c0cd6927c4c0964919f590c6c"
    //         }
    // 
    @NameInMap("user")
    public User user;

    public static QueryMerchantUserResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMerchantUserResponse self = new QueryMerchantUserResponse();
        return TeaModel.build(map, self);
    }

    public QueryMerchantUserResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMerchantUserResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMerchantUserResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMerchantUserResponse setUser(User user) {
        this.user = user;
        return this;
    }
    public User getUser() {
        return this.user;
    }

}
