// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_20ab7e4471e24e8fbfaa7df4ba0613c8.Models
{
    public class QueryBaasDidAgentServicetypeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 查询者did
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 指定查询的服务类型名
        [NameInMap("service_type")]
        [Validation(Required=true)]
        public string ServiceType { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

        // 服务类型定义列表
        [NameInMap("service_types")]
        [Validation(Required=false)]
        public List<string> ServiceTypes { get; set; }

        // 总共有几项
        [NameInMap("total_number")]
        [Validation(Required=false)]
        public long? TotalNumber { get; set; }

        // 总共有几页
        [NameInMap("total_page")]
        [Validation(Required=false)]
        public long? TotalPage { get; set; }

    }

}
