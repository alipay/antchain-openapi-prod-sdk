// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.duanka.models;

import com.aliyun.tea.*;

public class QueryResult extends TeaModel {
    // 工号
    @NameInMap("work_no")
    @Validation(required = true)
    public String workNo;

    // 花名
    @NameInMap("nick_name")
    public String nickName;

    // 姓名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 域账号
    @NameInMap("login_account")
    @Validation(required = true)
    public String loginAccount;

    // 企业邮箱
    @NameInMap("bu_mail")
    @Validation(required = true)
    public String buMail;

    // 人员类型
    @NameInMap("emp_type")
    @Validation(required = true)
    public String empType;

    public static QueryResult build(java.util.Map<String, ?> map) throws Exception {
        QueryResult self = new QueryResult();
        return TeaModel.build(map, self);
    }

    public QueryResult setWorkNo(String workNo) {
        this.workNo = workNo;
        return this;
    }
    public String getWorkNo() {
        return this.workNo;
    }

    public QueryResult setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public QueryResult setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryResult setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
        return this;
    }
    public String getLoginAccount() {
        return this.loginAccount;
    }

    public QueryResult setBuMail(String buMail) {
        this.buMail = buMail;
        return this;
    }
    public String getBuMail() {
        return this.buMail;
    }

    public QueryResult setEmpType(String empType) {
        this.empType = empType;
        return this;
    }
    public String getEmpType() {
        return this.empType;
    }

}
