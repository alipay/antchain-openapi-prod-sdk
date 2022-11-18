// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_1fef8815252948ebb01da07898dd0fb2.Models
{
    public class GetAntchainBbpContractRuleResponse : TeaModel {
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

        // 服务商
        [NameInMap("sp_provider")]
        [Validation(Required=false)]
        public SpProvider SpProvider { get; set; }

        // 规则明细
        [NameInMap("rule_details")]
        [Validation(Required=false)]
        public List<RuleDetail> RuleDetails { get; set; }

        // 确认人
        [NameInMap("confirmer")]
        [Validation(Required=false)]
        public string Confirmer { get; set; }

        // 确认状态
        [NameInMap("confirm_status")]
        [Validation(Required=false)]
        public string ConfirmStatus { get; set; }

        // 确认时间
        [NameInMap("confirm_date")]
        [Validation(Required=false)]
        public string ConfirmDate { get; set; }

    }

}
