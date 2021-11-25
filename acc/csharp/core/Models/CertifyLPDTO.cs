// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    // 法人认证信息
    public class CertifyLPDTO : TeaModel {
        // 认证id
        [NameInMap("certify_id")]
        [Validation(Required=true)]
        public string CertifyId { get; set; }

        // 二维码url
        [NameInMap("qr_url")]
        [Validation(Required=true)]
        public string QrUrl { get; set; }

        //  二维码中的Logo的图片地址
        [NameInMap("img_url")]
        [Validation(Required=true)]
        public string ImgUrl { get; set; }

        //  二维码中Logo缩放的比例系数，如5表示长宽最小值的1/5
        [NameInMap("ratio")]
        [Validation(Required=true)]
        public string Ratio { get; set; }

        // 过期时间戳，单位毫秒
        [NameInMap("expires")]
        [Validation(Required=true)]
        public long? Expires { get; set; }

    }

}
