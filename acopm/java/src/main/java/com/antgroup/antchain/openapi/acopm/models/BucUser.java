// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class BucUser extends TeaModel {
    // 工号
    /**
     * <strong>example:</strong>
     * <p>387745</p>
     */
    @NameInMap("emp_id")
    @Validation(required = true)
    public String empId;

    // 域账号
    /**
     * <strong>example:</strong>
     * <p>zhangsan.zs</p>
     */
    @NameInMap("email_prefix")
    @Validation(required = true)
    public String emailPrefix;

    // 花名
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("nick_name")
    public String nickName;

    public static BucUser build(java.util.Map<String, ?> map) throws Exception {
        BucUser self = new BucUser();
        return TeaModel.build(map, self);
    }

    public BucUser setEmpId(String empId) {
        this.empId = empId;
        return this;
    }
    public String getEmpId() {
        return this.empId;
    }

    public BucUser setEmailPrefix(String emailPrefix) {
        this.emailPrefix = emailPrefix;
        return this;
    }
    public String getEmailPrefix() {
        return this.emailPrefix;
    }

    public BucUser setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

}
