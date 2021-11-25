<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartDidVcrepositoryVctransmitRequest extends Model
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

    // 用户did标示
    /**
     * @var string
     */
    public $did;

    // 实际参数
    /**
     * @var VcTransmitPayload
     */
    public $payload;

    // 场景码，找dis工作人员进行分配
    /**
     * @var string
     */
    public $bizCode;

    // transmit在底层vc仓库使用时候是否需要使用did密钥进行信封封装加密，如果设定true则不需要底层信封加密，需要调用方执行vcContent的加密保护。
    /**
     * @var bool
     */
    public $notEncrypt;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'did'               => 'did',
        'payload'           => 'payload',
        'bizCode'           => 'biz_code',
        'notEncrypt'        => 'not_encrypt',
    ];

    public function validate()
    {
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('payload', $this->payload, true);
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
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->payload) {
            $res['payload'] = null !== $this->payload ? $this->payload->toMap() : null;
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }
        if (null !== $this->notEncrypt) {
            $res['not_encrypt'] = $this->notEncrypt;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartDidVcrepositoryVctransmitRequest
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
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['payload'])) {
            $model->payload = VcTransmitPayload::fromMap($map['payload']);
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }
        if (isset($map['not_encrypt'])) {
            $model->notEncrypt = $map['not_encrypt'];
        }

        return $model;
    }
}
