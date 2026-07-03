// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryCreditshieldProductIvrfcRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 1.信息查询 2.债务人判断
        [NameInMap("query_code")]
        [Validation(Required=true)]
        public string QueryCode { get; set; }

        // 查询信息Map集合
        [NameInMap("query_infos")]
        [Validation(Required=false)]
        public List<QueryInfo> QueryInfos { get; set; }

    }

}
