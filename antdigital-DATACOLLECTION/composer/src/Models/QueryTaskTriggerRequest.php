<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DATACOLLECTION\Models;

use AlibabaCloud\Tea\Model;

class QueryTaskTriggerRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'instId' => 'inst_id',
    ];
    public function validate() {
        Model::validateRequired('instId', $this->instId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->instId) {
            $res['inst_id'] = $this->instId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryTaskTriggerRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['inst_id'])){
            $model->instId = $map['inst_id'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 触发 id
    /**
     * @var string
     */
    public $instId;

}
