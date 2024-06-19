// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class GetRbbTaxinvoiceDataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 流水号
        [NameInMap("serial_number")]
        [Validation(Required=true)]
        public string SerialNumber { get; set; }

        // 社会新信用代码
        [NameInMap("taxpayer_id")]
        [Validation(Required=true)]
        public string TaxpayerId { get; set; }

    }

}
