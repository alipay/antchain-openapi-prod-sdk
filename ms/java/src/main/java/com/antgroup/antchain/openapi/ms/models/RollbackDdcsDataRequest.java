// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class RollbackDdcsDataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 当前租户 instanceId
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 回滚的属性的id
    @NameInMap("attribute_id")
    @Validation(required = true)
    public Long attributeId;

    // 再需要强制回滚的时候，需要通过指定 uniqueId 来强制回滚哪一次推送
    @NameInMap("unique_id")
    public String uniqueId;

    // 默认情况下，只能回滚最后一次推送。
    // 
    // 但是通过 force_rollback + unique_id 可以强制指定回滚某一次推送。风险较高，不建议使用。
    @NameInMap("force_rollback")
    public Boolean forceRollback;

    // 回滚操作人
    @NameInMap("operator")
    public String operator;

    public static RollbackDdcsDataRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackDdcsDataRequest self = new RollbackDdcsDataRequest();
        return TeaModel.build(map, self);
    }

    public RollbackDdcsDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RollbackDdcsDataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RollbackDdcsDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RollbackDdcsDataRequest setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
        return this;
    }
    public Long getAttributeId() {
        return this.attributeId;
    }

    public RollbackDdcsDataRequest setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

    public RollbackDdcsDataRequest setForceRollback(Boolean forceRollback) {
        this.forceRollback = forceRollback;
        return this;
    }
    public Boolean getForceRollback() {
        return this.forceRollback;
    }

    public RollbackDdcsDataRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
