// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class CheckCarrierTwometaRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 外部请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位。
        [NameInMap("outer_order_no")]
        [Validation(Required=true)]
        public string OuterOrderNo { get; set; }

        // 加密类型，填写时「支持加密」字段需要对应加密后赋值。默认使用明文模式
        // 0：明文
        // 1：MD5
        [NameInMap("encrypt_type")]
        [Validation(Required=false)]
        public string EncryptType { get; set; }

        // 要素入参模式：
        // 1：手机号+姓名
        // 2：手机号+身份证号
        [NameInMap("meta_mode")]
        [Validation(Required=true)]
        public string MetaMode { get; set; }

        // 手机号码「支持加密」
        [NameInMap("mobile")]
        [Validation(Required=true)]
        public string Mobile { get; set; }

        // 姓名「支持加密」
        [NameInMap("cert_name")]
        [Validation(Required=false)]
        public string CertName { get; set; }

        // 身份证号「支持加密」
        [NameInMap("cert_no")]
        [Validation(Required=false)]
        public string CertNo { get; set; }

        // 运营商类型：
        // CHINA_TELECOM；
        // CHINA_MOBILE；
        // CHINA_UNICOM
        [NameInMap("carrier")]
        [Validation(Required=false)]
        public string Carrier { get; set; }

        // 扩展信息，预留字段
        [NameInMap("extern_param")]
        [Validation(Required=false)]
        public string ExternParam { get; set; }

    }

}
