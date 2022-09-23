<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APPEX\Models;

use AlibabaCloud\Tea\Model;

class StartMypocketUserdidsignverifyRequest extends Model
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

    // 签名
    /**
     * @var string
     */
    public $didSign;

    // 签名原文
    /**
     * @var string
     */
    public $payload;

    // mychain did信息
    /**
     * @var string
     */
    public $userDid;

    // epoch时间，毫秒
    /**
     * @var int
     */
    public $timestamp;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'didSign'           => 'did_sign',
        'payload'           => 'payload',
        'userDid'           => 'user_did',
        'timestamp'         => 'timestamp',
    ];

    public function validate()
    {
        Model::validateRequired('didSign', $this->didSign, true);
        Model::validateRequired('payload', $this->payload, true);
        Model::validateRequired('userDid', $this->userDid, true);
        Model::validateRequired('timestamp', $this->timestamp, true);
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
        if (null !== $this->didSign) {
            $res['did_sign'] = $this->didSign;
        }
        if (null !== $this->payload) {
            $res['payload'] = $this->payload;
        }
        if (null !== $this->userDid) {
            $res['user_did'] = $this->userDid;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartMypocketUserdidsignverifyRequest
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
        if (isset($map['did_sign'])) {
            $model->didSign = $map['did_sign'];
        }
        if (isset($map['payload'])) {
            $model->payload = $map['payload'];
        }
        if (isset($map['user_did'])) {
            $model->userDid = $map['user_did'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }

        return $model;
    }
}
