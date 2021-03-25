// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 运维进程
    public class OpsProcessDefinition : TeaModel {
        // 描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 指令名称
        [NameInMap("instruction")]
        [Validation(Required=false)]
        public string Instruction { get; set; }

        // 进程名
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 运维类型
        [NameInMap("ops_type")]
        [Validation(Required=false)]
        public string OpsType { get; set; }

        // 发布单ID
        [NameInMap("plan_id")]
        [Validation(Required=false)]
        public string PlanId { get; set; }

        // 类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 概览信息
        [NameInMap("arrangements")]
        [Validation(Required=false)]
        public List<ArrangementInfo> Arrangements { get; set; }

        // 环境变量
        [NameInMap("env_config")]
        [Validation(Required=false)]
        public List<Pair> EnvConfig { get; set; }

        // 支持的状态转换列表
        [NameInMap("supported_transitions")]
        [Validation(Required=false)]
        public List<string> SupportedTransitions { get; set; }

        // 节点ID
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

        // 可独立执行
        [NameInMap("standalone_executable")]
        [Validation(Required=false)]
        public bool? StandaloneExecutable { get; set; }

        // ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

    }

}
