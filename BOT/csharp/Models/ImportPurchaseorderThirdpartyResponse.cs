// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ImportPurchaseorderThirdpartyResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 采购平台-采购详情id
        [NameInMap("purchase_order_id")]
        [Validation(Required=false)]
        public string PurchaseOrderId { get; set; }

        // 当前状态
        // READY_DELIVER(0, "待发货"),
        // DELIVERED(1, "已发货"),
        // REFUSED(2, "已拒发"),
        // CANCELED(4, "已取消"),
        // REFUNDED(5, "已退货");
        // 
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // InsertPurchaseOrderFailInfo
        [NameInMap("fail_map")]
        [Validation(Required=false)]
        public InsertPurchaseOrderFailInfo FailMap { get; set; }

        // 真实订单信息，成功不返回
        // 
        [NameInMap("purchase_order_info_detail")]
        [Validation(Required=false)]
        public PurchaseOrderInfoDetail PurchaseOrderInfoDetail { get; set; }

        // 幂等号
        [NameInMap("idempot_id")]
        [Validation(Required=false)]
        public string IdempotId { get; set; }

    }

}
