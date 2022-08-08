// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class CheckTwometaHashRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // hash后的身份证号，不区分大小写，使用的hash算法参考hash_type字段
        [NameInMap("cert_no_hash")]
        [Validation(Required=true)]
        public string CertNoHash { get; set; }

        // hash后的姓名，不区分大小写，使用的hash类型参考hash_type
        [NameInMap("cert_name_hash")]
        [Validation(Required=true)]
        public string CertNameHash { get; set; }

        // 本次核验id
        [NameInMap("outer_order_id")]
        [Validation(Required=true)]
        public string OuterOrderId { get; set; }

        // 支持的hash类型
        [NameInMap("hash_type")]
        [Validation(Required=true)]
        public string HashType { get; set; }

        // json格式的扩展字段
        [NameInMap("extern_info")]
        [Validation(Required=false)]
        public string ExternInfo { get; set; }

    }

}
