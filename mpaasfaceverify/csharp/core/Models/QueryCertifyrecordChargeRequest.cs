// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MPAASFACEVERIFY.Models
{
    public class QueryCertifyrecordChargeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 待查询的certify_id列表
        [NameInMap("certify_id_list")]
        [Validation(Required=true)]
        public List<string> CertifyIdList { get; set; }

    }

}
