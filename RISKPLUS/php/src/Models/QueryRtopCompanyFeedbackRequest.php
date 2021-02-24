<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryRtopCompanyFeedbackRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'pageNo' => 'page_no',
        'pageSize' => 'page_size',
        'userPlace' => 'user_place',
        'userPlaceType' => 'user_place_type',
    ];
    public function validate() {
        Model::validateRequired('pageNo', $this->pageNo, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('userPlace', $this->userPlace, true);
        Model::validateRequired('userPlaceType', $this->userPlaceType, true);
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
        if (null !== $this->userPlace) {
            $res['user_place'] = $this->userPlace;
        }
        if (null !== $this->userPlaceType) {
            $res['user_place_type'] = $this->userPlaceType;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryRtopCompanyFeedbackRequest
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
        if(isset($map['user_place'])){
            $model->userPlace = $map['user_place'];
        }
        if(isset($map['user_place_type'])){
            $model->userPlaceType = $map['user_place_type'];
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

    // 当前是第几页
    /**
     * @var int
     */
    public $pageNo;

    // 每一页的记录条数
    /**
     * @var int
     */
    public $pageSize;

    // 用户属地
    /**
     * @var string
     */
    public $userPlace;

    // 用户所在地类型
    /**
     * @var string
     */
    public $userPlaceType;

}
