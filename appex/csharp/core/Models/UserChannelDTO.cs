// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APPEX.Models
{
    // 用户可访问Channel信息
    public class UserChannelDTO : TeaModel {
        // 通道名称
        [NameInMap("channel_name")]
        [Validation(Required=true)]
        public string ChannelName { get; set; }

        // 通道是否公开可访问
        [NameInMap("public_acl")]
        [Validation(Required=true)]
        public bool? PublicAcl { get; set; }

        // 创建通道的用户did
        [NameInMap("creator_did")]
        [Validation(Required=true)]
        public string CreatorDid { get; set; }

        // 权限到期时间
        [NameInMap("valid_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ValidTime { get; set; }

    }

}
