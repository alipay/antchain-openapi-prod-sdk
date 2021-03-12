// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartDidAgentChallengeresponseRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

        // 一段auth challenge明文，即需要被计算签名的明文
        [NameInMap("challenge_request")]
        [Validation(Required=true)]
        public string ChallengeRequest { get; set; }

        // 指定的did，该did必须是租户自己，或托管给租户的did
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 0 原始字符串，1 hash值
        [NameInMap("challenge_type")]
        [Validation(Required=false)]
        public long? ChallengeType { get; set; }

    }

}
