// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // pod volume info.
    public class Volume : TeaModel {
        // 主机目录[仅针对HostPath类型volume有效]
        [NameInMap("host_path")]
        [Validation(Required=false)]
        public string HostPath { get; set; }

        // Volume名称。
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 关联的资源名称。
        [NameInMap("ref_resource_name")]
        [Validation(Required=false)]
        public string RefResourceName { get; set; }

        //  LOCAL_STORAGE：主机挂载|CONFIGMAP：配置项|SECRET：保密字典
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // Volume是否只读
        [NameInMap("read_only")]
        [Validation(Required=false)]
        public bool? ReadOnly { get; set; }

    }

}
