<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class ListZoneRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'region' => 'region',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ListZoneRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['region'])){
            $model->region = $map['region'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // region identity
    /**
     * @var string
     */
    public $region;

}
