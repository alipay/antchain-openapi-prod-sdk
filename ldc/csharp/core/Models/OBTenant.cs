// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // OB租户信息
    public class OBTenant : TeaModel {
        // 租户描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 扩展属性，序列化后的JSON字符串
        [NameInMap("extend_properties")]
        [Validation(Required=false)]
        public string ExtendProperties { get; set; }

        // 唯一标识
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 租户名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 租户类型（单库GZONE|分片库RZONE）：存放对应业务库
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 租户对应uid分段，用于存放对应的业务分片库
        [NameInMap("uids")]
        [Validation(Required=false)]
        public List<long?> Uids { get; set; }

        // 工作空间组唯一标识
        [NameInMap("workspace_group_id")]
        [Validation(Required=true)]
        public string WorkspaceGroupId { get; set; }

        // 创建日期
        [NameInMap("created_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreatedTime { get; set; }

        // 修改时间
        [NameInMap("modified_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ModifiedTime { get; set; }

    }

}
