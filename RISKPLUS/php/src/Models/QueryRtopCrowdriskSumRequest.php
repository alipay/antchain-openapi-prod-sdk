<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryRtopCrowdriskSumRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'companyIds' => 'company_ids',
        'placeName' => 'place_name',
        'placeType' => 'place_type',
    ];
    public function validate() {
        Model::validateRequired('companyIds', $this->companyIds, true);
        Model::validateRequired('placeName', $this->placeName, true);
        Model::validateRequired('placeType', $this->placeType, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->companyIds) {
            $res['company_ids'] = $this->companyIds;
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
     * @return QueryRtopCrowdriskSumRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['company_ids'])){
            if(!empty($map['company_ids'])){
                $model->companyIds = $map['company_ids'];
            }
        }
        if(isset($map['place_name'])){
            $model->placeName = $map['place_name'];
        }
        if(isset($map['place_type'])){
            $model->placeType = $map['place_type'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 指定的企业ID列表，企业ID数量不超过100个。
    /**
     * @var string[]
     */
    public $companyIds;

    // 指定的地区名称，例如温州市、鹿城区等
    /**
     * @var string
     */
    public $placeName;

    // 地区类型，PROVINCE表示省，CITY表示市，COUNTY表示县
    /**
     * @var string
     */
    public $placeType;

}
