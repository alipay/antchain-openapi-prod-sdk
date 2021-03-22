// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class ExecMypointsPreorderskuResponse : TeaModel {
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

        // 数量
        [NameInMap("count")]
        [Validation(Required=false)]
        public long? Count { get; set; }

        // 业务幂等ID
        [NameInMap("order_no")]
        [Validation(Required=false)]
        public string OrderNo { get; set; }

        // 预下单Id
        [NameInMap("pre_order_id")]
        [Validation(Required=false)]
        public string PreOrderId { get; set; }

        // 商品ID
        [NameInMap("sku_id")]
        [Validation(Required=false)]
        public string SkuId { get; set; }

        // 总集分宝数量(单位:个)
        [NameInMap("total_amount")]
        [Validation(Required=false)]
        public long? TotalAmount { get; set; }

        // 总费用
        [NameInMap("total_cost")]
        [Validation(Required=false)]
        public string TotalCost { get; set; }

        // 是否需要重试
        [NameInMap("need_retry")]
        [Validation(Required=false)]
        public bool? NeedRetry { get; set; }

    }

}
