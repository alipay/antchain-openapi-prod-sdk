// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateLeaseRiskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 承租人信息
        [NameInMap("person")]
        [Validation(Required=true)]
        public LesseePerson Person { get; set; }

        // 承租人类型，目前仅支持个人类型
        // PERSONAL 个人
        // ENTERPRISE 企业
        [NameInMap("lessee_type")]
        [Validation(Required=true)]
        public string LesseeType { get; set; }

    }

}
