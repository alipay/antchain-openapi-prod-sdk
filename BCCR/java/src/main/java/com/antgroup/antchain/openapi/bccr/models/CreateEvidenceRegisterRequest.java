// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class CreateEvidenceRegisterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 网页截图id
    @NameInMap("screenshot_id")
    @Validation(required = true)
    public String screenshotId;

    // 取证名称
    @NameInMap("evidence_name")
    public String evidenceName;

    // 幂等字段
    @NameInMap("client_token")
    @Validation(required = true)
    public String clientToken;

    public static CreateEvidenceRegisterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEvidenceRegisterRequest self = new CreateEvidenceRegisterRequest();
        return TeaModel.build(map, self);
    }

    public CreateEvidenceRegisterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateEvidenceRegisterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateEvidenceRegisterRequest setScreenshotId(String screenshotId) {
        this.screenshotId = screenshotId;
        return this;
    }
    public String getScreenshotId() {
        return this.screenshotId;
    }

    public CreateEvidenceRegisterRequest setEvidenceName(String evidenceName) {
        this.evidenceName = evidenceName;
        return this;
    }
    public String getEvidenceName() {
        return this.evidenceName;
    }

    public CreateEvidenceRegisterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
