// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACOPM.Models
{
    // UpdateRateLimit
    public class UpdateRateLimit : TeaModel {
        // api_name
        [NameInMap("api_name")]
        [Validation(Required=true)]
        public string ApiName { get; set; }

        // provider_id
        [NameInMap("provider_id")]
        [Validation(Required=true)]
        public string ProviderId { get; set; }

        // update_scope_value
        [NameInMap("update_scope_value")]
        [Validation(Required=true)]
        public UpdateScopeValue UpdateScopeValue { get; set; }

    }

}
