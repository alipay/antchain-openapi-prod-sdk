// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_be9ae52241c747408ac24bec8f036d74.Models
{
    // 项目信息
    public class Project : TeaModel {
        // 项目ID
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // 创建者ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 项目名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 项目状态:CREATING为创建中，FAILED为创建失败，FINISHED为创建完成。仅状态为FINISHED的项目才允许创建任务
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 创建时间（毫秒）
        [NameInMap("gmt_create")]
        [Validation(Required=false)]
        public long? GmtCreate { get; set; }

        // 更新时间（毫秒）
        [NameInMap("gmt_modified")]
        [Validation(Required=false)]
        public long? GmtModified { get; set; }

        // 参与方列表
        [NameInMap("party_list")]
        [Validation(Required=true)]
        public List<Party> PartyList { get; set; }

    }

}
