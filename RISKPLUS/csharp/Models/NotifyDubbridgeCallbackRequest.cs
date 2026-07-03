// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class NotifyDubbridgeCallbackRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户id
        [NameInMap("channel_code")]
        [Validation(Required=true)]
        public string ChannelCode { get; set; }

        // json参数
        [NameInMap("biz_param")]
        [Validation(Required=true)]
        public string BizParam { get; set; }

        // 回调类型（1授信回调2用信回调）
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 对应授信/用信传给三方留存单号
        [NameInMap("seq_no")]
        [Validation(Required=true)]
        public string SeqNo { get; set; }

    }

}
