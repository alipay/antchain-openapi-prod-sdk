// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartDidAgentServicetypeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 枚举类型，描述访问服务的方式
        [NameInMap("access_mode")]
        [Validation(Required=false)]
        public string AccessMode { get; set; }

        // 对服务的文字描述，<1000个字符
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 服务类型创建者did
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // {
        //   "item1":"",
        //   "item2":"",
        //   ...
        // }
        [NameInMap("service_input")]
        [Validation(Required=false)]
        public string ServiceInput { get; set; }

        // {
        //    "item1":""
        //    "item2":""
        //    ...
        // }
        [NameInMap("service_output")]
        [Validation(Required=false)]
        public string ServiceOutput { get; set; }

        // 自定义服务类型，字符数16～32个
        [NameInMap("service_type")]
        [Validation(Required=true)]
        public string ServiceType { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

    }

}
