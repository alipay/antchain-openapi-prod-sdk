// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creativerender.models;

import com.aliyun.tea.*;

public class QueryAntcloudMarketingagentCreativeResultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 消息ID
    @NameInMap("message_id")
    @Validation(required = true)
    public String messageId;

    // 是否返回基金长图的子图列表，默认 false。为 true 时，在长图生成完成后返回 assistant_extra.sub_images；不影响长图生成流程。
    @NameInMap("return_sub_images")
    public Boolean returnSubImages;

    public static QueryAntcloudMarketingagentCreativeResultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudMarketingagentCreativeResultRequest self = new QueryAntcloudMarketingagentCreativeResultRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudMarketingagentCreativeResultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntcloudMarketingagentCreativeResultRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public QueryAntcloudMarketingagentCreativeResultRequest setReturnSubImages(Boolean returnSubImages) {
        this.returnSubImages = returnSubImages;
        return this;
    }
    public Boolean getReturnSubImages() {
        return this.returnSubImages;
    }

}
