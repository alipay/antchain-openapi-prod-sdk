// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 数据资产分页查询
    public class ListDataEntityResult : TeaModel {
        // 数据模型信息
        [NameInMap("data_model")]
        [Validation(Required=true)]
        public DataModel DataModel { get; set; }

        // 数据资产信息
        [NameInMap("data_entity")]
        [Validation(Required=true)]
        public DataEntity DataEntity { get; set; }

    }

}
