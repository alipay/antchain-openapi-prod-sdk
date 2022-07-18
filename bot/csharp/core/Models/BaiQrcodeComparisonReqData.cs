// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 溯源码比对请求体
    public class BaiQrcodeComparisonReqData : TeaModel {
        // 扫码操作id，多次请求的trace_id相同代表短时间内在扫同一个码
        [NameInMap("trace_id")]
        [Validation(Required=true, MaxLength=128)]
        public string TraceId { get; set; }

        // query图片定位信息
        [NameInMap("query_image_location")]
        [Validation(Required=true)]
        public BaiResourceLocation QueryImageLocation { get; set; }

        // gallery图片定位信息
        [NameInMap("gallery_image_location")]
        [Validation(Required=true)]
        public BaiResourceLocation GalleryImageLocation { get; set; }

        // 是否允许降级
        [NameInMap("downgrade")]
        [Validation(Required=true)]
        public bool? Downgrade { get; set; }

    }

}
