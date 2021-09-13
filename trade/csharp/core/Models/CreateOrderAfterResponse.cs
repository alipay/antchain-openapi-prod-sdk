// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TRADE.Models
{
    public class CreateOrderAfterResponse : TeaModel {
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

        // 业务流水号
        [NameInMap("biz_no")]
        [Validation(Required=false)]
        public string BizNo { get; set; }

        // 下单返回值。里面有实例id和二级订单号等关键字段。
        [NameInMap("create_order_response_list")]
        [Validation(Required=false)]
        public List<CreateOrderResult> CreateOrderResponseList { get; set; }

    }

}
