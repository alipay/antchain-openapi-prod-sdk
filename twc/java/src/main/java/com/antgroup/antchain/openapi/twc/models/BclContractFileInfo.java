// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class BclContractFileInfo extends TeaModel {
    // 文件OSS Id
    @NameInMap("oss_file_id")
    @Validation(required = true, maxLength = 64)
    public String ossFileId;

    // 买家用户签署区信息
    @NameInMap("user_sign_fields")
    @Validation(required = true)
    public java.util.List<BclSignField> userSignFields;

    // 租赁商家签署区信息
    @NameInMap("merchant_sign_fields")
    public java.util.List<BclSignField> merchantSignFields;

    public static BclContractFileInfo build(java.util.Map<String, ?> map) throws Exception {
        BclContractFileInfo self = new BclContractFileInfo();
        return TeaModel.build(map, self);
    }

    public BclContractFileInfo setOssFileId(String ossFileId) {
        this.ossFileId = ossFileId;
        return this;
    }
    public String getOssFileId() {
        return this.ossFileId;
    }

    public BclContractFileInfo setUserSignFields(java.util.List<BclSignField> userSignFields) {
        this.userSignFields = userSignFields;
        return this;
    }
    public java.util.List<BclSignField> getUserSignFields() {
        return this.userSignFields;
    }

    public BclContractFileInfo setMerchantSignFields(java.util.List<BclSignField> merchantSignFields) {
        this.merchantSignFields = merchantSignFields;
        return this;
    }
    public java.util.List<BclSignField> getMerchantSignFields() {
        return this.merchantSignFields;
    }

}
