// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APPEX.Models
{
    public class CreateUnionChannelRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 联盟ID
        [NameInMap("union_id")]
        [Validation(Required=true)]
        public long? UnionId { get; set; }

        // 通信通道的名称
        [NameInMap("channel_name")]
        [Validation(Required=true)]
        public string ChannelName { get; set; }

        // 发起创建channel的用户
        [NameInMap("user_did")]
        [Validation(Required=true)]
        public string UserDid { get; set; }

        // Channel中数据是否联盟内公开，true为公开可访问，支持后续更新是否公开
        [NameInMap("public_acl")]
        [Validation(Required=true)]
        public bool? PublicAcl { get; set; }

    }

}
