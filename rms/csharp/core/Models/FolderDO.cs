// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 文件夹实体类
    public class FolderDO : TeaModel {
        // 文件夹ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 文件夹名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 父目录 ID
        [NameInMap("parent_folder_id")]
        [Validation(Required=true)]
        public string ParentFolderId { get; set; }

        // 排序号
        [NameInMap("sort_index")]
        [Validation(Required=false)]
        public string SortIndex { get; set; }

        // 监控租户 ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public long? TenantId { get; set; }

        // 监控工作空间 ID
        [NameInMap("workspace_id")]
        [Validation(Required=true)]
        public string WorkspaceId { get; set; }

        // 创建者
        [NameInMap("creater")]
        [Validation(Required=true)]
        public string Creater { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public long? GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=true)]
        public long? GmtModified { get; set; }

        // 修改者
        [NameInMap("modifier")]
        [Validation(Required=true)]
        public string Modifier { get; set; }

        // 是否告警
        [NameInMap("alarmed")]
        [Validation(Required=true)]
        public bool? Alarmed { get; set; }

        // 是否置顶
        [NameInMap("top")]
        [Validation(Required=true)]
        public bool? Top { get; set; }

    }

}
