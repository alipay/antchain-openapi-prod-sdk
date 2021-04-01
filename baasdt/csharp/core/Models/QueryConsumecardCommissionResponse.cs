// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class QueryConsumecardCommissionResponse : TeaModel {
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

        // 手续费规则结果
        [NameInMap("commission_rules")]
        [Validation(Required=false)]
        public List<CommissionRuleResponse> CommissionRules { get; set; }

        // 分类id（ffaaaaabbbbbb，如果存在则直接更新）
        [NameInMap("category_id")]
        [Validation(Required=false)]
        public string CategoryId { get; set; }

        // 手续费类型（0:全局，1:商户）
        [NameInMap("type")]
        [Validation(Required=false)]
        public long? Type { get; set; }

        // 手续费归属的账户id,如果type为0 ，则该字段必须为空
        [NameInMap("account_id")]
        [Validation(Required=false)]
        public string AccountId { get; set; }

        // 手续费支出方（0.卖家，1.买家，2.平台）
        [NameInMap("pay_commission_type")]
        [Validation(Required=false)]
        public string PayCommissionType { get; set; }

    }

}
