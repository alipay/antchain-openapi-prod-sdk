// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class AccountMap extends TeaModel {
    // 要映射的链对应的唯一id
    /**
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    // 0: 身份证；1：手机；2: 电子邮箱；3: 企业营业执照号
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("entity_info_type")
    public Long entityInfoType;

    // 对应entity_info_type的具体值
    // 
    /**
     * <strong>example:</strong>
     * <p>18701207322</p>
     */
    @NameInMap("entity_info_value")
    public String entityInfoValue;

    // 账户对应实体的全名
    /**
     * <strong>example:</strong>
     * <p>huihui.liu</p>
     */
    @NameInMap("full_name")
    public String fullName;

    // 该账户在指定链上的状态1，激活，2，冻结，新建账户只能为1
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 希望映射后在链上的账户名
    /**
     * <strong>example:</strong>
     * <p>huihui_online</p>
     */
    @NameInMap("target_name")
    public String targetName;

    // 该账户对应实体的类型：0， 个人； 1， 企业
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("type")
    public Long type;

    // 自有系统中该账户的唯一标示
    /**
     * <strong>example:</strong>
     * <p>huihui</p>
     */
    @NameInMap("uid")
    @Validation(required = true)
    public String uid;

    public static AccountMap build(java.util.Map<String, ?> map) throws Exception {
        AccountMap self = new AccountMap();
        return TeaModel.build(map, self);
    }

    public AccountMap setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public AccountMap setEntityInfoType(Long entityInfoType) {
        this.entityInfoType = entityInfoType;
        return this;
    }
    public Long getEntityInfoType() {
        return this.entityInfoType;
    }

    public AccountMap setEntityInfoValue(String entityInfoValue) {
        this.entityInfoValue = entityInfoValue;
        return this;
    }
    public String getEntityInfoValue() {
        return this.entityInfoValue;
    }

    public AccountMap setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }
    public String getFullName() {
        return this.fullName;
    }

    public AccountMap setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public AccountMap setTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }
    public String getTargetName() {
        return this.targetName;
    }

    public AccountMap setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public AccountMap setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
