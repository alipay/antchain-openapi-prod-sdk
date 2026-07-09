// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryIotplatformPurchaseorderResponse : TeaModel {
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

        // 是否为链上采购商品，true：是，false：否
        [NameInMap("goods_from_chain")]
        [Validation(Required=false)]
        public bool? GoodsFromChain { get; set; }

        // 采购时间
        [NameInMap("purchase_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string PurchaseTime { get; set; }

        // 采购商名称
        [NameInMap("lease_name")]
        [Validation(Required=false)]
        public string LeaseName { get; set; }

        // 采购价
        [NameInMap("purchase_order_price")]
        [Validation(Required=false)]
        public string PurchaseOrderPrice { get; set; }

        // 商品名称
        [NameInMap("goods_name")]
        [Validation(Required=false)]
        public string GoodsName { get; set; }

    }

}
