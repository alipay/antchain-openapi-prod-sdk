// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class GetApplicationPackagedownloadurlRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // versionId
        [NameInMap("version_id")]
        [Validation(Required=true)]
        public string VersionId { get; set; }

        // 应用id，用于鉴权
        [NameInMap("app_id")]
        [Validation(Required=true)]
        public string AppId { get; set; }

    }

}
