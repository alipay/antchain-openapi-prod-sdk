// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateStubRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数字票根全流程存证内容
        [NameInMap("onestep_flow_notary_info")]
        [Validation(Required=true)]
        public OnestepFlowNotaryInfo OnestepFlowNotaryInfo { get; set; }

        // 数字票根通用业务字段
        [NameInMap("stub_common_info")]
        [Validation(Required=true)]
        public StubCommonInfo StubCommonInfo { get; set; }

        // 数字票根扩展字段
        [NameInMap("stub_extra_info")]
        [Validation(Required=false)]
        public StubExtraInfo StubExtraInfo { get; set; }

        // 数字票根计量字段
        [NameInMap("metric_info")]
        [Validation(Required=false)]
        public MetricInfo MetricInfo { get; set; }

    }

}
