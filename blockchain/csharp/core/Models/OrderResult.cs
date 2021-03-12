// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 订单结果
    public class OrderResult : TeaModel {
        // 事例id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 是否成功
        [NameInMap("success")]
        [Validation(Required=true)]
        public bool? Success { get; set; }

    }

}
