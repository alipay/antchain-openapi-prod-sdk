// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryCreditshieldFixedcontactRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // FIXED_CONTACT_BATCH_QUERY 已修复联系方式查询
        [NameInMap("query_code")]
        [Validation(Required=true)]
        public string QueryCode { get; set; }

        // 批量查询请求体，手机号为md5,必填
        [NameInMap("query_infos")]
        [Validation(Required=true)]
        public List<CreditShieldFixContactResult> QueryInfos { get; set; }

    }

}
