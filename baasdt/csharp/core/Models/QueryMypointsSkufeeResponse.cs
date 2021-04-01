// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class QueryMypointsSkufeeResponse : TeaModel {
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

        // 预下单的数量
        [NameInMap("count")]
        [Validation(Required=false)]
        public long? Count { get; set; }

        // 费率
        [NameInMap("rate")]
        [Validation(Required=false)]
        public string Rate { get; set; }

        // 商品ID
        [NameInMap("sku_id")]
        [Validation(Required=false)]
        public string SkuId { get; set; }

        // 总集分宝数量（个）
        [NameInMap("total_amount")]
        [Validation(Required=false)]
        public long? TotalAmount { get; set; }

        // 总费用
        [NameInMap("total_cost")]
        [Validation(Required=false)]
        public string TotalCost { get; set; }

    }

}
