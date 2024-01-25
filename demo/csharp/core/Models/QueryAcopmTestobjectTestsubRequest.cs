// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    public class QueryAcopmTestobjectTestsubRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // consumerId
        [NameInMap("consumerid")]
        [Validation(Required=false)]
        public string Consumerid { get; set; }

        // originMsgId
        [NameInMap("originmsgid")]
        [Validation(Required=false)]
        public string Originmsgid { get; set; }

        // prodCode
        [NameInMap("prodcode")]
        [Validation(Required=false)]
        public string Prodcode { get; set; }

        // msgSource
        [NameInMap("msgsource")]
        [Validation(Required=false)]
        public string Msgsource { get; set; }

    }

}
