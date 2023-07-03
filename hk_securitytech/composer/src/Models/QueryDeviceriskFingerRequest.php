<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\HK_SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class QueryDeviceriskFingerRequest extends Model
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

    // apdid_token
    /**
     * @var string
     */
    public $apdidToken;

    // client_id
    /**
     * @var string
     */
    public $clientId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'apdidToken'        => 'apdid_token',
        'clientId'          => 'client_id',
    ];

    public function validate()
    {
        Model::validateRequired('apdidToken', $this->apdidToken, true);
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
        if (null !== $this->apdidToken) {
            $res['apdid_token'] = $this->apdidToken;
        }
        if (null !== $this->clientId) {
            $res['client_id'] = $this->clientId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDeviceriskFingerRequest
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
        if (isset($map['apdid_token'])) {
            $model->apdidToken = $map['apdid_token'];
        }
        if (isset($map['client_id'])) {
            $model->clientId = $map['client_id'];
        }

        return $model;
    }
}
