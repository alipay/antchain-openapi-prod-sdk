<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class QueryEtcVehicleRequest extends Model
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

    // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位。
    /**
     * @var string
     */
    public $outerOrderNo;

    // 企业侧车辆编号
    /**
     * @var string
     */
    public $corpVehicleId;

    // 车牌号码
    /**
     * @var string
     */
    public $plateNo;

    // 车牌颜色，枚举值
    // 蓝: BLUE
    // 黄: YELLOW
    // 黑: BLACK
    // 白: WHITE
    // 绿: GREEN
    /**
     * @var string
     */
    public $plateColor;

    // 企业运单号，唯一值
    /**
     * @var string
     */
    public $waybillNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'outerOrderNo'      => 'outer_order_no',
        'corpVehicleId'     => 'corp_vehicle_id',
        'plateNo'           => 'plate_no',
        'plateColor'        => 'plate_color',
        'waybillNo'         => 'waybill_no',
    ];

    public function validate()
    {
        Model::validateRequired('outerOrderNo', $this->outerOrderNo, true);
        Model::validateRequired('corpVehicleId', $this->corpVehicleId, true);
        Model::validateRequired('plateNo', $this->plateNo, true);
        Model::validateRequired('plateColor', $this->plateColor, true);
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
        if (null !== $this->outerOrderNo) {
            $res['outer_order_no'] = $this->outerOrderNo;
        }
        if (null !== $this->corpVehicleId) {
            $res['corp_vehicle_id'] = $this->corpVehicleId;
        }
        if (null !== $this->plateNo) {
            $res['plate_no'] = $this->plateNo;
        }
        if (null !== $this->plateColor) {
            $res['plate_color'] = $this->plateColor;
        }
        if (null !== $this->waybillNo) {
            $res['waybill_no'] = $this->waybillNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryEtcVehicleRequest
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
        if (isset($map['outer_order_no'])) {
            $model->outerOrderNo = $map['outer_order_no'];
        }
        if (isset($map['corp_vehicle_id'])) {
            $model->corpVehicleId = $map['corp_vehicle_id'];
        }
        if (isset($map['plate_no'])) {
            $model->plateNo = $map['plate_no'];
        }
        if (isset($map['plate_color'])) {
            $model->plateColor = $map['plate_color'];
        }
        if (isset($map['waybill_no'])) {
            $model->waybillNo = $map['waybill_no'];
        }

        return $model;
    }
}
