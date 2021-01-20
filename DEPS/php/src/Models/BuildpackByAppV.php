<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class BuildpackByAppV extends Model {
    protected $_name = [
        'id' => 'id',
        'name' => 'name',
        'des' => 'des',
        'version' => 'version',
        'deployScriptId' => 'deploy_script_id',
        'buildScriptId' => 'build_script_id',
        'configId' => 'config_id',
        'componentId' => 'component_id',
        'commandId' => 'command_id',
        'bgEnable' => 'bg_enable',
        'creator' => 'creator',
        'tenantId' => 'tenant_id',
        'customerIds' => 'customer_ids',
        'gmtCreate' => 'gmt_create',
        'gmtModified' => 'gmt_modified',
        'resultMsg' => 'result_msg',
        'utcCreate' => 'utc_create',
        'utcModified' => 'utc_modified',
    ];
    public function validate() {
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('utcModified', $this->utcModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->des) {
            $res['des'] = $this->des;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->deployScriptId) {
            $res['deploy_script_id'] = $this->deployScriptId;
        }
        if (null !== $this->buildScriptId) {
            $res['build_script_id'] = $this->buildScriptId;
        }
        if (null !== $this->configId) {
            $res['config_id'] = $this->configId;
        }
        if (null !== $this->componentId) {
            $res['component_id'] = $this->componentId;
        }
        if (null !== $this->commandId) {
            $res['command_id'] = $this->commandId;
        }
        if (null !== $this->bgEnable) {
            $res['bg_enable'] = $this->bgEnable;
        }
        if (null !== $this->creator) {
            $res['creator'] = $this->creator;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->customerIds) {
            $res['customer_ids'] = $this->customerIds;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }
        if (null !== $this->utcModified) {
            $res['utc_modified'] = $this->utcModified;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return BuildpackByAppV
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['des'])){
            $model->des = $map['des'];
        }
        if(isset($map['version'])){
            $model->version = $map['version'];
        }
        if(isset($map['deploy_script_id'])){
            $model->deployScriptId = $map['deploy_script_id'];
        }
        if(isset($map['build_script_id'])){
            $model->buildScriptId = $map['build_script_id'];
        }
        if(isset($map['config_id'])){
            $model->configId = $map['config_id'];
        }
        if(isset($map['component_id'])){
            $model->componentId = $map['component_id'];
        }
        if(isset($map['command_id'])){
            $model->commandId = $map['command_id'];
        }
        if(isset($map['bg_enable'])){
            $model->bgEnable = $map['bg_enable'];
        }
        if(isset($map['creator'])){
            $model->creator = $map['creator'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['customer_ids'])){
            $model->customerIds = $map['customer_ids'];
        }
        if(isset($map['gmt_create'])){
            $model->gmtCreate = $map['gmt_create'];
        }
        if(isset($map['gmt_modified'])){
            $model->gmtModified = $map['gmt_modified'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['utc_create'])){
            $model->utcCreate = $map['utc_create'];
        }
        if(isset($map['utc_modified'])){
            $model->utcModified = $map['utc_modified'];
        }
        return $model;
    }
    // id
    /**
     * @example id
     * @var string
     */
    public $id;

    // name
    /**
     * @example name
     * @var string
     */
    public $name;

    // des
    /**
     * @example des
     * @var string
     */
    public $des;

    // version
    /**
     * @example version
     * @var string
     */
    public $version;

    // deployScriptId
    /**
     * @example deployScriptId
     * @var string
     */
    public $deployScriptId;

    // buildScriptId
    /**
     * @example buildScriptId
     * @var string
     */
    public $buildScriptId;

    // configId
    /**
     * @example configId
     * @var string
     */
    public $configId;

    // componentId
    /**
     * @example componentId
     * @var string
     */
    public $componentId;

    // commandId
    /**
     * @example commandId
     * @var string
     */
    public $commandId;

    // bgEnable
    /**
     * @example true, false
     * @var bool
     */
    public $bgEnable;

    // creator
    /**
     * @example creator
     * @var string
     */
    public $creator;

    // tenantId
    /**
     * @example tenantId
     * @var string
     */
    public $tenantId;

    // customerIds
    /**
     * @example customerIds
     * @var string
     */
    public $customerIds;

    // gmtCreate
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $gmtCreate;

    // gmtModified
    /**
     * @example 
     * @var string
     */
    public $gmtModified;

    // resultMsg
    /**
     * @example resultMsg
     * @var string
     */
    public $resultMsg;

    // utcCreate
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $utcCreate;

    // utcModified
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $utcModified;

}
