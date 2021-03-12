// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 阿里云请求结果
    public class ALiYunHandleBabelMns : TeaModel {
        // message
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // request_id
        [NameInMap("request_id")]
        [Validation(Required=false)]
        public string RequestId { get; set; }

        // success
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

    }

}
