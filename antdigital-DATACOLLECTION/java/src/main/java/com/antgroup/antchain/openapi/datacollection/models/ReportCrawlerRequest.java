// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.datacollection.models;

import com.aliyun.tea.*;

public class ReportCrawlerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 上报MQ消息JSON串
    @NameInMap("msg_data")
    @Validation(required = true)
    public String msgData;

    public static ReportCrawlerRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportCrawlerRequest self = new ReportCrawlerRequest();
        return TeaModel.build(map, self);
    }

    public ReportCrawlerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReportCrawlerRequest setMsgData(String msgData) {
        this.msgData = msgData;
        return this;
    }
    public String getMsgData() {
        return this.msgData;
    }

}
