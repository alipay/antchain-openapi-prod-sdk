<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\BuildpackOS;
use AntChain\Deps\Models\BuildpackRegionRelationDetail;
use AntChain\Deps\Models\Techstack;

class QueryBuildpackFindbyappResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'bgEnable' => 'bg_enable',
        'buildpackArch' => 'buildpack_arch',
        'buildScriptId' => 'build_script_id',
        'commandId' => 'command_id',
        'componentId' => 'component_id',
        'configId' => 'config_id',
        'creator' => 'creator',
        'customerIds' => 'customer_ids',
        'deployScriptId' => 'deploy_script_id',
        'des' => 'des',
        'fullVersion' => 'full_version',
        'gmtCreate' => 'gmt_create',
        'gmtModified' => 'gmt_modified',
        'id' => 'id',
        'name' => 'name',
        'supportedOS' => 'supported_o_s',
        'supportedRegions' => 'supported_regions',
        'techstack' => 'techstack',
        'tenantId' => 'tenant_id',
        'utcCreate' => 'utc_create',
        'utcModified' => 'utc_modified',
        'version' => 'version',
    ];
    public function validate() {
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('utcModified', $this->utcModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->bgEnable) {
            $res['bg_enable'] = $this->bgEnable;
        }
        if (null !== $this->buildpackArch) {
            $res['buildpack_arch'] = $this->buildpackArch;
        }
        if (null !== $this->buildScriptId) {
            $res['build_script_id'] = $this->buildScriptId;
        }
        if (null !== $this->commandId) {
            $res['command_id'] = $this->commandId;
        }
        if (null !== $this->componentId) {
            $res['component_id'] = $this->componentId;
        }
        if (null !== $this->configId) {
            $res['config_id'] = $this->configId;
        }
        if (null !== $this->creator) {
            $res['creator'] = $this->creator;
        }
        if (null !== $this->customerIds) {
            $res['customer_ids'] = $this->customerIds;
        }
        if (null !== $this->deployScriptId) {
            $res['deploy_script_id'] = $this->deployScriptId;
        }
        if (null !== $this->des) {
            $res['des'] = $this->des;
        }
        if (null !== $this->fullVersion) {
            $res['full_version'] = $this->fullVersion;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->supportedOS) {
            $res['supported_o_s'] = [];
            if(null !== $this->supportedOS && is_array($this->supportedOS)){
                $n = 0;
                foreach($this->supportedOS as $item){
                    $res['supported_o_s'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->supportedRegions) {
            $res['supported_regions'] = [];
            if(null !== $this->supportedRegions && is_array($this->supportedRegions)){
                $n = 0;
                foreach($this->supportedRegions as $item){
                    $res['supported_regions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->techstack) {
            $res['techstack'] = null !== $this->techstack ? $this->techstack->toMap() : null;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }
        if (null !== $this->utcModified) {
            $res['utc_modified'] = $this->utcModified;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryBuildpackFindbyappResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['bg_enable'])){
            $model->bgEnable = $map['bg_enable'];
        }
        if(isset($map['buildpack_arch'])){
            $model->buildpackArch = $map['buildpack_arch'];
        }
        if(isset($map['build_script_id'])){
            $model->buildScriptId = $map['build_script_id'];
        }
        if(isset($map['command_id'])){
            $model->commandId = $map['command_id'];
        }
        if(isset($map['component_id'])){
            $model->componentId = $map['component_id'];
        }
        if(isset($map['config_id'])){
            $model->configId = $map['config_id'];
        }
        if(isset($map['creator'])){
            $model->creator = $map['creator'];
        }
        if(isset($map['customer_ids'])){
            if(!empty($map['customer_ids'])){
                $model->customerIds = $map['customer_ids'];
            }
        }
        if(isset($map['deploy_script_id'])){
            $model->deployScriptId = $map['deploy_script_id'];
        }
        if(isset($map['des'])){
            $model->des = $map['des'];
        }
        if(isset($map['full_version'])){
            $model->fullVersion = $map['full_version'];
        }
        if(isset($map['gmt_create'])){
            $model->gmtCreate = $map['gmt_create'];
        }
        if(isset($map['gmt_modified'])){
            $model->gmtModified = $map['gmt_modified'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['supported_o_s'])){
            if(!empty($map['supported_o_s'])){
                $model->supportedOS = [];
                $n = 0;
                foreach($map['supported_o_s'] as $item) {
                    $model->supportedOS[$n++] = null !== $item ? BuildpackOS::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['supported_regions'])){
            if(!empty($map['supported_regions'])){
                $model->supportedRegions = [];
                $n = 0;
                foreach($map['supported_regions'] as $item) {
                    $model->supportedRegions[$n++] = null !== $item ? BuildpackRegionRelationDetail::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['techstack'])){
            $model->techstack = Techstack::fromMap($map['techstack']);
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['utc_create'])){
            $model->utcCreate = $map['utc_create'];
        }
        if(isset($map['utc_modified'])){
            $model->utcModified = $map['utc_modified'];
        }
        if(isset($map['version'])){
            $model->version = $map['version'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // bgEnable
    /**
     * @var bool
     */
    public $bgEnable;

    // buildpackArch
    /**
     * @var string
     */
    public $buildpackArch;

    // buildScriptId
    /**
     * @var string
     */
    public $buildScriptId;

    // commandId
    /**
     * @var string
     */
    public $commandId;

    // componentId
    /**
     * @var string
     */
    public $componentId;

    // configId
    /**
     * @var string
     */
    public $configId;

    // creator
    /**
     * @var string
     */
    public $creator;

    // customerIds
    /**
     * @var string[]
     */
    public $customerIds;

    // deployScriptId
    /**
     * @var string
     */
    public $deployScriptId;

    // des
    /**
     * @var string
     */
    public $des;

    // fullVersion
    /**
     * @var string
     */
    public $fullVersion;

    // gmtCreate
    /**
     * @var string
     */
    public $gmtCreate;

    // gmtModified
    /**
     * @var string
     */
    public $gmtModified;

    // id
    /**
     * @var string
     */
    public $id;

    // name
    /**
     * @var string
     */
    public $name;

    // supportedOS
    /**
     * @var BuildpackOS[]
     */
    public $supportedOS;

    // supportedRegions
    /**
     * @var BuildpackRegionRelationDetail[]
     */
    public $supportedRegions;

    // techstack
    /**
     * @var Techstack
     */
    public $techstack;

    // tenantId
    /**
     * @var string
     */
    public $tenantId;

    // utcCreate
    /**
     * @var string
     */
    public $utcCreate;

    // utcModified
    /**
     * @var string
     */
    public $utcModified;

    // version
    /**
     * @var string
     */
    public $version;

}
