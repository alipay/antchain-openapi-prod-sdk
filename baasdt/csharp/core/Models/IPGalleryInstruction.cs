// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // IP图库记录
    public class IPGalleryInstruction : TeaModel {
        // 下载时间
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public long? Timestamp { get; set; }

        // 授权订单ID
        [NameInMap("ip_order_id")]
        [Validation(Required=true)]
        public string IpOrderId { get; set; }

        // IP链上ID
        [NameInMap("ip_id")]
        [Validation(Required=true)]
        public string IpId { get; set; }

        // 图库链接
        [NameInMap("ip_gallery_url")]
        [Validation(Required=true)]
        public string IpGalleryUrl { get; set; }

        // 图库下载链接，默认过期时间2小时
        [NameInMap("ip_gallery_temporary_url")]
        [Validation(Required=true)]
        public string IpGalleryTemporaryUrl { get; set; }

        // 图库版本
        [NameInMap("ip_gallery_version")]
        [Validation(Required=true)]
        public long? IpGalleryVersion { get; set; }

        // IP当前图库状态：0 生效中，1 已失效
        [NameInMap("ip_gallery_status")]
        [Validation(Required=true)]
        public long? IpGalleryStatus { get; set; }

        // 备注信息
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

    }

}
