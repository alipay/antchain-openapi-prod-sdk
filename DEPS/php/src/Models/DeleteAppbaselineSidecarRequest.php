<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class DeleteAppbaselineSidecarRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'appbaselineId' => 'appbaseline_id',
    ];
    public function validate() {
        Model::validateRequired('appbaselineId', $this->appbaselineId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->appbaselineId) {
            $res['appbaseline_id'] = $this->appbaselineId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DeleteAppbaselineSidecarRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['appbaseline_id'])){
            $model->appbaselineId = $map['appbaseline_id'];
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

    // 应用基线ID
    /**
     * @var string
     */
    public $appbaselineId;

}
