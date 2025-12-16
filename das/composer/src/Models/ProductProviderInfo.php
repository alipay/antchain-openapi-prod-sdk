<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class ProductProviderInfo extends Model
{
    // 数据产品标识
    /**
     * @example -
     *
     * @var string
     */
    public $productIdentityId;

    // 数据源企业code
    /**
     * @example -
     *
     * @var string
     */
    public $sourceEnterpriseCode;

    // 数据源企业名称
    /**
     * @example -
     *
     * @var string
     */
    public $sourceEnterpriseName;
    protected $_name = [
        'productIdentityId'    => 'product_identity_id',
        'sourceEnterpriseCode' => 'source_enterprise_code',
        'sourceEnterpriseName' => 'source_enterprise_name',
    ];

    public function validate()
    {
        Model::validateRequired('productIdentityId', $this->productIdentityId, true);
        Model::validateRequired('sourceEnterpriseCode', $this->sourceEnterpriseCode, true);
        Model::validateRequired('sourceEnterpriseName', $this->sourceEnterpriseName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->productIdentityId) {
            $res['product_identity_id'] = $this->productIdentityId;
        }
        if (null !== $this->sourceEnterpriseCode) {
            $res['source_enterprise_code'] = $this->sourceEnterpriseCode;
        }
        if (null !== $this->sourceEnterpriseName) {
            $res['source_enterprise_name'] = $this->sourceEnterpriseName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProductProviderInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['product_identity_id'])) {
            $model->productIdentityId = $map['product_identity_id'];
        }
        if (isset($map['source_enterprise_code'])) {
            $model->sourceEnterpriseCode = $map['source_enterprise_code'];
        }
        if (isset($map['source_enterprise_name'])) {
            $model->sourceEnterpriseName = $map['source_enterprise_name'];
        }

        return $model;
    }
}
