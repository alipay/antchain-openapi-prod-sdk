// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS.Models
{
    public class SaveOmngGenerationtaskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 任务ID、幂等处理
        [NameInMap("task_id")]
        [Validation(Required=true)]
        public string TaskId { get; set; }

        // 模型ID
        [NameInMap("model")]
        [Validation(Required=true)]
        public string Model { get; set; }

        // 素材内容
        [NameInMap("material_content_dto")]
        [Validation(Required=true)]
        public MaterialContentDto MaterialContentDto { get; set; }

        // 生成有声视频
        [NameInMap("generate_audio")]
        [Validation(Required=false)]
        public bool? GenerateAudio { get; set; }

        // 视频宽高比
        // 枚举值：16:9、4:3、1:1、3:4、9:16、21:9、adaptive
        [NameInMap("ratio")]
        [Validation(Required=false)]
        public string Ratio { get; set; }

        // 生成视频时长（单位：秒）。设置为 -1 时，实际生成视频的时长可通过 **视频生成任务查询接口 **返回的 duration 字段获取。视频时长与计费相关，请谨慎设置。
        // 目前最大值 仅支持 30、最小值-1。
        [NameInMap("duration")]
        [Validation(Required=false)]
        public long? Duration { get; set; }

        // 视频分辨率 可选值：480p、720p、1080p、4k
        [NameInMap("resolution")]
        [Validation(Required=false)]
        public string Resolution { get; set; }

        // 输出格式 枚举值:mp4、mov
        // 默认值：mp4
        [NameInMap("output_format")]
        [Validation(Required=false)]
        public string OutputFormat { get; set; }

        // 视频水印
        // 默认值：false
        //  true：生成视频右下角会展示 AI 生成 水印。
        [NameInMap("watermark")]
        [Validation(Required=false)]
        public bool? Watermark { get; set; }

        // 种子整数，用于控制生成内容的随机性
        [NameInMap("seed")]
        [Validation(Required=false)]
        public long? Seed { get; set; }

        // 返回尾帧 默认值 false
        // false/true
        [NameInMap("return_last_frame")]
        [Validation(Required=false)]
        public bool? ReturnLastFrame { get; set; }

        // 配置模型要调用的工具
        [NameInMap("tools")]
        [Validation(Required=false)]
        public List<ModelToolDto> Tools { get; set; }

        // 指定处理本次请求的服务等级类型 默认值 default
        // + default：在线推理模式
        // + flex：离线推理模式
        [NameInMap("service_tier")]
        [Validation(Required=false)]
        public string ServiceTier { get; set; }

        // 默认值 172800 秒 （48小时）
        // 3600 <=取值限制<= 259200
        [NameInMap("execution_expires_after")]
        [Validation(Required=false)]
        public long? ExecutionExpiresAfter { get; set; }

        // 终端用户的唯一标识符
        [NameInMap("safety_identifier")]
        [Validation(Required=false)]
        public string SafetyIdentifier { get; set; }

        // 执行优先级 默认值 0
        // 数值越大，优先级越高。
        [NameInMap("priority")]
        [Validation(Required=false)]
        public long? Priority { get; set; }

    }

}
