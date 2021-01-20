<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\SLBInfo;
use AntChain\Deps\Models\Pair;

class Machine extends Model {
    protected $_name = [
        'name' => 'name',
        'serviceId' => 'service_id',
        'servicePackageVersion' => 'service_package_version',
        'serviceGroupCollectionId' => 'service_group_collection_id',
        'serviceGroupId' => 'service_group_id',
        'arrangementId' => 'arrangement_id',
        'serviceType' => 'service_type',
        'paasServiceId' => 'paas_service_id',
        'paasState' => 'paas_state',
        'refTargetId' => 'ref_target_id',
        'targetIaasId' => 'target_iaas_id',
        'innerIp' => 'inner_ip',
        'publicIp' => 'public_ip',
        'hostName' => 'host_name',
        'hostDomain' => 'host_domain',
        'securityDomainId' => 'security_domain_id',
        'securityDomainCreatorId' => 'security_domain_creator_id',
        'securityDomainName' => 'security_domain_name',
        'defaultExecuteAccount' => 'default_execute_account',
        'zoneId' => 'zone_id',
        'cellId' => 'cell_id',
        'username' => 'username',
        'encodedPwd' => 'encoded_pwd',
        'encodedSecreyKey' => 'encoded_secrey_key',
        'publicKey' => 'public_key',
        'starManagerIp' => 'star_manager_ip',
        'starManagerPort' => 'star_manager_port',
        'scriptUrl' => 'script_url',
        'specialScriptUrl' => 'special_script_url',
        'agentUrl' => 'agent_url',
        'agentSetupUrl' => 'agent_setup_url',
        'machineInitUrl' => 'machine_init_url',
        'specialMachineInitUrl' => 'special_machine_init_url',
        'controlType' => 'control_type',
        'controlTarget' => 'control_target',
        'needInitialize' => 'need_initialize',
        'slbInfoList' => 'slb_info_list',
        'taskIds' => 'task_ids',
        'envConfig' => 'env_config',
        'processDefinitionId' => 'process_definition_id',
        'parentId' => 'parent_id',
        'parentEntityType' => 'parent_entity_type',
        'nodeId' => 'node_id',
        'state' => 'state',
        'startedTime' => 'started_time',
        'finishedTime' => 'finished_time',
        'standaloneExecutable' => 'standalone_executable',
        'id' => 'id',
    ];
    public function validate() {
        Model::validatePattern('startedTime', $this->startedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('finishedTime', $this->finishedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->serviceId) {
            $res['service_id'] = $this->serviceId;
        }
        if (null !== $this->servicePackageVersion) {
            $res['service_package_version'] = $this->servicePackageVersion;
        }
        if (null !== $this->serviceGroupCollectionId) {
            $res['service_group_collection_id'] = $this->serviceGroupCollectionId;
        }
        if (null !== $this->serviceGroupId) {
            $res['service_group_id'] = $this->serviceGroupId;
        }
        if (null !== $this->arrangementId) {
            $res['arrangement_id'] = $this->arrangementId;
        }
        if (null !== $this->serviceType) {
            $res['service_type'] = $this->serviceType;
        }
        if (null !== $this->paasServiceId) {
            $res['paas_service_id'] = $this->paasServiceId;
        }
        if (null !== $this->paasState) {
            $res['paas_state'] = $this->paasState;
        }
        if (null !== $this->refTargetId) {
            $res['ref_target_id'] = $this->refTargetId;
        }
        if (null !== $this->targetIaasId) {
            $res['target_iaas_id'] = $this->targetIaasId;
        }
        if (null !== $this->innerIp) {
            $res['inner_ip'] = $this->innerIp;
        }
        if (null !== $this->publicIp) {
            $res['public_ip'] = $this->publicIp;
        }
        if (null !== $this->hostName) {
            $res['host_name'] = $this->hostName;
        }
        if (null !== $this->hostDomain) {
            $res['host_domain'] = $this->hostDomain;
        }
        if (null !== $this->securityDomainId) {
            $res['security_domain_id'] = $this->securityDomainId;
        }
        if (null !== $this->securityDomainCreatorId) {
            $res['security_domain_creator_id'] = $this->securityDomainCreatorId;
        }
        if (null !== $this->securityDomainName) {
            $res['security_domain_name'] = $this->securityDomainName;
        }
        if (null !== $this->defaultExecuteAccount) {
            $res['default_execute_account'] = $this->defaultExecuteAccount;
        }
        if (null !== $this->zoneId) {
            $res['zone_id'] = $this->zoneId;
        }
        if (null !== $this->cellId) {
            $res['cell_id'] = $this->cellId;
        }
        if (null !== $this->username) {
            $res['username'] = $this->username;
        }
        if (null !== $this->encodedPwd) {
            $res['encoded_pwd'] = $this->encodedPwd;
        }
        if (null !== $this->encodedSecreyKey) {
            $res['encoded_secrey_key'] = $this->encodedSecreyKey;
        }
        if (null !== $this->publicKey) {
            $res['public_key'] = $this->publicKey;
        }
        if (null !== $this->starManagerIp) {
            $res['star_manager_ip'] = $this->starManagerIp;
        }
        if (null !== $this->starManagerPort) {
            $res['star_manager_port'] = $this->starManagerPort;
        }
        if (null !== $this->scriptUrl) {
            $res['script_url'] = $this->scriptUrl;
        }
        if (null !== $this->specialScriptUrl) {
            $res['special_script_url'] = $this->specialScriptUrl;
        }
        if (null !== $this->agentUrl) {
            $res['agent_url'] = $this->agentUrl;
        }
        if (null !== $this->agentSetupUrl) {
            $res['agent_setup_url'] = $this->agentSetupUrl;
        }
        if (null !== $this->machineInitUrl) {
            $res['machine_init_url'] = $this->machineInitUrl;
        }
        if (null !== $this->specialMachineInitUrl) {
            $res['special_machine_init_url'] = $this->specialMachineInitUrl;
        }
        if (null !== $this->controlType) {
            $res['control_type'] = $this->controlType;
        }
        if (null !== $this->controlTarget) {
            $res['control_target'] = $this->controlTarget;
        }
        if (null !== $this->needInitialize) {
            $res['need_initialize'] = $this->needInitialize;
        }
        if (null !== $this->slbInfoList) {
            $res['slb_info_list'] = [];
            if(null !== $this->slbInfoList && is_array($this->slbInfoList)){
                $n = 0;
                foreach($this->slbInfoList as $item){
                    $res['slb_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->taskIds) {
            $res['task_ids'] = $this->taskIds;
        }
        if (null !== $this->envConfig) {
            $res['env_config'] = [];
            if(null !== $this->envConfig && is_array($this->envConfig)){
                $n = 0;
                foreach($this->envConfig as $item){
                    $res['env_config'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->processDefinitionId) {
            $res['process_definition_id'] = $this->processDefinitionId;
        }
        if (null !== $this->parentId) {
            $res['parent_id'] = $this->parentId;
        }
        if (null !== $this->parentEntityType) {
            $res['parent_entity_type'] = $this->parentEntityType;
        }
        if (null !== $this->nodeId) {
            $res['node_id'] = $this->nodeId;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->startedTime) {
            $res['started_time'] = $this->startedTime;
        }
        if (null !== $this->finishedTime) {
            $res['finished_time'] = $this->finishedTime;
        }
        if (null !== $this->standaloneExecutable) {
            $res['standalone_executable'] = $this->standaloneExecutable;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Machine
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['service_id'])){
            $model->serviceId = $map['service_id'];
        }
        if(isset($map['service_package_version'])){
            $model->servicePackageVersion = $map['service_package_version'];
        }
        if(isset($map['service_group_collection_id'])){
            $model->serviceGroupCollectionId = $map['service_group_collection_id'];
        }
        if(isset($map['service_group_id'])){
            $model->serviceGroupId = $map['service_group_id'];
        }
        if(isset($map['arrangement_id'])){
            $model->arrangementId = $map['arrangement_id'];
        }
        if(isset($map['service_type'])){
            $model->serviceType = $map['service_type'];
        }
        if(isset($map['paas_service_id'])){
            $model->paasServiceId = $map['paas_service_id'];
        }
        if(isset($map['paas_state'])){
            $model->paasState = $map['paas_state'];
        }
        if(isset($map['ref_target_id'])){
            $model->refTargetId = $map['ref_target_id'];
        }
        if(isset($map['target_iaas_id'])){
            $model->targetIaasId = $map['target_iaas_id'];
        }
        if(isset($map['inner_ip'])){
            $model->innerIp = $map['inner_ip'];
        }
        if(isset($map['public_ip'])){
            $model->publicIp = $map['public_ip'];
        }
        if(isset($map['host_name'])){
            $model->hostName = $map['host_name'];
        }
        if(isset($map['host_domain'])){
            $model->hostDomain = $map['host_domain'];
        }
        if(isset($map['security_domain_id'])){
            $model->securityDomainId = $map['security_domain_id'];
        }
        if(isset($map['security_domain_creator_id'])){
            $model->securityDomainCreatorId = $map['security_domain_creator_id'];
        }
        if(isset($map['security_domain_name'])){
            $model->securityDomainName = $map['security_domain_name'];
        }
        if(isset($map['default_execute_account'])){
            $model->defaultExecuteAccount = $map['default_execute_account'];
        }
        if(isset($map['zone_id'])){
            $model->zoneId = $map['zone_id'];
        }
        if(isset($map['cell_id'])){
            $model->cellId = $map['cell_id'];
        }
        if(isset($map['username'])){
            $model->username = $map['username'];
        }
        if(isset($map['encoded_pwd'])){
            $model->encodedPwd = $map['encoded_pwd'];
        }
        if(isset($map['encoded_secrey_key'])){
            $model->encodedSecreyKey = $map['encoded_secrey_key'];
        }
        if(isset($map['public_key'])){
            $model->publicKey = $map['public_key'];
        }
        if(isset($map['star_manager_ip'])){
            $model->starManagerIp = $map['star_manager_ip'];
        }
        if(isset($map['star_manager_port'])){
            $model->starManagerPort = $map['star_manager_port'];
        }
        if(isset($map['script_url'])){
            $model->scriptUrl = $map['script_url'];
        }
        if(isset($map['special_script_url'])){
            $model->specialScriptUrl = $map['special_script_url'];
        }
        if(isset($map['agent_url'])){
            $model->agentUrl = $map['agent_url'];
        }
        if(isset($map['agent_setup_url'])){
            $model->agentSetupUrl = $map['agent_setup_url'];
        }
        if(isset($map['machine_init_url'])){
            $model->machineInitUrl = $map['machine_init_url'];
        }
        if(isset($map['special_machine_init_url'])){
            $model->specialMachineInitUrl = $map['special_machine_init_url'];
        }
        if(isset($map['control_type'])){
            $model->controlType = $map['control_type'];
        }
        if(isset($map['control_target'])){
            $model->controlTarget = $map['control_target'];
        }
        if(isset($map['need_initialize'])){
            $model->needInitialize = $map['need_initialize'];
        }
        if(isset($map['slb_info_list'])){
            if(!empty($map['slb_info_list'])){
                $model->slbInfoList = [];
                $n = 0;
                foreach($map['slb_info_list'] as $item) {
                    $model->slbInfoList[$n++] = null !== $item ? SLBInfo::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['task_ids'])){
            if(!empty($map['task_ids'])){
                $model->taskIds = $map['task_ids'];
            }
        }
        if(isset($map['env_config'])){
            if(!empty($map['env_config'])){
                $model->envConfig = [];
                $n = 0;
                foreach($map['env_config'] as $item) {
                    $model->envConfig[$n++] = null !== $item ? Pair::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['process_definition_id'])){
            $model->processDefinitionId = $map['process_definition_id'];
        }
        if(isset($map['parent_id'])){
            $model->parentId = $map['parent_id'];
        }
        if(isset($map['parent_entity_type'])){
            $model->parentEntityType = $map['parent_entity_type'];
        }
        if(isset($map['node_id'])){
            $model->nodeId = $map['node_id'];
        }
        if(isset($map['state'])){
            $model->state = $map['state'];
        }
        if(isset($map['started_time'])){
            $model->startedTime = $map['started_time'];
        }
        if(isset($map['finished_time'])){
            $model->finishedTime = $map['finished_time'];
        }
        if(isset($map['standalone_executable'])){
            $model->standaloneExecutable = $map['standalone_executable'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        return $model;
    }
    // 机器名
    /**
     * @example test
     * @var string
     */
    public $name;

    // 所属发布服务id
    /**
     * @example 123
     * @var string
     */
    public $serviceId;

    // 包版本
    /**
     * @example 1.0
     * @var string
     */
    public $servicePackageVersion;

    // 应用服务分组集合 ID
    /**
     * @example 123
     * @var string
     */
    public $serviceGroupCollectionId;

    // 发布分组 ID
    /**
     * @example 123
     * @var string
     */
    public $serviceGroupId;

    // 概览 ID
    /**
     * @example 123
     * @var string
     */
    public $arrangementId;

    // 服务类型
    /**
     * @example VM
     * @var string
     */
    public $serviceType;

    // paas 服务 ID
    /**
     * @example 123
     * @var string
     */
    public $paasServiceId;

    // paas 状态
    /**
     * @example ONLINE
     * @var string
     */
    public $paasState;

    // 关联目标 ID
    /**
     * @example 123
     * @var string
     */
    public $refTargetId;

    // 目标 iaas id
    /**
     * @example 123
     * @var string
     */
    public $targetIaasId;

    // 内网 IP
    /**
     * @example 11.11.11.11
     * @var string
     */
    public $innerIp;

    // 公网 IP
    /**
     * @example 11.11.11.11
     * @var string
     */
    public $publicIp;

    // 主机名
    /**
     * @example test
     * @var string
     */
    public $hostName;

    // 主机域名
    /**
     * @example test
     * @var string
     */
    public $hostDomain;

    // 安全组ID
    /**
     * @example 123
     * @var string
     */
    public $securityDomainId;

    // 安全组创建人 ID
    /**
     * @example 123
     * @var string
     */
    public $securityDomainCreatorId;

    // 安全组名
    /**
     * @example test
     * @var string
     */
    public $securityDomainName;

    // 默认执行账号
    /**
     * @example test
     * @var string
     */
    public $defaultExecuteAccount;

    // 可用区 ID
    /**
     * @example 123
     * @var string
     */
    public $zoneId;

    // 部署单元 ID
    /**
     * @example 123
     * @var string
     */
    public $cellId;

    // 用户名
    /**
     * @example test
     * @var string
     */
    public $username;

    // 加密密码
    /**
     * @example 123
     * @var string
     */
    public $encodedPwd;

    // 加密秘钥
    /**
     * @example 123
     * @var string
     */
    public $encodedSecreyKey;

    // 公钥
    /**
     * @example 123
     * @var string
     */
    public $publicKey;

    // star manage ip
    /**
     * @example 11.11.11.11
     * @var string
     */
    public $starManagerIp;

    // star manager port
    /**
     * @example 
     * @var int
     */
    public $starManagerPort;

    // 初始化脚本 url
    /**
     * @example test-url
     * @var string
     */
    public $scriptUrl;

    // 特殊初始化脚本 url
    /**
     * @example test-url
     * @var string
     */
    public $specialScriptUrl;

    // 代理 url
    /**
     * @example test-url
     * @var string
     */
    public $agentUrl;

    // 代理设置 url
    /**
     * @example test-url
     * @var string
     */
    public $agentSetupUrl;

    // 机器初始 url
    /**
     * @example test-url
     * @var string
     */
    public $machineInitUrl;

    // 特殊机器初始 url
    /**
     * @example test-url
     * @var string
     */
    public $specialMachineInitUrl;

    // 控制类型
    /**
     * @example test
     * @var string
     */
    public $controlType;

    // 控制对象
    /**
     * @example test
     * @var string
     */
    public $controlTarget;

    // 是否需要初始化
    /**
     * @example true, false
     * @var bool
     */
    public $needInitialize;

    // SLB 信息
    /**
     * @example 
     * @var SLBInfo[]
     */
    public $slbInfoList;

    // 子任务 id
    /**
     * @example 
     * @var string[]
     */
    public $taskIds;

    // 环境变量
    /**
     * @example 
     * @var Pair[]
     */
    public $envConfig;

    // pd id
    /**
     * @example 123
     * @var string
     */
    public $processDefinitionId;

    // 父节点 id
    /**
     * @example 123
     * @var string
     */
    public $parentId;

    // 父节点类型
    /**
     * @example SERVICE
     * @var string
     */
    public $parentEntityType;

    // 流程节点 ID
    /**
     * @example 123
     * @var string
     */
    public $nodeId;

    // 状态
    /**
     * @example FAILED
     * @var string
     */
    public $state;

    // 开始时间
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $startedTime;

    // 结束时间
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $finishedTime;

    // 是否可独立执行
    /**
     * @example true, false
     * @var bool
     */
    public $standaloneExecutable;

    // ID
    /**
     * @example 123
     * @var string
     */
    public $id;

}
