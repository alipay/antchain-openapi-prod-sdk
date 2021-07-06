// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryIndividualidInternalfourmetaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 被核验人银行卡号
    @NameInMap("bank_card_no")
    @Validation(required = true)
    public String bankCardNo;

    // 用于内部统计的参数，外部用户请忽略
    @NameInMap("biz_info")
    @Validation(required = true)
    public BizInfo bizInfo;

    // 被核验人身份证号码
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 被核验人手机号码
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 被核验人姓名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static QueryIndividualidInternalfourmetaRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIndividualidInternalfourmetaRequest self = new QueryIndividualidInternalfourmetaRequest();
        return TeaModel.build(map, self);
    }

    public QueryIndividualidInternalfourmetaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIndividualidInternalfourmetaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIndividualidInternalfourmetaRequest setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
        return this;
    }
    public String getBankCardNo() {
        return this.bankCardNo;
    }

    public QueryIndividualidInternalfourmetaRequest setBizInfo(BizInfo bizInfo) {
        this.bizInfo = bizInfo;
        return this;
    }
    public BizInfo getBizInfo() {
        return this.bizInfo;
    }

    public QueryIndividualidInternalfourmetaRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public QueryIndividualidInternalfourmetaRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public QueryIndividualidInternalfourmetaRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
