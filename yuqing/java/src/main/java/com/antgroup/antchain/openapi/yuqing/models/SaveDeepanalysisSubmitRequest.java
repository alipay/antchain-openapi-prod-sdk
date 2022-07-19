// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class SaveDeepanalysisSubmitRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 深度分析类型
    @NameInMap("tool_type")
    @Validation(required = true)
    public String toolType;

    // 任务名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 深度分析配置
    @NameInMap("config")
    @Validation(required = true)
    public AnalysisConfig config;

    public static SaveDeepanalysisSubmitRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveDeepanalysisSubmitRequest self = new SaveDeepanalysisSubmitRequest();
        return TeaModel.build(map, self);
    }

    public SaveDeepanalysisSubmitRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveDeepanalysisSubmitRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveDeepanalysisSubmitRequest setToolType(String toolType) {
        this.toolType = toolType;
        return this;
    }
    public String getToolType() {
        return this.toolType;
    }

    public SaveDeepanalysisSubmitRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SaveDeepanalysisSubmitRequest setConfig(AnalysisConfig config) {
        this.config = config;
        return this;
    }
    public AnalysisConfig getConfig() {
        return this.config;
    }

}
