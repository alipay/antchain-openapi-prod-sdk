// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class ListSafeCommunicationrulesRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 实例id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 规则名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 应用名称
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 取值(0-客户端,1-服务端)
        [NameInMap("direction")]
        [Validation(Required=false)]
        public string Direction { get; set; }

        // 模式(0-tls,1-mtls)
        [NameInMap("mode")]
        [Validation(Required=false)]
        public string Mode { get; set; }

        // 策略(0-普通,1-国密)
        [NameInMap("strategy")]
        [Validation(Required=false)]
        public string Strategy { get; set; }

        // 排序字段,key枚举范围("operateTime","name", "direction", "mode", "strategy","enabled",
        //             "scope")，dir枚举范围("DESC", "ASC")
        [NameInMap("orders")]
        [Validation(Required=false)]
        public string Orders { get; set; }

        // 开始页
        [NameInMap("start")]
        [Validation(Required=true)]
        public long? Start { get; set; }

        // 每页条数
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

    }

}
