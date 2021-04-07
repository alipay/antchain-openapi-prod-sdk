// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class QueryBuildpackRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 技术栈版本
        [NameInMap("bp_version")]
        [Validation(Required=false)]
        public string BpVersion { get; set; }

        // 是否分页，默认为true
        [NameInMap("by_page")]
        [Validation(Required=false)]
        public bool? ByPage { get; set; }

        // 组件ID
        [NameInMap("component_id")]
        [Validation(Required=false)]
        public string ComponentId { get; set; }

        // 配置ID
        [NameInMap("config_id")]
        [Validation(Required=false)]
        public string ConfigId { get; set; }

        // 页码：默认值为1，表示第一页
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // 部署脚本id
        [NameInMap("deploy_script_id")]
        [Validation(Required=false)]
        public string DeployScriptId { get; set; }

        // 技术栈ID标识
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 是否包含模板
        [NameInMap("include_template")]
        [Validation(Required=false)]
        public bool? IncludeTemplate { get; set; }

        // 技术栈名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 每页返回个数
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 查询名称过滤方式
        // 模糊查询 FUZZY
        // 精准匹配 ACCURATE
        // 前缀查询 START_WITH
        [NameInMap("query_type")]
        [Validation(Required=false)]
        public string QueryType { get; set; }

        // 所属技术栈类别ID
        [NameInMap("stack_id")]
        [Validation(Required=false)]
        public string StackId { get; set; }

        // 技术栈状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 技术栈定义类型
        // 系统模板 TEMPLATE,
        // 用户自定义 CUSTOM,
        // 后台服务 BACKGROUND_SERVICE
        [NameInMap("types")]
        [Validation(Required=false)]
        public List<string> Types { get; set; }

        // 工作空间
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

    }

}
