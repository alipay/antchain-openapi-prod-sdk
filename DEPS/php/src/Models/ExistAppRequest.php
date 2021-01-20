<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class ExistAppRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'appName' => 'app_name',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExistAppRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['app_name'])){
            $model->appName = $map['app_name'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 应用名称
    /**
     * @var string
     */
    public $appName;

}
