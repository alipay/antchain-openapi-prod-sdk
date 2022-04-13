// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 镜像中心账户信息
    public class RegistryAccout : TeaModel {
        // registry email url
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

        // registry password
        [NameInMap("password")]
        [Validation(Required=true)]
        public string Password { get; set; }

        // registry url
        [NameInMap("registry")]
        [Validation(Required=true)]
        public string Registry { get; set; }

        // registry username
        [NameInMap("username")]
        [Validation(Required=true)]
        public string Username { get; set; }

    }

}
