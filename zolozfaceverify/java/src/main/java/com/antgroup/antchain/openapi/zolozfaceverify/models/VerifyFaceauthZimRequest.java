// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.zolozfaceverify.models;

import com.aliyun.tea.*;

public class VerifyFaceauthZimRequest extends TeaModel {
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

    // 实人认证id
    @NameInMap("zim_id")
    @Validation(required = true)
    public String zimId;

    // zim_data可通过oss方式中转
    @NameInMap("zim_data_oss_obj")
    public String zimDataOssObj;

    public static VerifyFaceauthZimRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyFaceauthZimRequest self = new VerifyFaceauthZimRequest();
        return TeaModel.build(map, self);
    }

    public VerifyFaceauthZimRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyFaceauthZimRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyFaceauthZimRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

    public VerifyFaceauthZimRequest setZimData(String zimData) {
        this.zimData = zimData;
        return this;
    }
    public String getZimData() {
        return this.zimData;
    }

    public VerifyFaceauthZimRequest setZimId(String zimId) {
        this.zimId = zimId;
        return this;
    }
    public String getZimId() {
        return this.zimId;
    }

    public VerifyFaceauthZimRequest setZimDataOssObj(String zimDataOssObj) {
        this.zimDataOssObj = zimDataOssObj;
        return this;
    }
    public String getZimDataOssObj() {
        return this.zimDataOssObj;
    }

}
