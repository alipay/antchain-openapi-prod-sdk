// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAASPLATFORM.Models
{
    public class PayGeneralTicketsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 合约实例id
        [NameInMap("service_id")]
        [Validation(Required=true)]
        public string ServiceId { get; set; }

        // 持有账号的地址
        [NameInMap("from")]
        [Validation(Required=true)]
        public string From { get; set; }

        // 接收账号的地址
        [NameInMap("to")]
        [Validation(Required=true)]
        public string To { get; set; }

        // 数据资产ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 要转增的数据资产数量
        [NameInMap("amount")]
        [Validation(Required=true)]
        public long? Amount { get; set; }

        // 扩展数据
        [NameInMap("data")]
        [Validation(Required=false)]
        public string Data { get; set; }

    }

}
