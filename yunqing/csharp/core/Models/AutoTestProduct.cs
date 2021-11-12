// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 自动化测试工单中的产品
    public class AutoTestProduct : TeaModel {
        // 部署单元id
        [NameInMap("deploy_unit")]
        [Validation(Required=false)]
        public string DeployUnit { get; set; }

        // 产品码
        [NameInMap("prod_code")]
        [Validation(Required=true)]
        public string ProdCode { get; set; }

        // 应用启动参数数据
        [NameInMap("app_param_data")]
        [Validation(Required=false)]
        public List<AppParamData> AppParamData { get; set; }

    }

}
