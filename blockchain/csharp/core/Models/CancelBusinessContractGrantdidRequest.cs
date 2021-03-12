// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CancelBusinessContractGrantdidRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 合约所在链的业务id
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 合约名称
        [NameInMap("contract_name")]
        [Validation(Required=true)]
        public string ContractName { get; set; }

        // keyId的创建者数字身份
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 取消被授权者的数字身份
        [NameInMap("granted_did")]
        [Validation(Required=true)]
        public string GrantedDid { get; set; }

        // 取消授权的字段
        [NameInMap("item_ids")]
        [Validation(Required=true)]
        public List<string> ItemIds { get; set; }

    }

}
