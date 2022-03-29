// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class BatchqueryTraasmetaApptagRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // uuids
        [NameInMap("uuids")]
        [Validation(Required=false)]
        public List<string> Uuids { get; set; }

        // app_names
        [NameInMap("app_names")]
        [Validation(Required=false)]
        public List<string> AppNames { get; set; }

        // tenant_uuid
        [NameInMap("tenant_uuid")]
        [Validation(Required=false)]
        public string TenantUuid { get; set; }

        // tenant_name
        [NameInMap("tenant_name")]
        [Validation(Required=false)]
        public string TenantName { get; set; }

        // tag_keys
        [NameInMap("tag_keys")]
        [Validation(Required=false)]
        public List<string> TagKeys { get; set; }

    }

}
