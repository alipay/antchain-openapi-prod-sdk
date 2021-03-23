// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APPEX.Models
{
    // 数据通道Channel
    public class ChannelDTO : TeaModel {
        // 通道名称
        [NameInMap("channel_name")]
        [Validation(Required=true)]
        public string ChannelName { get; set; }

        // 通道是否公开访问
        [NameInMap("public_acl")]
        [Validation(Required=true)]
        public bool? PublicAcl { get; set; }

        // 通道创建账户
        [NameInMap("user_did")]
        [Validation(Required=true)]
        public string UserDid { get; set; }

    }

}
