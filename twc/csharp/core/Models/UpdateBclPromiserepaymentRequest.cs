// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class UpdateBclPromiserepaymentRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单编号ID,长度不超过32位
        [NameInMap("order_id")]
        [Validation(Required=true, MaxLength=32)]
        public string OrderId { get; set; }

        // 租期编号，如：1表示第一期; 目前还款支持最大期数为120期；
        [NameInMap("period")]
        [Validation(Required=true)]
        public long? Period { get; set; }

    }

}
