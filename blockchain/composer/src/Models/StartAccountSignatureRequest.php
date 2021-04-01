<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartAccountSignatureRequest extends Model
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

    // 加密算法
    /**
     * @var string
     */
    public $algorithm;

    // 区块链唯一标示
    /**
     * @var string
     */
    public $bizid;

    // 用户需要签名的原始数据
    /**
     * @var string
     */
    public $data;

    // 签名账户在原系统中的唯一标示
    /**
     * @var string
     */
    public $uid;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'algorithm'         => 'algorithm',
        'bizid'             => 'bizid',
        'data'              => 'data',
        'uid'               => 'uid',
    ];

    public function validate()
    {
        Model::validateRequired('algorithm', $this->algorithm, true);
        Model::validateRequired('bizid', $this->bizid, true);
        Model::validateRequired('data', $this->data, true);
        Model::validateRequired('uid', $this->uid, true);
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
        if (null !== $this->algorithm) {
            $res['algorithm'] = $this->algorithm;
        }
        if (null !== $this->bizid) {
            $res['bizid'] = $this->bizid;
        }
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->uid) {
            $res['uid'] = $this->uid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartAccountSignatureRequest
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
        if (isset($map['algorithm'])) {
            $model->algorithm = $map['algorithm'];
        }
        if (isset($map['bizid'])) {
            $model->bizid = $map['bizid'];
        }
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }
        if (isset($map['uid'])) {
            $model->uid = $map['uid'];
        }

        return $model;
    }
}
