// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class CheckPdcpDtraceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 存证数据类型名称
        [NameInMap("data_type")]
        [Validation(Required=true)]
        public string DataType { get; set; }

        // 存证数据ID
        [NameInMap("data_id")]
        [Validation(Required=true)]
        public string DataId { get; set; }

        // 存证操作区块链交易ID，即存证数据版本号。若未指定，检查当前最新版本。
        [NameInMap("tx_id")]
        [Validation(Required=false)]
        public string TxId { get; set; }

    }

}
