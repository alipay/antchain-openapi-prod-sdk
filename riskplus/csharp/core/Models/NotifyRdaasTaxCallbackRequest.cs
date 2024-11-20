// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class NotifyRdaasTaxCallbackRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 通知场景
        [NameInMap("notify_scene")]
        [Validation(Required=true)]
        public string NotifyScene { get; set; }

        // 租户号
        [NameInMap("inst_code")]
        [Validation(Required=true)]
        public string InstCode { get; set; }

        // 解决方案id
        [NameInMap("solution_id")]
        [Validation(Required=false)]
        public string SolutionId { get; set; }

        // 通知回调地址
        [NameInMap("callback_url")]
        [Validation(Required=false)]
        public string CallbackUrl { get; set; }

        // 业务参数
        [NameInMap("json_biz_params")]
        [Validation(Required=false)]
        public string JsonBizParams { get; set; }

    }

}
