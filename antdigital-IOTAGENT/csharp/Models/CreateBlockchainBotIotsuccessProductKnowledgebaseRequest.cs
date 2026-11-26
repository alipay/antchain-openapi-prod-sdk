// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    public class CreateBlockchainBotIotsuccessProductKnowledgebaseRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 实例ID，非必填，可用于产品实例间知识库隔离。
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

    }

}
