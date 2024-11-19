<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class CreateAntchainAtoWithholdActivepayRequest extends Model
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

    // 订单id 长度不可超过50
    /**
     * @var string
     */
    public $orderId;

    // 第几期,当支付类型为PERFORMANCE或为空必填
    /**
     * @var int
     */
    public $periodNum;

    // 支付类型
    /**
     * @var string
     */
    public $payType;

    // 支付渠道，非必填。可选值：JSAPI-JSAPI支付，APP-APP支付。默认值：JSAPI
    /**
     * @var string
     */
    public $payChannel;

    // 支付金额，单位为分
    /**
     * @var int
     */
    public $payAmount;

    // 经营分账标识Y/N
    // 当pay_type=BUYOUT、PENALTY必填。
    /**
     * @var string
     */
    public $operationDivideFlag;

    // 当operation_divide_flag=Y 必填
    // 经营分账收入列表，最多10条，分账比例与正常限制一致。
    /**
     * @var OperationDivideTransInModel[]
     */
    public $operationDivideTransInList;
    protected $_name = [
        'authToken'                  => 'auth_token',
        'productInstanceId'          => 'product_instance_id',
        'orderId'                    => 'order_id',
        'periodNum'                  => 'period_num',
        'payType'                    => 'pay_type',
        'payChannel'                 => 'pay_channel',
        'payAmount'                  => 'pay_amount',
        'operationDivideFlag'        => 'operation_divide_flag',
        'operationDivideTransInList' => 'operation_divide_trans_in_list',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateMaxLength('orderId', $this->orderId, 50);
        Model::validateMaxLength('payType', $this->payType, 64);
        Model::validateMaxLength('payChannel', $this->payChannel, 64);
        Model::validateMaxLength('operationDivideFlag', $this->operationDivideFlag, 1);
        Model::validateMinimum('periodNum', $this->periodNum, 1);
        Model::validateMinimum('payAmount', $this->payAmount, 1);
        Model::validateMinLength('payType', $this->payType, 1);
        Model::validateMinLength('payChannel', $this->payChannel, 1);
        Model::validateMinLength('operationDivideFlag', $this->operationDivideFlag, 1);
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
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->periodNum) {
            $res['period_num'] = $this->periodNum;
        }
        if (null !== $this->payType) {
            $res['pay_type'] = $this->payType;
        }
        if (null !== $this->payChannel) {
            $res['pay_channel'] = $this->payChannel;
        }
        if (null !== $this->payAmount) {
            $res['pay_amount'] = $this->payAmount;
        }
        if (null !== $this->operationDivideFlag) {
            $res['operation_divide_flag'] = $this->operationDivideFlag;
        }
        if (null !== $this->operationDivideTransInList) {
            $res['operation_divide_trans_in_list'] = [];
            if (null !== $this->operationDivideTransInList && \is_array($this->operationDivideTransInList)) {
                $n = 0;
                foreach ($this->operationDivideTransInList as $item) {
                    $res['operation_divide_trans_in_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAntchainAtoWithholdActivepayRequest
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
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['period_num'])) {
            $model->periodNum = $map['period_num'];
        }
        if (isset($map['pay_type'])) {
            $model->payType = $map['pay_type'];
        }
        if (isset($map['pay_channel'])) {
            $model->payChannel = $map['pay_channel'];
        }
        if (isset($map['pay_amount'])) {
            $model->payAmount = $map['pay_amount'];
        }
        if (isset($map['operation_divide_flag'])) {
            $model->operationDivideFlag = $map['operation_divide_flag'];
        }
        if (isset($map['operation_divide_trans_in_list'])) {
            if (!empty($map['operation_divide_trans_in_list'])) {
                $model->operationDivideTransInList = [];
                $n                                 = 0;
                foreach ($map['operation_divide_trans_in_list'] as $item) {
                    $model->operationDivideTransInList[$n++] = null !== $item ? OperationDivideTransInModel::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
