// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class CreateLoadbalanceResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 实例 id
        [NameInMap("loadbalance_sequences")]
        [Validation(Required=false)]
        public List<string> LoadbalanceSequences { get; set; }

        // paas_request_id
        [NameInMap("paas_request_id")]
        [Validation(Required=false)]
        public string PaasRequestId { get; set; }

    }

}
