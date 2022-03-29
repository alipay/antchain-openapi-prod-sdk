// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class GetTraasmetaApptagRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // uuid
        [NameInMap("uuid")]
        [Validation(Required=false)]
        public string Uuid { get; set; }

        // app_name
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // tenant_uuid
        [NameInMap("tenant_uuid")]
        [Validation(Required=false)]
        public string TenantUuid { get; set; }

        // tenant_name
        [NameInMap("tenant_name")]
        [Validation(Required=false)]
        public string TenantName { get; set; }

        // tag_key
        [NameInMap("tag_key")]
        [Validation(Required=false)]
        public string TagKey { get; set; }

    }

}
