// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AddDrmDrmdataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资源标识
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // 实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 推送目标Cell列表,英文逗号隔开
    @NameInMap("push_cells")
    public String pushCells;

    // 推送目标类型
    @NameInMap("push_target_type")
    public String pushTargetType;

    // 数据值
    @NameInMap("value")
    public String value;

    public static AddDrmDrmdataRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDrmDrmdataRequest self = new AddDrmDrmdataRequest();
        return TeaModel.build(map, self);
    }

    public AddDrmDrmdataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddDrmDrmdataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddDrmDrmdataRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public AddDrmDrmdataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddDrmDrmdataRequest setPushCells(String pushCells) {
        this.pushCells = pushCells;
        return this;
    }
    public String getPushCells() {
        return this.pushCells;
    }

    public AddDrmDrmdataRequest setPushTargetType(String pushTargetType) {
        this.pushTargetType = pushTargetType;
        return this;
    }
    public String getPushTargetType() {
        return this.pushTargetType;
    }

    public AddDrmDrmdataRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
