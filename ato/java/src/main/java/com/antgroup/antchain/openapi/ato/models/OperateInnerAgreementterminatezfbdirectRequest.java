// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class OperateInnerAgreementterminatezfbdirectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 代扣协议号
    @NameInMap("agreement_no")
    public String agreementNo;

    // 外部签约号
    @NameInMap("external_agreement_no")
    @Validation(required = true)
    public String externalAgreementNo;

    // 用户id
    @NameInMap("user_id")
    public String userId;

    public static OperateInnerAgreementterminatezfbdirectRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateInnerAgreementterminatezfbdirectRequest self = new OperateInnerAgreementterminatezfbdirectRequest();
        return TeaModel.build(map, self);
    }

    public OperateInnerAgreementterminatezfbdirectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateInnerAgreementterminatezfbdirectRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateInnerAgreementterminatezfbdirectRequest setAgreementNo(String agreementNo) {
        this.agreementNo = agreementNo;
        return this;
    }
    public String getAgreementNo() {
        return this.agreementNo;
    }

    public OperateInnerAgreementterminatezfbdirectRequest setExternalAgreementNo(String externalAgreementNo) {
        this.externalAgreementNo = externalAgreementNo;
        return this;
    }
    public String getExternalAgreementNo() {
        return this.externalAgreementNo;
    }

    public OperateInnerAgreementterminatezfbdirectRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
