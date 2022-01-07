// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.donpa.models;

import com.aliyun.tea.*;

public class BatchqueryMyslxfRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 修复批次ID
    @NameInMap("batch_id")
    @Validation(required = true)
    public String batchId;

    // 查询修复人的列表
    @NameInMap("repair_people_list")
    @Validation(required = true)
    public java.util.List<PersonData> repairPeopleList;

    public static BatchqueryMyslxfRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryMyslxfRequest self = new BatchqueryMyslxfRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryMyslxfRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryMyslxfRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchqueryMyslxfRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public BatchqueryMyslxfRequest setRepairPeopleList(java.util.List<PersonData> repairPeopleList) {
        this.repairPeopleList = repairPeopleList;
        return this;
    }
    public java.util.List<PersonData> getRepairPeopleList() {
        return this.repairPeopleList;
    }

}
