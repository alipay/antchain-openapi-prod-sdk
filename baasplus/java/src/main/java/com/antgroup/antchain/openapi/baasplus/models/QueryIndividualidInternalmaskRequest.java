// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryIndividualidInternalmaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用于内部统计的参数，外部用户请忽略
    @NameInMap("biz_info")
    @Validation(required = true)
    public BizInfo bizInfo;

    // 被核验人身份证号码后四位
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 被核验人手机号码
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 被核验人姓名的一部分
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static QueryIndividualidInternalmaskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIndividualidInternalmaskRequest self = new QueryIndividualidInternalmaskRequest();
        return TeaModel.build(map, self);
    }

    public QueryIndividualidInternalmaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIndividualidInternalmaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIndividualidInternalmaskRequest setBizInfo(BizInfo bizInfo) {
        this.bizInfo = bizInfo;
        return this;
    }
    public BizInfo getBizInfo() {
        return this.bizInfo;
    }

    public QueryIndividualidInternalmaskRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public QueryIndividualidInternalmaskRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public QueryIndividualidInternalmaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
