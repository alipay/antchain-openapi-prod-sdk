// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 发布应用信息
    public class ServiceInfo : TeaModel {
        // 应用名
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 部署单元 ID 列表
        [NameInMap("cell_ids")]
        [Validation(Required=false)]
        public List<string> CellIds { get; set; }

        // 默认执行账号
        [NameInMap("default_execute_account")]
        [Validation(Required=false)]
        public string DefaultExecuteAccount { get; set; }

        // 环境变量
        [NameInMap("env_config")]
        [Validation(Required=false)]
        public List<Pair> EnvConfig { get; set; }

        // 是否可以强制执行
        [NameInMap("force_executable")]
        [Validation(Required=false)]
        public bool? ForceExecutable { get; set; }

        // 灰度规则配置
        [NameInMap("gray_traffic_configs")]
        [Validation(Required=false)]
        public List<GrayTrafficConfig> GrayTrafficConfigs { get; set; }

        // 分组数
        [NameInMap("group_amount")]
        [Validation(Required=false)]
        public long? GroupAmount { get; set; }

        // 分组策略
        [NameInMap("group_strategy_type")]
        [Validation(Required=false)]
        public string GroupStrategyType { get; set; }

        // 从缓存安装
        [NameInMap("install_from_cache")]
        [Validation(Required=false)]
        public bool? InstallFromCache { get; set; }

        // 应用发布名
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 是否需要 beta
        [NameInMap("need_beta")]
        [Validation(Required=false)]
        public bool? NeedBeta { get; set; }

        // 是否需要灰度
        [NameInMap("need_gray_traffic")]
        [Validation(Required=false)]
        public bool? NeedGrayTraffic { get; set; }

        // 后置任务列表
        [NameInMap("post_arrangement_info")]
        [Validation(Required=false)]
        public List<ArrangementInfo> PostArrangementInfo { get; set; }

        // 前置任务列表
        [NameInMap("pre_arrangement_info")]
        [Validation(Required=false)]
        public List<ArrangementInfo> PreArrangementInfo { get; set; }

        // 发布概览
        [NameInMap("service_arrangement")]
        [Validation(Required=false)]
        public ArrangementInfo ServiceArrangement { get; set; }

        // 发布应用 ID
        [NameInMap("service_id")]
        [Validation(Required=false)]
        public string ServiceId { get; set; }

        // 静态资源下载链接
        [NameInMap("static_resource_download_url")]
        [Validation(Required=false)]
        public string StaticResourceDownloadUrl { get; set; }

        // 静态资源目标文件
        [NameInMap("static_resource_target_file")]
        [Validation(Required=false)]
        public string StaticResourceTargetFile { get; set; }

        // 类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 版本
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

        // 环境 ID
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // update_buildpack_version
        [NameInMap("update_buildpack_version")]
        [Validation(Required=false)]
        public string UpdateBuildpackVersion { get; set; }

        // update_buildpack_id
        [NameInMap("update_buildpack_id")]
        [Validation(Required=false)]
        public string UpdateBuildpackId { get; set; }

        // custom_params
        [NameInMap("custom_params")]
        [Validation(Required=false)]
        public string CustomParams { get; set; }

    }

}
