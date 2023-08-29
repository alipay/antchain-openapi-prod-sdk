// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_5511b931fbd04feba92b64ebc082aac0.Models
{
    public class InitAntchainEkycVerificationWebsdkRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 场景ID
        [NameInMap("scene_id")]
        [Validation(Required=false)]
        public string SceneId { get; set; }

        // 预留扩展参数
        [NameInMap("extern_param")]
        [Validation(Required=false)]
        public string ExternParam { get; set; }

        // 用户身份信息
        [NameInMap("identity_param")]
        [Validation(Required=false)]
        public string IdentityParam { get; set; }

        // metainfo环境参数
        [NameInMap("metainfo")]
        [Validation(Required=false)]
        public string Metainfo { get; set; }

    }

}
