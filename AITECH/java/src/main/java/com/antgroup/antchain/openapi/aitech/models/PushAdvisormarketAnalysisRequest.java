// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class PushAdvisormarketAnalysisRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 分析能力标识。当前仅支持 YINLI_CROWD_ANALYSIS。
    @NameInMap("analysis_type")
    @Validation(required = true)
    public String analysisType;

    // UTF-8 JSON 对象字符串，禁止二次编码。示例：{"city":"深圳","time_range":{"start_date":"2026-09-01","end_date":"2026-09-30"},"business_area":{"name":"中心商圈","aoi":{"geometry":{"type":"Polygon","coordinates":[[[114,22],[115,22],[114,23],[114,22]]]}},"reachable_aoi":{"geometry":{"type":"Polygon","coordinates":[[[113,21],[116,21],[113,24],[113,21]]]}}},"audience_path":"/a.txt.pgp"}。日期格式为 YYYY-MM-DD；两个 coordinates 均为闭合的 GeoJSON Polygon；audience_path 必须以 .txt.pgp 结尾。
    @NameInMap("input")
    @Validation(required = true)
    public String input;

    public static PushAdvisormarketAnalysisRequest build(java.util.Map<String, ?> map) throws Exception {
        PushAdvisormarketAnalysisRequest self = new PushAdvisormarketAnalysisRequest();
        return TeaModel.build(map, self);
    }

    public PushAdvisormarketAnalysisRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushAdvisormarketAnalysisRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushAdvisormarketAnalysisRequest setAnalysisType(String analysisType) {
        this.analysisType = analysisType;
        return this;
    }
    public String getAnalysisType() {
        return this.analysisType;
    }

    public PushAdvisormarketAnalysisRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

}
