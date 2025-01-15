// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 经营分账收入方详情信息(商户控制台订单详情用)
    public class OperationDivideTransInDetailInfo : TeaModel {
        // 分账收入方名称
        [NameInMap("trans_in_name")]
        [Validation(Required=false)]
        public string TransInName { get; set; }

        // 分账收入方支付宝用户id, 支付宝2088id
        [NameInMap("trans_in_user_id")]
        [Validation(Required=false)]
        public string TransInUserId { get; set; }

        // 分账金额，单位为分
        [NameInMap("divide_amount")]
        [Validation(Required=false)]
        public long? DivideAmount { get; set; }

        // 分账描述
        [NameInMap("desc")]
        [Validation(Required=false)]
        public string Desc { get; set; }

        // INIT("INIT", "初始化"),
        // PROCESSING("PROCESSING", "处理中"),
        // FAILED("FAILED", "失败"),
        // SUCCESS("SUCCESS", "分账成功");
        [NameInMap("divide_status")]
        [Validation(Required=false)]
        public string DivideStatus { get; set; }

    }

}
