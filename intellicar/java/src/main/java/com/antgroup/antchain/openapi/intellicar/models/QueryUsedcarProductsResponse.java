// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class QueryUsedcarProductsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 状态码
    @NameInMap("code")
    public String code;

    // 状态信息
    @NameInMap("msg")
    public String msg;

    // 车系名
    @NameInMap("seriesname")
    public String seriesname;

    // 车系id
    @NameInMap("seriesid")
    public String seriesid;

    // 车型信息
    @NameInMap("productlist")
    public java.util.List<ProductInfo> productlist;

    public static QueryUsedcarProductsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUsedcarProductsResponse self = new QueryUsedcarProductsResponse();
        return TeaModel.build(map, self);
    }

    public QueryUsedcarProductsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryUsedcarProductsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryUsedcarProductsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryUsedcarProductsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryUsedcarProductsResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public QueryUsedcarProductsResponse setSeriesname(String seriesname) {
        this.seriesname = seriesname;
        return this;
    }
    public String getSeriesname() {
        return this.seriesname;
    }

    public QueryUsedcarProductsResponse setSeriesid(String seriesid) {
        this.seriesid = seriesid;
        return this;
    }
    public String getSeriesid() {
        return this.seriesid;
    }

    public QueryUsedcarProductsResponse setProductlist(java.util.List<ProductInfo> productlist) {
        this.productlist = productlist;
        return this;
    }
    public java.util.List<ProductInfo> getProductlist() {
        return this.productlist;
    }

}
