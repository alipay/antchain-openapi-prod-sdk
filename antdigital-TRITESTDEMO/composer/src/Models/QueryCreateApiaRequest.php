<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TRITESTDEMO\Models;

use AlibabaCloud\Tea\Model;

class QueryCreateApiaRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'aaa' => 'aaa',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->aaa) {
            $res['aaa'] = $this->aaa;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryCreateApiaRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['aaa'])){
            $model->aaa = $map['aaa'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 描述
    /**
     * @var string
     */
    public $aaa;

}
