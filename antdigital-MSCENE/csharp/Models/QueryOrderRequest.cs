// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MSCENE.Models
{
    public class QueryOrderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 小游戏ID
        [NameInMap("mini_program_id")]
        [Validation(Required=true)]
        public string MiniProgramId { get; set; }

        // 平台ID
        [NameInMap("platform_id")]
        [Validation(Required=true)]
        public string PlatformId { get; set; }

        // 客户订单号
        [NameInMap("custom_id")]
        [Validation(Required=true)]
        public string CustomId { get; set; }

    }

}
