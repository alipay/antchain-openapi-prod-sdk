// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVE.Models
{
    public class PushMaasImageRequest : TeaModel {
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

        // 图片模型编码
        [NameInMap("model")]
        [Validation(Required=true)]
        public string Model { get; set; }

        // 类型
        [NameInMap("capability_type")]
        [Validation(Required=true)]
        public string CapabilityType { get; set; }

        // 生成模式
        [NameInMap("generate_mode")]
        [Validation(Required=false)]
        public string GenerateMode { get; set; }

        // 图片生成或编辑提示词
        [NameInMap("prompt")]
        [Validation(Required=true)]
        public string Prompt { get; set; }

        // 图片地址
        [NameInMap("image_urls")]
        [Validation(Required=false)]
        public List<string> ImageUrls { get; set; }

        // 图片尺寸
        [NameInMap("size")]
        [Validation(Required=false)]
        public string Size { get; set; }

        // 图片张数
        [NameInMap("n")]
        [Validation(Required=false)]
        public long? N { get; set; }

        // 扩展参数 JSON 字符串
        [NameInMap("ext_params")]
        [Validation(Required=false)]
        public string ExtParams { get; set; }

    }

}
