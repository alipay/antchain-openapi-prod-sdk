<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class QueryAppVersionRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'buildId' => 'build_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->buildId) {
            $res['build_id'] = $this->buildId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAppVersionRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['build_id'])){
            $model->buildId = $map['build_id'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 版本构建id
    /**
     * @var string
     */
    public $buildId;

}
