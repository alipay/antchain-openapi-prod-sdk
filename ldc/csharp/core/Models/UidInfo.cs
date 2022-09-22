// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // uid 信息
    public class UidInfo : TeaModel {
        // UID
        [NameInMap("uid")]
        [Validation(Required=true)]
        public long? Uid { get; set; }

        // 当前分组
        [NameInMap("current_group")]
        [Validation(Required=true)]
        public string CurrentGroup { get; set; }

        // 默认分组
        [NameInMap("default_group")]
        [Validation(Required=true)]
        public string DefaultGroup { get; set; }

        // 是否弹性
        [NameInMap("elastic")]
        [Validation(Required=false)]
        public bool? Elastic { get; set; }

        // 是否压测
        [NameInMap("press")]
        [Validation(Required=false)]
        public bool? Press { get; set; }

        // 是否灰度
        [NameInMap("gray")]
        [Validation(Required=false)]
        public bool? Gray { get; set; }

        // 单元分片容灾状态，枚举，NORMAL（正常）、LOCAL（同城容灾）、REMOTE（异地容灾）
        [NameInMap("disaster_state")]
        [Validation(Required=true)]
        public string DisasterState { get; set; }

    }

}
