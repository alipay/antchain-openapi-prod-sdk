<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class GetConfigGlobalRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'globalParamId' => 'global_param_id',
    ];
    public function validate() {
        Model::validateRequired('globalParamId', $this->globalParamId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->globalParamId) {
            $res['global_param_id'] = $this->globalParamId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetConfigGlobalRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['global_param_id'])){
            $model->globalParamId = $map['global_param_id'];
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

    // 要获取的全局参数 id
    /**
     * @var string
     */
    public $globalParamId;

}
