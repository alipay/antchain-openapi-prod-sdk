// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVE.Models
{
    public class PushMaasAudioRequest : TeaModel {
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

        // 音频模型编码
        [NameInMap("model")]
        [Validation(Required=true)]
        public string Model { get; set; }

        // 类型
        [NameInMap("capability_type")]
        [Validation(Required=true)]
        public string CapabilityType { get; set; }

        // 音频生成提示词
        [NameInMap("prompt")]
        [Validation(Required=true)]
        public string Prompt { get; set; }

        // 需要朗读的文本，仅支持该参数的模型使用
        [NameInMap("text")]
        [Validation(Required=false)]
        public string Text { get; set; }

        // 音频链接，REFERENCE_TO_AUDIO 时非空
        [NameInMap("audio_urls")]
        [Validation(Required=false)]
        public List<string> AudioUrls { get; set; }

        // 图片链接，IMAGE_TO_AUDIO 时非空
        [NameInMap("image_urls")]
        [Validation(Required=false)]
        public List<string> ImageUrls { get; set; }

        // 扩展参数 JSON 字符串，内容按模型扩展参数对象组织
        [NameInMap("ext_params")]
        [Validation(Required=false)]
        public string ExtParams { get; set; }

    }

}
