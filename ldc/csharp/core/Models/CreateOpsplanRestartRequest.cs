// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class CreateOpsplanRestartRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 是否自动执行
        [NameInMap("auto_execute")]
        [Validation(Required=false)]
        public bool? AutoExecute { get; set; }

        // 运维单扩展信息，jsonStr格式
        [NameInMap("context")]
        [Validation(Required=false)]
        public string Context { get; set; }

        // 容器服务间依赖顺序。
        // e.g 先发 A，B， 再发C， D
        // {"groups": [{container_services: [{"name": A}, {"name": B}]}, {"container_services": [{"name": C}, {"name": D}]}]}
        [NameInMap("dependency")]
        [Validation(Required=false)]
        public OpsContainerServiceChain Dependency { get; set; }

        // 在具体分组策略下，每个执行单元（部署单元，机房等）内部的分组个数。
        [NameInMap("group_amount")]
        [Validation(Required=true)]
        public long? GroupAmount { get; set; }

        // 用户可自定义分组发布的顺序，结合具体的分组策略并通过指定具体分组维度对应的名称生效。
        // e.g, 当分组策略为机房时，可以指定先发机房A，再发机房B ["A", "B"]
        [NameInMap("group_orders")]
        [Validation(Required=false)]
        public List<string> GroupOrders { get; set; }

        // 分组策略（维度）
        // 按部署单元（CELL） - 按部署单元依次重启
        // 按机房（ZONE）- 按机房依次重启
        // 按逻辑单元（UNIT） - 按逻辑单元重启
        // 共分一组（ALL） - 所有容器一起重启，仍遵循分组个数控制
        [NameInMap("group_strategy")]
        [Validation(Required=true)]
        public string GroupStrategy { get; set; }

        // 是否需要beta卡点
        [NameInMap("need_beta")]
        [Validation(Required=true)]
        public bool? NeedBeta { get; set; }

        // 限定操作的部署单元
        [NameInMap("restricted_cells")]
        [Validation(Required=false)]
        public List<string> RestrictedCells { get; set; }

        // 限定操作的机房
        [NameInMap("restricted_zones")]
        [Validation(Required=false)]
        public List<string> RestrictedZones { get; set; }

        // 选定的容器服务列表
        [NameInMap("selected_container_services")]
        [Validation(Required=true)]
        public OpsContainerServiceGroup SelectedContainerServices { get; set; }

        // 重启单标题
        [NameInMap("title")]
        [Validation(Required=true)]
        public string Title { get; set; }

        // 工作空间组
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

        // 命名空间
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

    }

}
