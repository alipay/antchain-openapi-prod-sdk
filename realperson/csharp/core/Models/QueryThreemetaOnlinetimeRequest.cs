// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class QueryThreemetaOnlinetimeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 外部请求id
        [NameInMap("outer_order_no")]
        [Validation(Required=true)]
        public string OuterOrderNo { get; set; }

        // 姓名
        [NameInMap("cert_name")]
        [Validation(Required=false)]
        public string CertName { get; set; }

        // 身份证号
        [NameInMap("cert_no")]
        [Validation(Required=false)]
        public string CertNo { get; set; }

        // 手机号码
        [NameInMap("phone_no")]
        [Validation(Required=true)]
        public string PhoneNo { get; set; }

        // 是否区分运营商
        [NameInMap("div_carrier")]
        [Validation(Required=false)]
        public bool? DivCarrier { get; set; }

        // 运营商类型
        [NameInMap("carrier")]
        [Validation(Required=false)]
        public string Carrier { get; set; }

        // 加密类型，填写时「支持加密」字段需要对应加密后赋值。默认使用明文模式
        // 0：明文
        // 1：MD5
        [NameInMap("encrypt_type")]
        [Validation(Required=false)]
        public string EncryptType { get; set; }

        // 扩展参数
        [NameInMap("extern_param")]
        [Validation(Required=false)]
        public string ExternParam { get; set; }

    }

}
