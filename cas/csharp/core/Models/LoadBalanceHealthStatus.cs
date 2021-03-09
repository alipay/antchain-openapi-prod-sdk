// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // LB后端健康状态
    public class LoadBalanceHealthStatus : TeaModel {
        // server_id
        [NameInMap("server_id")]
        [Validation(Required=true)]
        public string ServerId { get; set; }

        // status
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

    }

}
