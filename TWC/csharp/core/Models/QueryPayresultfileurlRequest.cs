// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryPayresultfileurlRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 对账日期
        [NameInMap("bill_date")]
        [Validation(Required=true)]
        public string BillDate { get; set; }

        // 交易类型
        [NameInMap("bill_type")]
        [Validation(Required=true)]
        public string BillType { get; set; }

    }

}
