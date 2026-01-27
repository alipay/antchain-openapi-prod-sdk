// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class QueryCutpaymentsubWithdrawalRequest : TeaModel {
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

        // 原商户流水号
        [NameInMap("withdraw_order_id")]
        [Validation(Required=true)]
        public string WithdrawOrderId { get; set; }

        // 交易时间 yyyy-MM-dd，原交易日期
        [NameInMap("time")]
        [Validation(Required=true)]
        public string Time { get; set; }

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
