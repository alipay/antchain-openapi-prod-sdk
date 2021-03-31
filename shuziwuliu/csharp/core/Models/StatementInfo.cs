// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 物流金融信用流转流水信息
    public class StatementInfo : TeaModel {
        // 信用流转批次号
        [NameInMap("batch_id")]
        [Validation(Required=true)]
        public string BatchId { get; set; }

        // 全局唯一业务号
        [NameInMap("out_biz_no")]
        [Validation(Required=true)]
        public string OutBizNo { get; set; }

        // 信用流转凭证
        [NameInMap("issue_id")]
        [Validation(Required=true)]
        public string IssueId { get; set; }

        // 合同号（预留）
        [NameInMap("contract_id")]
        [Validation(Required=false)]
        public string ContractId { get; set; }

        // 发行信用流转的运单号
        [NameInMap("waybill_id")]
        [Validation(Required=true)]
        public string WaybillId { get; set; }

        // 发行信用流转的支付单号
        [NameInMap("pay_order")]
        [Validation(Required=true)]
        public string PayOrder { get; set; }

        // 金额信息
        [NameInMap("credit_limit")]
        [Validation(Required=true)]
        public string CreditLimit { get; set; }

        // 流水类型
        [NameInMap("state_type")]
        [Validation(Required=true)]
        public string StateType { get; set; }

        // 流水类型说明
        [NameInMap("state_msg")]
        [Validation(Required=true)]
        public string StateMsg { get; set; }

        // 凭证来源方did
        [NameInMap("from_did")]
        [Validation(Required=true)]
        public string FromDid { get; set; }

        // 凭证流转方did
        [NameInMap("to_did")]
        [Validation(Required=true)]
        public string ToDid { get; set; }

        // 信用凭证发起时间
        [NameInMap("issue_date")]
        [Validation(Required=true)]
        public string IssueDate { get; set; }

        // 信用凭证到期时间
        [NameInMap("expire_date")]
        [Validation(Required=true)]
        public string ExpireDate { get; set; }

    }

}
