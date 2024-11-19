// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 营销分对象
    public class MarketingScoreInfo : TeaModel {
        // 手机号
        [NameInMap("phone_num")]
        [Validation(Required=false)]
        public string PhoneNum { get; set; }

        // 营销分
        [NameInMap("score")]
        [Validation(Required=false)]
        public string Score { get; set; }

    }

}
