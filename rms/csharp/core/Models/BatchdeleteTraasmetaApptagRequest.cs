// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class BatchdeleteTraasmetaApptagRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // uuids
        [NameInMap("uuids")]
        [Validation(Required=true)]
        public List<string> Uuids { get; set; }

    }

}
