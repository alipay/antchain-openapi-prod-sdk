// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class SaveAnalysisSubmitRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 分析类型
    @NameInMap("analyse_type")
    @Validation(required = true)
    public String analyseType;

    // 查询条件
    @NameInMap("search_condition")
    @Validation(required = true)
    public SearchCondition searchCondition;

    public static SaveAnalysisSubmitRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveAnalysisSubmitRequest self = new SaveAnalysisSubmitRequest();
        return TeaModel.build(map, self);
    }

    public SaveAnalysisSubmitRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveAnalysisSubmitRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveAnalysisSubmitRequest setAnalyseType(String analyseType) {
        this.analyseType = analyseType;
        return this;
    }
    public String getAnalyseType() {
        return this.analyseType;
    }

    public SaveAnalysisSubmitRequest setSearchCondition(SearchCondition searchCondition) {
        this.searchCondition = searchCondition;
        return this;
    }
    public SearchCondition getSearchCondition() {
        return this.searchCondition;
    }

}
