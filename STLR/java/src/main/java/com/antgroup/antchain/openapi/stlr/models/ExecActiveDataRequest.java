// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class ExecActiveDataRequest extends TeaModel {
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

    // 是否按照单元过程录入；`true` 表示按单元过程，`false` 表示汇总录入
    @NameInMap("input_by_process")
    public Boolean inputByProcess;

    // 活动数据项列表
    @NameInMap("item_list")
    @Validation(required = true)
    public java.util.List<ActiveDataItem> itemList;

    public static ExecActiveDataRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecActiveDataRequest self = new ExecActiveDataRequest();
        return TeaModel.build(map, self);
    }

    public ExecActiveDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecActiveDataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecActiveDataRequest setLocationName(String locationName) {
        this.locationName = locationName;
        return this;
    }
    public String getLocationName() {
        return this.locationName;
    }

    public ExecActiveDataRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public ExecActiveDataRequest setSpecification(String specification) {
        this.specification = specification;
        return this;
    }
    public String getSpecification() {
        return this.specification;
    }

    public ExecActiveDataRequest setDataDimension(String dataDimension) {
        this.dataDimension = dataDimension;
        return this;
    }
    public String getDataDimension() {
        return this.dataDimension;
    }

    public ExecActiveDataRequest setInputByProcess(Boolean inputByProcess) {
        this.inputByProcess = inputByProcess;
        return this;
    }
    public Boolean getInputByProcess() {
        return this.inputByProcess;
    }

    public ExecActiveDataRequest setItemList(java.util.List<ActiveDataItem> itemList) {
        this.itemList = itemList;
        return this;
    }
    public java.util.List<ActiveDataItem> getItemList() {
        return this.itemList;
    }

}
