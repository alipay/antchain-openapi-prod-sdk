// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class CallbackAntdigitalWebttsDacAmlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // DATA_PK
    @NameInMap("data_pk")
    @Validation(required = true)
    public String dataPk;

    // BSN_ID
    @NameInMap("bsn_id")
    @Validation(required = true)
    public String bsnId;

    // MULTI_TENANCY_ID
    @NameInMap("multi_tenancy_id")
    @Validation(required = true)
    public String multiTenancyId;

    // CFRM_RSLT_IND 1 通过，0 拒绝
    @NameInMap("cfrm_rslt_ind")
    @Validation(required = true)
    public String cfrmRsltInd;

    public static CallbackAntdigitalWebttsDacAmlRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackAntdigitalWebttsDacAmlRequest self = new CallbackAntdigitalWebttsDacAmlRequest();
        return TeaModel.build(map, self);
    }

    public CallbackAntdigitalWebttsDacAmlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackAntdigitalWebttsDacAmlRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CallbackAntdigitalWebttsDacAmlRequest setDataPk(String dataPk) {
        this.dataPk = dataPk;
        return this;
    }
    public String getDataPk() {
        return this.dataPk;
    }

    public CallbackAntdigitalWebttsDacAmlRequest setBsnId(String bsnId) {
        this.bsnId = bsnId;
        return this;
    }
    public String getBsnId() {
        return this.bsnId;
    }

    public CallbackAntdigitalWebttsDacAmlRequest setMultiTenancyId(String multiTenancyId) {
        this.multiTenancyId = multiTenancyId;
        return this;
    }
    public String getMultiTenancyId() {
        return this.multiTenancyId;
    }

    public CallbackAntdigitalWebttsDacAmlRequest setCfrmRsltInd(String cfrmRsltInd) {
        this.cfrmRsltInd = cfrmRsltInd;
        return this;
    }
    public String getCfrmRsltInd() {
        return this.cfrmRsltInd;
    }

}
