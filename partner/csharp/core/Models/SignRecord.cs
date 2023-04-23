// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PARTNER.Models
{
    // 签约记录
    public class SignRecord : TeaModel {
        // 合同类型：标准、自定义
        [NameInMap("contract_type")]
        [Validation(Required=true)]
        public string ContractType { get; set; }

        // 签约模式：ENTITY_SEAL（实体章）、ELECTRONIC_SEAL（电子章）
        [NameInMap("seal_mode")]
        [Validation(Required=true)]
        public string SealMode { get; set; }

        // 签约状态
        [NameInMap("sign_status")]
        [Validation(Required=true)]
        public string SignStatus { get; set; }

        // 签约记录关联的文件信息
        [NameInMap("files")]
        [Validation(Required=true)]
        public List<PartnerSignFile> Files { get; set; }

    }

}
