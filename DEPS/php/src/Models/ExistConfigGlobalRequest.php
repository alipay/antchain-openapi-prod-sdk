<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class ExistConfigGlobalRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'key' => 'key',
        'scopeIds' => 'scope_ids',
        'type' => 'type',
    ];
    public function validate() {
        Model::validateRequired('key', $this->key, true);
        Model::validateRequired('scopeIds', $this->scopeIds, true);
        Model::validateRequired('type', $this->type, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->scopeIds) {
            $res['scope_ids'] = $this->scopeIds;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExistConfigGlobalRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['key'])){
            $model->key = $map['key'];
        }
        if(isset($map['scope_ids'])){
            if(!empty($map['scope_ids'])){
                $model->scopeIds = $map['scope_ids'];
            }
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
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

    // 全局参数名称，同一个 scope + scopeId 下不能有同名的全局参数
    /**
     * @var string
     */
    public $key;

    // 作用域 id 数组，比如作用域类型（type）是 workspace，那么 scopeId 就是 workspace 的 id
    /**
     * @var string[]
     */
    public $scopeIds;

    // 作用域类型
    /**
     * @var string
     */
    public $type;

}
