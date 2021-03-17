// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AREC.Models
{
    public class AuthRcpRtcRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 申办业务号
        [NameInMap("apply_biz_id")]
        [Validation(Required=true)]
        public string ApplyBizId { get; set; }

        // 签署任务描述
        [NameInMap("sign_task_profile")]
        [Validation(Required=true)]
        public SignTaskProfile SignTaskProfile { get; set; }

    }

}
