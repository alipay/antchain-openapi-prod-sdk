// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AppOwner extends TeaModel {
    // 研发负责人
    @NameInMap("dev_owner")
    public UserInfo devOwner;

    // backup开发人员
    @NameInMap("backup_dev_owners")
    public java.util.List<UserInfo> backupDevOwners;

    // 测试负责人
    @NameInMap("test_owner")
    public UserInfo testOwner;

    // 备用测试人员
    @NameInMap("backup_test_owners")
    public java.util.List<UserInfo> backupTestOwners;

    // 运维负责人
    @NameInMap("ops")
    public UserInfo ops;

    // 备用SRE人员
    @NameInMap("backup_opses")
    public java.util.List<UserInfo> backupOpses;

    // 开发architect负责人
    @NameInMap("dev_architect")
    public UserInfo devArchitect;

    // 备用Architects联系人
    @NameInMap("backup_dev_architects")
    public java.util.List<UserInfo> backupDevArchitects;

    // 测试architect
    @NameInMap("test_architect")
    public UserInfo testArchitect;

    // 备用测试architects
    @NameInMap("backup_test_architects")
    public java.util.List<UserInfo> backupTestArchitects;

    public static AppOwner build(java.util.Map<String, ?> map) throws Exception {
        AppOwner self = new AppOwner();
        return TeaModel.build(map, self);
    }

    public AppOwner setDevOwner(UserInfo devOwner) {
        this.devOwner = devOwner;
        return this;
    }
    public UserInfo getDevOwner() {
        return this.devOwner;
    }

    public AppOwner setBackupDevOwners(java.util.List<UserInfo> backupDevOwners) {
        this.backupDevOwners = backupDevOwners;
        return this;
    }
    public java.util.List<UserInfo> getBackupDevOwners() {
        return this.backupDevOwners;
    }

    public AppOwner setTestOwner(UserInfo testOwner) {
        this.testOwner = testOwner;
        return this;
    }
    public UserInfo getTestOwner() {
        return this.testOwner;
    }

    public AppOwner setBackupTestOwners(java.util.List<UserInfo> backupTestOwners) {
        this.backupTestOwners = backupTestOwners;
        return this;
    }
    public java.util.List<UserInfo> getBackupTestOwners() {
        return this.backupTestOwners;
    }

    public AppOwner setOps(UserInfo ops) {
        this.ops = ops;
        return this;
    }
    public UserInfo getOps() {
        return this.ops;
    }

    public AppOwner setBackupOpses(java.util.List<UserInfo> backupOpses) {
        this.backupOpses = backupOpses;
        return this;
    }
    public java.util.List<UserInfo> getBackupOpses() {
        return this.backupOpses;
    }

    public AppOwner setDevArchitect(UserInfo devArchitect) {
        this.devArchitect = devArchitect;
        return this;
    }
    public UserInfo getDevArchitect() {
        return this.devArchitect;
    }

    public AppOwner setBackupDevArchitects(java.util.List<UserInfo> backupDevArchitects) {
        this.backupDevArchitects = backupDevArchitects;
        return this;
    }
    public java.util.List<UserInfo> getBackupDevArchitects() {
        return this.backupDevArchitects;
    }

    public AppOwner setTestArchitect(UserInfo testArchitect) {
        this.testArchitect = testArchitect;
        return this;
    }
    public UserInfo getTestArchitect() {
        return this.testArchitect;
    }

    public AppOwner setBackupTestArchitects(java.util.List<UserInfo> backupTestArchitects) {
        this.backupTestArchitects = backupTestArchitects;
        return this;
    }
    public java.util.List<UserInfo> getBackupTestArchitects() {
        return this.backupTestArchitects;
    }

}
