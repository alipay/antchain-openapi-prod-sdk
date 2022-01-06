// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class ExportSgAuthrulegroupsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 鉴权规则id集合，多个用逗号隔开，当is_export_all为false时此参数必填
        [NameInMap("auth_rule_ids")]
        [Validation(Required=false)]
        public string AuthRuleIds { get; set; }

        // 租户实例id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 是否导出所有规则
        [NameInMap("is_export_all")]
        [Validation(Required=true)]
        public bool? IsExportAll { get; set; }

    }

}
