<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTEGRATION_MACHINE\Models;

use AlibabaCloud\Tea\Model;

class QueryDevicestatisticsRequest extends Model
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

    // 设备SN号(最大限制100条)
    /**
     * @var string[]
     */
    public $serialNoList;

    // 厂商名称
    // 为空时:默认值telpo(天波)
    // 可用枚举值:
    // telpo(天波)
    // hemiao(禾苗)
    /**
     * @var string
     */
    public $cropName;

    // 开始时间(精确到ms)
    /**
     * @var int
     */
    public $startTime;

    // 结束时间(精确到ms,时间跨度不能超过24h)
    /**
     * @var int
     */
    public $endTime;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'serialNoList'      => 'serial_no_list',
        'cropName'          => 'crop_name',
        'startTime'         => 'start_time',
        'endTime'           => 'end_time',
    ];

    public function validate()
    {
        Model::validateRequired('serialNoList', $this->serialNoList, true);
        Model::validateRequired('startTime', $this->startTime, true);
        Model::validateRequired('endTime', $this->endTime, true);
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
        if (null !== $this->serialNoList) {
            $res['serial_no_list'] = $this->serialNoList;
        }
        if (null !== $this->cropName) {
            $res['crop_name'] = $this->cropName;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDevicestatisticsRequest
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
        if (isset($map['serial_no_list'])) {
            if (!empty($map['serial_no_list'])) {
                $model->serialNoList = $map['serial_no_list'];
            }
        }
        if (isset($map['crop_name'])) {
            $model->cropName = $map['crop_name'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }

        return $model;
    }
}
