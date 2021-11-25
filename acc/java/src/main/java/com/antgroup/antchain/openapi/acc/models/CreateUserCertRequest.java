// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class CreateUserCertRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 云蚂账户id
    @NameInMap("user_id")
    @Validation(required = true)
    public Long userId;

    // 姓名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 个人证件类型
    @NameInMap("cert_type")
    @Validation(required = true)
    public String certType;

    // 证件号码
    @NameInMap("cert_num")
    @Validation(required = true)
    public String certNum;

    // 个人证件正面图片文件id，应用侧fileId
    @NameInMap("cert_file_front")
    @Validation(required = true)
    public Long certFileFront;

    // 个人证件正面类型。JPG
    @NameInMap("cert_file_front_type")
    @Validation(required = true)
    public String certFileFrontType;

    // 个人证件反面图片文件id，应用侧fileId
    @NameInMap("cert_file_reverse")
    @Validation(required = true)
    public Long certFileReverse;

    // 个人证件反面类型。JPG
    @NameInMap("cert_file_reverse_type")
    @Validation(required = true)
    public String certFileReverseType;

    public static CreateUserCertRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserCertRequest self = new CreateUserCertRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserCertRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateUserCertRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateUserCertRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public CreateUserCertRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateUserCertRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public CreateUserCertRequest setCertNum(String certNum) {
        this.certNum = certNum;
        return this;
    }
    public String getCertNum() {
        return this.certNum;
    }

    public CreateUserCertRequest setCertFileFront(Long certFileFront) {
        this.certFileFront = certFileFront;
        return this;
    }
    public Long getCertFileFront() {
        return this.certFileFront;
    }

    public CreateUserCertRequest setCertFileFrontType(String certFileFrontType) {
        this.certFileFrontType = certFileFrontType;
        return this;
    }
    public String getCertFileFrontType() {
        return this.certFileFrontType;
    }

    public CreateUserCertRequest setCertFileReverse(Long certFileReverse) {
        this.certFileReverse = certFileReverse;
        return this;
    }
    public Long getCertFileReverse() {
        return this.certFileReverse;
    }

    public CreateUserCertRequest setCertFileReverseType(String certFileReverseType) {
        this.certFileReverseType = certFileReverseType;
        return this;
    }
    public String getCertFileReverseType() {
        return this.certFileReverseType;
    }

}
