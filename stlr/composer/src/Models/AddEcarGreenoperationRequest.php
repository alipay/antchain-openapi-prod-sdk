<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class AddEcarGreenoperationRequest extends Model
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

    // 绿色行为类型，目前支持包括：
    // ElectronicInvoice(电子发票),
    // LowCarbonCommodity(低碳商品),
    // ReusableBag(环保减塑)
    // OfflinePayment(线下支付)
    // GreenOrder(绿色订单，可以同时解析出低碳商品、环保减塑、线下支付等多种绿色行为)
    /**
     * @var string
     */
    public $greenOperationType;

    // 绿色行为相关的业务单号
    /**
     * @var string
     */
    public $enterpriseBizNo;

    // 发生时间，格式应如：2021-07-21 12:11:11
    /**
     * @var string
     */
    public $occurrenceTime;

    // 绿色行为数据扩展信息，必须为JSON格式，碳矩阵将分析解析数据检查获取相关的绿色行为数据
    /**
     * @var string
     */
    public $extInfo;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'greenOperationType' => 'green_operation_type',
        'enterpriseBizNo'    => 'enterprise_biz_no',
        'occurrenceTime'     => 'occurrence_time',
        'extInfo'            => 'ext_info',
    ];

    public function validate()
    {
        Model::validateRequired('greenOperationType', $this->greenOperationType, true);
        Model::validateRequired('enterpriseBizNo', $this->enterpriseBizNo, true);
        Model::validateRequired('occurrenceTime', $this->occurrenceTime, true);
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
        if (null !== $this->greenOperationType) {
            $res['green_operation_type'] = $this->greenOperationType;
        }
        if (null !== $this->enterpriseBizNo) {
            $res['enterprise_biz_no'] = $this->enterpriseBizNo;
        }
        if (null !== $this->occurrenceTime) {
            $res['occurrence_time'] = $this->occurrenceTime;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddEcarGreenoperationRequest
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
        if (isset($map['green_operation_type'])) {
            $model->greenOperationType = $map['green_operation_type'];
        }
        if (isset($map['enterprise_biz_no'])) {
            $model->enterpriseBizNo = $map['enterprise_biz_no'];
        }
        if (isset($map['occurrence_time'])) {
            $model->occurrenceTime = $map['occurrence_time'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }

        return $model;
    }
}
