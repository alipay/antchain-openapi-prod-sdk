// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class UserAuth extends TeaModel {
    // 授权条件,  Local的授权条件使用正则规则, 其中 # 为特殊分隔符, 在权限比较时需要移除该符号
    @NameInMap("condition")
    @Validation(required = true)
    public String condition;

    // YUNYOU_LOCAL_AUTH_KEY
    @NameInMap("condition_key")
    @Validation(required = true)
    public String conditionKey;

    // 用户昵称, 如果是域内, 就是花名
    @NameInMap("nick_name")
    public String nickName;

    // 是否为负责人
    @NameInMap("primary")
    @Validation(required = true)
    public Boolean primary;

    // 用户姓名
    @NameInMap("real_name")
    @Validation(required = true)
    public String realName;

    // PROCESS_ENGINEER: 全局运维工程师
    // PROD_PROCESS_ENGINEER: 产品运维工程师
    // DELIVERY_ENGINEER: 交付工程师
    // ENV_MANAGER: 环境管理员
    // LOCAL_OBSERVER: 观察者
    // AKE_PROCESS_ENGINEER: AKE运维工程师
    @NameInMap("role")
    @Validation(required = true)
    public String role;

    // ID来源, 该ID用于Global和Local进行信息同步使用, 因此该值就是域账号
    @NameInMap("source_id")
    public String sourceId;

    // 授权状态,
    // WAIT_REGIST: 等待用户注册
    // ACTIVE: 授权已经生效
    // DELETED: 授权已经删除
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 用户ID, 该值为IAM上的User.ID属性
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static UserAuth build(java.util.Map<String, ?> map) throws Exception {
        UserAuth self = new UserAuth();
        return TeaModel.build(map, self);
    }

    public UserAuth setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public UserAuth setConditionKey(String conditionKey) {
        this.conditionKey = conditionKey;
        return this;
    }
    public String getConditionKey() {
        return this.conditionKey;
    }

    public UserAuth setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public UserAuth setPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }
    public Boolean getPrimary() {
        return this.primary;
    }

    public UserAuth setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public UserAuth setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public UserAuth setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public UserAuth setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UserAuth setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
