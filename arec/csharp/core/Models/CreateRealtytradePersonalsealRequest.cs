// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AREC.Models
{
    public class CreateRealtytradePersonalsealRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 个人在数字房产平台的唯一ID
        [NameInMap("personal_id")]
        [Validation(Required=true)]
        public string PersonalId { get; set; }

        // 图片data，BASE64 编码后图片信息，图片原始格式必须为 png
        [NameInMap("picture_data")]
        [Validation(Required=true)]
        public string PictureData { get; set; }

        // 印章高度，单位为px，默认95
        [NameInMap("seal_height")]
        [Validation(Required=false)]
        public long? SealHeight { get; set; }

        // 印章宽度，单位为px，默认95
        [NameInMap("seal_width")]
        [Validation(Required=false)]
        public long? SealWidth { get; set; }

        // 否对图片进行透明化处理，默认false。仅对图片整体做透明化处理，无法去除图片背景。
        [NameInMap("transparentizing")]
        [Validation(Required=false)]
        public bool? Transparentizing { get; set; }

    }

}
