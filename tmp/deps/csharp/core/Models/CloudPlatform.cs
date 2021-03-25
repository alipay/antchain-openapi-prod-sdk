// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // CloudPlatform
    public class CloudPlatform : TeaModel {
        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // host
        [NameInMap("host")]
        [Validation(Required=false)]
        public string Host { get; set; }

        // loginName
        [NameInMap("login_name")]
        [Validation(Required=false)]
        public string LoginName { get; set; }

        // password
        [NameInMap("password")]
        [Validation(Required=false)]
        public string Password { get; set; }

    }

}
