// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_6f8b0e7502ec49d28cd8ad0e5807bbf9.models;

import com.aliyun.tea.*;

public class QueryDemoTestproductTestobjectTestsubaaaResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // test
    @NameInMap("name")
    public String name;

    public static QueryDemoTestproductTestobjectTestsubaaaResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoTestproductTestobjectTestsubaaaResponse self = new QueryDemoTestproductTestobjectTestsubaaaResponse();
        return TeaModel.build(map, self);
    }

    public QueryDemoTestproductTestobjectTestsubaaaResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDemoTestproductTestobjectTestsubaaaResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDemoTestproductTestobjectTestsubaaaResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDemoTestproductTestobjectTestsubaaaResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
