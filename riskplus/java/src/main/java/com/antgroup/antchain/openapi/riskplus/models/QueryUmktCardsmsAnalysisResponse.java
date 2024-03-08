// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryUmktCardsmsAnalysisResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 卡片短信解析服务业务流水id，与渲染回执中的bizId保持一致
    @NameInMap("biz_card_id")
    public String bizCardId;

    // 不支持卡片短信的手机号，以,分隔
    @NameInMap("not_media_mobiles")
    public String notMediaMobiles;

    // 卡短解析短链返回参数
    @NameInMap("short_url_infos")
    public java.util.List<ShortUrlInfo> shortUrlInfos;

    public static QueryUmktCardsmsAnalysisResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUmktCardsmsAnalysisResponse self = new QueryUmktCardsmsAnalysisResponse();
        return TeaModel.build(map, self);
    }

    public QueryUmktCardsmsAnalysisResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryUmktCardsmsAnalysisResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryUmktCardsmsAnalysisResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryUmktCardsmsAnalysisResponse setBizCardId(String bizCardId) {
        this.bizCardId = bizCardId;
        return this;
    }
    public String getBizCardId() {
        return this.bizCardId;
    }

    public QueryUmktCardsmsAnalysisResponse setNotMediaMobiles(String notMediaMobiles) {
        this.notMediaMobiles = notMediaMobiles;
        return this;
    }
    public String getNotMediaMobiles() {
        return this.notMediaMobiles;
    }

    public QueryUmktCardsmsAnalysisResponse setShortUrlInfos(java.util.List<ShortUrlInfo> shortUrlInfos) {
        this.shortUrlInfos = shortUrlInfos;
        return this;
    }
    public java.util.List<ShortUrlInfo> getShortUrlInfos() {
        return this.shortUrlInfos;
    }

}
