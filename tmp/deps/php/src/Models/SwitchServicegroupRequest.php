<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class SwitchServicegroupRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'serviceGroupId' => 'service_group_id',
        'serviceId' => 'service_id',
        'workspace' => 'workspace',
    ];
    public function validate() {
        Model::validateRequired('serviceGroupId', $this->serviceGroupId, true);
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
        if (null !== $this->serviceGroupId) {
            $res['service_group_id'] = $this->serviceGroupId;
        }
        if (null !== $this->serviceId) {
            $res['service_id'] = $this->serviceId;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SwitchServicegroupRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['service_group_id'])){
            $model->serviceGroupId = $map['service_group_id'];
        }
        if(isset($map['service_id'])){
            $model->serviceId = $map['service_id'];
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

    // service_group_id
    /**
     * @var string
     */
    public $serviceGroupId;

    // service_id
    /**
     * @var string
     */
    public $serviceId;

    // workspace
    /**
     * @var string
     */
    public $workspace;

}
