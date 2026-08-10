// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class OperatorList extends TeaModel {
    // 操作员 ID。
    /**
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("operator_id")
    @Validation(required = true)
    public String operatorId;

    // 操作员姓名。
    /**
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("operator_name")
    public String operatorName;

    // 登录邮箱。
    /**
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("email")
    public String email;

    // 手机号。
    /**
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("cell_phone")
    public String cellPhone;

    // 昵称。
    /**
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("nick_name")
    public String nickName;

    // 创建时间
    /**
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("create_time")
    public String createTime;

    // 操作员状态。
    /**
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("status")
    public String status;

    // 是否为超级管理员。
    /**
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("supervisor")
    public Boolean supervisor;

    public static OperatorList build(java.util.Map<String, ?> map) throws Exception {
        OperatorList self = new OperatorList();
        return TeaModel.build(map, self);
    }

    public OperatorList setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public OperatorList setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public OperatorList setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public OperatorList setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
        return this;
    }
    public String getCellPhone() {
        return this.cellPhone;
    }

    public OperatorList setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public OperatorList setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public OperatorList setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public OperatorList setSupervisor(Boolean supervisor) {
        this.supervisor = supervisor;
        return this;
    }
    public Boolean getSupervisor() {
        return this.supervisor;
    }

}
