// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class OpenTokenRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 申请事项，描述一个事情即可，
        [NameInMap("action")]
        [Validation(Required=true)]
        public string Action { get; set; }

        // 单位为秒
        [NameInMap("timeout")]
        [Validation(Required=false)]
        public long? Timeout { get; set; }

        // 额外的描述信息
        [NameInMap("options")]
        [Validation(Required=false)]
        public List<MapStringToStringEntity> Options { get; set; }

        // 此Token用途API对应的入参，应该是一个简单Object
        [NameInMap("param")]
        [Validation(Required=true)]
        public string Param { get; set; }

    }

}
