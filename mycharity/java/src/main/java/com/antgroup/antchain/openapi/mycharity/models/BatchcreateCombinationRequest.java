// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mycharity.models;

import com.aliyun.tea.*;

public class BatchcreateCombinationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 分期id
    @NameInMap("stages_id")
    @Validation(required = true)
    public String stagesId;

    // 实施内容信息集合
    @NameInMap("combination_message_list")
    @Validation(required = true)
    public java.util.List<SubjectCombinationMessage> combinationMessageList;

    public static BatchcreateCombinationRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateCombinationRequest self = new BatchcreateCombinationRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateCombinationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateCombinationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchcreateCombinationRequest setStagesId(String stagesId) {
        this.stagesId = stagesId;
        return this;
    }
    public String getStagesId() {
        return this.stagesId;
    }

    public BatchcreateCombinationRequest setCombinationMessageList(java.util.List<SubjectCombinationMessage> combinationMessageList) {
        this.combinationMessageList = combinationMessageList;
        return this;
    }
    public java.util.List<SubjectCombinationMessage> getCombinationMessageList() {
        return this.combinationMessageList;
    }

}
