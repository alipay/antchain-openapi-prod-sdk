// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class MaoContact extends TeaModel {
    // 联系人姓名
    /**
     * <strong>example:</strong>
     * <p>联系人姓名</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 联系人手机号
    /**
     * <strong>example:</strong>
     * <p>联系人手机号</p>
     */
    @NameInMap("phone")
    @Validation(required = true)
    public String phone;

    // 联系人邮箱
    /**
     * <strong>example:</strong>
     * <p>联系人邮箱</p>
     */
    @NameInMap("email")
    @Validation(required = true)
    public String email;

    // 联系人身份证号
    /**
     * <strong>example:</strong>
     * <p>联系人身份证号</p>
     */
    @NameInMap("id_card")
    public String idCard;

    // 角色
    /**
     * <strong>example:</strong>
     * <p>角色</p>
     */
    @NameInMap("role")
    public String role;

    public static MaoContact build(java.util.Map<String, ?> map) throws Exception {
        MaoContact self = new MaoContact();
        return TeaModel.build(map, self);
    }

    public MaoContact setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MaoContact setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public MaoContact setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public MaoContact setIdCard(String idCard) {
        this.idCard = idCard;
        return this;
    }
    public String getIdCard() {
        return this.idCard;
    }

    public MaoContact setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

}
