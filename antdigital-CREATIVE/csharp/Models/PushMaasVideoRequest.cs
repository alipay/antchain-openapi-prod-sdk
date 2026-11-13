// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVE.Models
{
    public class PushMaasVideoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 幂等标识，由客户端生成
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 视频模型编码
        [NameInMap("model")]
        [Validation(Required=true)]
        public string Model { get; set; }

        // 类型
        [NameInMap("capability_type")]
        [Validation(Required=true)]
        public string CapabilityType { get; set; }

        // 非空内容列表，至少含文本或素材
        [NameInMap("content")]
        [Validation(Required=true)]
        public List<ContentInfo> Content { get; set; }

        // 视频时长（秒）
        [NameInMap("duration")]
        [Validation(Required=false)]
        public string Duration { get; set; }

        // 宽高比，如 16:9、9:16
        [NameInMap("ratio")]
        [Validation(Required=false)]
        public string Ratio { get; set; }

        // 分辨率，如 720P、1080P
        [NameInMap("resolution")]
        [Validation(Required=false)]
        public string Resolution { get; set; }

        // 是否生成音轨，默认 false
        [NameInMap("generate_audio")]
        [Validation(Required=false)]
        public bool? GenerateAudio { get; set; }

        // 是否添加水印
        [NameInMap("watermark")]
        [Validation(Required=false)]
        public bool? Watermark { get; set; }

        // 扩展参数 JSON 字符串
        [NameInMap("ext_params")]
        [Validation(Required=false)]
        public string ExtParams { get; set; }

    }

}
