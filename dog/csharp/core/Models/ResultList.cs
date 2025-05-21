// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DOG.Models
{
    // aone  返回结构
    public class ResultList : TeaModel {
        // 返回结果
        [NameInMap("result")]
        [Validation(Required=true)]
        public DogHome Result { get; set; }

    }

}
