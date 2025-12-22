// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ApplyTechintegrationSkushipemptymodelbyuidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码
    @NameInMap("vendor_id")
    @Validation(required = true)
    public String vendorId;

    // 设备型号
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    // 设备SN号
    @NameInMap("device_id")
    @Validation(required = true)
    public String deviceId;

    // 产品类型
    @NameInMap("product_type")
    public Long productType;

    // 凭证种类，高八位表示是否下发凭证，低八位表示安全方案
    @NameInMap("cert_type")
    public Long certType;

    // id2 authCode
    @NameInMap("id2")
    public String id2;

    public static ApplyTechintegrationSkushipemptymodelbyuidRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyTechintegrationSkushipemptymodelbyuidRequest self = new ApplyTechintegrationSkushipemptymodelbyuidRequest();
        return TeaModel.build(map, self);
    }

    public ApplyTechintegrationSkushipemptymodelbyuidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyTechintegrationSkushipemptymodelbyuidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyTechintegrationSkushipemptymodelbyuidRequest setVendorId(String vendorId) {
        this.vendorId = vendorId;
        return this;
    }
    public String getVendorId() {
        return this.vendorId;
    }

    public ApplyTechintegrationSkushipemptymodelbyuidRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public ApplyTechintegrationSkushipemptymodelbyuidRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public ApplyTechintegrationSkushipemptymodelbyuidRequest setProductType(Long productType) {
        this.productType = productType;
        return this;
    }
    public Long getProductType() {
        return this.productType;
    }

    public ApplyTechintegrationSkushipemptymodelbyuidRequest setCertType(Long certType) {
        this.certType = certType;
        return this;
    }
    public Long getCertType() {
        return this.certType;
    }

    public ApplyTechintegrationSkushipemptymodelbyuidRequest setId2(String id2) {
        this.id2 = id2;
        return this;
    }
    public String getId2() {
        return this.id2;
    }

}
