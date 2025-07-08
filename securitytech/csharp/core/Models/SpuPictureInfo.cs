// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // spu图片信息
    public class SpuPictureInfo : TeaModel {
        // spu主图url
        [NameInMap("main_pic")]
        [Validation(Required=true)]
        public string MainPic { get; set; }

        // spu详情图片url
        [NameInMap("detail_pic")]
        [Validation(Required=false)]
        public List<string> DetailPic { get; set; }

    }

}
