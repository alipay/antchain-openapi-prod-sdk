<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartDidAgentChallengeresponseRequest extends Model
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

    // 场景码，找dis工作人员进行分配
    /**
     * @var string
     */
    public $bizCode;

    // 一段auth challenge明文，即需要被计算签名的明文
    /**
     * @var string
     */
    public $challengeRequest;

    // 指定的did，该did必须是租户自己，或托管给租户的did
    /**
     * @var string
     */
    public $did;

    // 0 原始字符串，1 hash值
    /**
     * @var int
     */
    public $challengeType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizCode'           => 'biz_code',
        'challengeRequest'  => 'challenge_request',
        'did'               => 'did',
        'challengeType'     => 'challenge_type',
    ];

    public function validate()
    {
        Model::validateRequired('challengeRequest', $this->challengeRequest, true);
        Model::validateRequired('did', $this->did, true);
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
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }
        if (null !== $this->challengeRequest) {
            $res['challenge_request'] = $this->challengeRequest;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->challengeType) {
            $res['challenge_type'] = $this->challengeType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartDidAgentChallengeresponseRequest
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
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }
        if (isset($map['challenge_request'])) {
            $model->challengeRequest = $map['challenge_request'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['challenge_type'])) {
            $model->challengeType = $map['challenge_type'];
        }

        return $model;
    }
}
