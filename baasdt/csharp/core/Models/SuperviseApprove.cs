// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 监修报审表单内容
    public class SuperviseApprove : TeaModel {
        // 关联的订单id
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 当前的阶段
        [NameInMap("stage")]
        [Validation(Required=true)]
        public long? Stage { get; set; }

        // json组织，用于存储监修报审的具体信息
        [NameInMap("ext_info")]
        [Validation(Required=true)]
        public string ExtInfo { get; set; }

        // 当前阶段的审批状态   0:待审批，1:审批通过 2:审批拒绝
        [NameInMap("approval_status")]
        [Validation(Required=true)]
        public long? ApprovalStatus { get; set; }

        // 审批备注
        [NameInMap("approval_comments")]
        [Validation(Required=false)]
        public string ApprovalComments { get; set; }

        // 上链的交易hash
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

        // 关联的订单交易的ip id
        [NameInMap("ip_id")]
        [Validation(Required=true)]
        public string IpId { get; set; }

        // 关联交易的卖家id
        [NameInMap("seller_account_id")]
        [Validation(Required=true)]
        public string SellerAccountId { get; set; }

        // 关联交易的买家id
        [NameInMap("buyer_account_id")]
        [Validation(Required=true)]
        public string BuyerAccountId { get; set; }

        // 审批额外信息
        [NameInMap("approval_ext_info")]
        [Validation(Required=false)]
        public string ApprovalExtInfo { get; set; }

    }

}
