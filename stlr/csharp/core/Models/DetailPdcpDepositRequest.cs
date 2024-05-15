// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class DetailPdcpDepositRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数据类型名称，用户标识记录的数据类型。
        [NameInMap("data_type")]
        [Validation(Required=true)]
        public string DataType { get; set; }

        // 存证数据ID，存证数据唯一标识ID。
        [NameInMap("data_id")]
        [Validation(Required=true)]
        public string DataId { get; set; }

        // 数据存证区块链交易ID，对应数据版本号。 若未指定，返回最近的版本。
        [NameInMap("tx_id")]
        [Validation(Required=false)]
        public string TxId { get; set; }

    }

}
