<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryRtopCompanyRiskyRequest extends Model
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

    // 数据时间
    /**
     * @var string
     */
    public $dataTime;

    // 全局态势中的列表 类型
    /**
     * @var string
     */
    public $listType;

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

    // 全局动态类型
    /**
     * @var string
     */
    public $type;

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
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'dataTime'          => 'data_time',
        'listType'          => 'list_type',
        'pageNo'            => 'page_no',
        'pageSize'          => 'page_size',
        'type'              => 'type',
        'userPlace'         => 'user_place',
        'userPlaceType'     => 'user_place_type',
    ];

    public function validate()
    {
        Model::validateRequired('dataTime', $this->dataTime, true);
        Model::validateRequired('listType', $this->listType, true);
        Model::validateRequired('pageNo', $this->pageNo, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('userPlace', $this->userPlace, true);
        Model::validateRequired('userPlaceType', $this->userPlaceType, true);
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
        if (null !== $this->dataTime) {
            $res['data_time'] = $this->dataTime;
        }
        if (null !== $this->listType) {
            $res['list_type'] = $this->listType;
        }
        if (null !== $this->pageNo) {
            $res['page_no'] = $this->pageNo;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
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
     *
     * @return QueryRtopCompanyRiskyRequest
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
        if (isset($map['data_time'])) {
            $model->dataTime = $map['data_time'];
        }
        if (isset($map['list_type'])) {
            $model->listType = $map['list_type'];
        }
        if (isset($map['page_no'])) {
            $model->pageNo = $map['page_no'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['user_place'])) {
            $model->userPlace = $map['user_place'];
        }
        if (isset($map['user_place_type'])) {
            $model->userPlaceType = $map['user_place_type'];
        }

        return $model;
    }
}
