// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CodeCommit extends TeaModel {
    // 作者
    @NameInMap("author")
    public String author;

    // 分支
    @NameInMap("branch")
    public String branch;

    // 代码版本
    @NameInMap("code_version")
    public String codeVersion;

    // 时间
    @NameInMap("date")
    public String date;

    // id
    @NameInMap("id")
    public String id;

    // 消息
    @NameInMap("msg")
    public String msg;

    // 仓库名称
    @NameInMap("repo_name")
    public String repoName;

    // 创建时间
    @NameInMap("utc_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String utcCreate;

    // 修改时间
    @NameInMap("utc_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String utcModified;

    public static CodeCommit build(java.util.Map<String, ?> map) throws Exception {
        CodeCommit self = new CodeCommit();
        return TeaModel.build(map, self);
    }

    public CodeCommit setAuthor(String author) {
        this.author = author;
        return this;
    }
    public String getAuthor() {
        return this.author;
    }

    public CodeCommit setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public String getBranch() {
        return this.branch;
    }

    public CodeCommit setCodeVersion(String codeVersion) {
        this.codeVersion = codeVersion;
        return this;
    }
    public String getCodeVersion() {
        return this.codeVersion;
    }

    public CodeCommit setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public CodeCommit setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CodeCommit setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public CodeCommit setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public CodeCommit setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public CodeCommit setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

}
