// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGYTOOL.Models
{
    public class SyncKmVersionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 树ID
        [NameInMap("tree_id")]
        [Validation(Required=true)]
        public string TreeId { get; set; }

        // 版本号
        [NameInMap("tree_version")]
        [Validation(Required=true)]
        public string TreeVersion { get; set; }

    }

}
