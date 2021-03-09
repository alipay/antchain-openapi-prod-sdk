// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // CloudPlatform
    public class CloudPlatform : TeaModel {
        // host
        [NameInMap("host")]
        [Validation(Required=false)]
        public string Host { get; set; }

        // login_name
        [NameInMap("login_name")]
        [Validation(Required=false)]
        public string LoginName { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // password
        [NameInMap("password")]
        [Validation(Required=false)]
        public string Password { get; set; }

    }

}
