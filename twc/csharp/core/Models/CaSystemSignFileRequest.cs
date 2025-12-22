// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 法务电子签签署文件列表（包含印模和签署区域）
    public class CaSystemSignFileRequest : TeaModel {
        // 单次请求文件唯一id，与AntSignFileRequest中的fileId对应
        [NameInMap("file_id")]
        [Validation(Required=true)]
        public string FileId { get; set; }

        // 签署区域信息（包括印模信息）
        [NameInMap("ca_system_sign_area_request_list")]
        [Validation(Required=true)]
        public List<CaSystemSignAreaRequest> CaSystemSignAreaRequestList { get; set; }

    }

}
