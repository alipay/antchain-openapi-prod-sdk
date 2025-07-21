// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class MonitorTask extends TeaModel {
    // 内容表述
    // 
    // 
    /**
     * <strong>example:</strong>
     * <p>wert</p>
     */
    @NameInMap("content_desc")
    public String contentDesc;

    // 监测任务标题
    // 
    // 
    /**
     * <strong>example:</strong>
     * <p>awe</p>
     */
    @NameInMap("content_title")
    public String contentTitle;

    // 监测文件时长，主要用于视频监测、音频监测的时长记录
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("file_length_in_second")
    public Long fileLengthInSecond;

    // 监测关键字
    // 
    // 
    /**
     * <strong>example:</strong>
     * <p>111111111111111111</p>
     */
    @NameInMap("keywords")
    @Validation(required = true)
    public java.util.List<String> keywords;

    // 监测任务ID
    // 
    /**
     * <strong>example:</strong>
     * <p>111111111111111111</p>
     */
    @NameInMap("monitor_task_id")
    @Validation(required = true)
    public String monitorTaskId;

    // 任务名称
    // 
    // 
    /**
     * <strong>example:</strong>
     * <p>111111111111111111</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 监测供应商id
    /**
     * <strong>example:</strong>
     * <p>GOODEYE</p>
     */
    @NameInMap("provider_id")
    public String providerId;

    // 监测结果数量
    // 
    // 
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("result_count")
    public Long resultCount;

    // 监测范围
    // 
    // 
    /**
     * <strong>example:</strong>
     * <p>111111111111111111</p>
     */
    @NameInMap("scopes")
    @Validation(required = true)
    public java.util.List<String> scopes;

    // 任务状态
    // 
    // INIT
    // 
    // WORKING
    // 
    // FINISH
    // 
    // FAILURE
    // 
    // DELETE
    /**
     * <strong>example:</strong>
     * <p>WORKING</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 监测时长(天)
    // 
    // 
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("task_duration")
    @Validation(required = true)
    public Long taskDuration;

    // 任务结束时间
    // 
    // 
    /**
     * <strong>example:</strong>
     * <p>1592807928</p>
     */
    @NameInMap("task_end")
    public Long taskEnd;

    // 任务开始时间
    // 
    // 
    /**
     * <strong>example:</strong>
     * <p>1592807928</p>
     */
    @NameInMap("task_start")
    public Long taskStart;

    // 文件类别
    // 
    // IMAGE
    // 
    // TEXT
    // 
    // VIDEO
    /**
     * <strong>example:</strong>
     * <p>IMAGE</p>
     */
    @NameInMap("file_type")
    @Validation(required = true)
    public String fileType;

    // 文件大小
    /**
     * <strong>example:</strong>
     * <p>111111</p>
     */
    @NameInMap("file_size")
    public Long fileSize;

    // submitType是url就是url地址 submitType 是file就是oss fileId
    /**
     * <strong>example:</strong>
     * <p><a href="https://xxxx">https://xxxx</a></p>
     */
    @NameInMap("submit_content")
    @Validation(required = true)
    public String submitContent;

    // 提交任务的类型:FILE/URL
    // 不填为FILE
    // FILE表示文件上传素材，URL表示上传URL
    /**
     * <strong>example:</strong>
     * <p>FILE</p>
     */
    @NameInMap("submit_type")
    public String submitType;

    // 当status为failure时的具体错误信息（中文描述）
    /**
     * <strong>example:</strong>
     * <p>error</p>
     */
    @NameInMap("failure_msg")
    public String failureMsg;

    // 当status为failure时的具体错误信息（错误枚举）
    /**
     * <strong>example:</strong>
     * <p>SERVER_ERROR</p>
     */
    @NameInMap("failure_code")
    public String failureCode;

    public static MonitorTask build(java.util.Map<String, ?> map) throws Exception {
        MonitorTask self = new MonitorTask();
        return TeaModel.build(map, self);
    }

    public MonitorTask setContentDesc(String contentDesc) {
        this.contentDesc = contentDesc;
        return this;
    }
    public String getContentDesc() {
        return this.contentDesc;
    }

    public MonitorTask setContentTitle(String contentTitle) {
        this.contentTitle = contentTitle;
        return this;
    }
    public String getContentTitle() {
        return this.contentTitle;
    }

    public MonitorTask setFileLengthInSecond(Long fileLengthInSecond) {
        this.fileLengthInSecond = fileLengthInSecond;
        return this;
    }
    public Long getFileLengthInSecond() {
        return this.fileLengthInSecond;
    }

    public MonitorTask setKeywords(java.util.List<String> keywords) {
        this.keywords = keywords;
        return this;
    }
    public java.util.List<String> getKeywords() {
        return this.keywords;
    }

    public MonitorTask setMonitorTaskId(String monitorTaskId) {
        this.monitorTaskId = monitorTaskId;
        return this;
    }
    public String getMonitorTaskId() {
        return this.monitorTaskId;
    }

    public MonitorTask setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MonitorTask setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

    public MonitorTask setResultCount(Long resultCount) {
        this.resultCount = resultCount;
        return this;
    }
    public Long getResultCount() {
        return this.resultCount;
    }

    public MonitorTask setScopes(java.util.List<String> scopes) {
        this.scopes = scopes;
        return this;
    }
    public java.util.List<String> getScopes() {
        return this.scopes;
    }

    public MonitorTask setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public MonitorTask setTaskDuration(Long taskDuration) {
        this.taskDuration = taskDuration;
        return this;
    }
    public Long getTaskDuration() {
        return this.taskDuration;
    }

    public MonitorTask setTaskEnd(Long taskEnd) {
        this.taskEnd = taskEnd;
        return this;
    }
    public Long getTaskEnd() {
        return this.taskEnd;
    }

    public MonitorTask setTaskStart(Long taskStart) {
        this.taskStart = taskStart;
        return this;
    }
    public Long getTaskStart() {
        return this.taskStart;
    }

    public MonitorTask setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public MonitorTask setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public MonitorTask setSubmitContent(String submitContent) {
        this.submitContent = submitContent;
        return this;
    }
    public String getSubmitContent() {
        return this.submitContent;
    }

    public MonitorTask setSubmitType(String submitType) {
        this.submitType = submitType;
        return this;
    }
    public String getSubmitType() {
        return this.submitType;
    }

    public MonitorTask setFailureMsg(String failureMsg) {
        this.failureMsg = failureMsg;
        return this;
    }
    public String getFailureMsg() {
        return this.failureMsg;
    }

    public MonitorTask setFailureCode(String failureCode) {
        this.failureCode = failureCode;
        return this;
    }
    public String getFailureCode() {
        return this.failureCode;
    }

}
