// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class CreateOamserviceApplicationconfigurationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // ApplicationConfiguration yaml字符串
        [NameInMap("yamlcontent")]
        [Validation(Required=true)]
        public string Yamlcontent { get; set; }

    }

}
