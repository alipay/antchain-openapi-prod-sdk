// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryFundCreditauthRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 资方社会引用代码
        [NameInMap("fund_id")]
        [Validation(Required=true)]
        public string FundId { get; set; }

        // 授权id
        [NameInMap("auth_id")]
        [Validation(Required=true)]
        public string AuthId { get; set; }

        // 授权类型
        // CREDIT_GRANTING 授信
        // CREDIT_UTILIZATION 用信
        [NameInMap("auth_type")]
        [Validation(Required=true)]
        public string AuthType { get; set; }

    }

}
