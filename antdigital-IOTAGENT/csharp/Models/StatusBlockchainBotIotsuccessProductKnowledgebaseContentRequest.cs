// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    public class StatusBlockchainBotIotsuccessProductKnowledgebaseContentRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        [NameInMap("kb_id")]
        [Validation(Required=true)]
        public string KbId { get; set; }

        // 上传返回的已有文档ID
        [NameInMap("doc_id")]
        [Validation(Required=true)]
        public string DocId { get; set; }

    }

}
