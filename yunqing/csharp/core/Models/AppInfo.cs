// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 巡检app信息
    public class AppInfo : TeaModel {
        // 集群里面该app的namespace
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // pod信息列表
        [NameInMap("pod_list")]
        [Validation(Required=true)]
        public List<PodInfo> PodList { get; set; }

        // 应用名称
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // ap version
        [NameInMap("app_version")]
        [Validation(Required=true)]
        public string AppVersion { get; set; }

        // 应用类型
        [NameInMap("app_type")]
        [Validation(Required=false)]
        public string AppType { get; set; }

    }

}
