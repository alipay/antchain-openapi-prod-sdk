// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 技术栈支持的操作系统
    public class BuildpackOS : TeaModel {
        // creationTime
        [NameInMap("creation_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string CreationTime { get; set; }

        // 描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // extraInfo
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

        // 全名
        [NameInMap("full_name")]
        [Validation(Required=false)]
        public string FullName { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // modificationTime
        [NameInMap("modification_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string ModificationTime { get; set; }

        // 名字
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 操作系统位数
        [NameInMap("os_bit")]
        [Validation(Required=false)]
        public long? OsBit { get; set; }

        // supportedCloudDisplayNames
        [NameInMap("supported_cloud_display_names")]
        [Validation(Required=false)]
        public List<string> SupportedCloudDisplayNames { get; set; }

        // supportedCloudNames
        [NameInMap("supported_cloud_names")]
        [Validation(Required=false)]
        public List<string> SupportedCloudNames { get; set; }

        // 版本
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

        // 操作系统位数，e.g. 32 or 64
        [NameInMap("os_bit_num")]
        [Validation(Required=false)]
        public long? OsBitNum { get; set; }

    }

}
