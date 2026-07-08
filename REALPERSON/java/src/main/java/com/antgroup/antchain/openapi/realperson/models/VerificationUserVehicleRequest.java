// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class VerificationUserVehicleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 车牌号
    @NameInMap("license_plate")
    @Validation(required = true)
    public String licensePlate;

    // 姓名
    @NameInMap("cert_name")
    @Validation(required = true)
    public String certName;

    // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 入参加密模式：
    // "0"：不加密；
    @NameInMap("encrypt_type")
    @Validation(required = true)
    public String encryptType;

    // 扩展信息，预留字段
    @NameInMap("extern_param")
    public String externParam;

    public static VerificationUserVehicleRequest build(java.util.Map<String, ?> map) throws Exception {
        VerificationUserVehicleRequest self = new VerificationUserVehicleRequest();
        return TeaModel.build(map, self);
    }

    public VerificationUserVehicleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerificationUserVehicleRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerificationUserVehicleRequest setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
        return this;
    }
    public String getLicensePlate() {
        return this.licensePlate;
    }

    public VerificationUserVehicleRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public VerificationUserVehicleRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public VerificationUserVehicleRequest setEncryptType(String encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public String getEncryptType() {
        return this.encryptType;
    }

    public VerificationUserVehicleRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

}
