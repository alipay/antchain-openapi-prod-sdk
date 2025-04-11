<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\UNICONTACT\Models;

use AlibabaCloud\Tea\Model;

class ReplaceRobotcallPhoneRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 请求ID
    /**
     * @var string
     */
    public $reqId;

    // 当前时间戳毫秒值
    /**
     * @var int
     */
    public $timestamp;

    // 待解密号码
    /**
     * @var string
     */
    public $aesphone;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'reqId'             => 'req_id',
        'timestamp'         => 'timestamp',
        'aesphone'          => 'aesphone',
    ];

    public function validate()
    {
        Model::validateRequired('reqId', $this->reqId, true);
        Model::validateRequired('timestamp', $this->timestamp, true);
        Model::validateRequired('aesphone', $this->aesphone, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->reqId) {
            $res['req_id'] = $this->reqId;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }
        if (null !== $this->aesphone) {
            $res['aesphone'] = $this->aesphone;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ReplaceRobotcallPhoneRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['req_id'])) {
            $model->reqId = $map['req_id'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }
        if (isset($map['aesphone'])) {
            $model->aesphone = $map['aesphone'];
        }

        return $model;
    }
}
