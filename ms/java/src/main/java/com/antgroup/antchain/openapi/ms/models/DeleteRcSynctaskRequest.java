// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class DeleteRcSynctaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // cluster_task_unique_key
    @NameInMap("cluster_task_unique_key")
    @Validation(required = true)
    public String clusterTaskUniqueKey;

    // instance_id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static DeleteRcSynctaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRcSynctaskRequest self = new DeleteRcSynctaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRcSynctaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteRcSynctaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteRcSynctaskRequest setClusterTaskUniqueKey(String clusterTaskUniqueKey) {
        this.clusterTaskUniqueKey = clusterTaskUniqueKey;
        return this;
    }
    public String getClusterTaskUniqueKey() {
        return this.clusterTaskUniqueKey;
    }

    public DeleteRcSynctaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
