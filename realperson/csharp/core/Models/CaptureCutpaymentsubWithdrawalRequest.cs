// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class CaptureCutpaymentsubWithdrawalRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
        [NameInMap("outer_order_no")]
        [Validation(Required=true)]
        public string OuterOrderNo { get; set; }

        // 提现的订单号，商户订单号需要唯一，方便定位到每一笔订单
        [NameInMap("withdraw_order_id")]
        [Validation(Required=true)]
        public string WithdrawOrderId { get; set; }

        // 二级商户账户号
        [NameInMap("contract_no")]
        [Validation(Required=true)]
        public string ContractNo { get; set; }

        // 提现金额，单位：元，整数部分最长10位数，保留两位小数
        [NameInMap("deal_amount")]
        [Validation(Required=true)]
        public string DealAmount { get; set; }

        // 一级商户商户号
        [NameInMap("first_level_memberid")]
        [Validation(Required=true)]
        public string FirstLevelMemberid { get; set; }

        // 一级商户终端号
        [NameInMap("first_level_terminalid")]
        [Validation(Required=true)]
        public string FirstLevelTerminalid { get; set; }

        // 扩展信息，预留字段
        [NameInMap("extern_param")]
        [Validation(Required=false)]
        public string ExternParam { get; set; }

    }

}
