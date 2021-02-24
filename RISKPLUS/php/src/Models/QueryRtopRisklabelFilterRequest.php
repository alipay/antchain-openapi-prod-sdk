<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryRtopRisklabelFilterRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'pageNo' => 'page_no',
        'pageSize' => 'page_size',
        'placeName' => 'place_name',
        'placeType' => 'place_type',
    ];
    public function validate() {
        Model::validateRequired('pageNo', $this->pageNo, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
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
        if (null !== $this->pageNo) {
            $res['page_no'] = $this->pageNo;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
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
     * @return QueryRtopRisklabelFilterRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['page_no'])){
            $model->pageNo = $map['page_no'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
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

    // pageNo
    /**
     * @var int
     */
    public $pageNo;

    // page_size
    /**
     * @var int
     */
    public $pageSize;

    // 成都市
    /**
     * @var string
     */
    public $placeName;

    // CITY
    /**
     * @var string
     */
    public $placeType;

}
