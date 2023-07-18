// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 合同文件信息
    public class BclContractFileInfo : TeaModel {
        // 文件OSS Id
        [NameInMap("oss_file_id")]
        [Validation(Required=true, MaxLength=64)]
        public string OssFileId { get; set; }

        // 买家用户签署区信息
        [NameInMap("user_sign_fields")]
        [Validation(Required=true)]
        public List<BclSignField> UserSignFields { get; set; }

        // 租赁商家签署区信息
        [NameInMap("merchant_sign_fields")]
        [Validation(Required=false)]
        public List<BclSignField> MerchantSignFields { get; set; }

    }

}
