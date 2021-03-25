// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class UpdateAppserviceenvparamUpdateparamsRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // appServiceId
        [NameInMap("app_service_id")]
        [Validation(Required=false)]
        public string AppServiceId { get; set; }

        // buildpackId
        [NameInMap("buildpack_id")]
        [Validation(Required=false)]
        public string BuildpackId { get; set; }

        // params
        [NameInMap("params")]
        [Validation(Required=false)]
        public List<AppServiceEnvParam> Params { get; set; }

    }

}
