// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryJusticeBasecaseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 针对案件信息查询的索引方式，01为根据案件caseID索引，02为根据申请人的统一社会信用代码与业务订单号进行索引
    @NameInMap("index_method")
    @Validation(required = true)
    public String indexMethod;

    // 纠纷处理平台后台唯一的caseID 当索引方式为01时必填
    @NameInMap("case_id")
    public String caseId;

    // 案件申请人（企业）的统一社会信用代码 当索引方式为02时必填
    @NameInMap("id_number")
    public String idNumber;

    // 案件的业务订单ID 当索引方式为02时必填
    @NameInMap("business_number")
    public String businessNumber;

    public static QueryJusticeBasecaseRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryJusticeBasecaseRequest self = new QueryJusticeBasecaseRequest();
        return TeaModel.build(map, self);
    }

    public QueryJusticeBasecaseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryJusticeBasecaseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryJusticeBasecaseRequest setIndexMethod(String indexMethod) {
        this.indexMethod = indexMethod;
        return this;
    }
    public String getIndexMethod() {
        return this.indexMethod;
    }

    public QueryJusticeBasecaseRequest setCaseId(String caseId) {
        this.caseId = caseId;
        return this;
    }
    public String getCaseId() {
        return this.caseId;
    }

    public QueryJusticeBasecaseRequest setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public QueryJusticeBasecaseRequest setBusinessNumber(String businessNumber) {
        this.businessNumber = businessNumber;
        return this;
    }
    public String getBusinessNumber() {
        return this.businessNumber;
    }

}
