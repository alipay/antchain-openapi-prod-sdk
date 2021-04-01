<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class InitVcVcrepoVctransmitRequest extends Model
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

    // vc传输发起人did
    /**
     * @var string
     */
    public $did;

    // vc_transmit_init
    /**
     * @var string
     */
    public $operation;

    // 使用对应的did私钥进行签名
    /**
     * @var string
     */
    public $signature;

    // 可验证声明id
    /**
     * @var string
     */
    public $vcId;

    // 传递目标
    /**
     * @var VcTransmitTargetStruct[]
     */
    public $verifiers;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'did'               => 'did',
        'operation'         => 'operation',
        'signature'         => 'signature',
        'vcId'              => 'vc_id',
        'verifiers'         => 'verifiers',
    ];

    public function validate()
    {
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('operation', $this->operation, true);
        Model::validateRequired('signature', $this->signature, true);
        Model::validateRequired('vcId', $this->vcId, true);
        Model::validateRequired('verifiers', $this->verifiers, true);
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
        if (null !== $this->operation) {
            $res['operation'] = $this->operation;
        }
        if (null !== $this->signature) {
            $res['signature'] = $this->signature;
        }
        if (null !== $this->vcId) {
            $res['vc_id'] = $this->vcId;
        }
        if (null !== $this->verifiers) {
            $res['verifiers'] = [];
            if (null !== $this->verifiers && \is_array($this->verifiers)) {
                $n = 0;
                foreach ($this->verifiers as $item) {
                    $res['verifiers'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitVcVcrepoVctransmitRequest
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
        if (isset($map['operation'])) {
            $model->operation = $map['operation'];
        }
        if (isset($map['signature'])) {
            $model->signature = $map['signature'];
        }
        if (isset($map['vc_id'])) {
            $model->vcId = $map['vc_id'];
        }
        if (isset($map['verifiers'])) {
            if (!empty($map['verifiers'])) {
                $model->verifiers = [];
                $n                = 0;
                foreach ($map['verifiers'] as $item) {
                    $model->verifiers[$n++] = null !== $item ? VcTransmitTargetStruct::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
