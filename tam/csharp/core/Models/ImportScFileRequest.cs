// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAM.Models
{
    public class ImportScFileRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        //  
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        //  
        [NameInMap("file_name")]
        [Validation(Required=true)]
        public string FileName { get; set; }

        //  
        [NameInMap("business_name")]
        [Validation(Required=true)]
        public string BusinessName { get; set; }

    }

}
