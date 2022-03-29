// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.op.models;

import com.aliyun.tea.*;

public class ImportSdkRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 产品码
    @NameInMap("prod_code")
    @Validation(required = true)
    public String prodCode;

    // SDK语言
    @NameInMap("sdk_language")
    @Validation(required = true)
    public String sdkLanguage;

    // 版本
    @NameInMap("version_of_sdk")
    @Validation(required = true)
    public String versionOfSdk;

    // 依赖详情
    @NameInMap("dependency_detail")
    @Validation(required = true)
    public String dependencyDetail;

    public static ImportSdkRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportSdkRequest self = new ImportSdkRequest();
        return TeaModel.build(map, self);
    }

    public ImportSdkRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportSdkRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public ImportSdkRequest setSdkLanguage(String sdkLanguage) {
        this.sdkLanguage = sdkLanguage;
        return this;
    }
    public String getSdkLanguage() {
        return this.sdkLanguage;
    }

    public ImportSdkRequest setVersionOfSdk(String versionOfSdk) {
        this.versionOfSdk = versionOfSdk;
        return this;
    }
    public String getVersionOfSdk() {
        return this.versionOfSdk;
    }

    public ImportSdkRequest setDependencyDetail(String dependencyDetail) {
        this.dependencyDetail = dependencyDetail;
        return this;
    }
    public String getDependencyDetail() {
        return this.dependencyDetail;
    }

}
