<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class StubCommonInfo extends Model
{
    // 项目名称
    /**
     * @example 黄山景区数字票根
     *
     * @var string
     */
    public $projectName;

    // 客户名称（三方合约中甲方名称：景区或服务商）
    /**
     * @example 黄山景区
     *
     * @var string
     */
    public $sceneName;

    // 业务类型。目前只有数字票根这一个情景，枚举为：TICKET_STUB
    /**
     * @example TICKET_STUB
     *
     * @var string
     */
    public $bizType;

    // 业务来源；Alipay：支付宝，Scene：景区
    /**
     * @example Alipay
     *
     * @var string
     */
    public $bizSource;

    // 订单id。若bizSource为支付宝情况下传支付宝流水号（业务系统的出票流水号）；若bizSource为景区时传上游生成的订单号
    /**
     * @example xxxxxx
     *
     * @var string
     */
    public $orderId;

    // 订单名称
    /**
     * @example xxxxxx
     *
     * @var string
     */
    public $orderName;

    // 订单总金额，单位：分。如传100，即为100分，1元
    /**
     * @example 100
     *
     * @var int
     */
    public $orderAmount;

    // 下单时间
    /**
     * @example 2022-04-15 17:05:37
     *
     * @var string
     */
    public $orderTime;

    // 待分账金额，单位：分。如传100，即为100分，1元
    /**
     * @example 100
     *
     * @var int
     */
    public $stubAmount;

    // 客户id。支付宝情况下传支付宝id，2088打头；景区时可传自定义的客户id
    /**
     * @example 2088xxxxx
     *
     * @var string
     */
    public $customerId;
    protected $_name = [
        'projectName' => 'project_name',
        'sceneName'   => 'scene_name',
        'bizType'     => 'biz_type',
        'bizSource'   => 'biz_source',
        'orderId'     => 'order_id',
        'orderName'   => 'order_name',
        'orderAmount' => 'order_amount',
        'orderTime'   => 'order_time',
        'stubAmount'  => 'stub_amount',
        'customerId'  => 'customer_id',
    ];

    public function validate()
    {
        Model::validateRequired('projectName', $this->projectName, true);
        Model::validateRequired('sceneName', $this->sceneName, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('bizSource', $this->bizSource, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('orderAmount', $this->orderAmount, true);
        Model::validateRequired('orderTime', $this->orderTime, true);
        Model::validateRequired('stubAmount', $this->stubAmount, true);
        Model::validateRequired('customerId', $this->customerId, true);
        Model::validatePattern('orderTime', $this->orderTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->projectName) {
            $res['project_name'] = $this->projectName;
        }
        if (null !== $this->sceneName) {
            $res['scene_name'] = $this->sceneName;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->bizSource) {
            $res['biz_source'] = $this->bizSource;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->orderName) {
            $res['order_name'] = $this->orderName;
        }
        if (null !== $this->orderAmount) {
            $res['order_amount'] = $this->orderAmount;
        }
        if (null !== $this->orderTime) {
            $res['order_time'] = $this->orderTime;
        }
        if (null !== $this->stubAmount) {
            $res['stub_amount'] = $this->stubAmount;
        }
        if (null !== $this->customerId) {
            $res['customer_id'] = $this->customerId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StubCommonInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['project_name'])) {
            $model->projectName = $map['project_name'];
        }
        if (isset($map['scene_name'])) {
            $model->sceneName = $map['scene_name'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['biz_source'])) {
            $model->bizSource = $map['biz_source'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['order_name'])) {
            $model->orderName = $map['order_name'];
        }
        if (isset($map['order_amount'])) {
            $model->orderAmount = $map['order_amount'];
        }
        if (isset($map['order_time'])) {
            $model->orderTime = $map['order_time'];
        }
        if (isset($map['stub_amount'])) {
            $model->stubAmount = $map['stub_amount'];
        }
        if (isset($map['customer_id'])) {
            $model->customerId = $map['customer_id'];
        }

        return $model;
    }
}
