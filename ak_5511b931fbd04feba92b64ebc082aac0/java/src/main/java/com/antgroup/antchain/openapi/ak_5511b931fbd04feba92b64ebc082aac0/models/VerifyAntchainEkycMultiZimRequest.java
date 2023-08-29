// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_5511b931fbd04feba92b64ebc082aac0.models;

import com.aliyun.tea.*;

public class VerifyAntchainEkycMultiZimRequest extends TeaModel {
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
    @NameInMap("certify_id")
    @Validation(required = true)
    public String certifyId;

    // zim_data可通过oss方式中转
    @NameInMap("zim_data_oss_obj")
    public String zimDataOssObj;

    // 产品类型
    @NameInMap("product_type")
    public String productType;

    public static VerifyAntchainEkycMultiZimRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyAntchainEkycMultiZimRequest self = new VerifyAntchainEkycMultiZimRequest();
        return TeaModel.build(map, self);
    }

    public VerifyAntchainEkycMultiZimRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyAntchainEkycMultiZimRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyAntchainEkycMultiZimRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

    public VerifyAntchainEkycMultiZimRequest setZimData(String zimData) {
        this.zimData = zimData;
        return this;
    }
    public String getZimData() {
        return this.zimData;
    }

    public VerifyAntchainEkycMultiZimRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public VerifyAntchainEkycMultiZimRequest setZimDataOssObj(String zimDataOssObj) {
        this.zimDataOssObj = zimDataOssObj;
        return this;
    }
    public String getZimDataOssObj() {
        return this.zimDataOssObj;
    }

    public VerifyAntchainEkycMultiZimRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}
