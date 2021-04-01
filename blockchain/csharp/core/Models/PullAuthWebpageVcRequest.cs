// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class PullAuthWebpageVcRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 企业B类的唯一ID，对应的did在返回值vc_content中的subject字段
        [NameInMap("pk_id")]
        [Validation(Required=true)]
        public string PkId { get; set; }

        // C类用户的唯一ID，当前为通过姓名+身份证号组合计算哈希得到user_id = sha256(name+certNo)，对应的did在返回值vc_content中的issuer字段
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

    }

}
