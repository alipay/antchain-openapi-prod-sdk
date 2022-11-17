// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class QueryNotaryOrderResponse : TeaModel {
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

        // 订单状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 支付状态最后更新时间戳
        [NameInMap("pay_time")]
        [Validation(Required=false)]
        public long? PayTime { get; set; }

        // 用户预览签署文件的时间戳
        [NameInMap("preview_time")]
        [Validation(Required=false)]
        public long? PreviewTime { get; set; }

        // 支付状态
        [NameInMap("pay_status")]
        [Validation(Required=false)]
        public string PayStatus { get; set; }

        // 补充材料说明，当需要补充材料时提供
        [NameInMap("material_remarks")]
        [Validation(Required=false)]
        public string MaterialRemarks { get; set; }

        // 出证的公证书信息
        [NameInMap("notary_info")]
        [Validation(Required=false)]
        public NotaryInfo NotaryInfo { get; set; }

        // 拒绝办理信息
        [NameInMap("reject_info")]
        [Validation(Required=false)]
        public RefuseInfo RejectInfo { get; set; }

        // 终止信息
        [NameInMap("terminal_info")]
        [Validation(Required=false)]
        public RefuseInfo TerminalInfo { get; set; }

        // 支付方式
        [NameInMap("pay_type")]
        [Validation(Required=false)]
        public string PayType { get; set; }

        // 用户应付的金额
        [NameInMap("payable_amount")]
        [Validation(Required=false)]
        public long? PayableAmount { get; set; }

        // 用户实际支付的金额
        [NameInMap("paid_amount")]
        [Validation(Required=false)]
        public long? PaidAmount { get; set; }

        // 公证处物流信息
        [NameInMap("notary_express_list")]
        [Validation(Required=false)]
        public List<ExpressInfo> NotaryExpressList { get; set; }

        // 发票物流信息
        [NameInMap("invoice_express_list")]
        [Validation(Required=false)]
        public List<ExpressInfo> InvoiceExpressList { get; set; }

    }

}
