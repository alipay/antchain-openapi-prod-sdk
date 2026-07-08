// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class QueryActiveDataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 生产单元名称
    @NameInMap("location_name")
    @Validation(required = true)
    public String locationName;

    // 产品名称
    @NameInMap("product_name")
    @Validation(required = true)
    public String productName;

    // 产品规格
    @NameInMap("specification")
    @Validation(required = true)
    public String specification;

    // 填报维度，`PRODUCT` 表示产品维度，`UNIT` 表示单元维度
    @NameInMap("data_dimension")
    public String dataDimension;

    // 是否按照单元过程查询，true标识按照，false标识不按照
    @NameInMap("input_by_process")
    @Validation(required = true)
    public Boolean inputByProcess;

    public static QueryActiveDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryActiveDataRequest self = new QueryActiveDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryActiveDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryActiveDataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryActiveDataRequest setLocationName(String locationName) {
        this.locationName = locationName;
        return this;
    }
    public String getLocationName() {
        return this.locationName;
    }

    public QueryActiveDataRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public QueryActiveDataRequest setSpecification(String specification) {
        this.specification = specification;
        return this;
    }
    public String getSpecification() {
        return this.specification;
    }

    public QueryActiveDataRequest setDataDimension(String dataDimension) {
        this.dataDimension = dataDimension;
        return this;
    }
    public String getDataDimension() {
        return this.dataDimension;
    }

    public QueryActiveDataRequest setInputByProcess(Boolean inputByProcess) {
        this.inputByProcess = inputByProcess;
        return this;
    }
    public Boolean getInputByProcess() {
        return this.inputByProcess;
    }

}
