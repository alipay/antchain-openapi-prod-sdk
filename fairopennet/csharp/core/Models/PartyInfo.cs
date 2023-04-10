// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.FAIROPENNET.Models
{
    // 参与方信息
    public class PartyInfo : TeaModel {
        //  
        [NameInMap("party_id")]
        [Validation(Required=true)]
        public string PartyId { get; set; }

        //  
        [NameInMap("desc")]
        [Validation(Required=true)]
        public string Desc { get; set; }

        //  
        [NameInMap("private_key")]
        [Validation(Required=true)]
        public string PrivateKey { get; set; }

        //  
        [NameInMap("private_key_passwd")]
        [Validation(Required=true)]
        public string PrivateKeyPasswd { get; set; }

        //  
        [NameInMap("recover_key")]
        [Validation(Required=true)]
        public string RecoverKey { get; set; }

        //  
        [NameInMap("recovery_key_passwd")]
        [Validation(Required=true)]
        public string RecoveryKeyPasswd { get; set; }

    }

}
