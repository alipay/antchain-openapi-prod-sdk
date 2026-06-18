// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 商城收货信息
    public class PointReceiverInfo : TeaModel {
        // 联系人名称
        [NameInMap("contact_name")]
        [Validation(Required=true)]
        public string ContactName { get; set; }

        // 手机号
        [NameInMap("mobile")]
        [Validation(Required=true)]
        public string Mobile { get; set; }

        // 收货地址
        [NameInMap("address")]
        [Validation(Required=true)]
        public string Address { get; set; }

    }

}
