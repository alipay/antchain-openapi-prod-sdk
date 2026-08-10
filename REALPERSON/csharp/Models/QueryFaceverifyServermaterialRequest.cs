// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class QueryFaceverifyServermaterialRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 实人认证唯一标识
        [NameInMap("certify_id")]
        [Validation(Required=true)]
        public string CertifyId { get; set; }

        // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
        [NameInMap("outer_order_no")]
        [Validation(Required=true)]
        public string OuterOrderNo { get; set; }

        // 场景ID
        [NameInMap("scene_id")]
        [Validation(Required=true)]
        public string SceneId { get; set; }

        // 预留扩展业务参数
        [NameInMap("extern_param")]
        [Validation(Required=false)]
        public string ExternParam { get; set; }

        // 图片的传入加密模式 0：明文 1：AES加密
        [NameInMap("material_enc_type")]
        [Validation(Required=false)]
        public string MaterialEncType { get; set; }

        // 公钥加密后的密钥，用于传入的加密图片/视频
        [NameInMap("material_enc_token")]
        [Validation(Required=false)]
        public string MaterialEncToken { get; set; }

    }

}
