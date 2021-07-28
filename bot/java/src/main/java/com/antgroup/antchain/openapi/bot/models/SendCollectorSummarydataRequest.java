// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class SendCollectorSummarydataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 汇总所属的场景码
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 汇总的业务类型，同一个scene下可以有不同的业务类型，此字段用于区分业务类型
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 提交日期（汇总所属的日期）
    @NameInMap("submit_date")
    @Validation(required = true)
    public String submitDate;

    // 汇总数据的数据模型ID
    @NameInMap("data_model_id")
    @Validation(required = true)
    public String dataModelId;

    // 汇总数据的内容，格式遵循data_model_id制定的格式
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    public static SendCollectorSummarydataRequest build(java.util.Map<String, ?> map) throws Exception {
        SendCollectorSummarydataRequest self = new SendCollectorSummarydataRequest();
        return TeaModel.build(map, self);
    }

    public SendCollectorSummarydataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendCollectorSummarydataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SendCollectorSummarydataRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public SendCollectorSummarydataRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public SendCollectorSummarydataRequest setSubmitDate(String submitDate) {
        this.submitDate = submitDate;
        return this;
    }
    public String getSubmitDate() {
        return this.submitDate;
    }

    public SendCollectorSummarydataRequest setDataModelId(String dataModelId) {
        this.dataModelId = dataModelId;
        return this;
    }
    public String getDataModelId() {
        return this.dataModelId;
    }

    public SendCollectorSummarydataRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
