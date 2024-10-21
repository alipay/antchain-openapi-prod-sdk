// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE.Models
{
    // 项目资源
    public class ProjectResource : TeaModel {
        // 资源ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 项目ID
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // 资源类型（目前只有PROJECT_REPORT）
        [NameInMap("resource_type")]
        [Validation(Required=true)]
        public string ResourceType { get; set; }

        // 资源名称
        [NameInMap("resource_name")]
        [Validation(Required=true)]
        public string ResourceName { get; set; }

        // 文件ID
        [NameInMap("file_id")]
        [Validation(Required=true)]
        public string FileId { get; set; }

        // 创建时间戳
        [NameInMap("gmt_created")]
        [Validation(Required=true)]
        public long? GmtCreated { get; set; }

    }

}
