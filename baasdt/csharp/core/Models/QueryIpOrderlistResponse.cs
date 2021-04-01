// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class QueryIpOrderlistResponse : TeaModel {
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

        // 页码
        [NameInMap("page_number")]
        [Validation(Required=false)]
        public long? PageNumber { get; set; }

        // 页面大小
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 订单总数
        [NameInMap("total_order_count")]
        [Validation(Required=false)]
        public long? TotalOrderCount { get; set; }

        // 总金额
        [NameInMap("total_payment_amount")]
        [Validation(Required=false)]
        public string TotalPaymentAmount { get; set; }

        // 总客户数
        [NameInMap("total_buyer_count")]
        [Validation(Required=false)]
        public long? TotalBuyerCount { get; set; }

        // 订单列表
        [NameInMap("order_list")]
        [Validation(Required=false)]
        public List<IPOrder> OrderList { get; set; }

        // 筛选条件下订单总数
        [NameInMap("select_order_count")]
        [Validation(Required=false)]
        public long? SelectOrderCount { get; set; }

    }

}
