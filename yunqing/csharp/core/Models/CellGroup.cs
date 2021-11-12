// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // LDC下的CellGroup
    public class CellGroup : TeaModel {
        // cellGroup的id
        [NameInMap("cell_group_id")]
        [Validation(Required=true)]
        public string CellGroupId { get; set; }

        // 默认gzone cell的id
        [NameInMap("default_gzone")]
        [Validation(Required=false)]
        public string DefaultGzone { get; set; }

        // 是否弹性
        [NameInMap("elastic")]
        [Validation(Required=false)]
        public bool? Elastic { get; set; }

        // cellGroup的名字
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 暂时不知道啥意思
        [NameInMap("normal_drstat")]
        [Validation(Required=false)]
        public string NormalDrstat { get; set; }

        // 暂时不知道啥意思
        [NameInMap("press_drstat")]
        [Validation(Required=false)]
        public string PressDrstat { get; set; }

        // LDC下cellGroup的类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 显示的名字
        [NameInMap("display_name")]
        [Validation(Required=true)]
        public string DisplayName { get; set; }

    }

}
