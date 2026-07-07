// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class PushActiveDataRequest extends TeaModel {
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

    // 规格型号
    @NameInMap("specification")
    @Validation(required = true)
    public String specification;

    // 是否按照单元过程录入
    @NameInMap("input_by_process")
    @Validation(required = true)
    public Boolean inputByProcess;

    // lca活动数据项列表
    @NameInMap("item_list")
    @Validation(required = true)
    public java.util.List<ActiveDataItem> itemList;

    public static PushActiveDataRequest build(java.util.Map<String, ?> map) throws Exception {
        PushActiveDataRequest self = new PushActiveDataRequest();
        return TeaModel.build(map, self);
    }

    public PushActiveDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushActiveDataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushActiveDataRequest setLocationName(String locationName) {
        this.locationName = locationName;
        return this;
    }
    public String getLocationName() {
        return this.locationName;
    }

    public PushActiveDataRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public PushActiveDataRequest setSpecification(String specification) {
        this.specification = specification;
        return this;
    }
    public String getSpecification() {
        return this.specification;
    }

    public PushActiveDataRequest setInputByProcess(Boolean inputByProcess) {
        this.inputByProcess = inputByProcess;
        return this;
    }
    public Boolean getInputByProcess() {
        return this.inputByProcess;
    }

    public PushActiveDataRequest setItemList(java.util.List<ActiveDataItem> itemList) {
        this.itemList = itemList;
        return this;
    }
    public java.util.List<ActiveDataItem> getItemList() {
        return this.itemList;
    }

}
