// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aigc.models;

import com.aliyun.tea.*;

public class SubTasks extends TeaModel {
    // 子任务ID
    /**
     * <strong>example:</strong>
     * <p>子任务ID</p>
     */
    @NameInMap("sub_task_id")
    @Validation(required = true)
    public Long subTaskId;

    // 子任务名称
    /**
     * <strong>example:</strong>
     * <p>子任务名称</p>
     */
    @NameInMap("sub_task_name")
    @Validation(required = true)
    public String subTaskName;

    // 目标翻译语言
    /**
     * <strong>example:</strong>
     * <p>目标翻译语言</p>
     */
    @NameInMap("target_language")
    @Validation(required = true)
    public String targetLanguage;

    // 子任务状态包括：PENDING（待执行）、EXECUTING（执行中）、FAILED（失败）、COMPLETED（已完成）
    /**
     * <strong>example:</strong>
     * <p>子任务状态</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 源语言
    /**
     * <strong>example:</strong>
     * <p>源语言</p>
     */
    @NameInMap("source_language")
    @Validation(required = true)
    public String sourceLanguage;

    // 翻译后视频地址
    /**
     * <strong>example:</strong>
     * <p>翻译后视频地址</p>
     */
    @NameInMap("output_video_url")
    public String outputVideoUrl;

    // 翻译前字幕文件地址
    /**
     * <strong>example:</strong>
     * <p>翻译前字幕文件地址</p>
     */
    @NameInMap("original_subtitle_url")
    public String originalSubtitleUrl;

    // 翻译后字幕文件地址
    /**
     * <strong>example:</strong>
     * <p>翻译后字幕文件地址</p>
     */
    @NameInMap("translated_subtitle_url")
    public String translatedSubtitleUrl;

    // 视频时长（秒）
    /**
     * <strong>example:</strong>
     * <p>视频时长（秒）</p>
     */
    @NameInMap("duration_seconds")
    public Long durationSeconds;

    // 错误信息
    /**
     * <strong>example:</strong>
     * <p>错误信息</p>
     */
    @NameInMap("error_message")
    public String errorMessage;

    public static SubTasks build(java.util.Map<String, ?> map) throws Exception {
        SubTasks self = new SubTasks();
        return TeaModel.build(map, self);
    }

    public SubTasks setSubTaskId(Long subTaskId) {
        this.subTaskId = subTaskId;
        return this;
    }
    public Long getSubTaskId() {
        return this.subTaskId;
    }

    public SubTasks setSubTaskName(String subTaskName) {
        this.subTaskName = subTaskName;
        return this;
    }
    public String getSubTaskName() {
        return this.subTaskName;
    }

    public SubTasks setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public SubTasks setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SubTasks setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public SubTasks setOutputVideoUrl(String outputVideoUrl) {
        this.outputVideoUrl = outputVideoUrl;
        return this;
    }
    public String getOutputVideoUrl() {
        return this.outputVideoUrl;
    }

    public SubTasks setOriginalSubtitleUrl(String originalSubtitleUrl) {
        this.originalSubtitleUrl = originalSubtitleUrl;
        return this;
    }
    public String getOriginalSubtitleUrl() {
        return this.originalSubtitleUrl;
    }

    public SubTasks setTranslatedSubtitleUrl(String translatedSubtitleUrl) {
        this.translatedSubtitleUrl = translatedSubtitleUrl;
        return this;
    }
    public String getTranslatedSubtitleUrl() {
        return this.translatedSubtitleUrl;
    }

    public SubTasks setDurationSeconds(Long durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }
    public Long getDurationSeconds() {
        return this.durationSeconds;
    }

    public SubTasks setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

}
