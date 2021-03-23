// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ZOLOZFACEVERIFY.Models
{
    public class VerifyFaceauthZimRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 扩展信息,Map的json格式
        [NameInMap("extern_param")]
        [Validation(Required=false)]
        public string ExternParam { get; set; }

        // 人脸业务参数
        [NameInMap("zim_data")]
        [Validation(Required=true)]
        public string ZimData { get; set; }

        // 实人认证id
        [NameInMap("zim_id")]
        [Validation(Required=true)]
        public string ZimId { get; set; }

    }

}
