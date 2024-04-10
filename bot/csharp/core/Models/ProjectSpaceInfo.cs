// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // iotbasic项目空间信息
    public class ProjectSpaceInfo : TeaModel {
        // 项目名称
        [NameInMap("project_name")]
        [Validation(Required=true)]
        public string ProjectName { get; set; }

        // 项目编码
        [NameInMap("project_code")]
        [Validation(Required=true)]
        public string ProjectCode { get; set; }

        // 项目描述
        [NameInMap("project_desc")]
        [Validation(Required=false)]
        public string ProjectDesc { get; set; }

    }

}
