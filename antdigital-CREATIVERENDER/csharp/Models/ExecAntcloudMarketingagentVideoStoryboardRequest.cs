// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVERENDER.Models
{
    public class ExecAntcloudMarketingagentVideoStoryboardRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 拆解要求
        [NameInMap("prompt")]
        [Validation(Required=true)]
        public string Prompt { get; set; }

        // 模型
        [NameInMap("video_model")]
        [Validation(Required=false)]
        public string VideoModel { get; set; }

        // 画幅
        [NameInMap("ratio")]
        [Validation(Required=false)]
        public string Ratio { get; set; }

        // 分辨率
        [NameInMap("resolution")]
        [Validation(Required=false)]
        public long? Resolution { get; set; }

        // 原视频+替换图片
        [NameInMap("media_refs")]
        [Validation(Required=true)]
        public List<CreativeVideoAssetRef> MediaRefs { get; set; }

        // 会话ID
        [NameInMap("session_id")]
        [Validation(Required=false)]
        public string SessionId { get; set; }

    }

}
