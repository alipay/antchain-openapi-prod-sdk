// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class QueryIpOrderinfoResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 订单信息
        [NameInMap("ip_order")]
        [Validation(Required=false)]
        public IPOrder IpOrder { get; set; }

        // IP授权销售数据
        [NameInMap("ip_sales_info_list")]
        [Validation(Required=false)]
        public List<IPSalesInfo> IpSalesInfoList { get; set; }

    }

}
