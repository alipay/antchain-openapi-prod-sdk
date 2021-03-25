<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class CreateBuildpackGeneratesignurlRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'id' => 'id',
        'regionNum' => 'region_num',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->regionNum) {
            $res['region_num'] = $this->regionNum;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateBuildpackGeneratesignurlRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['region_num'])){
            $model->regionNum = $map['region_num'];
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

    // id
    /**
     * @var string
     */
    public $id;

    // 地域ID
    /**
     * @var string
     */
    public $regionNum;

}
