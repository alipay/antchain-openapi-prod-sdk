// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class GetDubbridgeJumpurlRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求唯一id
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 授信流水号
        [NameInMap("credit_no")]
        [Validation(Required=false)]
        public string CreditNo { get; set; }

        // 支用流水号
        [NameInMap("loan_no")]
        [Validation(Required=false)]
        public string LoanNo { get; set; }

        // 跳端申请流水号
        [NameInMap("jump_no")]
        [Validation(Required=true)]
        public string JumpNo { get; set; }

        // 借款确认信息
        [NameInMap("loan_confirm_info")]
        [Validation(Required=true)]
        public LoanConfirmInfo LoanConfirmInfo { get; set; }

        // 回跳平台方地址
        [NameInMap("plat_jump_url")]
        [Validation(Required=true)]
        public PlatJumpUrl PlatJumpUrl { get; set; }

        // 合作方渠道标示，用于区分产品
        [NameInMap("channel_id")]
        [Validation(Required=true)]
        public string ChannelId { get; set; }

        // 拓展信息，json格式字符串
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

    }

}
