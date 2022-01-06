// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class AddSafeCommunicationruleRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 	
        // 实例id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 规则名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 取值(0-客户端,1-服务端)
        [NameInMap("direction")]
        [Validation(Required=true)]
        public long? Direction { get; set; }

        // 模式(0-tls,1-mtls)
        [NameInMap("mode")]
        [Validation(Required=true)]
        public long? Mode { get; set; }

        // 策略(0-普通,1-国密)
        [NameInMap("strategy")]
        [Validation(Required=true)]
        public string Strategy { get; set; }

        // 分类(0-应用,1-标签)
        [NameInMap("scope")]
        [Validation(Required=true)]
        public long? Scope { get; set; }

        // [{"key":"aa","value":"bb","type":1}]
        [NameInMap("labels")]
        [Validation(Required=true)]
        public string Labels { get; set; }

    }

}
