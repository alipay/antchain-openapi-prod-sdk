<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class QueryOperationlogRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'event' => 'event',
        'pageNo' => 'page_no',
        'pageSize' => 'page_size',
        'result' => 'result',
        'targetId' => 'target_id',
        'targetType' => 'target_type',
        'userId' => 'user_id',
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
        if (null !== $this->event) {
            $res['event'] = $this->event;
        }
        if (null !== $this->pageNo) {
            $res['page_no'] = $this->pageNo;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->result) {
            $res['result'] = $this->result;
        }
        if (null !== $this->targetId) {
            $res['target_id'] = $this->targetId;
        }
        if (null !== $this->targetType) {
            $res['target_type'] = $this->targetType;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryOperationlogRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['event'])){
            $model->event = $map['event'];
        }
        if(isset($map['page_no'])){
            $model->pageNo = $map['page_no'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['result'])){
            $model->result = $map['result'];
        }
        if(isset($map['target_id'])){
            $model->targetId = $map['target_id'];
        }
        if(isset($map['target_type'])){
            $model->targetType = $map['target_type'];
        }
        if(isset($map['user_id'])){
            $model->userId = $map['user_id'];
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

    // event
    /**
     * @var string
     */
    public $event;

    // page_no
    /**
     * @var int
     */
    public $pageNo;

    // page_size
    /**
     * @var int
     */
    public $pageSize;

    // result
    /**
     * @var bool
     */
    public $result;

    // target_id
    /**
     * @var string
     */
    public $targetId;

    // target_type
    /**
     * @var string
     */
    public $targetType;

    // user_id
    /**
     * @var string
     */
    public $userId;

}
