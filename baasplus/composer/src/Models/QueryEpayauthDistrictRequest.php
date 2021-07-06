<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryEpayauthDistrictRequest extends Model
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

    // 父级行政地区编码。 不填则默认查询省级行政地区编码，支持省市县三级查询。
    /**
     * @var string
     */
    public $parentCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'parentCode'        => 'parent_code',
    ];

    public function validate()
    {
        Model::validateRequired('parentCode', $this->parentCode, true);
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
        if (null !== $this->parentCode) {
            $res['parent_code'] = $this->parentCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryEpayauthDistrictRequest
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
        if (isset($map['parent_code'])) {
            $model->parentCode = $map['parent_code'];
        }

        return $model;
    }
}
