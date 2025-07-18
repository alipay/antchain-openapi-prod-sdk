// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryCreditshieldProductCallbackRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 查询编码 
        // 1.支付宝交易流水查询
        // 2.审批回调
        [NameInMap("query_code")]
        [Validation(Required=true)]
        public string QueryCode { get; set; }

        // 查询信息集合
        [NameInMap("query_infos")]
        [Validation(Required=false)]
        public List<QueryInfo> QueryInfos { get; set; }

    }

}
