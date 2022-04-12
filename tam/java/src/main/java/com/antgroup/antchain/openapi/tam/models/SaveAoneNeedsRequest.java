// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tam.models;

import com.aliyun.tea.*;

public class SaveAoneNeedsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 产品线
    @NameInMap("product_line")
    @Validation(required = true)
    public String productLine;

    // 产品名称
    @NameInMap("product_name")
    @Validation(required = true)
    public String productName;

    // 问题类型
    @NameInMap("issue_type")
    @Validation(required = true)
    public String issueType;

    // 期望日期
    @NameInMap("expected_at")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String expectedAt;

    // 创建者的工号
    @NameInMap("author")
    @Validation(required = true)
    public String author;

    // 解决者/指派者的工号
    @NameInMap("assigned_to")
    @Validation(required = true)
    public String assignedTo;

    // 标题
    @NameInMap("subject")
    @Validation(required = true)
    public String subject;

    // 描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 跟踪者的工号
    @NameInMap("watcher_users")
    @Validation(required = true)
    public java.util.List<String> watcherUsers;

    // 优先级
    @NameInMap("priority_id")
    @Validation(required = true)
    public Long priorityId;

    // 上传文件集合
    @NameInMap("uploadlist")
    public UploadRequestArray uploadlist;

    public static SaveAoneNeedsRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveAoneNeedsRequest self = new SaveAoneNeedsRequest();
        return TeaModel.build(map, self);
    }

    public SaveAoneNeedsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveAoneNeedsRequest setProductLine(String productLine) {
        this.productLine = productLine;
        return this;
    }
    public String getProductLine() {
        return this.productLine;
    }

    public SaveAoneNeedsRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public SaveAoneNeedsRequest setIssueType(String issueType) {
        this.issueType = issueType;
        return this;
    }
    public String getIssueType() {
        return this.issueType;
    }

    public SaveAoneNeedsRequest setExpectedAt(String expectedAt) {
        this.expectedAt = expectedAt;
        return this;
    }
    public String getExpectedAt() {
        return this.expectedAt;
    }

    public SaveAoneNeedsRequest setAuthor(String author) {
        this.author = author;
        return this;
    }
    public String getAuthor() {
        return this.author;
    }

    public SaveAoneNeedsRequest setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
        return this;
    }
    public String getAssignedTo() {
        return this.assignedTo;
    }

    public SaveAoneNeedsRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public SaveAoneNeedsRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SaveAoneNeedsRequest setWatcherUsers(java.util.List<String> watcherUsers) {
        this.watcherUsers = watcherUsers;
        return this;
    }
    public java.util.List<String> getWatcherUsers() {
        return this.watcherUsers;
    }

    public SaveAoneNeedsRequest setPriorityId(Long priorityId) {
        this.priorityId = priorityId;
        return this;
    }
    public Long getPriorityId() {
        return this.priorityId;
    }

    public SaveAoneNeedsRequest setUploadlist(UploadRequestArray uploadlist) {
        this.uploadlist = uploadlist;
        return this;
    }
    public UploadRequestArray getUploadlist() {
        return this.uploadlist;
    }

}
