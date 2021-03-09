// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 技术栈
    public class Buildpack : TeaModel {
        // 技术栈标识ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 技术栈名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 技术栈描述
        [NameInMap("des")]
        [Validation(Required=false)]
        public string Des { get; set; }

        // 技术栈版本
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

        // 技术栈类别
        [NameInMap("stack")]
        [Validation(Required=false)]
        public string Stack { get; set; }

        // 部署脚本id
        [NameInMap("deploy_script_id")]
        [Validation(Required=false)]
        public string DeployScriptId { get; set; }

        // 构建脚本ID
        [NameInMap("build_script_id")]
        [Validation(Required=false)]
        public string BuildScriptId { get; set; }

        // 配置id
        [NameInMap("config_id")]
        [Validation(Required=false)]
        public string ConfigId { get; set; }

        // 组件id
        [NameInMap("component_id")]
        [Validation(Required=false)]
        public string ComponentId { get; set; }

        // 命令id
        [NameInMap("command_id")]
        [Validation(Required=false)]
        public string CommandId { get; set; }

        // 启用蓝绿
        [NameInMap("bg_enable")]
        [Validation(Required=false)]
        public bool? BgEnable { get; set; }

        // 创建人
        [NameInMap("creator")]
        [Validation(Required=false)]
        public string Creator { get; set; }

        // 租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 客户id列表
        [NameInMap("customer_ids")]
        [Validation(Required=false)]
        public List<string> CustomerIds { get; set; }

        // 技术栈定义类型
        // 系统模板 TEMPLATE
        // 用户自定义 CUSTOM
        // 后台服务 BACKGROUND_SERVICE
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 技术栈状态
        // 草稿 DRAFT
        // 已提交 COMMITED 
        // 已对外发布 PUBLISHED
        // 已退役 RETIRED
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 创建日期
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string GmtCreate { get; set; }

        // 最近修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string GmtModified { get; set; }

        // 技术栈信息汇总
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 可用 USABLE
        // 不可用 UNUSABLE
        [NameInMap("version_status")]
        [Validation(Required=false)]
        public string VersionStatus { get; set; }

        // 运行时属性
        [NameInMap("instances")]
        [Validation(Required=false)]
        public BuildpackInstances Instances { get; set; }

    }

}
