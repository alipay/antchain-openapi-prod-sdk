// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 部署单元
    public class DeployCell : TeaModel {
        // 所属逻辑单元名称[单元化模式特有]
        [NameInMap("cell_group")]
        [Validation(Required=false)]
        public string CellGroup { get; set; }

        // 所属集群	
        // 
        [NameInMap("cluster")]
        [Validation(Required=false)]
        public string Cluster { get; set; }

        // 蓝绿着色信息[单元化模式特有]
        [NameInMap("color")]
        [Validation(Required=false)]
        public string Color { get; set; }

        // 创建时间
        [NameInMap("created_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string CreatedTime { get; set; }

        // cell名称，与name一样，为了兼容已有代码
        [NameInMap("display_name")]
        [Validation(Required=false)]
        public string DisplayName { get; set; }

        // 部署单元标识，创建之后不允许修改
        [NameInMap("identity")]
        [Validation(Required=false)]
        public string Identity { get; set; }

        // 是否灰度[单元化模式特有]
        [NameInMap("is_gray")]
        [Validation(Required=false)]
        public bool? IsGray { get; set; }

        // 部署单元名称，主要用作页面展示
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 压测权重
        [NameInMap("press_weight")]
        [Validation(Required=false)]
        public long? PressWeight { get; set; }

        // 部署单元类型[单元化模式特有]
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 默认权重[单元化模式特有]
        [NameInMap("weight")]
        [Validation(Required=false)]
        public long? Weight { get; set; }

        // 所属工作空间名称
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

        // 所属机房名称
        [NameInMap("zone")]
        [Validation(Required=false)]
        public string Zone { get; set; }

        // cell id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

    }

}
