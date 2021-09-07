// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.goodschain.models;

import com.aliyun.tea.*;

public class QueryGoodsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 商品信息
    @NameInMap("goods")
    public GoodsDTO goods;

    // 溯源信息列表
    @NameInMap("trace_info_list")
    public java.util.List<TraceInfoDTO> traceInfoList;

    // 流转信息列表
    @NameInMap("roam_trace_list")
    public java.util.List<TraceInfoDTO> roamTraceList;

    public static QueryGoodsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGoodsResponse self = new QueryGoodsResponse();
        return TeaModel.build(map, self);
    }

    public QueryGoodsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryGoodsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryGoodsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryGoodsResponse setGoods(GoodsDTO goods) {
        this.goods = goods;
        return this;
    }
    public GoodsDTO getGoods() {
        return this.goods;
    }

    public QueryGoodsResponse setTraceInfoList(java.util.List<TraceInfoDTO> traceInfoList) {
        this.traceInfoList = traceInfoList;
        return this;
    }
    public java.util.List<TraceInfoDTO> getTraceInfoList() {
        return this.traceInfoList;
    }

    public QueryGoodsResponse setRoamTraceList(java.util.List<TraceInfoDTO> roamTraceList) {
        this.roamTraceList = roamTraceList;
        return this;
    }
    public java.util.List<TraceInfoDTO> getRoamTraceList() {
        return this.roamTraceList;
    }

}
