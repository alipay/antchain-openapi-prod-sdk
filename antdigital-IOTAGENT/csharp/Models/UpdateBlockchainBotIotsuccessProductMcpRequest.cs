// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    public class UpdateBlockchainBotIotsuccessProductMcpRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        [NameInMap("plugin_id")]
        [Validation(Required=true)]
        public string PluginId { get; set; }

        [NameInMap("url")]
        [Validation(Required=false)]
        public string Url { get; set; }

        // JSON对象字符串
        [NameInMap("headers")]
        [Validation(Required=false)]
        public string Headers { get; set; }

        [NameInMap("purpose")]
        [Validation(Required=false)]
        public string Purpose { get; set; }

    }

}
