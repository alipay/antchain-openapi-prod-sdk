// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENT.Models
{
    public class SendUserProjectordermsgRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 购买者
        [NameInMap("buyer")]
        [Validation(Required=true)]
        public User Buyer { get; set; }

        // 链ID
        [NameInMap("chain_id")]
        [Validation(Required=true)]
        public string ChainId { get; set; }

        // 订单详情
        [NameInMap("order")]
        [Validation(Required=true)]
        public Order Order { get; set; }

        // 项目信息
        [NameInMap("project")]
        [Validation(Required=true)]
        public Project Project { get; set; }

        // 分享者
        [NameInMap("sharer")]
        [Validation(Required=true)]
        public User Sharer { get; set; }

    }

}
