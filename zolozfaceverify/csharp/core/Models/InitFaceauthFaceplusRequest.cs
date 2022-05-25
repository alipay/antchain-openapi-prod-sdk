// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ZOLOZFACEVERIFY.Models
{
    public class InitFaceauthFaceplusRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务唯一单号
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 身份，需要公钥加密
        [NameInMap("identity_param")]
        [Validation(Required=true)]
        public string IdentityParam { get; set; }

        // 客户端采集
        [NameInMap("metainfo")]
        [Validation(Required=true)]
        public string Metainfo { get; set; }

        // 外部参数
        [NameInMap("extern_param")]
        [Validation(Required=false)]
        public string ExternParam { get; set; }

        // 操作类型
        [NameInMap("operation_type")]
        [Validation(Required=false)]
        public string OperationType { get; set; }

        // 比对源图片
        [NameInMap("ref_img")]
        [Validation(Required=false)]
        public string RefImg { get; set; }

    }

}
