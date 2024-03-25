// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DUANKA.Models
{
    public class QueryCommonScoreRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 用户授权编码
        [NameInMap("auth_no")]
        [Validation(Required=true)]
        public string AuthNo { get; set; }

        // 模型id
        [NameInMap("model_id")]
        [Validation(Required=true)]
        public string ModelId { get; set; }

        // 用户id（客户身份证号/手机号的md5/sha256散列值）
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 用户id类型（身份证号：ID_NO；手机号：MOBILE_NO）
        [NameInMap("user_id_type")]
        [Validation(Required=true)]
        public string UserIdType { get; set; }

        // 加密类型: "MD5"：MD5（小写）, "SHA256" ： SHA256（小写）， "SM3"： SM3（小写）
        [NameInMap("encrypt_type")]
        [Validation(Required=true)]
        public string EncryptType { get; set; }

        // 客户编码
        [NameInMap("customer_code")]
        [Validation(Required=true)]
        public string CustomerCode { get; set; }

        // 流水号，串联链路用，非必填
        [NameInMap("trans_no")]
        [Validation(Required=false)]
        public string TransNo { get; set; }

    }

}
