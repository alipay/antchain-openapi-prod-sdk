// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APPEX.Models
{
    public class AuthChannelUserRequest : TeaModel {
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

        // Channel名称
        [NameInMap("channel_name")]
        [Validation(Required=true)]
        public string ChannelName { get; set; }

        // 发起授权操作的账户
        [NameInMap("user_did")]
        [Validation(Required=true)]
        public string UserDid { get; set; }

        // 要授权的账户
        [NameInMap("target_user_did")]
        [Validation(Required=true)]
        public string TargetUserDid { get; set; }

        // 要给用户分配读或写权限
        // READ,
        // WRITE;
        [NameInMap("operate_type")]
        [Validation(Required=true)]
        public string OperateType { get; set; }

        // 授权有效期，为空时表示永久有效
        [NameInMap("valid_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ValidTime { get; set; }

    }

}
