// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgeCustomerBankcardlistRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 客户号
        [NameInMap("customer_no")]
        [Validation(Required=true)]
        public string CustomerNo { get; set; }

        // 资金方编号
        [NameInMap("fund_code")]
        [Validation(Required=true)]
        public string FundCode { get; set; }

        // 业务类型
        [NameInMap("prod_type")]
        [Validation(Required=false)]
        public string ProdType { get; set; }

    }

}
