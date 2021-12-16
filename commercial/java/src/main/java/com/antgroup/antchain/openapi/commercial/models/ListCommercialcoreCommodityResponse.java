// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class ListCommercialcoreCommodityResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 商品列表
    @NameInMap("commodities")
    public java.util.List<CommodityVO> commodities;

    public static ListCommercialcoreCommodityResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCommercialcoreCommodityResponse self = new ListCommercialcoreCommodityResponse();
        return TeaModel.build(map, self);
    }

    public ListCommercialcoreCommodityResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListCommercialcoreCommodityResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListCommercialcoreCommodityResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListCommercialcoreCommodityResponse setCommodities(java.util.List<CommodityVO> commodities) {
        this.commodities = commodities;
        return this;
    }
    public java.util.List<CommodityVO> getCommodities() {
        return this.commodities;
    }

}
