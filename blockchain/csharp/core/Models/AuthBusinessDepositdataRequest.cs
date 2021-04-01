// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class AuthBusinessDepositdataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务链对应的bizId    
        // 
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 授权者身份
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 被授权者did身份
        [NameInMap("granted_did")]
        [Validation(Required=true)]
        public string GrantedDid { get; set; }

        // 被授权的字段
        [NameInMap("item_key_id")]
        [Validation(Required=true)]
        public List<string> ItemKeyId { get; set; }

        // 业务逻辑唯一id
        [NameInMap("key_id")]
        [Validation(Required=true)]
        public string KeyId { get; set; }

    }

}
