<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class CancelComputeropsRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'operationId' => 'operation_id',
        'reason' => 'reason',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->operationId) {
            $res['operation_id'] = $this->operationId;
        }
        if (null !== $this->reason) {
            $res['reason'] = $this->reason;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CancelComputeropsRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['operation_id'])){
            $model->operationId = $map['operation_id'];
        }
        if(isset($map['reason'])){
            $model->reason = $map['reason'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 运维单id
    /**
     * @var string
     */
    public $operationId;

    // 取消原因。长度不超过100个UTF-8字符
    /**
     * @var string
     */
    public $reason;

}
