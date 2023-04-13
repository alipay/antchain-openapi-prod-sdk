// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.FAIROPENNET.Models
{
    public class CreateFlowRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        //  参与方的partyId
        [NameInMap("party_id")]
        [Validation(Required=true)]
        public string PartyId { get; set; }

        // 静态工作流配置字符串
        [NameInMap("static_flow_config")]
        [Validation(Required=true)]
        public string StaticFlowConfig { get; set; }

    }

}
