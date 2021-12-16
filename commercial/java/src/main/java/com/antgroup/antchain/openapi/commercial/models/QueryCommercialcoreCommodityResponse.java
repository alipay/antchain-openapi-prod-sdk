// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class QueryCommercialcoreCommodityResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 商品来源列表
    @NameInMap("source_types")
    public java.util.List<CommoditySourceType> sourceTypes;

    public static QueryCommercialcoreCommodityResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCommercialcoreCommodityResponse self = new QueryCommercialcoreCommodityResponse();
        return TeaModel.build(map, self);
    }

    public QueryCommercialcoreCommodityResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCommercialcoreCommodityResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCommercialcoreCommodityResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCommercialcoreCommodityResponse setSourceTypes(java.util.List<CommoditySourceType> sourceTypes) {
        this.sourceTypes = sourceTypes;
        return this;
    }
    public java.util.List<CommoditySourceType> getSourceTypes() {
        return this.sourceTypes;
    }

}
