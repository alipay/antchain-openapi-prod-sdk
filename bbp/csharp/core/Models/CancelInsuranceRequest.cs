// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BBP.Models
{
    public class CancelInsuranceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 原保单号
        [NameInMap("policy_no")]
        [Validation(Required=true)]
        public string PolicyNo { get; set; }

        // 保单终止日期 毫秒值
        [NameInMap("policy_end_time")]
        [Validation(Required=true)]
        public long? PolicyEndTime { get; set; }

        // 退保原因
        [NameInMap("reason_for_quit")]
        [Validation(Required=true)]
        public string ReasonForQuit { get; set; }

        // 退保保费金额，单位分
        [NameInMap("quit_total_amount")]
        [Validation(Required=true)]
        public long? QuitTotalAmount { get; set; }

        // 扩展信息
        [NameInMap("extend")]
        [Validation(Required=false)]
        public string Extend { get; set; }

    }

}
