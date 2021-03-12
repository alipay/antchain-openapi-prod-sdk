<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ApplyDataauthorizationAuthorizationWithsignatureRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 申请ID
    /**
     * @var string
     */
    public $bizUid;

    // 区块链ID
    /**
     * @var string
     */
    public $blockchainId;

    // 带签名的参数信息
    /**
     * @var string
     */
    public $parameters;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizUid'            => 'biz_uid',
        'blockchainId'      => 'blockchain_id',
        'parameters'        => 'parameters',
    ];

    public function validate()
    {
        Model::validateRequired('bizUid', $this->bizUid, true);
        Model::validateRequired('blockchainId', $this->blockchainId, true);
        Model::validateRequired('parameters', $this->parameters, true);
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
        if (null !== $this->bizUid) {
            $res['biz_uid'] = $this->bizUid;
        }
        if (null !== $this->blockchainId) {
            $res['blockchain_id'] = $this->blockchainId;
        }
        if (null !== $this->parameters) {
            $res['parameters'] = $this->parameters;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyDataauthorizationAuthorizationWithsignatureRequest
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
        if (isset($map['biz_uid'])) {
            $model->bizUid = $map['biz_uid'];
        }
        if (isset($map['blockchain_id'])) {
            $model->blockchainId = $map['blockchain_id'];
        }
        if (isset($map['parameters'])) {
            $model->parameters = $map['parameters'];
        }

        return $model;
    }
}
