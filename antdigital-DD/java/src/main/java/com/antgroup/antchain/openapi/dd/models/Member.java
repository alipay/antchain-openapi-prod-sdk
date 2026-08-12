// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class Member extends TeaModel {
    // 用户ID
    /**
     * <strong>example:</strong>
     * <p>0000461041</p>
     */
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 用户名称
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 登录名
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:hpat684@alitest.xyz">hpat684@alitest.xyz</a></p>
     */
    @NameInMap("login_name")
    @Validation(required = true)
    public String loginName;

    // 项目ID
    /**
     * <strong>example:</strong>
     * <p>00004606871785921985864</p>
     */
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 创建时间
    /**
     * <strong>example:</strong>
     * <p>2026-05-22 10:18:40</p>
     */
    @NameInMap("gmt_create")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    public static Member build(java.util.Map<String, ?> map) throws Exception {
        Member self = new Member();
        return TeaModel.build(map, self);
    }

    public Member setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public Member setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public Member setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public Member setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public Member setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

}
