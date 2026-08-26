// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.agorax.models;

import com.aliyun.tea.*;

public class PushMarketingConversionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 全部转化记录的逐条处理结果
    @NameInMap("conversion_results")
    public java.util.List<MarketingConversionResultItem> conversionResults;

    public static PushMarketingConversionResponse build(java.util.Map<String, ?> map) throws Exception {
        PushMarketingConversionResponse self = new PushMarketingConversionResponse();
        return TeaModel.build(map, self);
    }

    public PushMarketingConversionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PushMarketingConversionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushMarketingConversionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PushMarketingConversionResponse setConversionResults(java.util.List<MarketingConversionResultItem> conversionResults) {
        this.conversionResults = conversionResults;
        return this;
    }
    public java.util.List<MarketingConversionResultItem> getConversionResults() {
        return this.conversionResults;
    }

}
