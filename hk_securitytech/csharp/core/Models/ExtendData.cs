// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.HK_SECURITYTECH.Models
{
    // aml_extend_data
    public class ExtendData : TeaModel {
        // user_id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // cert_name
        [NameInMap("cert_name")]
        [Validation(Required=true)]
        public string CertName { get; set; }

    }

}
