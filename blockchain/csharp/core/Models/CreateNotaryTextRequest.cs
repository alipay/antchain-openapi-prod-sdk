// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateNotaryTextRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
        [NameInMap("location")]
        [Validation(Required=false)]
        public Location Location { get; set; }

        // 存证内容
        [NameInMap("notary_content")]
        [Validation(Required=true)]
        public string NotaryContent { get; set; }

        // 描述本条存证在存证事务中的阶段，用户可自行维护
        [NameInMap("phase")]
        [Validation(Required=true)]
        public string Phase { get; set; }

        // 扩展属性
        [NameInMap("properties")]
        [Validation(Required=true)]
        public string Properties { get; set; }

        // 存证事务id
        [NameInMap("token")]
        [Validation(Required=true)]
        public string Token { get; set; }

        // 是否使用可信时间戳，默认为false
        [NameInMap("tsr")]
        [Validation(Required=false)]
        public bool? Tsr { get; set; }

    }

}
