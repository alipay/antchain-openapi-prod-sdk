// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.FAIROPENNET.Models
{
    public class RegisterNormalNodeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        //  
        [NameInMap("info")]
        [Validation(Required=true)]
        public NormalNodeIdentityInfo Info { get; set; }

        //  
        [NameInMap("extra")]
        [Validation(Required=false)]
        public string Extra { get; set; }

    }

}
