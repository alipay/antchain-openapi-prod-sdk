// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    // 物证信息
    public class EvidenceInfo : TeaModel {
        // 自定义序列
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public long? BizId { get; set; }

        // 资产id
        [NameInMap("asset_id")]
        [Validation(Required=false)]
        public string AssetId { get; set; }

        // 请求信息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 创建是否成功
        [NameInMap("success")]
        [Validation(Required=true)]
        public bool? Success { get; set; }

        // 短码
        [NameInMap("qr_code")]
        [Validation(Required=false)]
        public string QrCode { get; set; }

    }

}
