// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class UploadIpCodecirculationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 		
    // 正版码的编码
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 正版码流转信息，每次最多10条信息。
    @NameInMap("code_circulation_list")
    @Validation(required = true)
    public java.util.List<CodeCirculation> codeCirculationList;

    public static UploadIpCodecirculationRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadIpCodecirculationRequest self = new UploadIpCodecirculationRequest();
        return TeaModel.build(map, self);
    }

    public UploadIpCodecirculationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadIpCodecirculationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadIpCodecirculationRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public UploadIpCodecirculationRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UploadIpCodecirculationRequest setCodeCirculationList(java.util.List<CodeCirculation> codeCirculationList) {
        this.codeCirculationList = codeCirculationList;
        return this;
    }
    public java.util.List<CodeCirculation> getCodeCirculationList() {
        return this.codeCirculationList;
    }

}
