// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CreateDriverDisRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 司机身份证号码
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 扩展字段
    @NameInMap("extension_info")
    public String extensionInfo;

    // 司机手机号码
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 司机姓名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 所属承运平台did
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    public static CreateDriverDisRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDriverDisRequest self = new CreateDriverDisRequest();
        return TeaModel.build(map, self);
    }

    public CreateDriverDisRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDriverDisRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDriverDisRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CreateDriverDisRequest setExtensionInfo(String extensionInfo) {
        this.extensionInfo = extensionInfo;
        return this;
    }
    public String getExtensionInfo() {
        return this.extensionInfo;
    }

    public CreateDriverDisRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public CreateDriverDisRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDriverDisRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

}
