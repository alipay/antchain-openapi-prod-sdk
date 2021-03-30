// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class CreateMonitorTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // submitType是url就传 url地址 submitType 是file就传 oss fileId
    @NameInMap("submit_content")
    @Validation(required = true)
    public String submitContent;

    // 提交任务的类型:FILE/URL
    // 不填为FILE
    // FILE表示文件上传素材，URL表示上传URL
    @NameInMap("submit_type")
    public String submitType;

    // 文件类别
    // 
    // IMAGE
    // 
    // TEXT
    // 
    // VIDEO
    @NameInMap("file_type")
    @Validation(required = true)
    public String fileType;

    // 任务名称(不超过100字符)
    @NameInMap("task_name")
    @Validation(required = true)
    public String taskName;

    // 监测任务标题(不超过100字符)
    @NameInMap("content_title")
    @Validation(required = true)
    public String contentTitle;

    // 关键词(不超过200字符)
    @NameInMap("keywords")
    @Validation(required = true)
    public java.util.List<String> keywords;

    // 内容表述(不超过1000字符)
    @NameInMap("content_desc")
    public String contentDesc;

    // 监测供应商id
    @NameInMap("provider_id")
    public String providerId;

    // 监测范围 默认全部：ALL；PC网站：SITE；APP应用：APP
    @NameInMap("scopes")
    public java.util.List<String> scopes;

    // 任务开始时间，如当前时间戳，不传则取服务器当前时间戳，单位毫秒
    @NameInMap("task_start")
    public Long taskStart;

    // 任务持续时间，单位天，默认90天
    // 
    // 一次性监测：0
    @NameInMap("task_duration")
    public Long taskDuration;

    // 代理信息
    @NameInMap("proxy_info")
    public ProxyData proxyInfo;

    // 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。更多详情，请参见如何保证幂等性。
    @NameInMap("client_token")
    @Validation(required = true)
    public String clientToken;

    public static CreateMonitorTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorTaskRequest self = new CreateMonitorTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateMonitorTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateMonitorTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateMonitorTaskRequest setSubmitContent(String submitContent) {
        this.submitContent = submitContent;
        return this;
    }
    public String getSubmitContent() {
        return this.submitContent;
    }

    public CreateMonitorTaskRequest setSubmitType(String submitType) {
        this.submitType = submitType;
        return this;
    }
    public String getSubmitType() {
        return this.submitType;
    }

    public CreateMonitorTaskRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public CreateMonitorTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateMonitorTaskRequest setContentTitle(String contentTitle) {
        this.contentTitle = contentTitle;
        return this;
    }
    public String getContentTitle() {
        return this.contentTitle;
    }

    public CreateMonitorTaskRequest setKeywords(java.util.List<String> keywords) {
        this.keywords = keywords;
        return this;
    }
    public java.util.List<String> getKeywords() {
        return this.keywords;
    }

    public CreateMonitorTaskRequest setContentDesc(String contentDesc) {
        this.contentDesc = contentDesc;
        return this;
    }
    public String getContentDesc() {
        return this.contentDesc;
    }

    public CreateMonitorTaskRequest setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

    public CreateMonitorTaskRequest setScopes(java.util.List<String> scopes) {
        this.scopes = scopes;
        return this;
    }
    public java.util.List<String> getScopes() {
        return this.scopes;
    }

    public CreateMonitorTaskRequest setTaskStart(Long taskStart) {
        this.taskStart = taskStart;
        return this;
    }
    public Long getTaskStart() {
        return this.taskStart;
    }

    public CreateMonitorTaskRequest setTaskDuration(Long taskDuration) {
        this.taskDuration = taskDuration;
        return this;
    }
    public Long getTaskDuration() {
        return this.taskDuration;
    }

    public CreateMonitorTaskRequest setProxyInfo(ProxyData proxyInfo) {
        this.proxyInfo = proxyInfo;
        return this;
    }
    public ProxyData getProxyInfo() {
        return this.proxyInfo;
    }

    public CreateMonitorTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
