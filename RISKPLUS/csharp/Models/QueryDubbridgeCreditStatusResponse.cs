// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgeCreditStatusResponse : TeaModel {
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

        // 授信状态（0-通过/1-不通过2-处理中）
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 拒绝原因
        [NameInMap("msg")]
        [Validation(Required=false)]
        public string Msg { get; set; }

        // 授信额度
        [NameInMap("credit_amt")]
        [Validation(Required=false)]
        public long? CreditAmt { get; set; }

        // 期数
        [NameInMap("period")]
        [Validation(Required=false)]
        public long? Period { get; set; }

        // 还款方式
        [NameInMap("repay_type")]
        [Validation(Required=false)]
        public string RepayType { get; set; }

        // 额度信息
        [NameInMap("credit_info")]
        [Validation(Required=false)]
        public CreditAmount CreditInfo { get; set; }

        // 客户编号(该客户的唯一标识，后续接口需要用到)
        [NameInMap("custom_no")]
        [Validation(Required=false)]
        public string CustomNo { get; set; }

        // 授信申请编号
        [NameInMap("apply_no")]
        [Validation(Required=false)]
        public string ApplyNo { get; set; }

        // 资金方编号
        [NameInMap("fund_code")]
        [Validation(Required=false)]
        public string FundCode { get; set; }

        // 冷静期结束日期
        [NameInMap("cooling_period")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CoolingPeriod { get; set; }

        // 资金源编码
        [NameInMap("loan_inst_code")]
        [Validation(Required=false)]
        public string LoanInstCode { get; set; }

        // JSON字符串
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

    }

}
