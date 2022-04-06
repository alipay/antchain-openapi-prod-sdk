// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 阿里云日志服务(SLS)-日志项目
    public class SLSProject : TeaModel {
        // 项目描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 项目名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 阿里云返回的regionName，仅作展示用
        [NameInMap("region")]
        [Validation(Required=false)]
        public string Region { get; set; }

    }

}
