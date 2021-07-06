// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASPLUS.Models
{
    public class InitContentriskInternalRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 进行识别的音频地址
        [NameInMap("audio_urls")]
        [Validation(Required=false)]
        public string AudioUrls { get; set; }

        // 内部字段
        [NameInMap("biz_info")]
        [Validation(Required=true)]
        public BizInfo BizInfo { get; set; }

        // 待校验连接
        [NameInMap("link_urls")]
        [Validation(Required=false)]
        public string LinkUrls { get; set; }

        // 图片连接
        [NameInMap("picture_urls")]
        [Validation(Required=false)]
        public string PictureUrls { get; set; }

        // 场景码
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

        // 待校验文本
        [NameInMap("text")]
        [Validation(Required=false)]
        public string Text { get; set; }

        // 进行识别的视频地址
        [NameInMap("video_urls")]
        [Validation(Required=false)]
        public string VideoUrls { get; set; }

        // 用户id
        [NameInMap("account_id")]
        [Validation(Required=false)]
        public string AccountId { get; set; }

    }

}
