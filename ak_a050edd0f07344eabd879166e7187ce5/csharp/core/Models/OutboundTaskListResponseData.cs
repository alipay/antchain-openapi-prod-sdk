// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_a050edd0f07344eabd879166e7187ce5.Models
{
    // 任务列表返回体
    public class OutboundTaskListResponseData : TeaModel {
        // 任务数据库id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 任务名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 任务id
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        // 流程前端id/流程code
        [NameInMap("flow_feld")]
        [Validation(Required=false)]
        public string FlowFeld { get; set; }

        // 流程id
        [NameInMap("flow_id")]
        [Validation(Required=false)]
        public long? FlowId { get; set; }

        // 流程名称
        [NameInMap("flow_name")]
        [Validation(Required=false)]
        public string FlowName { get; set; }

        // 流程环境区分
        // PRE——预发
        // PUB——线上
        [NameInMap("flow_env")]
        [Validation(Required=false)]
        public string FlowEnv { get; set; }

        // 规则id
        [NameInMap("rule_id")]
        [Validation(Required=false)]
        public long? RuleId { get; set; }

        // 规则名称
        [NameInMap("rule_name")]
        [Validation(Required=false)]
        public string RuleName { get; set; }

        // 状态
        // USING-启用
        // UNUSED-不启用
        // DELETED-已删除
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 当前任务版本号
        [NameInMap("version")]
        [Validation(Required=false)]
        public long? Version { get; set; }

        // 当前引用流程版本号
        [NameInMap("flow_version")]
        [Validation(Required=false)]
        public long? FlowVersion { get; set; }

        // 流程最新的版本号
        [NameInMap("flow_latest_version")]
        [Validation(Required=false)]
        public long? FlowLatestVersion { get; set; }

        // 当前引用规则版本号
        [NameInMap("rule_version")]
        [Validation(Required=false)]
        public long? RuleVersion { get; set; }

        // 规则最新的版本号
        [NameInMap("rule_latest_version")]
        [Validation(Required=false)]
        public long? RuleLatestVersion { get; set; }

        // 任务最新的版本号
        [NameInMap("latest_version")]
        [Validation(Required=false)]
        public long? LatestVersion { get; set; }

        // 任务线上版本号
        [NameInMap("pub_version")]
        [Validation(Required=false)]
        public long? PubVersion { get; set; }

        // 任务是否在发布流程中
        [NameInMap("publishing")]
        [Validation(Required=true)]
        public bool? Publishing { get; set; }

    }

}
