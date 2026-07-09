// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class StartEvidenceQueryRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 信物链单条存证查询请求结构体
        [NameInMap("evidence_query_info_req")]
        [Validation(Required=true)]
        public EvidenceQueryInfoReq EvidenceQueryInfoReq { get; set; }

        // 输入交易唯一ID，短时内唯一
        [NameInMap("nonce")]
        [Validation(Required=true)]
        public string Nonce { get; set; }

    }

}
