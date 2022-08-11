// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_5bb1b66c4aab4cc998c05a36078e45c1.Models
{
    public class StartAntchainBbpVerifyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 核身上下文id
        [NameInMap("verify_id")]
        [Validation(Required=true)]
        public string VerifyId { get; set; }

        // 核身模块分组
        [NameInMap("group")]
        [Validation(Required=true)]
        public string Group { get; set; }

        // 核身动作：view-渲染，verify-校验，repeat-重新发送
        [NameInMap("product_action")]
        [Validation(Required=true)]
        public string ProductAction { get; set; }

        // 业务id
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 核身渲染结果
        [NameInMap("result")]
        [Validation(Required=false)]
        public List<GwVerifyViewResult> Result { get; set; }

    }

}
