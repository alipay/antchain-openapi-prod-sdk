// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TDM.Models
{
    // 核身初始化结果
    public class CertificationInitResponse : TeaModel {
        // 核身认证唯一标识
        [NameInMap("certify_id")]
        [Validation(Required=true)]
        public string CertifyId { get; set; }

        // 商户请求唯一标识
        [NameInMap("outer_order_no")]
        [Validation(Required=true)]
        public string OuterOrderNo { get; set; }

        // 场景ID
        [NameInMap("scene_id")]
        [Validation(Required=true)]
        public string SceneId { get; set; }

    }

}
