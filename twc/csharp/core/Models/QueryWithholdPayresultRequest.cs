// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryWithholdPayresultRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求扣款时，返回的委托单号,该笔转账在支付宝系统内部的单据ID
        [NameInMap("entrust_order_id")]
        [Validation(Required=true)]
        public string EntrustOrderId { get; set; }

        // 外部订单号,请求方保证唯一性
        [NameInMap("out_biz_no")]
        [Validation(Required=true)]
        public string OutBizNo { get; set; }

    }

}
