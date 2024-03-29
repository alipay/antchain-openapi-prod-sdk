// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class PagequeryIpSalesResponse : TeaModel {
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

        // 订单ID
        [NameInMap("ip_order_id")]
        [Validation(Required=false)]
        public string IpOrderId { get; set; }

        // 账单ID
        [NameInMap("sales_biz_id")]
        [Validation(Required=false)]
        public string SalesBizId { get; set; }

        // IP授权销售数据
        [NameInMap("ip_sales_info_list")]
        [Validation(Required=false)]
        public List<IPSalesInfo> IpSalesInfoList { get; set; }

        // 页码
        [NameInMap("page_number")]
        [Validation(Required=false)]
        public long? PageNumber { get; set; }

        // 页面大小
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 销售数据总数
        [NameInMap("total_count")]
        [Validation(Required=false)]
        public long? TotalCount { get; set; }

    }

}
