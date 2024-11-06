// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COLLABINV.Models
{
    // 特征集信息
    public class FeatureSetInfo : TeaModel {
        // 特征集编码
        [NameInMap("featureset_code")]
        [Validation(Required=true)]
        public string FeaturesetCode { get; set; }

        // 名称
        [NameInMap("featureset_name")]
        [Validation(Required=true)]
        public string FeaturesetName { get; set; }

        // 数量
        [NameInMap("nums")]
        [Validation(Required=true)]
        public string Nums { get; set; }

        // 描述
        [NameInMap("desc")]
        [Validation(Required=true)]
        public string Desc { get; set; }

    }

}
