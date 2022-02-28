// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SP.Models
{
    // 订单执行结果描述
    public class OrderResult : TeaModel {
        // 实例Id
        [NameInMap("instance_id")]
        [Validation(Required=true, MaxLength=10)]
        public string InstanceId { get; set; }

        // 是否生成成功
        [NameInMap("success")]
        [Validation(Required=true)]
        public bool? Success { get; set; }

    }

}
