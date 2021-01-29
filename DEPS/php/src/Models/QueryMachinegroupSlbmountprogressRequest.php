<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class QueryMachinegroupSlbmountprogressRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'machineGroupId' => 'machine_group_id',
        'requestIds' => 'request_ids',
        'workspace' => 'workspace',
    ];
    public function validate() {
        Model::validateRequired('machineGroupId', $this->machineGroupId, true);
        Model::validateRequired('requestIds', $this->requestIds, true);
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
        if (null !== $this->requestIds) {
            $res['request_ids'] = $this->requestIds;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryMachinegroupSlbmountprogressRequest
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
        if(isset($map['request_ids'])){
            if(!empty($map['request_ids'])){
                $model->requestIds = $map['request_ids'];
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

    // 分组ID
    /**
     * @var string
     */
    public $machineGroupId;

    // 请求 ID 列表
    /**
     * @var string[]
     */
    public $requestIds;

    // workspace
    /**
     * @var string
     */
    public $workspace;

}
