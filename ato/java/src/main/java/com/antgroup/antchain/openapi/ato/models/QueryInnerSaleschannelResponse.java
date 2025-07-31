// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerSaleschannelResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 渠道code
    @NameInMap("channel_code")
    public String channelCode;

    // 渠道名称
    @NameInMap("channel_name")
    public String channelName;

    // 	
    // 渠道链接
    @NameInMap("channel_link")
    public String channelLink;

    // 渠道级别
    @NameInMap("channel_level")
    public Long channelLevel;

    // 子渠道列表，JSONArray
    @NameInMap("child_channel_list")
    public String childChannelList;

    public static QueryInnerSaleschannelResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerSaleschannelResponse self = new QueryInnerSaleschannelResponse();
        return TeaModel.build(map, self);
    }

    public QueryInnerSaleschannelResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInnerSaleschannelResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInnerSaleschannelResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInnerSaleschannelResponse setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public QueryInnerSaleschannelResponse setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public QueryInnerSaleschannelResponse setChannelLink(String channelLink) {
        this.channelLink = channelLink;
        return this;
    }
    public String getChannelLink() {
        return this.channelLink;
    }

    public QueryInnerSaleschannelResponse setChannelLevel(Long channelLevel) {
        this.channelLevel = channelLevel;
        return this;
    }
    public Long getChannelLevel() {
        return this.channelLevel;
    }

    public QueryInnerSaleschannelResponse setChildChannelList(String childChannelList) {
        this.childChannelList = childChannelList;
        return this;
    }
    public String getChildChannelList() {
        return this.childChannelList;
    }

}
