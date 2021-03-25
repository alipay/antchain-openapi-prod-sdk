<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class ExistAppGroupRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'appgroupName' => 'appgroup_name',
    ];
    public function validate() {
        Model::validateRequired('appgroupName', $this->appgroupName, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->appgroupName) {
            $res['appgroup_name'] = $this->appgroupName;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExistAppGroupRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['appgroup_name'])){
            $model->appgroupName = $map['appgroup_name'];
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

    // 应用分组名称
    /**
     * @var string
     */
    public $appgroupName;

}
