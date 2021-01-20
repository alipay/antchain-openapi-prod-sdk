<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class GetConfigAppRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'appParamId' => 'app_param_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->appParamId) {
            $res['app_param_id'] = $this->appParamId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetConfigAppRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
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

    // 应用参数 id
    /**
     * @var string
     */
    public $appParamId;

}
