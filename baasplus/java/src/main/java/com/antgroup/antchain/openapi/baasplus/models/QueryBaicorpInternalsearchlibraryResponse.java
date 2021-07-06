// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryBaicorpInternalsearchlibraryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // NoucelId
    @NameInMap("custom_id")
    public String customId;

    // 采用的模型以及版本说明
    @NameInMap("model_info")
    public String modelInfo;

    // 重复列表，json list格式
    @NameInMap("repeat_info")
    public String repeatInfo;

    // 相似度信息列表，json list格式
    @NameInMap("similarity_info")
    public String similarityInfo;

    public static QueryBaicorpInternalsearchlibraryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBaicorpInternalsearchlibraryResponse self = new QueryBaicorpInternalsearchlibraryResponse();
        return TeaModel.build(map, self);
    }

    public QueryBaicorpInternalsearchlibraryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBaicorpInternalsearchlibraryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBaicorpInternalsearchlibraryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBaicorpInternalsearchlibraryResponse setCustomId(String customId) {
        this.customId = customId;
        return this;
    }
    public String getCustomId() {
        return this.customId;
    }

    public QueryBaicorpInternalsearchlibraryResponse setModelInfo(String modelInfo) {
        this.modelInfo = modelInfo;
        return this;
    }
    public String getModelInfo() {
        return this.modelInfo;
    }

    public QueryBaicorpInternalsearchlibraryResponse setRepeatInfo(String repeatInfo) {
        this.repeatInfo = repeatInfo;
        return this;
    }
    public String getRepeatInfo() {
        return this.repeatInfo;
    }

    public QueryBaicorpInternalsearchlibraryResponse setSimilarityInfo(String similarityInfo) {
        this.similarityInfo = similarityInfo;
        return this;
    }
    public String getSimilarityInfo() {
        return this.similarityInfo;
    }

}
