// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRtopTagImageResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 标签图片列表
    @NameInMap("risk_images")
    public java.util.List<RtopTagImage> riskImages;

    public static QueryRtopTagImageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRtopTagImageResponse self = new QueryRtopTagImageResponse();
        return TeaModel.build(map, self);
    }

    public QueryRtopTagImageResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRtopTagImageResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRtopTagImageResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRtopTagImageResponse setRiskImages(java.util.List<RtopTagImage> riskImages) {
        this.riskImages = riskImages;
        return this;
    }
    public java.util.List<RtopTagImage> getRiskImages() {
        return this.riskImages;
    }

}
