// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    public class CreateAutotestopsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 环境id
        [NameInMap("env_id")]
        [Validation(Required=false)]
        public string EnvId { get; set; }

        // 测试单名字
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 需要测试的产品
        [NameInMap("products")]
        [Validation(Required=true)]
        public List<AutoTestProduct> Products { get; set; }

        // 单元的id
        [NameInMap("cell_id")]
        [Validation(Required=true)]
        public string CellId { get; set; }

        // 如果未设置，默认返回NORMAL_JOB，NORMAL_JOB：通用一次任务；HAS_JOB：巡检一次任务
        // 
        // 
        [NameInMap("auto_test_type")]
        [Validation(Required=false)]
        public string AutoTestType { get; set; }

    }

}
