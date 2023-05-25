// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class ImageRepo extends TeaModel {
    // repo ID
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 镜像仓库名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 镜像仓库域名
    @NameInMap("domain")
    @Validation(required = true)
    public String domain;

    // 用户名
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 密码
    @NameInMap("password")
    @Validation(required = true)
    public String password;

    // 状态
    @NameInMap("status")
    @Validation(required = true)
    public Boolean status;

    // 创建时间
    @NameInMap("create_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createTime;

    // 上次连接时间
    @NameInMap("last_connect_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String lastConnectTime;

    public static ImageRepo build(java.util.Map<String, ?> map) throws Exception {
        ImageRepo self = new ImageRepo();
        return TeaModel.build(map, self);
    }

    public ImageRepo setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ImageRepo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ImageRepo setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ImageRepo setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public ImageRepo setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ImageRepo setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public ImageRepo setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public ImageRepo setLastConnectTime(String lastConnectTime) {
        this.lastConnectTime = lastConnectTime;
        return this;
    }
    public String getLastConnectTime() {
        return this.lastConnectTime;
    }

}
