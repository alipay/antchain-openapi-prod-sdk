// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_6f8b0e7502ec49d28cd8ad0e5807bbf9.models;

import com.aliyun.tea.*;

public class QueryDemoApdevcenterTestobjectTestsubaResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 主键
    @NameInMap("id")
    public Long id;

    // 名称
    @NameInMap("name")
    public String name;

    // 描述
    @NameInMap("desc")
    public String desc;

    public static QueryDemoApdevcenterTestobjectTestsubaResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoApdevcenterTestobjectTestsubaResponse self = new QueryDemoApdevcenterTestobjectTestsubaResponse();
        return TeaModel.build(map, self);
    }

    public QueryDemoApdevcenterTestobjectTestsubaResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDemoApdevcenterTestobjectTestsubaResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDemoApdevcenterTestobjectTestsubaResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDemoApdevcenterTestobjectTestsubaResponse setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueryDemoApdevcenterTestobjectTestsubaResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryDemoApdevcenterTestobjectTestsubaResponse setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

}
