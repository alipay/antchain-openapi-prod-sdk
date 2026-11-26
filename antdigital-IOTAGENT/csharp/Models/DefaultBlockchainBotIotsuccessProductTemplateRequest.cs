// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    public class DefaultBlockchainBotIotsuccessProductTemplateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        [NameInMap("product_key")]
        [Validation(Required=true)]
        public string ProductKey { get; set; }

        [NameInMap("template_id")]
        [Validation(Required=true)]
        public string TemplateId { get; set; }

    }

}
