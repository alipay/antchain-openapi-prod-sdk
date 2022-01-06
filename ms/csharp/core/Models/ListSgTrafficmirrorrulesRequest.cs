// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class ListSgTrafficmirrorrulesRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户实例id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 源应用
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 源服务id
        [NameInMap("data_id")]
        [Validation(Required=false)]
        public string DataId { get; set; }

        // 规则名称
        [NameInMap("rule_name")]
        [Validation(Required=false)]
        public string RuleName { get; set; }

        // 起始页
        [NameInMap("start")]
        [Validation(Required=true)]
        public long? Start { get; set; }

        // 页大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

    }

}
