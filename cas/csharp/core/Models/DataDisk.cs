// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // computer 数据盘
    public class DataDisk : TeaModel {
        // 磁盘大小
        [NameInMap("size")]
        [Validation(Required=true)]
        public long? Size { get; set; }

        // 若使用磁盘创建，需填写此字段
        [NameInMap("snapshot_sequence")]
        [Validation(Required=false)]
        public string SnapshotSequence { get; set; }

        // 磁盘规格
        [NameInMap("spec_id")]
        [Validation(Required=true)]
        public string SpecId { get; set; }

        // 数据盘设备
        [NameInMap("device")]
        [Validation(Required=true)]
        public string Device { get; set; }

    }

}
