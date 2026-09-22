// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVERENDER.Models
{
    public class ExecAntcloudMarketingagentCreativeVideoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 视频描述，文生视频、图生视频均不能为空
        [NameInMap("prompt")]
        [Validation(Required=true)]
        public string Prompt { get; set; }

        // 参考图片，最多 5 张；不传或空数组表示文生视频
        [NameInMap("input_elements")]
        [Validation(Required=false)]
        public List<CreativeAssetRef> InputElements { get; set; }

        // 模型标识，不传使用服务端默认模型；可用值需与上游确认
        [NameInMap("model")]
        [Validation(Required=false)]
        public string Model { get; set; }

        // STORE_VISIT_VIDEO：探店视频；PRODUCT_PROMOTION_VIDEO：带货视频
        [NameInMap("scene")]
        [Validation(Required=false)]
        public string Scene { get; set; }

        // 支持 9:16、1:1、16:9、4:3、3:4，默认 9:16
        [NameInMap("ratio")]
        [Validation(Required=false)]
        public string Ratio { get; set; }

        // 视频时长，单位秒，4～30 的整数，默认 15
        [NameInMap("duration")]
        [Validation(Required=false)]
        public long? Duration { get; set; }

        // 分辨率，支持 480、720、1080，默认 720
        [NameInMap("resolution")]
        [Validation(Required=false)]
        public long? Resolution { get; set; }

        // 是否生成音频，默认 true
        [NameInMap("generate_audio")]
        [Validation(Required=false)]
        public bool? GenerateAudio { get; set; }

        // 是否扩写脚本，默认true
        [NameInMap("expand_script")]
        [Validation(Required=false)]
        public bool? ExpandScript { get; set; }

        // 是否生成字幕，默认 true
        [NameInMap("generate_subtitle")]
        [Validation(Required=false)]
        public bool? GenerateSubtitle { get; set; }

    }

}
