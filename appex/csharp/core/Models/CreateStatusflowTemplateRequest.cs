// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APPEX.Models
{
    public class CreateStatusflowTemplateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 联盟ID
        [NameInMap("union_id")]
        [Validation(Required=true)]
        public string UnionId { get; set; }

        // 状态流模版名称
        [NameInMap("flow_name")]
        [Validation(Required=true)]
        public string FlowName { get; set; }

        // 自定义流程入参DTO
        [NameInMap("flow_template")]
        [Validation(Required=true)]
        public List<FlowTemplate> FlowTemplate { get; set; }

    }

}
