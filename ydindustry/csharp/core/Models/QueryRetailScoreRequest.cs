// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YDINDUSTRY.Models
{
    public class QueryRetailScoreRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 模型id
        [NameInMap("industry_id")]
        [Validation(Required=true)]
        public string IndustryId { get; set; }

        // 用户id（客户身份证号/手机号的md5/sha256散列值）
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 用户id类型（身份证号：ID_NO；手机号：MOBILE_NO）
        [NameInMap("user_id_type")]
        [Validation(Required=true)]
        public string UserIdType { get; set; }

        // user_id 散列类型: "MD5"：MD5（小写）, ...
        [NameInMap("encrypt_type")]
        [Validation(Required=true)]
        public string EncryptType { get; set; }

        // 客户编码
        [NameInMap("customer_code")]
        [Validation(Required=true)]
        public string CustomerCode { get; set; }

        // 流水号，串联链路用，非必填
        [NameInMap("trans_no")]
        [Validation(Required=true)]
        public string TransNo { get; set; }

        // encrypt_type类型的散列后的操作，默认为空不加密...
        [NameInMap("user_id_hash_encrypt")]
        [Validation(Required=true)]
        public string UserIdHashEncrypt { get; set; }

    }

}
