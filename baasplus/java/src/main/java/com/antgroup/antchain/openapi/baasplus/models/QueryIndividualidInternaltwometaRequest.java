// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryIndividualidInternaltwometaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用于内部统计的参数，外部用户请忽略
    @NameInMap("biz_info")
    @Validation(required = true)
    public BizInfo bizInfo;

    // 被核验人身份证号码
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 被核验人姓名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static QueryIndividualidInternaltwometaRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIndividualidInternaltwometaRequest self = new QueryIndividualidInternaltwometaRequest();
        return TeaModel.build(map, self);
    }

    public QueryIndividualidInternaltwometaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIndividualidInternaltwometaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIndividualidInternaltwometaRequest setBizInfo(BizInfo bizInfo) {
        this.bizInfo = bizInfo;
        return this;
    }
    public BizInfo getBizInfo() {
        return this.bizInfo;
    }

    public QueryIndividualidInternaltwometaRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public QueryIndividualidInternaltwometaRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
