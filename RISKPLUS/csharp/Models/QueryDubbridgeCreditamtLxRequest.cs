// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgeCreditamtLxRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 合作方代码
        [NameInMap("partner_code")]
        [Validation(Required=true)]
        public string PartnerCode { get; set; }

        // 业务入参，json格式字符串
        [NameInMap("biz_content")]
        [Validation(Required=true)]
        public string BizContent { get; set; }

        // 请求发送时间
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public string Timestamp { get; set; }

    }

}
