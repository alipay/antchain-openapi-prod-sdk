// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class UpdateContainerserviceJsonpatchRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 必填：保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符，且不能超过64个字符。
        [NameInMap("client_token")]
        [Validation(Required=true)]
        public string ClientToken { get; set; }

        // 应用服务名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 命名空间
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // 工作空间组
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

        // 应用服务版本，不传取最新的版本
        [NameInMap("revision")]
        [Validation(Required=false)]
        public string Revision { get; set; }

        // 操作人账号
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // json patch 内容
        [NameInMap("json_patches")]
        [Validation(Required=true)]
        public List<JsonPatch> JsonPatches { get; set; }

        // 配置为CLOUD_NATIVE_GROUP_RELEASE会自动创建发布单
        [NameInMap("ops_type")]
        [Validation(Required=false)]
        public string OpsType { get; set; }

        // 发布单类型，SLS_CHANGE代表只做sls配置变更
        [NameInMap("ops_mode")]
        [Validation(Required=false)]
        public string OpsMode { get; set; }

        // 部署策略
        [NameInMap("deploy_config")]
        [Validation(Required=false)]
        public DeployConfig DeployConfig { get; set; }

        // 是否自动执行发布单，默认 true
        [NameInMap("is_auto_execute")]
        [Validation(Required=false)]
        public bool? IsAutoExecute { get; set; }

        // 灰度平台pods分批序列化为json的结果	
        // 
        [NameInMap("graycore_batches")]
        [Validation(Required=false)]
        public string GraycoreBatches { get; set; }

        // [huanyu场景使用]huanyu变更单id
        [NameInMap("huanyu_exec_no")]
        [Validation(Required=false)]
        public string HuanyuExecNo { get; set; }

    }

}
