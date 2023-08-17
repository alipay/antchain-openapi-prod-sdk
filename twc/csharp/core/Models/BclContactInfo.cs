// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 商家联系人信息
    public class BclContactInfo : TeaModel {
        // 联系人名称，最大长度：128
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 联系人手机号，最大长度：20
        [NameInMap("mobile")]
        [Validation(Required=true)]
        public string Mobile { get; set; }

        // 联系人电话，最大长度：20
        [NameInMap("phone")]
        [Validation(Required=false)]
        public string Phone { get; set; }

    }

}
