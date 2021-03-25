// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 逻辑单元
    public class CellGroup : TeaModel {
        // 包含部署单元列表
        [NameInMap("cells")]
        [Validation(Required=false)]
        public List<DeployCell> Cells { get; set; }

        // 机房名称
        [NameInMap("datacenter")]
        [Validation(Required=false)]
        public string Datacenter { get; set; }

        // 默认全局域
        [NameInMap("default_gzone")]
        [Validation(Required=false)]
        public string DefaultGzone { get; set; }

        // 逻辑单元灾备信息
        [NameInMap("disaster_info")]
        [Validation(Required=false)]
        public List<DisasterInfo> DisasterInfo { get; set; }

        // 修改时间
        [NameInMap("modified_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string ModifiedTime { get; set; }

        // 逻辑单元名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // 所属地域：CZone Group 必填
        [NameInMap("region")]
        [Validation(Required=false)]
        public string Region { get; set; }

        // 逻辑单元类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
