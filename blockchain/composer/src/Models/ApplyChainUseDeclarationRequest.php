<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ApplyChainUseDeclarationRequest extends Model
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

    // 用途KEY
    /**
     * @var string
     */
    public $chainPurposeKey;

    // 选择其他类型时，用户输入（必填）
    /**
     * @var string
     */
    public $chainPurposeExtend;

    // 简短说明用途
    //
    // 选择其他类型时，用户输入
    /**
     * @var string
     */
    public $chainPurposeItem;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'chainPurposeKey'    => 'chain_purpose_key',
        'chainPurposeExtend' => 'chain_purpose_extend',
        'chainPurposeItem'   => 'chain_purpose_item',
    ];

    public function validate()
    {
        Model::validateRequired('chainPurposeKey', $this->chainPurposeKey, true);
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
        if (null !== $this->chainPurposeKey) {
            $res['chain_purpose_key'] = $this->chainPurposeKey;
        }
        if (null !== $this->chainPurposeExtend) {
            $res['chain_purpose_extend'] = $this->chainPurposeExtend;
        }
        if (null !== $this->chainPurposeItem) {
            $res['chain_purpose_item'] = $this->chainPurposeItem;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyChainUseDeclarationRequest
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
        if (isset($map['chain_purpose_key'])) {
            $model->chainPurposeKey = $map['chain_purpose_key'];
        }
        if (isset($map['chain_purpose_extend'])) {
            $model->chainPurposeExtend = $map['chain_purpose_extend'];
        }
        if (isset($map['chain_purpose_item'])) {
            $model->chainPurposeItem = $map['chain_purpose_item'];
        }

        return $model;
    }
}
