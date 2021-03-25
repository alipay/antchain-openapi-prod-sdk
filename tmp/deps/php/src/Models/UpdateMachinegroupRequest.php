<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class UpdateMachinegroupRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'machineGroupId' => 'machine_group_id',
        'machineIds' => 'machine_ids',
        'workspace' => 'workspace',
    ];
    public function validate() {
        Model::validateRequired('machineGroupId', $this->machineGroupId, true);
        Model::validateRequired('machineIds', $this->machineIds, true);
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
        if (null !== $this->machineGroupId) {
            $res['machine_group_id'] = $this->machineGroupId;
        }
        if (null !== $this->machineIds) {
            $res['machine_ids'] = $this->machineIds;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateMachinegroupRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['machine_group_id'])){
            $model->machineGroupId = $map['machine_group_id'];
        }
        if(isset($map['machine_ids'])){
            if(!empty($map['machine_ids'])){
                $model->machineIds = $map['machine_ids'];
            }
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

    // 分组 ID
    /**
     * @var string
     */
    public $machineGroupId;

    // 发布机器 ID
    /**
     * @var string[]
     */
    public $machineIds;

    // workspace
    /**
     * @var string
     */
    public $workspace;

}
