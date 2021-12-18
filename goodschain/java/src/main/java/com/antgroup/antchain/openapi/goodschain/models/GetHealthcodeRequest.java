// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.goodschain.models;

import com.aliyun.tea.*;

public class GetHealthcodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 身份证号，使用蚂蚁侧提供的RSA公钥加密
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 设备编码
    @NameInMap("device_code")
    @Validation(required = true)
    public String deviceCode;

    // 姓名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 是否需要健康码信息，不传默认不需要
    // 1：需要
    // 0：不需要
    @NameInMap("health")
    public Long health;

    // 是否需要疫苗信息
    // 1：需要，0：不需要，不传默认不需要
    @NameInMap("vaccination")
    public Long vaccination;

    // 是否需要核酸信息：
    // 1.需要，0：不需要，不传默认不需要
    @NameInMap("nucleic_acid")
    public Long nucleicAcid;

    // 是否需要行程码：
    // 1.需要，0：不需要，不传默认不需要
    @NameInMap("travel")
    public Long travel;

    public static GetHealthcodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHealthcodeRequest self = new GetHealthcodeRequest();
        return TeaModel.build(map, self);
    }

    public GetHealthcodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetHealthcodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetHealthcodeRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public GetHealthcodeRequest setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
        return this;
    }
    public String getDeviceCode() {
        return this.deviceCode;
    }

    public GetHealthcodeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetHealthcodeRequest setHealth(Long health) {
        this.health = health;
        return this;
    }
    public Long getHealth() {
        return this.health;
    }

    public GetHealthcodeRequest setVaccination(Long vaccination) {
        this.vaccination = vaccination;
        return this;
    }
    public Long getVaccination() {
        return this.vaccination;
    }

    public GetHealthcodeRequest setNucleicAcid(Long nucleicAcid) {
        this.nucleicAcid = nucleicAcid;
        return this;
    }
    public Long getNucleicAcid() {
        return this.nucleicAcid;
    }

    public GetHealthcodeRequest setTravel(Long travel) {
        this.travel = travel;
        return this;
    }
    public Long getTravel() {
        return this.travel;
    }

}
