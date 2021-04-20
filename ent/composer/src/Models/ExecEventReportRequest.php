<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ENT\Models;

use AlibabaCloud\Tea\Model;

class ExecEventReportRequest extends Model
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

    // 事件类型，目前支持类型 VISIT：访问事件，TRADE：交易事件，SHARE：分享事件
    /**
     * @var string
     */
    public $eventType;

    // 事件实例编码，目前支持访问事件，VISIT类别包括MINI_HOME_PAGE：访问首页，CONTRACT_DETAIL_OAGE：访问项目详情页，SHARE_LANDING_PAGE：访问分享页，TRADE类别包括TRADE_SUCCESS：购买成功，REFUND_SUCCESS: 退货成功，SHARE类别包括SHARE_FROM_MERCHANT
    /**
     * @var string
     */
    public $eventInstanceCode;

    // 购买人或者访问者
    /**
     * @var User
     */
    public $eventChild;

    // 分享者
    /**
     * @var User
     */
    public $eventParent;

    // 唯一业务单号
    /**
     * @var string
     */
    public $requestId;

    // 项目唯一编号，访问详情页和回流页、购买事件必填
    /**
     * @var string
     */
    public $projectId;

    // 到账类型，DIRECT：直接到账， TWO_STEP_MANUAL：手动到账，TWO_STEP：定时到账
    /**
     * @var string
     */
    public $confirmType;

    // 到账时间。当到账类型为定时到账时，该字段必填。
    /**
     * @var string
     */
    public $confirmTime;

    // 交易订单数据
    /**
     * @var TradeOrder
     */
    public $tradeOrder;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'eventType'         => 'event_type',
        'eventInstanceCode' => 'event_instance_code',
        'eventChild'        => 'event_child',
        'eventParent'       => 'event_parent',
        'requestId'         => 'request_id',
        'projectId'         => 'project_id',
        'confirmType'       => 'confirm_type',
        'confirmTime'       => 'confirm_time',
        'tradeOrder'        => 'trade_order',
    ];

    public function validate()
    {
        Model::validateRequired('eventType', $this->eventType, true);
        Model::validateRequired('eventInstanceCode', $this->eventInstanceCode, true);
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validatePattern('confirmTime', $this->confirmTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->eventType) {
            $res['event_type'] = $this->eventType;
        }
        if (null !== $this->eventInstanceCode) {
            $res['event_instance_code'] = $this->eventInstanceCode;
        }
        if (null !== $this->eventChild) {
            $res['event_child'] = null !== $this->eventChild ? $this->eventChild->toMap() : null;
        }
        if (null !== $this->eventParent) {
            $res['event_parent'] = null !== $this->eventParent ? $this->eventParent->toMap() : null;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->confirmType) {
            $res['confirm_type'] = $this->confirmType;
        }
        if (null !== $this->confirmTime) {
            $res['confirm_time'] = $this->confirmTime;
        }
        if (null !== $this->tradeOrder) {
            $res['trade_order'] = null !== $this->tradeOrder ? $this->tradeOrder->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecEventReportRequest
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
        if (isset($map['event_type'])) {
            $model->eventType = $map['event_type'];
        }
        if (isset($map['event_instance_code'])) {
            $model->eventInstanceCode = $map['event_instance_code'];
        }
        if (isset($map['event_child'])) {
            $model->eventChild = User::fromMap($map['event_child']);
        }
        if (isset($map['event_parent'])) {
            $model->eventParent = User::fromMap($map['event_parent']);
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['confirm_type'])) {
            $model->confirmType = $map['confirm_type'];
        }
        if (isset($map['confirm_time'])) {
            $model->confirmTime = $map['confirm_time'];
        }
        if (isset($map['trade_order'])) {
            $model->tradeOrder = TradeOrder::fromMap($map['trade_order']);
        }

        return $model;
    }
}
