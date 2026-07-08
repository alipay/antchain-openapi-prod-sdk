// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class VerifyFacevrfZimRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 扩展信息,Map的json格式
    @NameInMap("extern_param")
    public String externParam;

    // 人脸业务参数
    @NameInMap("zim_data")
    @Validation(required = true)
    public String zimData;

    // 7501f6c2dd57e06fe0d4202d3aaab58e
    @NameInMap("zim_id")
    @Validation(required = true)
    public String zimId;

    public static VerifyFacevrfZimRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyFacevrfZimRequest self = new VerifyFacevrfZimRequest();
        return TeaModel.build(map, self);
    }

    public VerifyFacevrfZimRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyFacevrfZimRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyFacevrfZimRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

    public VerifyFacevrfZimRequest setZimData(String zimData) {
        this.zimData = zimData;
        return this;
    }
    public String getZimData() {
        return this.zimData;
    }

    public VerifyFacevrfZimRequest setZimId(String zimId) {
        this.zimId = zimId;
        return this;
    }
    public String getZimId() {
        return this.zimId;
    }

}
