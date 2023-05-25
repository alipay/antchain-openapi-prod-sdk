// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    // 路径
    public class Path : TeaModel {
        // fixpath
        [NameInMap("fix_path")]
        [Validation(Required=false)]
        public FixPath FixPath { get; set; }

        // shibai lujing
        [NameInMap("failed_path")]
        [Validation(Required=false)]
        public string FailedPath { get; set; }

    }

}
