// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 机器信息
    public class Machine : TeaModel {
        // 机器名
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 所属发布服务id
        [NameInMap("service_id")]
        [Validation(Required=false)]
        public string ServiceId { get; set; }

        // 包版本
        [NameInMap("service_package_version")]
        [Validation(Required=false)]
        public string ServicePackageVersion { get; set; }

        // 应用服务分组集合 ID
        [NameInMap("service_group_collection_id")]
        [Validation(Required=false)]
        public string ServiceGroupCollectionId { get; set; }

        // 发布分组 ID
        [NameInMap("service_group_id")]
        [Validation(Required=false)]
        public string ServiceGroupId { get; set; }

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

        // paas 状态
        [NameInMap("paas_state")]
        [Validation(Required=false)]
        public string PaasState { get; set; }

        // 关联目标 ID
        [NameInMap("ref_target_id")]
        [Validation(Required=false)]
        public string RefTargetId { get; set; }

        // 目标 iaas id
        [NameInMap("target_iaas_id")]
        [Validation(Required=false)]
        public string TargetIaasId { get; set; }

        // 内网 IP
        [NameInMap("inner_ip")]
        [Validation(Required=false)]
        public string InnerIp { get; set; }

        // 公网 IP
        [NameInMap("public_ip")]
        [Validation(Required=false)]
        public string PublicIp { get; set; }

        // 主机名
        [NameInMap("host_name")]
        [Validation(Required=false)]
        public string HostName { get; set; }

        // 主机域名
        [NameInMap("host_domain")]
        [Validation(Required=false)]
        public string HostDomain { get; set; }

        // 安全组ID
        [NameInMap("security_domain_id")]
        [Validation(Required=false)]
        public string SecurityDomainId { get; set; }

        // 安全组创建人 ID
        [NameInMap("security_domain_creator_id")]
        [Validation(Required=false)]
        public string SecurityDomainCreatorId { get; set; }

        // 安全组名
        [NameInMap("security_domain_name")]
        [Validation(Required=false)]
        public string SecurityDomainName { get; set; }

        // 默认执行账号
        [NameInMap("default_execute_account")]
        [Validation(Required=false)]
        public string DefaultExecuteAccount { get; set; }

        // 可用区 ID
        [NameInMap("zone_id")]
        [Validation(Required=false)]
        public string ZoneId { get; set; }

        // 部署单元 ID
        [NameInMap("cell_id")]
        [Validation(Required=false)]
        public string CellId { get; set; }

        // 用户名
        [NameInMap("username")]
        [Validation(Required=false)]
        public string Username { get; set; }

        // 加密密码
        [NameInMap("encoded_pwd")]
        [Validation(Required=false)]
        public string EncodedPwd { get; set; }

        // 加密秘钥
        [NameInMap("encoded_secrey_key")]
        [Validation(Required=false)]
        public string EncodedSecreyKey { get; set; }

        // 公钥
        [NameInMap("public_key")]
        [Validation(Required=false)]
        public string PublicKey { get; set; }

        // star manage ip
        [NameInMap("star_manager_ip")]
        [Validation(Required=false)]
        public string StarManagerIp { get; set; }

        // star manager port
        [NameInMap("star_manager_port")]
        [Validation(Required=false)]
        public long? StarManagerPort { get; set; }

        // 初始化脚本 url
        [NameInMap("script_url")]
        [Validation(Required=false)]
        public string ScriptUrl { get; set; }

        // 特殊初始化脚本 url
        [NameInMap("special_script_url")]
        [Validation(Required=false)]
        public string SpecialScriptUrl { get; set; }

        // 代理 url
        [NameInMap("agent_url")]
        [Validation(Required=false)]
        public string AgentUrl { get; set; }

        // 代理设置 url
        [NameInMap("agent_setup_url")]
        [Validation(Required=false)]
        public string AgentSetupUrl { get; set; }

        // 机器初始 url
        [NameInMap("machine_init_url")]
        [Validation(Required=false)]
        public string MachineInitUrl { get; set; }

        // 特殊机器初始 url
        [NameInMap("special_machine_init_url")]
        [Validation(Required=false)]
        public string SpecialMachineInitUrl { get; set; }

        // 控制类型
        [NameInMap("control_type")]
        [Validation(Required=false)]
        public string ControlType { get; set; }

        // 控制对象
        [NameInMap("control_target")]
        [Validation(Required=false)]
        public string ControlTarget { get; set; }

        // 是否需要初始化
        [NameInMap("need_initialize")]
        [Validation(Required=false)]
        public bool? NeedInitialize { get; set; }

        // SLB 信息
        [NameInMap("slb_info_list")]
        [Validation(Required=false)]
        public List<SLBInfo> SlbInfoList { get; set; }

        // 子任务 id 
        [NameInMap("task_ids")]
        [Validation(Required=false)]
        public List<string> TaskIds { get; set; }

        // 环境变量
        [NameInMap("env_config")]
        [Validation(Required=false)]
        public List<Pair> EnvConfig { get; set; }

        // pd id
        [NameInMap("process_definition_id")]
        [Validation(Required=false)]
        public string ProcessDefinitionId { get; set; }

        // 父节点 id
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

        // 是否可独立执行
        [NameInMap("standalone_executable")]
        [Validation(Required=false)]
        public bool? StandaloneExecutable { get; set; }

        // ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

    }

}
