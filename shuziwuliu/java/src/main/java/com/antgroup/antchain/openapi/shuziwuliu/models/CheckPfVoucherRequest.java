// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CheckPfVoucherRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 融资主体did
    @NameInMap("financing_subject_did")
    @Validation(required = true, maxLength = 80)
    public String financingSubjectDid;

    // 运单所属平台did
    @NameInMap("platform_did")
    @Validation(required = true, maxLength = 80)
    public String platformDid;

    // 凭证类型，支持 WAYBILL(运单)
    @NameInMap("voucher_category")
    @Validation(required = true, maxLength = 100, minLength = 1)
    public String voucherCategory;

    // 支持多个，逗号隔开
    @NameInMap("voucher_ids")
    @Validation(required = true, maxLength = 3000, minLength = 1)
    public String voucherIds;

    public static CheckPfVoucherRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckPfVoucherRequest self = new CheckPfVoucherRequest();
        return TeaModel.build(map, self);
    }

    public CheckPfVoucherRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckPfVoucherRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckPfVoucherRequest setFinancingSubjectDid(String financingSubjectDid) {
        this.financingSubjectDid = financingSubjectDid;
        return this;
    }
    public String getFinancingSubjectDid() {
        return this.financingSubjectDid;
    }

    public CheckPfVoucherRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public CheckPfVoucherRequest setVoucherCategory(String voucherCategory) {
        this.voucherCategory = voucherCategory;
        return this;
    }
    public String getVoucherCategory() {
        return this.voucherCategory;
    }

    public CheckPfVoucherRequest setVoucherIds(String voucherIds) {
        this.voucherIds = voucherIds;
        return this;
    }
    public String getVoucherIds() {
        return this.voucherIds;
    }

}
