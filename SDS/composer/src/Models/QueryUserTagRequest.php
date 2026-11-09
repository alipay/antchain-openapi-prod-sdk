<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SDS\Models;

use AlibabaCloud\Tea\Model;

class QueryUserTagRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'channelNo' => 'channel_no',
        'userId' => 'user_id',
        'userIdType' => 'user_id_type',
        'traceId' => 'trace_id',
    ];
    public function validate() {
        Model::validateRequired('channelNo', $this->channelNo, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('userIdType', $this->userIdType, true);
        Model::validateRequired('traceId', $this->traceId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->channelNo) {
            $res['channel_no'] = $this->channelNo;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->userIdType) {
            $res['user_id_type'] = $this->userIdType;
        }
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryUserTagRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['channel_no'])){
            $model->channelNo = $map['channel_no'];
        }
        if(isset($map['user_id'])){
            $model->userId = $map['user_id'];
        }
        if(isset($map['user_id_type'])){
            $model->userIdType = $map['user_id_type'];
        }
        if(isset($map['trace_id'])){
            $model->traceId = $map['trace_id'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 12345678
    /**
     * @var string
     */
    public $channelNo;

    // 用户id
    /**
     * @var string
     */
    public $userId;

    // 用户id类型
    /**
     * @var string
     */
    public $userIdType;

    // 用户访问时生成的埋点traceid
    /**
     * @var string
     */
    public $traceId;

}
