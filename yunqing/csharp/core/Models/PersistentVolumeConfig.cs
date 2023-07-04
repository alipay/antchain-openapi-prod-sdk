// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 持久化存储配置
    public class PersistentVolumeConfig : TeaModel {
        // 挂载名称
        [NameInMap("volume_name")]
        [Validation(Required=true)]
        public string VolumeName { get; set; }

        //     挂载的获取名称，默认：ReadWriteOnce。READWRITEONCE("ReadWriteOnce"),
        //     READONLYMANY("ReadOnlyMany"),
        //     READWRITEMANY("ReadWriteMany");
        [NameInMap("access_modes")]
        [Validation(Required=false)]
        public List<string> AccessModes { get; set; }

        // 存储类
        [NameInMap("storage_class")]
        [Validation(Required=false)]
        public string StorageClass { get; set; }

        // 是否使用匿名卷，，默认false
        [NameInMap("use_empty_dir")]
        [Validation(Required=true)]
        public bool? UseEmptyDir { get; set; }

    }

}
