// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 阿里云区块链创建信息
    public class ALiYunChainExecuteOrder : TeaModel {
        // user_request_id
        [NameInMap("user_request_id")]
        [Validation(Required=false)]
        public string UserRequestId { get; set; }

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
