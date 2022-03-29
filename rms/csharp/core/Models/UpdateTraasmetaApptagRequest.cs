// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class UpdateTraasmetaApptagRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // uuid
        [NameInMap("uuid")]
        [Validation(Required=true)]
        public string Uuid { get; set; }

        // tag_key
        [NameInMap("tag_key")]
        [Validation(Required=false)]
        public string TagKey { get; set; }

        // outside_id
        [NameInMap("outside_id")]
        [Validation(Required=false)]
        public string OutsideId { get; set; }

        // source_from
        [NameInMap("source_from")]
        [Validation(Required=false)]
        public string SourceFrom { get; set; }

        // extension
        [NameInMap("extension")]
        [Validation(Required=false)]
        public string Extension { get; set; }

        // tenant_uuid
        [NameInMap("tenant_uuid")]
        [Validation(Required=false)]
        public string TenantUuid { get; set; }

        // tenant_name
        [NameInMap("tenant_name")]
        [Validation(Required=false)]
        public string TenantName { get; set; }

        // app_uuid
        [NameInMap("app_uuid")]
        [Validation(Required=false)]
        public string AppUuid { get; set; }

        // app_name
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // tag_value
        [NameInMap("tag_value")]
        [Validation(Required=false)]
        public string TagValue { get; set; }

    }

}
