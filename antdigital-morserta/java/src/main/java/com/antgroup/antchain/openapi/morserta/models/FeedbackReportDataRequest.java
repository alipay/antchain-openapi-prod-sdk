// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.morserta.models;

import com.aliyun.tea.*;

public class FeedbackReportDataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 广告主账号ID
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 报表类型级别
    @NameInMap("level")
    @Validation(required = true)
    public String level;

    // 回传数据明细，类型json array
    @NameInMap("feedback_data")
    @Validation(required = true)
    public String feedbackData;

    public static FeedbackReportDataRequest build(java.util.Map<String, ?> map) throws Exception {
        FeedbackReportDataRequest self = new FeedbackReportDataRequest();
        return TeaModel.build(map, self);
    }

    public FeedbackReportDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public FeedbackReportDataRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public FeedbackReportDataRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public FeedbackReportDataRequest setFeedbackData(String feedbackData) {
        this.feedbackData = feedbackData;
        return this;
    }
    public String getFeedbackData() {
        return this.feedbackData;
    }

}
