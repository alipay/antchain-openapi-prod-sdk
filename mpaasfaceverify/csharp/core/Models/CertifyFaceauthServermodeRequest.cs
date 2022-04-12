// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MPAASFACEVERIFY.Models
{
    public class CertifyFaceauthServermodeRequest : TeaModel {
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

        // 预留扩展业务参数
        [NameInMap("extern_param")]
        [Validation(Required=true)]
        public string ExternParam { get; set; }

        // 用户身份信息
        [NameInMap("identity_param")]
        [Validation(Required=true)]
        public string IdentityParam { get; set; }

        // 待认证图片，默认base64格式
        [NameInMap("auth_img")]
        [Validation(Required=true)]
        public string AuthImg { get; set; }

        // 待认证图片类型，不传默认为base64后的图片，可以扩展Blob/video等类型
        [NameInMap("auth_img_type")]
        [Validation(Required=true)]
        public string AuthImgType { get; set; }

        // 操作类型，operation_type为custom时表示自定义模式，需要用户上传比对源图片
        [NameInMap("operation_type")]
        [Validation(Required=true)]
        public string OperationType { get; set; }

        // 比对源图片
        [NameInMap("ref_img")]
        [Validation(Required=true)]
        public string RefImg { get; set; }

    }

}
