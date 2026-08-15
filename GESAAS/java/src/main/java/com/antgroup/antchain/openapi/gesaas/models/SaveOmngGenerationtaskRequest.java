// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class SaveOmngGenerationtaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 任务ID、幂等处理
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // 模型ID
    @NameInMap("model")
    @Validation(required = true)
    public String model;

    // 素材内容
    @NameInMap("material_content_dto")
    @Validation(required = true)
    public MaterialContentDto materialContentDto;

    // 生成有声视频
    @NameInMap("generate_audio")
    public Boolean generateAudio;

    // 视频宽高比
    // 枚举值：16:9、4:3、1:1、3:4、9:16、21:9、adaptive
    @NameInMap("ratio")
    public String ratio;

    // 生成视频时长（单位：秒）。设置为 -1 时，实际生成视频的时长可通过 **视频生成任务查询接口 **返回的 duration 字段获取。视频时长与计费相关，请谨慎设置。
    // 目前最大值 仅支持 30、最小值-1。
    @NameInMap("duration")
    public Long duration;

    // 视频分辨率 可选值：480p、720p、1080p、4k
    @NameInMap("resolution")
    public String resolution;

    // 输出格式 枚举值:mp4、mov
    // 默认值：mp4
    @NameInMap("output_format")
    public String outputFormat;

    // 视频水印
    // 默认值：false
    //  true：生成视频右下角会展示 AI 生成 水印。
    @NameInMap("watermark")
    public Boolean watermark;

    // 种子整数，用于控制生成内容的随机性
    @NameInMap("seed")
    public Long seed;

    // 返回尾帧 默认值 false
    // false/true
    @NameInMap("return_last_frame")
    public Boolean returnLastFrame;

    // 配置模型要调用的工具
    @NameInMap("tools")
    public java.util.List<ModelToolDto> tools;

    // 指定处理本次请求的服务等级类型 默认值 default
    // + default：在线推理模式
    // + flex：离线推理模式
    @NameInMap("service_tier")
    public String serviceTier;

    // 默认值 172800 秒 （48小时）
    // 3600 <=取值限制<= 259200
    @NameInMap("execution_expires_after")
    public Long executionExpiresAfter;

    // 终端用户的唯一标识符
    @NameInMap("safety_identifier")
    public String safetyIdentifier;

    // 执行优先级 默认值 0
    // 数值越大，优先级越高。
    @NameInMap("priority")
    public Long priority;

    public static SaveOmngGenerationtaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveOmngGenerationtaskRequest self = new SaveOmngGenerationtaskRequest();
        return TeaModel.build(map, self);
    }

    public SaveOmngGenerationtaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveOmngGenerationtaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveOmngGenerationtaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public SaveOmngGenerationtaskRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public SaveOmngGenerationtaskRequest setMaterialContentDto(MaterialContentDto materialContentDto) {
        this.materialContentDto = materialContentDto;
        return this;
    }
    public MaterialContentDto getMaterialContentDto() {
        return this.materialContentDto;
    }

    public SaveOmngGenerationtaskRequest setGenerateAudio(Boolean generateAudio) {
        this.generateAudio = generateAudio;
        return this;
    }
    public Boolean getGenerateAudio() {
        return this.generateAudio;
    }

    public SaveOmngGenerationtaskRequest setRatio(String ratio) {
        this.ratio = ratio;
        return this;
    }
    public String getRatio() {
        return this.ratio;
    }

    public SaveOmngGenerationtaskRequest setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public SaveOmngGenerationtaskRequest setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    public String getResolution() {
        return this.resolution;
    }

    public SaveOmngGenerationtaskRequest setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }
    public String getOutputFormat() {
        return this.outputFormat;
    }

    public SaveOmngGenerationtaskRequest setWatermark(Boolean watermark) {
        this.watermark = watermark;
        return this;
    }
    public Boolean getWatermark() {
        return this.watermark;
    }

    public SaveOmngGenerationtaskRequest setSeed(Long seed) {
        this.seed = seed;
        return this;
    }
    public Long getSeed() {
        return this.seed;
    }

    public SaveOmngGenerationtaskRequest setReturnLastFrame(Boolean returnLastFrame) {
        this.returnLastFrame = returnLastFrame;
        return this;
    }
    public Boolean getReturnLastFrame() {
        return this.returnLastFrame;
    }

    public SaveOmngGenerationtaskRequest setTools(java.util.List<ModelToolDto> tools) {
        this.tools = tools;
        return this;
    }
    public java.util.List<ModelToolDto> getTools() {
        return this.tools;
    }

    public SaveOmngGenerationtaskRequest setServiceTier(String serviceTier) {
        this.serviceTier = serviceTier;
        return this;
    }
    public String getServiceTier() {
        return this.serviceTier;
    }

    public SaveOmngGenerationtaskRequest setExecutionExpiresAfter(Long executionExpiresAfter) {
        this.executionExpiresAfter = executionExpiresAfter;
        return this;
    }
    public Long getExecutionExpiresAfter() {
        return this.executionExpiresAfter;
    }

    public SaveOmngGenerationtaskRequest setSafetyIdentifier(String safetyIdentifier) {
        this.safetyIdentifier = safetyIdentifier;
        return this;
    }
    public String getSafetyIdentifier() {
        return this.safetyIdentifier;
    }

    public SaveOmngGenerationtaskRequest setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

}
