// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class UpdateCloudconfigRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // cloud_config json描述
        [NameInMap("cloud_config")]
        [Validation(Required=true)]
        public string CloudConfig { get; set; }

        // UPDATE或ROLLBACK
        [NameInMap("option")]
        [Validation(Required=true)]
        public string Option { get; set; }

    }

}
