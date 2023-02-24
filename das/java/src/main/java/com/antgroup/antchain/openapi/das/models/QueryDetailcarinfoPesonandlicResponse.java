// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class QueryDetailcarinfoPesonandlicResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 车辆详细信息
    @NameInMap("data")
    public DetailCarInfo data;

    // 是否是该人名下的车，true表示是，false表示否
    @NameInMap("owner")
    public Boolean owner;

    public static QueryDetailcarinfoPesonandlicResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDetailcarinfoPesonandlicResponse self = new QueryDetailcarinfoPesonandlicResponse();
        return TeaModel.build(map, self);
    }

    public QueryDetailcarinfoPesonandlicResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDetailcarinfoPesonandlicResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDetailcarinfoPesonandlicResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDetailcarinfoPesonandlicResponse setData(DetailCarInfo data) {
        this.data = data;
        return this;
    }
    public DetailCarInfo getData() {
        return this.data;
    }

    public QueryDetailcarinfoPesonandlicResponse setOwner(Boolean owner) {
        this.owner = owner;
        return this;
    }
    public Boolean getOwner() {
        return this.owner;
    }

}
