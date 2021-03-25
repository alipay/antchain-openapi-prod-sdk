<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class SetServiceMachinegroupRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'groupMount' => 'group_mount',
        'groupStrategyType' => 'group_strategy_type',
        'machineGroups' => 'machine_groups',
        'needBeta' => 'need_beta',
        'serviceId' => 'service_id',
        'useDefaultSetup' => 'use_default_setup',
        'workspace' => 'workspace',
    ];
    public function validate() {
        Model::validateRequired('serviceId', $this->serviceId, true);
        Model::validateRequired('workspace', $this->workspace, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->groupMount) {
            $res['group_mount'] = $this->groupMount;
        }
        if (null !== $this->groupStrategyType) {
            $res['group_strategy_type'] = $this->groupStrategyType;
        }
        if (null !== $this->machineGroups) {
            $res['machine_groups'] = $this->machineGroups;
        }
        if (null !== $this->needBeta) {
            $res['need_beta'] = $this->needBeta;
        }
        if (null !== $this->serviceId) {
            $res['service_id'] = $this->serviceId;
        }
        if (null !== $this->useDefaultSetup) {
            $res['use_default_setup'] = $this->useDefaultSetup;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SetServiceMachinegroupRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['group_mount'])){
            $model->groupMount = $map['group_mount'];
        }
        if(isset($map['group_strategy_type'])){
            $model->groupStrategyType = $map['group_strategy_type'];
        }
        if(isset($map['machine_groups'])){
            if(!empty($map['machine_groups'])){
                $model->machineGroups = $map['machine_groups'];
            }
        }
        if(isset($map['need_beta'])){
            $model->needBeta = $map['need_beta'];
        }
        if(isset($map['service_id'])){
            $model->serviceId = $map['service_id'];
        }
        if(isset($map['use_default_setup'])){
            $model->useDefaultSetup = $map['use_default_setup'];
        }
        if(isset($map['workspace'])){
            $model->workspace = $map['workspace'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $tenant;

    // 分组数
    /**
     * @var int
     */
    public $groupMount;

    // groupStrategyType
    /**
     * @var string
     */
    public $groupStrategyType;

    // machine_groups
    /**
     * @var string[]
     */
    public $machineGroups;

    // need_beta
    /**
     * @var bool
     */
    public $needBeta;

    // service_id
    /**
     * @var string
     */
    public $serviceId;

    // use_default_setup
    /**
     * @var bool
     */
    public $useDefaultSetup;

    // workspace
    /**
     * @var string
     */
    public $workspace;

}
