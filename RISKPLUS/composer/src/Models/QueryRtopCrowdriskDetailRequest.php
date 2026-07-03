<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryRtopCrowdriskDetailRequest extends Model
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

    // 企业ID
    /**
     * @var string
     */
    public $companyId;

    // 所在地的名称
    /**
     * @var string
     */
    public $placeName;

    // 地区类型
    /**
     * @var string
     */
    public $placeType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'companyId'         => 'company_id',
        'placeName'         => 'place_name',
        'placeType'         => 'place_type',
    ];

    public function validate()
    {
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
        if (null !== $this->companyId) {
            $res['company_id'] = $this->companyId;
        }
        if (null !== $this->placeName) {
            $res['place_name'] = $this->placeName;
        }
        if (null !== $this->placeType) {
            $res['place_type'] = $this->placeType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRtopCrowdriskDetailRequest
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
        if (isset($map['company_id'])) {
            $model->companyId = $map['company_id'];
        }
        if (isset($map['place_name'])) {
            $model->placeName = $map['place_name'];
        }
        if (isset($map['place_type'])) {
            $model->placeType = $map['place_type'];
        }

        return $model;
    }
}
