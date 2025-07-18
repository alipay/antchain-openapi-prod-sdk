// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class StandardAuthExtendInfoRequest extends TeaModel {
    // 协议列表
    /**
     * <strong>example:</strong>
     * <p>协议列表</p>
     */
    @NameInMap("agreement_list")
    @Validation(required = true)
    public java.util.List<AgreementExtRequest> agreementList;

    // 地区请求
    /**
     * <strong>example:</strong>
     * <p>地区请求</p>
     */
    @NameInMap("districtext_request")
    @Validation(required = true)
    public DistrictExtRequest districtextRequest;

    public static StandardAuthExtendInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        StandardAuthExtendInfoRequest self = new StandardAuthExtendInfoRequest();
        return TeaModel.build(map, self);
    }

    public StandardAuthExtendInfoRequest setAgreementList(java.util.List<AgreementExtRequest> agreementList) {
        this.agreementList = agreementList;
        return this;
    }
    public java.util.List<AgreementExtRequest> getAgreementList() {
        return this.agreementList;
    }

    public StandardAuthExtendInfoRequest setDistrictextRequest(DistrictExtRequest districtextRequest) {
        this.districtextRequest = districtextRequest;
        return this;
    }
    public DistrictExtRequest getDistrictextRequest() {
        return this.districtextRequest;
    }

}
