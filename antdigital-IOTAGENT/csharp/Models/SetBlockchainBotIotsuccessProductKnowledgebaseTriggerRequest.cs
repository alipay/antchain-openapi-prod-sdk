// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    public class SetBlockchainBotIotsuccessProductKnowledgebaseTriggerRequest : TeaModel {
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

        // 枚举:ANY,ALL
        [NameInMap("combine")]
        [Validation(Required=true)]
        public string Combine { get; set; }

        [NameInMap("keywords")]
        [Validation(Required=false)]
        public List<string> Keywords { get; set; }

        [NameInMap("intents")]
        [Validation(Required=false)]
        public List<string> Intents { get; set; }

        [NameInMap("entities")]
        [Validation(Required=false)]
        public List<string> Entities { get; set; }

    }

}
