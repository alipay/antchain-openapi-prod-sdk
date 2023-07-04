// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class ImportSolutioninstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 解决方案序列化后的结果
    @NameInMap("box_data")
    @Validation(required = true)
    public String boxData;

    // 环境id
    @NameInMap("env_id")
    @Validation(required = true)
    public String envId;

    // 操作人ID
    @NameInMap("submitter_id")
    @Validation(required = true)
    public String submitterId;

    // 操作人名称
    @NameInMap("submitter_name")
    public String submitterName;

    public static ImportSolutioninstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportSolutioninstanceRequest self = new ImportSolutioninstanceRequest();
        return TeaModel.build(map, self);
    }

    public ImportSolutioninstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportSolutioninstanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportSolutioninstanceRequest setBoxData(String boxData) {
        this.boxData = boxData;
        return this;
    }
    public String getBoxData() {
        return this.boxData;
    }

    public ImportSolutioninstanceRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public ImportSolutioninstanceRequest setSubmitterId(String submitterId) {
        this.submitterId = submitterId;
        return this;
    }
    public String getSubmitterId() {
        return this.submitterId;
    }

    public ImportSolutioninstanceRequest setSubmitterName(String submitterName) {
        this.submitterName = submitterName;
        return this;
    }
    public String getSubmitterName() {
        return this.submitterName;
    }

}
