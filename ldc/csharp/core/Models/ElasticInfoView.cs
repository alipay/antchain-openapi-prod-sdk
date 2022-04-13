// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 弹性信息
    public class ElasticInfoView : TeaModel {
        // 全局弹性状态，有效值：NORMAL，ELASTIC
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 弹性值
        [NameInMap("elastic_values")]
        [Validation(Required=false)]
        public List<string> ElasticValues { get; set; }

        // 是否压测
        [NameInMap("press")]
        [Validation(Required=false)]
        public bool? Press { get; set; }

    }

}
