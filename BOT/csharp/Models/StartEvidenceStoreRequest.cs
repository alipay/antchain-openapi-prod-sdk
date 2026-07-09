// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class StartEvidenceStoreRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 信物链存证结构体参数
        [NameInMap("evidence_storage_req")]
        [Validation(Required=true)]
        public EvidenceStorageReq EvidenceStorageReq { get; set; }

        // 输入唯一交易ID序号，客户端管理短时内唯一
        [NameInMap("nonce")]
        [Validation(Required=true)]
        public string Nonce { get; set; }

    }

}
