// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_320bc483f2434f39a3af9ec9f04d3cc0.Models
{
    // 签署文件信息（包含印模和签署区域）
    public class CaSystemSignFileRequest : TeaModel {
        // 签署文件id,和签署文件列表fileId呼应
        [NameInMap("file_id")]
        [Validation(Required=false)]
        public string FileId { get; set; }

        // 签署文件列表（包含印模和签署区域）
        [NameInMap("system_sign_area_request_list")]
        [Validation(Required=true)]
        public List<CaSystemSignAreaRequest> SystemSignAreaRequestList { get; set; }

    }

}
