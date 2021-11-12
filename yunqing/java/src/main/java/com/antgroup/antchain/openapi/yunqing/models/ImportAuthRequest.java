// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class ImportAuthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权的条件
    @NameInMap("condition")
    @Validation(required = true)
    public String condition;

    // 授权的KEY, 目前Local只有YUNYOU_LOCAL_AUTH_KEY
    @NameInMap("condition_key")
    @Validation(required = true)
    public String conditionKey;

    // 是否被删除授权
    @NameInMap("deleted")
    @Validation(required = true)
    public Boolean deleted;

    // 授权的MD5
    @NameInMap("md5")
    @Validation(required = true)
    public String md5;

    // 昵称
    @NameInMap("nick_name")
    public String nickName;

    // 是否为负责人
    @NameInMap("primary")
    @Validation(required = true)
    public Boolean primary;

    // 用户真名
    @NameInMap("real_name")
    @Validation(required = true)
    public String realName;

    // 角色
    @NameInMap("role")
    @Validation(required = true)
    public String role;

    // 用户的域账号
    @NameInMap("source_id")
    @Validation(required = true)
    public String sourceId;

    // 工号
    @NameInMap("work_no")
    public String workNo;

    public static ImportAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportAuthRequest self = new ImportAuthRequest();
        return TeaModel.build(map, self);
    }

    public ImportAuthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportAuthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportAuthRequest setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public ImportAuthRequest setConditionKey(String conditionKey) {
        this.conditionKey = conditionKey;
        return this;
    }
    public String getConditionKey() {
        return this.conditionKey;
    }

    public ImportAuthRequest setDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
    public Boolean getDeleted() {
        return this.deleted;
    }

    public ImportAuthRequest setMd5(String md5) {
        this.md5 = md5;
        return this;
    }
    public String getMd5() {
        return this.md5;
    }

    public ImportAuthRequest setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public ImportAuthRequest setPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }
    public Boolean getPrimary() {
        return this.primary;
    }

    public ImportAuthRequest setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public ImportAuthRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public ImportAuthRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public ImportAuthRequest setWorkNo(String workNo) {
        this.workNo = workNo;
        return this;
    }
    public String getWorkNo() {
        return this.workNo;
    }

}
