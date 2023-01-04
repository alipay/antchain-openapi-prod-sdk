// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class SendContractComplainfeedbackRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 支付宝侧投诉单号
    @NameInMap("complain_event_id")
    @Validation(required = true, maxLength = 64)
    public String complainEventId;

    // 反馈类目ID
    // 00:使用体验保障金退款；
    // 02:通过其他方式退款;
    // 03:已发货;
    // 04:其他;
    // 05:已完成售后服务;
    // 06:非我方责任范围；
    @NameInMap("feedback_code")
    @Validation(required = true, maxLength = 32)
    public String feedbackCode;

    // 反馈内容，字数不超过200个字
    @NameInMap("feedback_content")
    @Validation(required = true, maxLength = 200)
    public String feedbackContent;

    // 商家处理投诉时反馈凭证的图片id，多个逗号隔开（图片id可以通过"商户上传处理图片"接口获取）
    @NameInMap("feedback_images")
    public String feedbackImages;

    // 处理投诉人，字数不超过6个字
    @NameInMap("operator")
    @Validation(maxLength = 32)
    public String operator;

    public static SendContractComplainfeedbackRequest build(java.util.Map<String, ?> map) throws Exception {
        SendContractComplainfeedbackRequest self = new SendContractComplainfeedbackRequest();
        return TeaModel.build(map, self);
    }

    public SendContractComplainfeedbackRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendContractComplainfeedbackRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SendContractComplainfeedbackRequest setComplainEventId(String complainEventId) {
        this.complainEventId = complainEventId;
        return this;
    }
    public String getComplainEventId() {
        return this.complainEventId;
    }

    public SendContractComplainfeedbackRequest setFeedbackCode(String feedbackCode) {
        this.feedbackCode = feedbackCode;
        return this;
    }
    public String getFeedbackCode() {
        return this.feedbackCode;
    }

    public SendContractComplainfeedbackRequest setFeedbackContent(String feedbackContent) {
        this.feedbackContent = feedbackContent;
        return this;
    }
    public String getFeedbackContent() {
        return this.feedbackContent;
    }

    public SendContractComplainfeedbackRequest setFeedbackImages(String feedbackImages) {
        this.feedbackImages = feedbackImages;
        return this;
    }
    public String getFeedbackImages() {
        return this.feedbackImages;
    }

    public SendContractComplainfeedbackRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
