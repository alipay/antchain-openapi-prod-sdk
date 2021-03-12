// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateLogisticFinanceDriverRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
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

    public static CreateLogisticFinanceDriverRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLogisticFinanceDriverRequest self = new CreateLogisticFinanceDriverRequest();
        return TeaModel.build(map, self);
    }

    public CreateLogisticFinanceDriverRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLogisticFinanceDriverRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateLogisticFinanceDriverRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CreateLogisticFinanceDriverRequest setExtensionInfo(String extensionInfo) {
        this.extensionInfo = extensionInfo;
        return this;
    }
    public String getExtensionInfo() {
        return this.extensionInfo;
    }

    public CreateLogisticFinanceDriverRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public CreateLogisticFinanceDriverRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLogisticFinanceDriverRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

}
