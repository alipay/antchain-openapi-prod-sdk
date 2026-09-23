// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryInnerSppdashboardpurchaseResponse : TeaModel {
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

        // 采买总览（目标/当前/达成率）
        [NameInMap("overview")]
        [Validation(Required=false)]
        public string Overview { get; set; }

        // 各商家采购达成卡
        [NameInMap("merchants")]
        [Validation(Required=false)]
        public string Merchants { get; set; }

        // 商家流量评估（渠道 Top20% + AI 调量）
        [NameInMap("evaluations")]
        [Validation(Required=false)]
        public string Evaluations { get; set; }

    }

}
