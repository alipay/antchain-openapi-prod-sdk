// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AIGC.Models
{
    public class PushVideoCreatetaskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 模型标识，如 ：doubao-seedance-2-0-260128
        [NameInMap("model")]
        [Validation(Required=true)]
        public string Model { get; set; }

        // 文本提示词
        [NameInMap("prompt")]
        [Validation(Required=true)]
        public string Prompt { get; set; }

        // 图生视频参考图片 URL
        [NameInMap("image_url")]
        [Validation(Required=false)]
        public List<string> ImageUrl { get; set; }

        // 视频参考/续写时传入视频 URL
        [NameInMap("video_url")]
        [Validation(Required=false)]
        public List<string> VideoUrl { get; set; }

        // 参考音频URL列表
        [NameInMap("audio_url")]
        [Validation(Required=false)]
        public List<string> AudioUrl { get; set; }

        // 比例
        [NameInMap("ratio")]
        [Validation(Required=false)]
        public string Ratio { get; set; }

        // 视频时长（秒）
        [NameInMap("duration")]
        [Validation(Required=false)]
        public string Duration { get; set; }

        // 请求追踪 ID，用于幂等去重
        [NameInMap("request_id")]
        [Validation(Required=false)]
        public string RequestId { get; set; }

        // 扩展JSON
        [NameInMap("ext")]
        [Validation(Required=false)]
        public string Ext { get; set; }

    }

}
