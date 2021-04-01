// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateLogisticFinanceDisvcRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 指定可验证声明颁发对象的分布式数字身份id
        [NameInMap("dest_did")]
        [Validation(Required=true)]
        public string DestDid { get; set; }

        // 可验证声明有效期 (时间戳) ， 到达该时间戳表示的时间时过期， 默认一天
        [NameInMap("expire")]
        [Validation(Required=false)]
        public string Expire { get; set; }

        // vc颁发者分布式数字身份，缺省时为调用者的默认分布式数字身份
        [NameInMap("src_did")]
        [Validation(Required=false)]
        public string SrcDid { get; set; }

    }

}
