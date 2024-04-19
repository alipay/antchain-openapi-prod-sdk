// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class SubmitEcarLcaorderwithcustomerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 客户信息
        [NameInMap("customer")]
        [Validation(Required=true)]
        public PlatformCustomerSummary Customer { get; set; }

        // 产品信息
        [NameInMap("product")]
        [Validation(Required=true)]
        public EnterpriseProductSummary Product { get; set; }

        // 订单时间，格式：yyyy-MM-dd HH:mm:ss
        [NameInMap("order_time")]
        [Validation(Required=true)]
        public string OrderTime { get; set; }

        // 订单金额，订单金额只能为有效数字（整数不得大于10位，小数不得大于6位）
        [NameInMap("order_amount")]
        [Validation(Required=true)]
        public string OrderAmount { get; set; }

        // 来源于三方平台的订单编号
        [NameInMap("source_order_no")]
        [Validation(Required=true)]
        public string SourceOrderNo { get; set; }

    }

}
