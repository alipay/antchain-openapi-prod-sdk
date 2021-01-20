<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class PullConfigTemplateRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'appName' => 'app_name',
        'state' => 'state',
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
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PullConfigTemplateRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['app_name'])){
            $model->appName = $map['app_name'];
        }
        if(isset($map['state'])){
            $model->state = $map['state'];
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

    // RELEAES：获取最新的、已经发布的参数模板；
    // DRAFT：获取最新的参数模板草稿；
    // 不指定：获取已存在的最新的参数模板，不区分已发布或者草稿态；
    /**
     * @var string
     */
    public $state;

}
