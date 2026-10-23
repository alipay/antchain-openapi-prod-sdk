// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creativerender.models;

import com.aliyun.tea.*;

public class ExecAntcloudMarketingagentCreativeImageeditRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 产品代码，当前仅支持 FUND（基金）。
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 来源子图成功版本 ID，必须属于当前调用用户及租户；可使用子图列表中的成功版本或上一轮编辑成功返回的新版本。
    @NameInMap("segment_version_id")
    @Validation(required = true)
    public String segmentVersionId;

    // 本轮图片修改要求，不能为空。源图和输出宽高由服务端根据来源版本解析。
    @NameInMap("prompt")
    @Validation(required = true)
    public String prompt;

    public static ExecAntcloudMarketingagentCreativeImageeditRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecAntcloudMarketingagentCreativeImageeditRequest self = new ExecAntcloudMarketingagentCreativeImageeditRequest();
        return TeaModel.build(map, self);
    }

    public ExecAntcloudMarketingagentCreativeImageeditRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecAntcloudMarketingagentCreativeImageeditRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ExecAntcloudMarketingagentCreativeImageeditRequest setSegmentVersionId(String segmentVersionId) {
        this.segmentVersionId = segmentVersionId;
        return this;
    }
    public String getSegmentVersionId() {
        return this.segmentVersionId;
    }

    public ExecAntcloudMarketingagentCreativeImageeditRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

}
