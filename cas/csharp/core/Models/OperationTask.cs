// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // Staragent Operation Task info
    public class OperationTask : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // computer id
        [NameInMap("computer_id")]
        [Validation(Required=false)]
        public string ComputerId { get; set; }

        // computer ip
        [NameInMap("computer_ip")]
        [Validation(Required=false)]
        public string ComputerIp { get; set; }

        // command
        [NameInMap("command")]
        [Validation(Required=false)]
        public string Command { get; set; }

        // 状态取值：INIT，PROCESSING，SUCCEEDED，FAILED，TIMEOUT，NOT_FOUND
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // errorCode
        [NameInMap("error_code")]
        [Validation(Required=false)]
        public string ErrorCode { get; set; }

        // resultMsg
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

    }

}
