// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 应用技术栈
    public class TechStack : TeaModel {
        // 技术栈描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 该字段为字符串类型Map，序列化为字符串用于存储扩展信息，e.g： 云原生下打包存放目录 /home/admin/release
        [NameInMap("extend_properties")]
        [Validation(Required=true)]
        public string ExtendProperties { get; set; }

        // 技术栈id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 技术栈名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 技术栈可见范围，全局可见|租户内可见
        [NameInMap("scope")]
        [Validation(Required=true)]
        public string Scope { get; set; }

        // 创建时间（UTC）
        [NameInMap("utc_created")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UtcCreated { get; set; }

        // 最近修改时间（UTC）
        [NameInMap("utc_modified")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UtcModified { get; set; }

    }

}
