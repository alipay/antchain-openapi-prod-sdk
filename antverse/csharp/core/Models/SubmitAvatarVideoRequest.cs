// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ANTVERSE.Models
{
    public class SubmitAvatarVideoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 视频名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 数字人id
        [NameInMap("avatar_id")]
        [Validation(Required=true)]
        public string AvatarId { get; set; }

        // 说话人code
        [NameInMap("speaker_code")]
        [Validation(Required=true)]
        public string SpeakerCode { get; set; }

        // 播报文本（一千字以内），支持SSML
        [NameInMap("text")]
        [Validation(Required=true)]
        public string Text { get; set; }

        // 音量（0~100，默认50）
        [NameInMap("volume")]
        [Validation(Required=false)]
        public long? Volume { get; set; }

        // 语速（-50~50，默认 0）
        [NameInMap("speed")]
        [Validation(Required=false)]
        public long? Speed { get; set; }

        // 音调（-50~50，默认 0）
        [NameInMap("tone")]
        [Validation(Required=false)]
        public long? Tone { get; set; }

        // 背景图片Url，需要公网可访问
        [NameInMap("background_url")]
        [Validation(Required=true)]
        public string BackgroundUrl { get; set; }

        // 分辨率，暂只支持1080
        [NameInMap("resolution")]
        [Validation(Required=true)]
        public string Resolution { get; set; }

        // 画布比例，16:9/9:16
        [NameInMap("radio")]
        [Validation(Required=true)]
        public string Radio { get; set; }

        // 数字人位置大小信息，以左上角为起始坐标，向右向下为正值
        [NameInMap("human_config")]
        [Validation(Required=true)]
        public PositionSizeInfo HumanConfig { get; set; }

    }

}
