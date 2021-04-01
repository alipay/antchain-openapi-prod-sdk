// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartMydidcommunTaskGetdataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 要获取的数据ID
        [NameInMap("data_did")]
        [Validation(Required=true)]
        public string DataDid { get; set; }

        // 申请获得的数据的用户DID，将用该DID公钥加密原始数据
        [NameInMap("target_did")]
        [Validation(Required=true)]
        public string TargetDid { get; set; }

        // 授权数据申请方读取该数据的VC
        [NameInMap("vc")]
        [Validation(Required=true)]
        public string Vc { get; set; }

        // 请求发起人的did
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

    }

}
