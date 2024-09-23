// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 智租风控-物流信息
    public class DeliveryDetail : TeaModel {
        // 收件人姓名
        [NameInMap("receiver_name")]
        [Validation(Required=false, MaxLength=32)]
        public string ReceiverName { get; set; }

        // 收件人手机号
        [NameInMap("receiver_mobile")]
        [Validation(Required=false, MaxLength=32)]
        public string ReceiverMobile { get; set; }

        // 收件人地址
        [NameInMap("receiver_address")]
        [Validation(Required=false, MaxLength=256)]
        public string ReceiverAddress { get; set; }

    }

}
