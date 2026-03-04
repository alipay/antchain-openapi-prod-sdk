<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryElectrocarTravelRequest extends Model
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

    // iffaa 硬件唯一ID
    /**
     * @var string
     */
    public $tuid;

    // 行程数据查询模式
    /**
     * @var int
     */
    public $tripDataModel;

    // 注：trip_data_model = 3 必传
    /**
     * @var string
     */
    public $tripId;

    // 时间范围
    // 注：trip_data_model = 3 不需要传
    /**
     * @var string
     */
    public $timeRange;

    // 默认1
    /**
     * @var int
     */
    public $pageNum;

    // 默认20
    /**
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tuid'              => 'tuid',
        'tripDataModel'     => 'trip_data_model',
        'tripId'            => 'trip_id',
        'timeRange'         => 'time_range',
        'pageNum'           => 'page_num',
        'pageSize'          => 'page_size',
    ];

    public function validate()
    {
        Model::validateRequired('tuid', $this->tuid, true);
        Model::validateRequired('tripDataModel', $this->tripDataModel, true);
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
        if (null !== $this->tuid) {
            $res['tuid'] = $this->tuid;
        }
        if (null !== $this->tripDataModel) {
            $res['trip_data_model'] = $this->tripDataModel;
        }
        if (null !== $this->tripId) {
            $res['trip_id'] = $this->tripId;
        }
        if (null !== $this->timeRange) {
            $res['time_range'] = $this->timeRange;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryElectrocarTravelRequest
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
        if (isset($map['tuid'])) {
            $model->tuid = $map['tuid'];
        }
        if (isset($map['trip_data_model'])) {
            $model->tripDataModel = $map['trip_data_model'];
        }
        if (isset($map['trip_id'])) {
            $model->tripId = $map['trip_id'];
        }
        if (isset($map['time_range'])) {
            $model->timeRange = $map['time_range'];
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }

        return $model;
    }
}
