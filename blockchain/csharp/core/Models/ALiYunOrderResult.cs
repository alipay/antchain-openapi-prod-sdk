// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 阿里云订单结果
    public class ALiYunOrderResult : TeaModel {
        // request_id
        [NameInMap("request_id")]
        [Validation(Required=false)]
        public string RequestId { get; set; }

        // data
        [NameInMap("data")]
        [Validation(Required=false)]
        public string Data { get; set; }

        // success
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

        // code
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        // message
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // synchro
        [NameInMap("synchro")]
        [Validation(Required=false)]
        public bool? Synchro { get; set; }

    }

}
