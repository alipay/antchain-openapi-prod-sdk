// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class QueryUsedcarSeriesResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 品牌id
    @NameInMap("brandid")
    public String brandid;

    // 车系信息
    @NameInMap("serieslist")
    public java.util.List<LetterInfo> serieslist;

    // 品牌名称
    @NameInMap("brandname")
    public String brandname;

    // 状态码
    @NameInMap("code")
    public String code;

    // 响应结果
    @NameInMap("msg")
    public String msg;

    public static QueryUsedcarSeriesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUsedcarSeriesResponse self = new QueryUsedcarSeriesResponse();
        return TeaModel.build(map, self);
    }

    public QueryUsedcarSeriesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryUsedcarSeriesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryUsedcarSeriesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryUsedcarSeriesResponse setBrandid(String brandid) {
        this.brandid = brandid;
        return this;
    }
    public String getBrandid() {
        return this.brandid;
    }

    public QueryUsedcarSeriesResponse setSerieslist(java.util.List<LetterInfo> serieslist) {
        this.serieslist = serieslist;
        return this;
    }
    public java.util.List<LetterInfo> getSerieslist() {
        return this.serieslist;
    }

    public QueryUsedcarSeriesResponse setBrandname(String brandname) {
        this.brandname = brandname;
        return this;
    }
    public String getBrandname() {
        return this.brandname;
    }

    public QueryUsedcarSeriesResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryUsedcarSeriesResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

}
