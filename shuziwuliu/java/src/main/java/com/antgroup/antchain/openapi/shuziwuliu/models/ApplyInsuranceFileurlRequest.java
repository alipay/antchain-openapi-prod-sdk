// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ApplyInsuranceFileurlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 上传的文件名，要求文件名后缀必须以 _yyyyMMdd结尾
    @NameInMap("file_name")
    @Validation(required = true, maxLength = 80)
    public String fileName;

    public static ApplyInsuranceFileurlRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyInsuranceFileurlRequest self = new ApplyInsuranceFileurlRequest();
        return TeaModel.build(map, self);
    }

    public ApplyInsuranceFileurlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyInsuranceFileurlRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyInsuranceFileurlRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
