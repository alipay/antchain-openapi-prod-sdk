// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.HK_SECURITYTECH.Models
{
    public class QueryEaglepromoMarketingriskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // security_data
        [NameInMap("security_data")]
        [Validation(Required=true)]
        public MarketingRiskSecurityData SecurityData { get; set; }

        // sign_factor
        [NameInMap("sign_factor")]
        [Validation(Required=true)]
        public string SignFactor { get; set; }

        // client_id
        [NameInMap("client_id")]
        [Validation(Required=true)]
        public string ClientId { get; set; }

        // request_id
        [NameInMap("request_id")]
        [Validation(Required=false)]
        public string RequestId { get; set; }

        // biz_code
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

        // terminal_type
        [NameInMap("terminal_type")]
        [Validation(Required=false)]
        public string TerminalType { get; set; }

    }

}
