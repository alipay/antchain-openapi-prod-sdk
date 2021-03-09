// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // LB的vip类型
    public class VipType : TeaModel {
        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // vip_address_type
        [NameInMap("vip_address_type")]
        [Validation(Required=true)]
        public string VipAddressType { get; set; }

        // vip_type
        [NameInMap("vip_type")]
        [Validation(Required=true)]
        public string VipType_ { get; set; }

    }

}
