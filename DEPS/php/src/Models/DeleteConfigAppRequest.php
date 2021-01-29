<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class DeleteConfigAppRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'appParamId' => 'app_param_id',
    ];
    public function validate() {
        Model::validateRequired('appParamId', $this->appParamId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->appParamId) {
            $res['app_param_id'] = $this->appParamId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DeleteConfigAppRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['app_param_id'])){
            $model->appParamId = $map['app_param_id'];
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

    // 要删除的应用参数 id
    /**
     * @var string
     */
    public $appParamId;

}
