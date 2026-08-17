// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class TaskResultInfoDto extends TeaModel {
    // 任务ID
    /**
     * <strong>example:</strong>
     * <p>1798234932684395</p>
     */
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // 模型名称与版本
    // 格式为 模型名称-版本
    /**
     * <strong>example:</strong>
     * <p>doubao-seedance-2-0-260128</p>
     */
    @NameInMap("model")
    @Validation(required = true)
    public String model;

    // 任务状态
    // + creating: 任务创建中
    // + queued：排队中
    // + running：任务运行中
    // + cancelled：取消任务，取消状态 24h 自动删除（只支持排队中状态的任务被取消）
    // + succeeded：任务成功
    // + failed：任务失败
    // + expired：任务超时
    /**
     * <strong>example:</strong>
     * <p>creating</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 错误信息（任务失败时返回错误数据）
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("error")
    public TaskErrorDto error;

    // 输出内容
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("content")
    public ContentInfoDto content;

    // token 用量
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("usage")
    public TokenUsageDto usage;

    // 视频时长（秒）
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("duration")
    public Long duration;

    // 视频帧数
    // 说明： duration 和 frames 参数只会返回一个 。
    /**
     * <strong>example:</strong>
     * <p>323</p>
     */
    @NameInMap("frames")
    public Long frames;

    // 分辨率
    /**
     * <strong>example:</strong>
     * <p>4k</p>
     */
    @NameInMap("resolution")
    public String resolution;

    // 宽高比
    /**
     * <strong>example:</strong>
     * <p>4:3</p>
     */
    @NameInMap("ratio")
    public String ratio;

    // 随机种子
    /**
     * <strong>example:</strong>
     * <p>233</p>
     */
    @NameInMap("seed")
    public Long seed;

    // 视频帧率
    /**
     * <strong>example:</strong>
     * <p>321</p>
     */
    @NameInMap("framespersecond")
    @Validation(required = true)
    public Long framespersecond;

    // 是否生成同步音频
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("generate_audio")
    public Boolean generateAudio;

    // 服务等级
    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("service_tier")
    public String serviceTier;

    // 任务超时阈值（秒）
    /**
     * <strong>example:</strong>
     * <p>23543</p>
     */
    @NameInMap("execution_expires_after")
    public Long executionExpiresAfter;

    // 执行优先级
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("priority")
    public Long priority;

    // 终端用户标识
    /**
     * <strong>example:</strong>
     * <p>tools</p>
     */
    @NameInMap("safety_identifier")
    public String safetyIdentifier;

    // 任务实际创建时间 格式 yyyy-MM-dd HH:mm:ss
    /**
     * <strong>example:</strong>
     * <p>2026-06-10 10:09:01</p>
     */
    @NameInMap("created_at")
    public String createdAt;

    // 更新时间  格式 yyyy-MM-dd HH:mm:ss
    /**
     * <strong>example:</strong>
     * <p>2026-06-10 10:09:01</p>
     */
    @NameInMap("updated_at")
    public String updatedAt;

    // 实际使用的工具
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("tools")
    public java.util.List<ModelToolDto> tools;

    public static TaskResultInfoDto build(java.util.Map<String, ?> map) throws Exception {
        TaskResultInfoDto self = new TaskResultInfoDto();
        return TeaModel.build(map, self);
    }

    public TaskResultInfoDto setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public TaskResultInfoDto setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public TaskResultInfoDto setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public TaskResultInfoDto setError(TaskErrorDto error) {
        this.error = error;
        return this;
    }
    public TaskErrorDto getError() {
        return this.error;
    }

    public TaskResultInfoDto setContent(ContentInfoDto content) {
        this.content = content;
        return this;
    }
    public ContentInfoDto getContent() {
        return this.content;
    }

    public TaskResultInfoDto setUsage(TokenUsageDto usage) {
        this.usage = usage;
        return this;
    }
    public TokenUsageDto getUsage() {
        return this.usage;
    }

    public TaskResultInfoDto setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public TaskResultInfoDto setFrames(Long frames) {
        this.frames = frames;
        return this;
    }
    public Long getFrames() {
        return this.frames;
    }

    public TaskResultInfoDto setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    public String getResolution() {
        return this.resolution;
    }

    public TaskResultInfoDto setRatio(String ratio) {
        this.ratio = ratio;
        return this;
    }
    public String getRatio() {
        return this.ratio;
    }

    public TaskResultInfoDto setSeed(Long seed) {
        this.seed = seed;
        return this;
    }
    public Long getSeed() {
        return this.seed;
    }

    public TaskResultInfoDto setFramespersecond(Long framespersecond) {
        this.framespersecond = framespersecond;
        return this;
    }
    public Long getFramespersecond() {
        return this.framespersecond;
    }

    public TaskResultInfoDto setGenerateAudio(Boolean generateAudio) {
        this.generateAudio = generateAudio;
        return this;
    }
    public Boolean getGenerateAudio() {
        return this.generateAudio;
    }

    public TaskResultInfoDto setServiceTier(String serviceTier) {
        this.serviceTier = serviceTier;
        return this;
    }
    public String getServiceTier() {
        return this.serviceTier;
    }

    public TaskResultInfoDto setExecutionExpiresAfter(Long executionExpiresAfter) {
        this.executionExpiresAfter = executionExpiresAfter;
        return this;
    }
    public Long getExecutionExpiresAfter() {
        return this.executionExpiresAfter;
    }

    public TaskResultInfoDto setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

    public TaskResultInfoDto setSafetyIdentifier(String safetyIdentifier) {
        this.safetyIdentifier = safetyIdentifier;
        return this;
    }
    public String getSafetyIdentifier() {
        return this.safetyIdentifier;
    }

    public TaskResultInfoDto setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public TaskResultInfoDto setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public TaskResultInfoDto setTools(java.util.List<ModelToolDto> tools) {
        this.tools = tools;
        return this;
    }
    public java.util.List<ModelToolDto> getTools() {
        return this.tools;
    }

}
