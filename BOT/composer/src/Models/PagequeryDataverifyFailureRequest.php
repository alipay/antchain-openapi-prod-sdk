<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class PagequeryDataverifyFailureRequest extends Model
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

    // 页数，默认1
    /**
     * @var int
     */
    public $pageIndex;

    // 页码大小，默认10
    /**
     * @var int
     */
    public $pageSize;

    // 场景码
    //
    /**
     * @var string
     */
    public $scene;

    // 起始查询时间
    /**
     * @var string
     */
    public $startDate;

    // 结束查询时间
    /**
     * @var string
     */
    public $endDate;

    // 设备ID（模糊查询）
    /**
     * @var string
     */
    public $deviceId;

    // 数据来源：0(普通数据上报)；1(MAAS数据上报)；2(设备业务数据上报);3(标签流转)
    /**
     * @var int
     */
    public $source;

    // 类型：0:数据上报;1:数据完整性校验
    /**
     * @var int
     */
    public $type;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'pageIndex'         => 'page_index',
        'pageSize'          => 'page_size',
        'scene'             => 'scene',
        'startDate'         => 'start_date',
        'endDate'           => 'end_date',
        'deviceId'          => 'device_id',
        'source'            => 'source',
        'type'              => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('pageIndex', $this->pageIndex, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('startDate', $this->startDate, true);
        Model::validateRequired('endDate', $this->endDate, true);
        Model::validatePattern('startDate', $this->startDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('endDate', $this->endDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->pageIndex) {
            $res['page_index'] = $this->pageIndex;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->startDate) {
            $res['start_date'] = $this->startDate;
        }
        if (null !== $this->endDate) {
            $res['end_date'] = $this->endDate;
        }
        if (null !== $this->deviceId) {
            $res['device_id'] = $this->deviceId;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryDataverifyFailureRequest
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
        if (isset($map['page_index'])) {
            $model->pageIndex = $map['page_index'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['start_date'])) {
            $model->startDate = $map['start_date'];
        }
        if (isset($map['end_date'])) {
            $model->endDate = $map['end_date'];
        }
        if (isset($map['device_id'])) {
            $model->deviceId = $map['device_id'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
