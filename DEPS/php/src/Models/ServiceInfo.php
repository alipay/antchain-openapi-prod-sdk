<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\Pair;
use AntChain\Deps\Models\GrayTrafficConfig;
use AntChain\Deps\Models\ArrangementInfo;

class ServiceInfo extends Model {
    protected $_name = [
        'appName' => 'app_name',
        'cellIds' => 'cell_ids',
        'defaultExecuteAccount' => 'default_execute_account',
        'envConfig' => 'env_config',
        'forceExecutable' => 'force_executable',
        'grayTrafficConfigs' => 'gray_traffic_configs',
        'groupAmount' => 'group_amount',
        'groupStrategyType' => 'group_strategy_type',
        'installFromCache' => 'install_from_cache',
        'name' => 'name',
        'needBeta' => 'need_beta',
        'needGrayTraffic' => 'need_gray_traffic',
        'postArrangementInfo' => 'post_arrangement_info',
        'preArrangementInfo' => 'pre_arrangement_info',
        'serviceArrangement' => 'service_arrangement',
        'serviceId' => 'service_id',
        'staticResourceDownloadUrl' => 'static_resource_download_url',
        'staticResourceTargetFile' => 'static_resource_target_file',
        'type' => 'type',
        'version' => 'version',
        'workspaceId' => 'workspace_id',
        'updateBuildpackVersion' => 'update_buildpack_version',
        'updateBuildpackId' => 'update_buildpack_id',
        'customParams' => 'custom_params',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->cellIds) {
            $res['cell_ids'] = $this->cellIds;
        }
        if (null !== $this->defaultExecuteAccount) {
            $res['default_execute_account'] = $this->defaultExecuteAccount;
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
        if (null !== $this->forceExecutable) {
            $res['force_executable'] = $this->forceExecutable;
        }
        if (null !== $this->grayTrafficConfigs) {
            $res['gray_traffic_configs'] = [];
            if(null !== $this->grayTrafficConfigs && is_array($this->grayTrafficConfigs)){
                $n = 0;
                foreach($this->grayTrafficConfigs as $item){
                    $res['gray_traffic_configs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->groupAmount) {
            $res['group_amount'] = $this->groupAmount;
        }
        if (null !== $this->groupStrategyType) {
            $res['group_strategy_type'] = $this->groupStrategyType;
        }
        if (null !== $this->installFromCache) {
            $res['install_from_cache'] = $this->installFromCache;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->needBeta) {
            $res['need_beta'] = $this->needBeta;
        }
        if (null !== $this->needGrayTraffic) {
            $res['need_gray_traffic'] = $this->needGrayTraffic;
        }
        if (null !== $this->postArrangementInfo) {
            $res['post_arrangement_info'] = [];
            if(null !== $this->postArrangementInfo && is_array($this->postArrangementInfo)){
                $n = 0;
                foreach($this->postArrangementInfo as $item){
                    $res['post_arrangement_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->preArrangementInfo) {
            $res['pre_arrangement_info'] = [];
            if(null !== $this->preArrangementInfo && is_array($this->preArrangementInfo)){
                $n = 0;
                foreach($this->preArrangementInfo as $item){
                    $res['pre_arrangement_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->serviceArrangement) {
            $res['service_arrangement'] = null !== $this->serviceArrangement ? $this->serviceArrangement->toMap() : null;
        }
        if (null !== $this->serviceId) {
            $res['service_id'] = $this->serviceId;
        }
        if (null !== $this->staticResourceDownloadUrl) {
            $res['static_resource_download_url'] = $this->staticResourceDownloadUrl;
        }
        if (null !== $this->staticResourceTargetFile) {
            $res['static_resource_target_file'] = $this->staticResourceTargetFile;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->updateBuildpackVersion) {
            $res['update_buildpack_version'] = $this->updateBuildpackVersion;
        }
        if (null !== $this->updateBuildpackId) {
            $res['update_buildpack_id'] = $this->updateBuildpackId;
        }
        if (null !== $this->customParams) {
            $res['custom_params'] = $this->customParams;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ServiceInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['app_name'])){
            $model->appName = $map['app_name'];
        }
        if(isset($map['cell_ids'])){
            if(!empty($map['cell_ids'])){
                $model->cellIds = $map['cell_ids'];
            }
        }
        if(isset($map['default_execute_account'])){
            $model->defaultExecuteAccount = $map['default_execute_account'];
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
        if(isset($map['force_executable'])){
            $model->forceExecutable = $map['force_executable'];
        }
        if(isset($map['gray_traffic_configs'])){
            if(!empty($map['gray_traffic_configs'])){
                $model->grayTrafficConfigs = [];
                $n = 0;
                foreach($map['gray_traffic_configs'] as $item) {
                    $model->grayTrafficConfigs[$n++] = null !== $item ? GrayTrafficConfig::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['group_amount'])){
            $model->groupAmount = $map['group_amount'];
        }
        if(isset($map['group_strategy_type'])){
            $model->groupStrategyType = $map['group_strategy_type'];
        }
        if(isset($map['install_from_cache'])){
            $model->installFromCache = $map['install_from_cache'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['need_beta'])){
            $model->needBeta = $map['need_beta'];
        }
        if(isset($map['need_gray_traffic'])){
            $model->needGrayTraffic = $map['need_gray_traffic'];
        }
        if(isset($map['post_arrangement_info'])){
            if(!empty($map['post_arrangement_info'])){
                $model->postArrangementInfo = [];
                $n = 0;
                foreach($map['post_arrangement_info'] as $item) {
                    $model->postArrangementInfo[$n++] = null !== $item ? ArrangementInfo::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['pre_arrangement_info'])){
            if(!empty($map['pre_arrangement_info'])){
                $model->preArrangementInfo = [];
                $n = 0;
                foreach($map['pre_arrangement_info'] as $item) {
                    $model->preArrangementInfo[$n++] = null !== $item ? ArrangementInfo::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['service_arrangement'])){
            $model->serviceArrangement = ArrangementInfo::fromMap($map['service_arrangement']);
        }
        if(isset($map['service_id'])){
            $model->serviceId = $map['service_id'];
        }
        if(isset($map['static_resource_download_url'])){
            $model->staticResourceDownloadUrl = $map['static_resource_download_url'];
        }
        if(isset($map['static_resource_target_file'])){
            $model->staticResourceTargetFile = $map['static_resource_target_file'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['version'])){
            $model->version = $map['version'];
        }
        if(isset($map['workspace_id'])){
            $model->workspaceId = $map['workspace_id'];
        }
        if(isset($map['update_buildpack_version'])){
            $model->updateBuildpackVersion = $map['update_buildpack_version'];
        }
        if(isset($map['update_buildpack_id'])){
            $model->updateBuildpackId = $map['update_buildpack_id'];
        }
        if(isset($map['custom_params'])){
            $model->customParams = $map['custom_params'];
        }
        return $model;
    }
    // 应用名
    /**
     * @example aa
     * @var string
     */
    public $appName;

    // 部署单元 ID 列表
    /**
     * @example 
     * @var string[]
     */
    public $cellIds;

    // 默认执行账号
    /**
     * @example 123
     * @var string
     */
    public $defaultExecuteAccount;

    // 环境变量
    /**
     * @example 
     * @var Pair[]
     */
    public $envConfig;

    // 是否可以强制执行
    /**
     * @example true, false
     * @var bool
     */
    public $forceExecutable;

    // 灰度规则配置
    /**
     * @example 
     * @var GrayTrafficConfig[]
     */
    public $grayTrafficConfigs;

    // 分组数
    /**
     * @example 
     * @var int
     */
    public $groupAmount;

    // 分组策略
    /**
     * @example QUICK
     * @var string
     */
    public $groupStrategyType;

    // 从缓存安装
    /**
     * @example true, false
     * @var bool
     */
    public $installFromCache;

    // 应用发布名
    /**
     * @example aa
     * @var string
     */
    public $name;

    // 是否需要 beta
    /**
     * @example true, false
     * @var bool
     */
    public $needBeta;

    // 是否需要灰度
    /**
     * @example true, false
     * @var bool
     */
    public $needGrayTraffic;

    // 后置任务列表
    /**
     * @example 
     * @var ArrangementInfo[]
     */
    public $postArrangementInfo;

    // 前置任务列表
    /**
     * @example 
     * @var ArrangementInfo[]
     */
    public $preArrangementInfo;

    // 发布概览
    /**
     * @example 
     * @var ArrangementInfo
     */
    public $serviceArrangement;

    // 发布应用 ID
    /**
     * @example 123
     * @var string
     */
    public $serviceId;

    // 静态资源下载链接
    /**
     * @example test-url
     * @var string
     */
    public $staticResourceDownloadUrl;

    // 静态资源目标文件
    /**
     * @example aa
     * @var string
     */
    public $staticResourceTargetFile;

    // 类型
    /**
     * @example VM
     * @var string
     */
    public $type;

    // 版本
    /**
     * @example 123
     * @var string
     */
    public $version;

    // 环境 ID
    /**
     * @example 123
     * @var string
     */
    public $workspaceId;

    // update_buildpack_version
    /**
     * @example update_buildpack_version
     * @var string
     */
    public $updateBuildpackVersion;

    // update_buildpack_id
    /**
     * @example update_buildpack_id
     * @var string
     */
    public $updateBuildpackId;

    // custom_params
    /**
     * @example custom_params
     * @var string
     */
    public $customParams;

}
