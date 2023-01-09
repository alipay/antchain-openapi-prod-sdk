// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class QueryDciRegistrationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数登申请id
        [NameInMap("digital_register_id")]
        [Validation(Required=false)]
        public string DigitalRegisterId { get; set; }

        // dci申领id
        [NameInMap("dci_content_id")]
        [Validation(Required=false)]
        public string DciContentId { get; set; }

    }

}
