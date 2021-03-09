// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 阿里云日志服务(SLS)-日志配置-输出类型配置
    public class SLSConfigOutputDetail : TeaModel {
        // 项目名称，必须为请求的project名。
        [NameInMap("project_name")]
        [Validation(Required=true)]
        public string ProjectName { get; set; }

        // 日志库名称
        [NameInMap("logstore_name")]
        [Validation(Required=true)]
        public string LogstoreName { get; set; }

    }

}
