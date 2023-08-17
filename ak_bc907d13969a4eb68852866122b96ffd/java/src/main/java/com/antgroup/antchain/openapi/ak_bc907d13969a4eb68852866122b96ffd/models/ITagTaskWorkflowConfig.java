// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_bc907d13969a4eb68852866122b96ffd.models;

import com.aliyun.tea.*;

public class ITagTaskWorkflowConfig extends TeaModel {
    // 标注阶段
    @NameInMap("nodename")
    public String nodename;

    // 标注人员列表
    @NameInMap("users")
    public java.util.List<User> users;

    // 分组
    @NameInMap("groups")
    public java.util.List<Groups> groups;

    // 扩展参数，例如质检抽样的比例，0~100 %
    @NameInMap("exif")
    public Exif exif;

    public static ITagTaskWorkflowConfig build(java.util.Map<String, ?> map) throws Exception {
        ITagTaskWorkflowConfig self = new ITagTaskWorkflowConfig();
        return TeaModel.build(map, self);
    }

    public ITagTaskWorkflowConfig setNodename(String nodename) {
        this.nodename = nodename;
        return this;
    }
    public String getNodename() {
        return this.nodename;
    }

    public ITagTaskWorkflowConfig setUsers(java.util.List<User> users) {
        this.users = users;
        return this;
    }
    public java.util.List<User> getUsers() {
        return this.users;
    }

    public ITagTaskWorkflowConfig setGroups(java.util.List<Groups> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<Groups> getGroups() {
        return this.groups;
    }

    public ITagTaskWorkflowConfig setExif(Exif exif) {
        this.exif = exif;
        return this;
    }
    public Exif getExif() {
        return this.exif;
    }

}
