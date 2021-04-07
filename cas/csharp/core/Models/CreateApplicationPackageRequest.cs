// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class CreateApplicationPackageRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // app_id
        [NameInMap("app_id")]
        [Validation(Required=true)]
        public string AppId { get; set; }

        // manifest
        [NameInMap("manifest")]
        [Validation(Required=true)]
        public AppManifest Manifest { get; set; }

    }

}
