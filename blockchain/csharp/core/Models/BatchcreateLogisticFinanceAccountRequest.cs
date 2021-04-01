// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class BatchcreateLogisticFinanceAccountRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 指定的分布式数字身份，缺省时为自己的分布式数字身份
        [NameInMap("did")]
        [Validation(Required=false)]
        public string Did { get; set; }

        // 业务方用户列表，一次最多不超过200
        [NameInMap("users")]
        [Validation(Required=true)]
        public List<LogisticFinUser> Users { get; set; }

    }

}
