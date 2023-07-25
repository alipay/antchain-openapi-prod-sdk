// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_320bc483f2434f39a3af9ec9f04d3cc0.Models
{
    // 签署发起返回类
    public class ContractSignResponse : TeaModel {
        // 流程id
        [NameInMap("flow_id")]
        [Validation(Required=true)]
        public string FlowId { get; set; }

        // 签署链接数组
        [NameInMap("sign_url_list")]
        [Validation(Required=true)]
        public List<SignUrlResp> SignUrlList { get; set; }

    }

}
