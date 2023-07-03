// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.hk_securitytech.models;

import com.aliyun.tea.*;

public class SubmitAshieldHardeningtaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // APK/ABB 上传后的地址
    @NameInMap("file_url")
    @Validation(required = true)
    public String fileUrl;

    // java2jni配置文件
    @NameInMap("javatoc_jni_config")
    @Validation(required = true)
    public java.util.List<ClassMethodConfig> javatocJniConfig;

    public static SubmitAshieldHardeningtaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAshieldHardeningtaskRequest self = new SubmitAshieldHardeningtaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAshieldHardeningtaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitAshieldHardeningtaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitAshieldHardeningtaskRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public SubmitAshieldHardeningtaskRequest setJavatocJniConfig(java.util.List<ClassMethodConfig> javatocJniConfig) {
        this.javatocJniConfig = javatocJniConfig;
        return this;
    }
    public java.util.List<ClassMethodConfig> getJavatocJniConfig() {
        return this.javatocJniConfig;
    }

}
