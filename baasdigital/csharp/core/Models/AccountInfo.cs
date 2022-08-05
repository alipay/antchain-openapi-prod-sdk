// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDIGITAL.Models
{
    // 发送交易时的账户信息，托管(推荐)和非托管(本地)必选其中一种
    public class AccountInfo : TeaModel {
        // 托管账户的账户名称，也是链上账户名称，交易发起方账户
        [NameInMap("account")]
        [Validation(Required=false)]
        public string Account { get; set; }

        // 托管账户对应的秘钥ID
        [NameInMap("kms_id")]
        [Validation(Required=false)]
        public string KmsId { get; set; }

        // 托管账户对应的租户ID，默认为空，如有使用其他租户的托管账户时需指定
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 非托管模式下必须输入，客户端构建交易出的信息，base64编码
        [NameInMap("sign_data")]
        [Validation(Required=false)]
        public string SignData { get; set; }

    }

}
