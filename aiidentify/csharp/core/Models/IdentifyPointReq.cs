// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AIIDENTIFY.Models
{
    // 提交AI鉴定时鉴定点信息
    public class IdentifyPointReq : TeaModel {
        // 鉴定点名称
        [NameInMap("identify_point_name")]
        [Validation(Required=true)]
        public string IdentifyPointName { get; set; }

        // 鉴定点编号
        [NameInMap("identify_point_code")]
        [Validation(Required=true)]
        public string IdentifyPointCode { get; set; }

        // 鉴定商品此鉴定点的图片
        [NameInMap("identify_point_img")]
        [Validation(Required=true)]
        public string IdentifyPointImg { get; set; }

    }

}
