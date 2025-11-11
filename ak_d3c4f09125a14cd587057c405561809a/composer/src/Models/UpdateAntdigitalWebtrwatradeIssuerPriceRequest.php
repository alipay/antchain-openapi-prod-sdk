<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models;

use AlibabaCloud\Tea\Model;

class UpdateAntdigitalWebtrwatradeIssuerPriceRequest extends Model
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

    // 项目ID
    /**
     * @var string
     */
    public $projectId;

    // 项目净值
    /**
     * @var string
     */
    public $netValue;

    // 要修改的价格类型（必须与项目创建时设定的类型一致）
    /**
     * @var string
     */
    public $priceType;

    // 修改说明或备注
    /**
     * @var string
     */
    public $remark;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'projectId'         => 'project_id',
        'netValue'          => 'net_value',
        'priceType'         => 'price_type',
        'remark'            => 'remark',
    ];

    public function validate()
    {
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('netValue', $this->netValue, true);
        Model::validateRequired('priceType', $this->priceType, true);
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
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->netValue) {
            $res['net_value'] = $this->netValue;
        }
        if (null !== $this->priceType) {
            $res['price_type'] = $this->priceType;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateAntdigitalWebtrwatradeIssuerPriceRequest
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
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['net_value'])) {
            $model->netValue = $map['net_value'];
        }
        if (isset($map['price_type'])) {
            $model->priceType = $map['price_type'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }

        return $model;
    }
}
