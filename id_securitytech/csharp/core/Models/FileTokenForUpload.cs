// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ID_SECURITYTECH.Models
{
    // FileTokenForUpload
    public class FileTokenForUpload : TeaModel {
        // access_id
        [NameInMap("access_id")]
        [Validation(Required=true)]
        public string AccessId { get; set; }

        // dir
        [NameInMap("dir")]
        [Validation(Required=true)]
        public string Dir { get; set; }

        // expire
        [NameInMap("expire")]
        [Validation(Required=true)]
        public string Expire { get; set; }

        // host
        [NameInMap("host")]
        [Validation(Required=true)]
        public string Host { get; set; }

        // policy
        [NameInMap("policy")]
        [Validation(Required=true)]
        public string Policy { get; set; }

        // signature
        [NameInMap("signature")]
        [Validation(Required=true)]
        public string Signature { get; set; }

    }

}
