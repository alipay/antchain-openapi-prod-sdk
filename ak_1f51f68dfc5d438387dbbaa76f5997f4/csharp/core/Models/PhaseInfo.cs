// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_1f51f68dfc5d438387dbbaa76f5997f4.Models
{
    // 环节信息
    public class PhaseInfo : TeaModel {
        // 环节名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 环节项
        [NameInMap("items")]
        [Validation(Required=true)]
        public List<PhaseItem> Items { get; set; }

        // 上传者信息
        [NameInMap("upload_info")]
        [Validation(Required=true)]
        public UploaderInfo UploadInfo { get; set; }

        // 区块信息
        [NameInMap("block_info")]
        [Validation(Required=true)]
        public BlockInfo BlockInfo { get; set; }

    }

}
