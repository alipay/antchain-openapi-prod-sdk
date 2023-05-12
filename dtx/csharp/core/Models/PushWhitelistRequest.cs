// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    public class PushWhitelistRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // instance_id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // ref _id
        [NameInMap("ref_id")]
        [Validation(Required=true)]
        public long? RefId { get; set; }

        // 1按照服务器推送 2按照集群推送
        [NameInMap("type")]
        [Validation(Required=true)]
        public long? Type { get; set; }

        // 如果按照服务器推送 传多个ip的数组，逗号分割。如果是按照集群推送，传zone数组，一个不传就默认全部
        [NameInMap("push_target")]
        [Validation(Required=true)]
        public List<string> PushTarget { get; set; }

    }

}
