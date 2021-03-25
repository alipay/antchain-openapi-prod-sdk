// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 机器分组
    public class MachineGroup : TeaModel {
        // 机器名
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 所属发布服务 ID
        [NameInMap("service_id")]
        [Validation(Required=false)]
        public string ServiceId { get; set; }

        // 所属发布服务分组 ID
        [NameInMap("service_group_id")]
        [Validation(Required=false)]
        public string ServiceGroupId { get; set; }

        // 发布服务分组集合 ID
        [NameInMap("service_group_collection_id")]
        [Validation(Required=false)]
        public string ServiceGroupCollectionId { get; set; }

        // 概览 ID
        [NameInMap("arrangement_id")]
        [Validation(Required=false)]
        public string ArrangementId { get; set; }

        // 服务类型
        [NameInMap("service_type")]
        [Validation(Required=false)]
        public string ServiceType { get; set; }

        // paas 服务 ID
        [NameInMap("paas_service_id")]
        [Validation(Required=false)]
        public string PaasServiceId { get; set; }

        // 是否 beta 分组
        [NameInMap("need_beta")]
        [Validation(Required=false)]
        public bool? NeedBeta { get; set; }

        // 是否需要确认
        [NameInMap("need_confirm")]
        [Validation(Required=false)]
        public bool? NeedConfirm { get; set; }

        // 是否需要分组预确认
        [NameInMap("need_reserve")]
        [Validation(Required=false)]
        public bool? NeedReserve { get; set; }

        // 是否需要引流确认
        [NameInMap("need_confirm_traffic")]
        [Validation(Required=false)]
        public bool? NeedConfirmTraffic { get; set; }

        // 机器信息组
        [NameInMap("machines")]
        [Validation(Required=false)]
        public List<Machine> Machines { get; set; }

        // pd id
        [NameInMap("process_definition_id")]
        [Validation(Required=false)]
        public string ProcessDefinitionId { get; set; }

        // 父节点 ID
        [NameInMap("parent_id")]
        [Validation(Required=false)]
        public string ParentId { get; set; }

        // 父节点类型
        [NameInMap("parent_entity_type")]
        [Validation(Required=false)]
        public string ParentEntityType { get; set; }

        // 流程节点 ID
        [NameInMap("node_id")]
        [Validation(Required=false)]
        public string NodeId { get; set; }

        // 状态
        [NameInMap("state")]
        [Validation(Required=false)]
        public string State { get; set; }

        // 开始时间
        [NameInMap("started_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string StartedTime { get; set; }

        // 结束时间
        [NameInMap("finished_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string FinishedTime { get; set; }

        // 是否可以独立执行
        [NameInMap("standalone_executable")]
        [Validation(Required=false)]
        public bool? StandaloneExecutable { get; set; }

        // ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

    }

}
