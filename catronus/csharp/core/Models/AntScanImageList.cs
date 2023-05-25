// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    // 蚂蚁扫描镜像列表
    public class AntScanImageList : TeaModel {
        // 镜像镜像扫描
        [NameInMap("list")]
        [Validation(Required=true)]
        public List<AntScanImage> List { get; set; }

    }

}
