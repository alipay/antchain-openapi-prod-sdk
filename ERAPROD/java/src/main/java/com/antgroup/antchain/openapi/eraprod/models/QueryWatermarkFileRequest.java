// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.eraprod.models;

import com.aliyun.tea.*;

public class QueryWatermarkFileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资料id
    @NameInMap("datum_item_code")
    @Validation(required = true)
    public String datumItemCode;

    // 工号
    @NameInMap("employee_no")
    @Validation(required = true)
    public String employeeNo;

    // 项目id
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 投标资源id
    @NameInMap("tender_resource_id")
    public String tenderResourceId;

    public static QueryWatermarkFileRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryWatermarkFileRequest self = new QueryWatermarkFileRequest();
        return TeaModel.build(map, self);
    }

    public QueryWatermarkFileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryWatermarkFileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryWatermarkFileRequest setDatumItemCode(String datumItemCode) {
        this.datumItemCode = datumItemCode;
        return this;
    }
    public String getDatumItemCode() {
        return this.datumItemCode;
    }

    public QueryWatermarkFileRequest setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
        return this;
    }
    public String getEmployeeNo() {
        return this.employeeNo;
    }

    public QueryWatermarkFileRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public QueryWatermarkFileRequest setTenderResourceId(String tenderResourceId) {
        this.tenderResourceId = tenderResourceId;
        return this;
    }
    public String getTenderResourceId() {
        return this.tenderResourceId;
    }

}
