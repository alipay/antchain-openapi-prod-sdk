// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartMydidcommunAgencyAuthRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 发起者did
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 用户在本地构造的发起数据授权申请的消息
        [NameInMap("request_raw")]
        [Validation(Required=true)]
        public string RequestRaw { get; set; }

        // 业务码，需要接入时联系数据隐私服务分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

    }

}
