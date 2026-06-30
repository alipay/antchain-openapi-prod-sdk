// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class FaceVerifyResultData extends TeaModel {
    // 请求唯一标识Id
    /**
     * <strong>example:</strong>
     * <p>111111111111111</p>
     */
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 认证是否通过
    /**
     * <strong>example:</strong>
     * <p>T、F 或 null</p>
     */
    @NameInMap("passed")
    @Validation(required = true)
    public String passed;

    // faceOcclusion:面部遮挡信息；true为有面部遮挡，false为无面部遮挡
    /**
     * <strong>example:</strong>
     * <p>&quot;{&quot;faceOcclusion&quot;:false}&quot;</p>
     */
    @NameInMap("material_info")
    @Validation(required = true)
    public String materialInfo;

    public static FaceVerifyResultData build(java.util.Map<String, ?> map) throws Exception {
        FaceVerifyResultData self = new FaceVerifyResultData();
        return TeaModel.build(map, self);
    }

    public FaceVerifyResultData setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FaceVerifyResultData setPassed(String passed) {
        this.passed = passed;
        return this;
    }
    public String getPassed() {
        return this.passed;
    }

    public FaceVerifyResultData setMaterialInfo(String materialInfo) {
        this.materialInfo = materialInfo;
        return this;
    }
    public String getMaterialInfo() {
        return this.materialInfo;
    }

}
