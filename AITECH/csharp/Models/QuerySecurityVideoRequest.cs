// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    public class QuerySecurityVideoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 视频公开访问 URL
        [NameInMap("video_url")]
        [Validation(Required=true)]
        public string VideoUrl { get; set; }

        // 归一化后须 video 前缀，否则拒绝
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

        // 租户标识（老值兼容替换）
        [NameInMap("business_id")]
        [Validation(Required=false)]
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
