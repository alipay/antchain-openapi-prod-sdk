// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class CheckRouteTwometaRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
        [NameInMap("outer_order_no")]
        [Validation(Required=true)]
        public string OuterOrderNo { get; set; }

        // 姓名
        [NameInMap("cert_name")]
        [Validation(Required=true)]
        public string CertName { get; set; }

        // 身份证号
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 使用场景（不再使用）
        [NameInMap("scene")]
        [Validation(Required=false)]
        public string Scene { get; set; }

        // map结果的json数据格式，预留字段
        // 
        [NameInMap("extern_param")]
        [Validation(Required=false)]
        public string ExternParam { get; set; }

        // 入参加密模式：NONE：不加密；AES：姓名、身份证号、手机号码字段都是AES加密后的字符串。非必填，不填时默认明文
        [NameInMap("req_enc_type")]
        [Validation(Required=false)]
        public string ReqEncType { get; set; }

        // 用于入参加密的AES密钥
        [NameInMap("enc_token")]
        [Validation(Required=false)]
        public string EncToken { get; set; }

    }

}
