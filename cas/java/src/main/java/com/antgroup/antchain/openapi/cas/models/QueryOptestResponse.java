// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryOptestResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // str
    @NameInMap("str")
    public String str;

    // lon
    @NameInMap("lon")
    public Long lon;

    // stru
    @NameInMap("stru")
    public VPC stru;

    // arr_str
    @NameInMap("arr_str")
    public java.util.List<String> arrStr;

    // arr_stru
    @NameInMap("arr_stru")
    public java.util.List<VPC> arrStru;

    public static QueryOptestResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOptestResponse self = new QueryOptestResponse();
        return TeaModel.build(map, self);
    }

    public QueryOptestResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryOptestResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryOptestResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryOptestResponse setStr(String str) {
        this.str = str;
        return this;
    }
    public String getStr() {
        return this.str;
    }

    public QueryOptestResponse setLon(Long lon) {
        this.lon = lon;
        return this;
    }
    public Long getLon() {
        return this.lon;
    }

    public QueryOptestResponse setStru(VPC stru) {
        this.stru = stru;
        return this;
    }
    public VPC getStru() {
        return this.stru;
    }

    public QueryOptestResponse setArrStr(java.util.List<String> arrStr) {
        this.arrStr = arrStr;
        return this;
    }
    public java.util.List<String> getArrStr() {
        return this.arrStr;
    }

    public QueryOptestResponse setArrStru(java.util.List<VPC> arrStru) {
        this.arrStru = arrStru;
        return this;
    }
    public java.util.List<VPC> getArrStru() {
        return this.arrStru;
    }

}
