<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateCmportProfitrateRequest extends Model
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

    // 产品编号
    /**
     * @var string
     */
    public $productNo;

    // 产品类型
    /**
     * @var string
     */
    public $productType;

    // 产品名称
    /**
     * @var string
     */
    public $productName;

    // 金融机构编号
    /**
     * @var string
     */
    public $financialNo;

    // 金融机构名称
    /**
     * @var string
     */
    public $financialName;

    // 各方分润比例
    // 对应角色编码类型：
    // 风险承担方：RISK_TAKER
    // 货物监管方：CARGO_SUPERVISION
    // 资金推荐方：CAPITAL_RECOMMEND
    // 融资推荐方：FUNDER_RECOMMEND
    // 运营管理方：MANAGEMENT
    // 技术支持方：TECHNICAL
    /**
     * @var RoleRatio[]
     */
    public $roleRatio;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'productNo'         => 'product_no',
        'productType'       => 'product_type',
        'productName'       => 'product_name',
        'financialNo'       => 'financial_no',
        'financialName'     => 'financial_name',
        'roleRatio'         => 'role_ratio',
    ];

    public function validate()
    {
        Model::validateRequired('productNo', $this->productNo, true);
        Model::validateRequired('productType', $this->productType, true);
        Model::validateRequired('productName', $this->productName, true);
        Model::validateRequired('financialNo', $this->financialNo, true);
        Model::validateRequired('financialName', $this->financialName, true);
        Model::validateRequired('roleRatio', $this->roleRatio, true);
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
        if (null !== $this->productNo) {
            $res['product_no'] = $this->productNo;
        }
        if (null !== $this->productType) {
            $res['product_type'] = $this->productType;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->financialNo) {
            $res['financial_no'] = $this->financialNo;
        }
        if (null !== $this->financialName) {
            $res['financial_name'] = $this->financialName;
        }
        if (null !== $this->roleRatio) {
            $res['role_ratio'] = [];
            if (null !== $this->roleRatio && \is_array($this->roleRatio)) {
                $n = 0;
                foreach ($this->roleRatio as $item) {
                    $res['role_ratio'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateCmportProfitrateRequest
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
        if (isset($map['product_no'])) {
            $model->productNo = $map['product_no'];
        }
        if (isset($map['product_type'])) {
            $model->productType = $map['product_type'];
        }
        if (isset($map['product_name'])) {
            $model->productName = $map['product_name'];
        }
        if (isset($map['financial_no'])) {
            $model->financialNo = $map['financial_no'];
        }
        if (isset($map['financial_name'])) {
            $model->financialName = $map['financial_name'];
        }
        if (isset($map['role_ratio'])) {
            if (!empty($map['role_ratio'])) {
                $model->roleRatio = [];
                $n                = 0;
                foreach ($map['role_ratio'] as $item) {
                    $model->roleRatio[$n++] = null !== $item ? RoleRatio::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
