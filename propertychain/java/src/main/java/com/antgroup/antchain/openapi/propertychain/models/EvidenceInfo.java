// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class EvidenceInfo extends TeaModel {
    // 自定义序列
    @NameInMap("biz_id")
    @Validation(required = true)
    public Long bizId;

    // 资产id
    @NameInMap("asset_id")
    public String assetId;

    // 请求信息
    @NameInMap("message")
    public String message;

    // 创建是否成功
    @NameInMap("success")
    @Validation(required = true)
    public Boolean success;

    // 短码
    @NameInMap("qr_code")
    public String qrCode;

    public static EvidenceInfo build(java.util.Map<String, ?> map) throws Exception {
        EvidenceInfo self = new EvidenceInfo();
        return TeaModel.build(map, self);
    }

    public EvidenceInfo setBizId(Long bizId) {
        this.bizId = bizId;
        return this;
    }
    public Long getBizId() {
        return this.bizId;
    }

    public EvidenceInfo setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public EvidenceInfo setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EvidenceInfo setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public EvidenceInfo setQrCode(String qrCode) {
        this.qrCode = qrCode;
        return this;
    }
    public String getQrCode() {
        return this.qrCode;
    }

}
