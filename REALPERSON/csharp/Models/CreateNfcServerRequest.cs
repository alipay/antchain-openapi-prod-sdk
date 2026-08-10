// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class CreateNfcServerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 证件类型，ID_CARD，PASSPORT
        [NameInMap("cert_type")]
        [Validation(Required=true)]
        public string CertType { get; set; }

        // 证件号码
        [NameInMap("cert_no")]
        [Validation(Required=false)]
        public string CertNo { get; set; }

        // 证件姓名
        [NameInMap("cert_name")]
        [Validation(Required=false)]
        public string CertName { get; set; }

        // 出生日期
        [NameInMap("birthday")]
        [Validation(Required=false)]
        public string Birthday { get; set; }

        // 证件有效期
        [NameInMap("validate_date")]
        [Validation(Required=false)]
        public string ValidateDate { get; set; }

        // 护照要素录入模式 NONE MANUAL TRANS
        [NameInMap("mode")]
        [Validation(Required=false)]
        public string Mode { get; set; }

        // 扩展参数
        // {"syntheticEdoc":"Y"     是否合成证件图"}
        // {"obtainDocPhoto":"Y"    是否获取高清人像"}
        [NameInMap("extern_param")]
        [Validation(Required=false)]
        public string ExternParam { get; set; }

        // metainfo 环境参数，需要通过客户端 SDK 获取
        [NameInMap("meta_info")]
        [Validation(Required=true)]
        public string MetaInfo { get; set; }

        // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面...
        [NameInMap("outer_order_no")]
        [Validation(Required=true)]
        public string OuterOrderNo { get; set; }

        // 场景ID
        [NameInMap("scene_id")]
        [Validation(Required=true)]
        public string SceneId { get; set; }

        // 商户自定义的用户ID
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

    }

}
