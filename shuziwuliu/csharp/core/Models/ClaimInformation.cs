// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 索赔资料附件
    public class ClaimInformation : TeaModel {
        // 索赔资料地址url
        [NameInMap("file_url")]
        [Validation(Required=true, MaxLength=500)]
        public string FileUrl { get; set; }

        // 文件名	
        [NameInMap("file_name")]
        [Validation(Required=true, MaxLength=200)]
        public string FileName { get; set; }

    }

}
