// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class SubmitEcarLcaorderwithcustomerResponse : TeaModel {
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

        // 订单编号
        [NameInMap("order_no")]
        [Validation(Required=false)]
        public string OrderNo { get; set; }

        // 来源于三方平台的订单编号
        [NameInMap("source_order_no")]
        [Validation(Required=false)]
        public string SourceOrderNo { get; set; }

        // 碳账户编号，碳矩阵为客户分配的碳账户编号
        [NameInMap("carbon_account_no")]
        [Validation(Required=false)]
        public string CarbonAccountNo { get; set; }

        // 订单状态，Pending——处理中，Closed——已关闭，Finished——已完成
        [NameInMap("order_status")]
        [Validation(Required=false)]
        public string OrderStatus { get; set; }

    }

}
