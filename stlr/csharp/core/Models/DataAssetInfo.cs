// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 数据资产信息
    public class DataAssetInfo : TeaModel {
        // 数据资产DID
        [NameInMap("dataset_did")]
        [Validation(Required=true)]
        public string DatasetDid { get; set; }

        // 数据资产所有方DID
        [NameInMap("user_did")]
        [Validation(Required=true)]
        public string UserDid { get; set; }

        // 数据资产名称
        [NameInMap("dataset_name")]
        [Validation(Required=true)]
        public string DatasetName { get; set; }

        // 数据类型
        [NameInMap("data_type")]
        [Validation(Required=true)]
        public string DataType { get; set; }

    }

}
