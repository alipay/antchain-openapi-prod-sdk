<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class GetContractRecordRequest extends Model
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

    // 区块链唯一标识
    /**
     * @var string
     */
    public $bizid;

    // 16进制表示的合约identity
    /**
     * @var string
     */
    public $identity;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizid'             => 'bizid',
        'identity'          => 'identity',
    ];

    public function validate()
    {
        Model::validateRequired('bizid', $this->bizid, true);
        Model::validateRequired('identity', $this->identity, true);
        Model::validateMaxLength('identity', $this->identity, 64);
        Model::validateMinLength('identity', $this->identity, 64);
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
        if (null !== $this->identity) {
            $res['identity'] = $this->identity;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetContractRecordRequest
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
        if (isset($map['identity'])) {
            $model->identity = $map['identity'];
        }

        return $model;
    }
}
