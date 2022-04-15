// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class SendProductNoticeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 提醒类型
    @NameInMap("notice_type")
    public String noticeType;

    // 钉钉结构体
    @NameInMap("ding_talk_content")
    public DingTalkContent dingTalkContent;

    public static SendProductNoticeRequest build(java.util.Map<String, ?> map) throws Exception {
        SendProductNoticeRequest self = new SendProductNoticeRequest();
        return TeaModel.build(map, self);
    }

    public SendProductNoticeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendProductNoticeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SendProductNoticeRequest setNoticeType(String noticeType) {
        this.noticeType = noticeType;
        return this;
    }
    public String getNoticeType() {
        return this.noticeType;
    }

    public SendProductNoticeRequest setDingTalkContent(DingTalkContent dingTalkContent) {
        this.dingTalkContent = dingTalkContent;
        return this;
    }
    public DingTalkContent getDingTalkContent() {
        return this.dingTalkContent;
    }

}
