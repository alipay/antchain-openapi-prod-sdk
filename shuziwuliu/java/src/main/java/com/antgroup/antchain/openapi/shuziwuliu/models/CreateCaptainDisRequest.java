// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CreateCaptainDisRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 身份证号码
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 扩展字段
    @NameInMap("extension_info")
    public String extensionInfo;

    // 手机号码
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 姓名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 所属平台did
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    public static CreateCaptainDisRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCaptainDisRequest self = new CreateCaptainDisRequest();
        return TeaModel.build(map, self);
    }

    public CreateCaptainDisRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateCaptainDisRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateCaptainDisRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CreateCaptainDisRequest setExtensionInfo(String extensionInfo) {
        this.extensionInfo = extensionInfo;
        return this;
    }
    public String getExtensionInfo() {
        return this.extensionInfo;
    }

    public CreateCaptainDisRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public CreateCaptainDisRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCaptainDisRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

}
