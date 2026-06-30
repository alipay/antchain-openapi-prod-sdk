// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class CallbackMktMonitordataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 回传请求对应id
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 监测数据回传数据类型，仅支持: POLICY_DATA（保单信息）, CANCELLATION_DATA（退保信息）, RENEWAL_DATA（续费信息）
        [NameInMap("data_type")]
        [Validation(Required=true)]
        public string DataType { get; set; }

        // 监测数据回传内容
        [NameInMap("data_content")]
        [Validation(Required=true)]
        public string DataContent { get; set; }

        // 与待传营销数据相关联的项目id 结合数科网关租户id进行鉴权
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

    }

}
