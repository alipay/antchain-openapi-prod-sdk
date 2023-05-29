// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ANTVERSE.Models
{
    public class GetInteractvideoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 问题
        [NameInMap("question")]
        [Validation(Required=true)]
        public string Question { get; set; }

        // 数字人形象ID(不填写时,返回默认形象视频)
        [NameInMap("avatar_id")]
        [Validation(Required=false)]
        public string AvatarId { get; set; }

        // 交互类型（默认为QA, 问答：QA）
        [NameInMap("interact_type")]
        [Validation(Required=false)]
        public string InteractType { get; set; }

    }

}
