// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CancelBusinessDepositGrantcorpRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数据存证所在链的业务id
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 存证数据的发起者did数字身份
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 取消授权的组织名称
        [NameInMap("granted_corp")]
        [Validation(Required=true)]
        public string GrantedCorp { get; set; }

        // 取消授权的子列名称
        [NameInMap("item_key_id")]
        [Validation(Required=true)]
        public List<string> ItemKeyId { get; set; }

        // 存证数据的逻辑主keyId
        [NameInMap("key_id")]
        [Validation(Required=true)]
        public string KeyId { get; set; }

    }

}
