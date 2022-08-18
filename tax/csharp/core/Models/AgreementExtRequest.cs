// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    // 通用同步授权扩展字段
    public class AgreementExtRequest : TeaModel {
        // 证书类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 是否盖章，true：是 false：否
        [NameInMap("is_seal")]
        [Validation(Required=true)]
        public string IsSeal { get; set; }

        // 地址
        [NameInMap("address")]
        [Validation(Required=true)]
        public string Address { get; set; }

        // 授权文件信息
        [NameInMap("agreement_file")]
        [Validation(Required=false)]
        public AgreementFile AgreementFile { get; set; }

    }

}
