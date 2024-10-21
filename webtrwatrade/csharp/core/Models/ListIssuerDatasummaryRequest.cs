// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE.Models
{
    public class ListIssuerDatasummaryRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 币种（目前支持USD、HKD）
        [NameInMap("currency")]
        [Validation(Required=false)]
        public string Currency { get; set; }

        // 开始时间(格式：YYYY-MM-DD)
        [NameInMap("begin_date")]
        [Validation(Required=false)]
        public string BeginDate { get; set; }

        // 截止时间(格式：YYYY-MM-DD)
        [NameInMap("end_date")]
        [Validation(Required=false)]
        public string EndDate { get; set; }

    }

}
