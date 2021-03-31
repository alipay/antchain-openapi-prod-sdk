// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 凭证id发行信息
    public class IssueIdInfo : TeaModel {
        // 信用流转凭证
        [NameInMap("issue_id")]
        [Validation(Required=true)]
        public string IssueId { get; set; }

        // 全局唯一业务号
        [NameInMap("out_biz_no")]
        [Validation(Required=true)]
        public string OutBizNo { get; set; }

        // 合同号（预留）
        [NameInMap("contract_id")]
        [Validation(Required=false)]
        public string ContractId { get; set; }

        // 发行信用流转的运单号
        [NameInMap("waybill_id")]
        [Validation(Required=true)]
        public string WaybillId { get; set; }

        // 支付订单
        [NameInMap("pay_order")]
        [Validation(Required=true)]
        public string PayOrder { get; set; }

        // 凭证金额
        [NameInMap("ticket_amt")]
        [Validation(Required=true)]
        public string TicketAmt { get; set; }

        // 信用凭证发起时间
        [NameInMap("issue_date")]
        [Validation(Required=true)]
        public string IssueDate { get; set; }

        // 信用凭证到期时间
        [NameInMap("expire_date")]
        [Validation(Required=true)]
        public string ExpireDate { get; set; }

        // 发行结果状态 -1:发行失败状态， 0:未完成状态， 1:已发行状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // 失败原因信息
        [NameInMap("err_msg")]
        [Validation(Required=true)]
        public string ErrMsg { get; set; }

    }

}
