// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // MCC信息(https://gw.alipayobjects.com/os/bmw-prod/05c9a32e-42d1-436b-ace7-13101d91f672.xlsx）
    public class IPMCC : TeaModel {
        // MCC编码
        [NameInMap("mcc_code")]
        [Validation(Required=true)]
        public string MccCode { get; set; }

        // 经营类目一级
        [NameInMap("category_level1")]
        [Validation(Required=true)]
        public string CategoryLevel1 { get; set; }

        // 经营类目二级
        [NameInMap("category_level2")]
        [Validation(Required=true)]
        public string CategoryLevel2 { get; set; }

        // 经营类目三级
        [NameInMap("category_level3")]
        [Validation(Required=true)]
        public string CategoryLevel3 { get; set; }

    }

}
