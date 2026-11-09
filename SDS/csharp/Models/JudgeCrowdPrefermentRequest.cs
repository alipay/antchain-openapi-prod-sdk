// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SDS.Models
{
    public class JudgeCrowdPrefermentRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务号：可以标识用户的编码，例如手机号，身份证号等，通过业务号类型来控制，与biz_no_type和encrypt_type共同确定编码形式。
        [NameInMap("biz_no")]
        [Validation(Required=true)]
        public string BizNo { get; set; }

        // 业务号类型：1-手机号，2-支付宝用户id
        [NameInMap("biz_no_type")]
        [Validation(Required=true)]
        public string BizNoType { get; set; }

        // 加密方式：0-不加密，1-SHA1，2-MD5
        [NameInMap("encrypt_type")]
        [Validation(Required=true)]
        public string EncryptType { get; set; }

        // json结构，可以传递自定义参数
        [NameInMap("properties")]
        [Validation(Required=false, MaxLength=512)]
        public string Properties { get; set; }

    }

}
