// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 持久化存储数据卷配置
    public class PersistentVolumeSource : TeaModel {
        //     READWRITEONCE("ReadWriteOnce"),
        //     READONLYMANY("ReadOnlyMany"),
        //     READWRITEMANY("ReadWriteMany");
        [NameInMap("access_modes")]
        [Validation(Required=true)]
        public List<string> AccessModes { get; set; }

    }

}
