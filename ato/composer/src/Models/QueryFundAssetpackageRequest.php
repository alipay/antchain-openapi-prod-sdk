<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryFundAssetpackageRequest extends Model
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

    // 资方社会信用代码
    /**
     * @var string
     */
    public $fundId;

    // 商家统一社会信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 商户的租户id
    /**
     * @var string
     */
    public $tenantId;

    // 用信id
    /**
     * @var string
     */
    public $utilizationId;

    // 资产包id
    /**
     * @var string
     */
    public $assetPackageId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fundId'            => 'fund_id',
        'merchantId'        => 'merchant_id',
        'tenantId'          => 'tenant_id',
        'utilizationId'     => 'utilization_id',
        'assetPackageId'    => 'asset_package_id',
    ];

    public function validate()
    {
        Model::validateRequired('fundId', $this->fundId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('assetPackageId', $this->assetPackageId, true);
        Model::validateMaxLength('fundId', $this->fundId, 200);
        Model::validateMaxLength('merchantId', $this->merchantId, 200);
        Model::validateMaxLength('tenantId', $this->tenantId, 10);
        Model::validateMaxLength('utilizationId', $this->utilizationId, 32);
        Model::validateMaxLength('assetPackageId', $this->assetPackageId, 64);
        Model::validateMinLength('fundId', $this->fundId, 1);
        Model::validateMinLength('merchantId', $this->merchantId, 1);
        Model::validateMinLength('tenantId', $this->tenantId, 1);
        Model::validateMinLength('utilizationId', $this->utilizationId, 1);
        Model::validateMinLength('assetPackageId', $this->assetPackageId, 1);
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
        if (null !== $this->fundId) {
            $res['fund_id'] = $this->fundId;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->utilizationId) {
            $res['utilization_id'] = $this->utilizationId;
        }
        if (null !== $this->assetPackageId) {
            $res['asset_package_id'] = $this->assetPackageId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryFundAssetpackageRequest
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
        if (isset($map['fund_id'])) {
            $model->fundId = $map['fund_id'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['utilization_id'])) {
            $model->utilizationId = $map['utilization_id'];
        }
        if (isset($map['asset_package_id'])) {
            $model->assetPackageId = $map['asset_package_id'];
        }

        return $model;
    }
}
