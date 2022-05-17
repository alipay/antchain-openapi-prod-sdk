// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 应用画像应用节点列表结构体
    public class AppPortraitAppNodeList : TeaModel {
        // 返回ecs节点数据
        [NameInMap("ecs")]
        [Validation(Required=false)]
        public List<AppPortraitAppNodeEcsList> Ecs { get; set; }

        // 返回slb节点数据
        [NameInMap("slb")]
        [Validation(Required=false)]
        public AppPortraitAppNodeEcsList Slb { get; set; }

        // 返回rds节点数据
        [NameInMap("rds")]
        [Validation(Required=false)]
        public AppPortraitAppNodeEcsList Rds { get; set; }

        // 返回pod节点数据
        [NameInMap("pod")]
        [Validation(Required=false)]
        public AppPortraitAppNodeEcsList Pod { get; set; }

    }

}
