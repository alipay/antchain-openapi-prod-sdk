// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEFINCASHIER.Models
{
    // 分账确认结果对象
    public class PaymentShareConfirmResult : TeaModel {
        // 蚂蚁分账申请返回的交易号
        [NameInMap("org_order_id")]
        [Validation(Required=true)]
        public string OrgOrderId { get; set; }

        // 蚂蚁分账确认订单ID
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 外部请求ID，幂等字段
        [NameInMap("out_request_id")]
        [Validation(Required=true)]
        public string OutRequestId { get; set; }

        // 分账单状态
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

        // 业务错误码(为空表示成功，否则为业务错误码)
        [NameInMap("sub_code")]
        [Validation(Required=true)]
        public string SubCode { get; set; }

        // 业务错误描述
        [NameInMap("sub_msg")]
        [Validation(Required=true)]
        public string SubMsg { get; set; }

    }

}
