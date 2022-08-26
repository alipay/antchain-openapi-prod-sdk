<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_7365e031a87c467bbe817bec28a2a1dc\Models;

use AlibabaCloud\Tea\Model;

class GetBaasPlusDataserviceBlockchainheightRequest extends Model
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

    // 区块链的唯一性标示
    /**
     * @var string
     */
    public $bizid;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizid'             => 'bizid',
    ];

    public function validate()
    {
        Model::validateRequired('bizid', $this->bizid, true);
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
        if (null !== $this->bizid) {
            $res['bizid'] = $this->bizid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetBaasPlusDataserviceBlockchainheightRequest
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
        if (isset($map['bizid'])) {
            $model->bizid = $map['bizid'];
        }

        return $model;
    }
}
