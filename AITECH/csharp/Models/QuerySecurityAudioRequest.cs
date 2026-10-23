// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    public class QuerySecurityAudioRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 音频公网 URL（与 audio 二选一，网关侧仅支持 URL 方式）
        [NameInMap("audio_url")]
        [Validation(Required=true)]
        public string AudioUrl { get; set; }

        // wav/mp3/flac/m4a/aiff/alac/ape，缺省从 URL 后缀或 magic number 推断
        [NameInMap("audio_format")]
        [Validation(Required=false)]
        public string AudioFormat { get; set; }

        // Boolean 降噪（null 时服务端默认 true）
        [NameInMap("denoise")]
        [Validation(Required=false)]
        public string Denoise { get; set; }

        // 须 audio 前缀，audio_input_*/audio_output_*
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

        // 租户标识（老值兼容替换）
        [NameInMap("business_id")]
        [Validation(Required=true)]
        public string BusinessId { get; set; }

        // 应用码
        [NameInMap("app_code")]
        [Validation(Required=false)]
        public string AppCode { get; set; }

        // 消息 ID
        [NameInMap("message_id")]
        [Validation(Required=false)]
        public string MessageId { get; set; }

        // 企业标识
        [NameInMap("enterprise")]
        [Validation(Required=false)]
        public string Enterprise { get; set; }

        // 访问控制维度
        [NameInMap("account_id")]
        [Validation(Required=false)]
        public string AccountId { get; set; }

    }

}
