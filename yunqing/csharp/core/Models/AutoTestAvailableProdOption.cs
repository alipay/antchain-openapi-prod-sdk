// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 测试用例是否可执行
    public class AutoTestAvailableProdOption : TeaModel {
        // 是否可执行测试用例	
        [NameInMap("is_runnable")]
        [Validation(Required=true)]
        public bool? IsRunnable { get; set; }

        // 不能执行自动化测试用例的原因	
        // 
        [NameInMap("message")]
        [Validation(Required=true)]
        public string Message { get; set; }

        // 部署单元唯一标识（元数据）	
        // 
        [NameInMap("deployment_unit_identity")]
        [Validation(Required=true)]
        public string DeploymentUnitIdentity { get; set; }

        // 部署单元实例唯一标识	
        [NameInMap("identity")]
        [Validation(Required=true)]
        public string Identity { get; set; }

        // 产品码
        [NameInMap("prod_code")]
        [Validation(Required=true)]
        public string ProdCode { get; set; }

    }

}
