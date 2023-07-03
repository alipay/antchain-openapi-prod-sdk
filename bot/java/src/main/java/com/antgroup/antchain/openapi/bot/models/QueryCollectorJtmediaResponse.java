// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryCollectorJtmediaResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 多媒体文件列表
    @NameInMap("media_list")
    public java.util.List<JtMedia> mediaList;

    public static QueryCollectorJtmediaResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCollectorJtmediaResponse self = new QueryCollectorJtmediaResponse();
        return TeaModel.build(map, self);
    }

    public QueryCollectorJtmediaResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCollectorJtmediaResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCollectorJtmediaResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCollectorJtmediaResponse setMediaList(java.util.List<JtMedia> mediaList) {
        this.mediaList = mediaList;
        return this;
    }
    public java.util.List<JtMedia> getMediaList() {
        return this.mediaList;
    }

}
