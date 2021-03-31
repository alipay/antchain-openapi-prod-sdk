// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 链上hash
    public class TxDto : TeaModel {
        // 链上凭证
        [NameInMap("tx_code")]
        [Validation(Required=true)]
        public string TxCode { get; set; }

        // 链上存储结构对应类型
        [NameInMap("data_type")]
        [Validation(Required=true)]
        public string DataType { get; set; }

    }

}
