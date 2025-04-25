// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 公司概要信息
    public class CompanySummaryInfo : TeaModel {
        // 社会统一信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=false)]
        public string MerchantId { get; set; }

        // 公司名称
        [NameInMap("merchant_name")]
        [Validation(Required=false)]
        public string MerchantName { get; set; }

    }

}
