// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class BatchqueryTraasmetaTenantRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // uuid数组
        [NameInMap("uuids")]
        [Validation(Required=false)]
        public List<string> Uuids { get; set; }

        // names
        [NameInMap("names")]
        [Validation(Required=false)]
        public List<string> Names { get; set; }

    }

}
