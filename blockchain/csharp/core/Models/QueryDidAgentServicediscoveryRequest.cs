// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryDidAgentServicediscoveryRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 查询页数
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public long? PageNum { get; set; }

        // 需要查找的服务类型
        [NameInMap("service_type")]
        [Validation(Required=true)]
        public string ServiceType { get; set; }

        // 场景码，找dis工作人员进行分配
        // 
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

    }

}
