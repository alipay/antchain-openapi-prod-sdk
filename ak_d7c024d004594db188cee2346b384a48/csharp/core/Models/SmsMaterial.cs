// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_d7c024d004594db188cee2346b384a48.Models
{
    // 彩信素材
    public class SmsMaterial : TeaModel {
        // 素材名称
        [NameInMap("material_name")]
        [Validation(Required=false)]
        public string MaterialName { get; set; }

        // 素材类型
        [NameInMap("material_type")]
        [Validation(Required=true)]
        public string MaterialType { get; set; }

        // 素材内容
        [NameInMap("material_content")]
        [Validation(Required=true)]
        public string MaterialContent { get; set; }

    }

}
