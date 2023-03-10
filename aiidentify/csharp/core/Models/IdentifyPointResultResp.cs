// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AIIDENTIFY.Models
{
    // 鉴定点结果
    public class IdentifyPointResultResp : TeaModel {
        // 234
        [NameInMap("identify_point_name")]
        [Validation(Required=true)]
        public string IdentifyPointName { get; set; }

        // 鉴定点唯一编号
        [NameInMap("identify_point_code")]
        [Validation(Required=true)]
        public string IdentifyPointCode { get; set; }

        // 鉴定点图片
        [NameInMap("identify_point_img")]
        [Validation(Required=true)]
        public string IdentifyPointImg { get; set; }

        // 鉴定点的鉴定结果
        // SUCCESS：符合鉴定标准
        // FAILED：不符合鉴定标准
        // NOT_IDENTIFY：无法鉴定
        [NameInMap("identify_point_result")]
        [Validation(Required=true)]
        public string IdentifyPointResult { get; set; }

    }

}
