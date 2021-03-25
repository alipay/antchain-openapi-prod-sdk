// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class UpdateAppservicebuildpackrelationRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // new_app_service
        [NameInMap("new_app_service")]
        [Validation(Required=false)]
        public BuildpackAppService NewAppService { get; set; }

        // original_app_service
        [NameInMap("original_app_service")]
        [Validation(Required=false)]
        public BuildpackAppService OriginalAppService { get; set; }

    }

}
