// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CancelBusinessDepositGrantdidRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 存证数据的发起者did身份
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 取消授权的did数字身份
        [NameInMap("granted_did")]
        [Validation(Required=true)]
        public string GrantedDid { get; set; }

        // 取消授权的字段名称
        [NameInMap("item_key_id")]
        [Validation(Required=true)]
        public List<string> ItemKeyId { get; set; }

        // 存证数据的主键
        [NameInMap("key_id")]
        [Validation(Required=true)]
        public string KeyId { get; set; }

    }

}
