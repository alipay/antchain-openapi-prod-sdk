// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SP.Models
{
    public class GetSpProductOrderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        [NameInMap("product_access_code")]
        [Validation(Required=false)]
        public string ProductAccessCode { get; set; }

        // 订单号用于业务串联，以及幂等。目前为纯数字。保留使用大小写英文字符可能。
        [NameInMap("order_no")]
        [Validation(Required=true, MaxLength=64)]
        public string OrderNo { get; set; }

        // 产品码 全局唯一
        [NameInMap("product_code")]
        [Validation(Required=true, MaxLength=20)]
        public string ProductCode { get; set; }

    }

}
