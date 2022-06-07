<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INDUSTRY\Models;

use AlibabaCloud\Tea\Model;

class PushServiceMeterdataRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 业务唯一单据号，最大64
    /**
     * @var string
     */
    public $bizNo;

    // 来源场景码, 由中台分配给业务方
    /**
     * @var string
     */
    public $source;

    // 行业渠道码(由经支中台分配给业务方)
    /**
     * @var string
     */
    public $channel;

    // 业务发生时间
    /**
     * @var string
     */
    public $gmtService;

    // 服务唯一标识码
    /**
     * @var string
     */
    public $serviceCode;

    // 如果是金额，请填写分；如果是次数，请填写整数
    /**
     * @var string
     */
    public $serviceAmount;

    // 服务量单位，如果是金额，请填写币种value(exp:156),如果是次数/个,填写UU
    /**
     * @var string
     */
    public $serviceUnit;

    // 业务标题
    /**
     * @var string
     */
    public $serviceSubject;

    // 业务详细内容
    /**
     * @var string
     */
    public $serviceBody;

    // 会员id;如果是商户，那么是商户uid,如果是用户，那么是会员id
    /**
     * @var string
     */
    public $userId;

    // 基本与user_id保持一致
    /**
     * @var string
     */
    public $buyerId;

    // 卖家id,用于代收付场景
    /**
     * @var string
     */
    public $sellerId;

    // 扩展属性字段
    /**
     * @var string
     */
    public $properties;
    protected $_name = [
        'authToken'      => 'auth_token',
        'bizNo'          => 'biz_no',
        'source'         => 'source',
        'channel'        => 'channel',
        'gmtService'     => 'gmt_service',
        'serviceCode'    => 'service_code',
        'serviceAmount'  => 'service_amount',
        'serviceUnit'    => 'service_unit',
        'serviceSubject' => 'service_subject',
        'serviceBody'    => 'service_body',
        'userId'         => 'user_id',
        'buyerId'        => 'buyer_id',
        'sellerId'       => 'seller_id',
        'properties'     => 'properties',
    ];

    public function validate()
    {
        Model::validateRequired('bizNo', $this->bizNo, true);
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('channel', $this->channel, true);
        Model::validateRequired('gmtService', $this->gmtService, true);
        Model::validateRequired('serviceCode', $this->serviceCode, true);
        Model::validateRequired('serviceAmount', $this->serviceAmount, true);
        Model::validateRequired('serviceUnit', $this->serviceUnit, true);
        Model::validateRequired('serviceSubject', $this->serviceSubject, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('buyerId', $this->buyerId, true);
        Model::validateRequired('properties', $this->properties, true);
        Model::validateMaxLength('bizNo', $this->bizNo, 64);
        Model::validateMaxLength('source', $this->source, 32);
        Model::validateMaxLength('channel', $this->channel, 32);
        Model::validateMaxLength('serviceCode', $this->serviceCode, 32);
        Model::validateMaxLength('serviceAmount', $this->serviceAmount, 32);
        Model::validateMaxLength('serviceUnit', $this->serviceUnit, 16);
        Model::validateMaxLength('serviceSubject', $this->serviceSubject, 128);
        Model::validateMaxLength('serviceBody', $this->serviceBody, 512);
        Model::validateMaxLength('userId', $this->userId, 32);
        Model::validateMaxLength('buyerId', $this->buyerId, 32);
        Model::validateMaxLength('sellerId', $this->sellerId, 32);
        Model::validateMaxLength('properties', $this->properties, 512);
        Model::validatePattern('gmtService', $this->gmtService, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->bizNo) {
            $res['biz_no'] = $this->bizNo;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->channel) {
            $res['channel'] = $this->channel;
        }
        if (null !== $this->gmtService) {
            $res['gmt_service'] = $this->gmtService;
        }
        if (null !== $this->serviceCode) {
            $res['service_code'] = $this->serviceCode;
        }
        if (null !== $this->serviceAmount) {
            $res['service_amount'] = $this->serviceAmount;
        }
        if (null !== $this->serviceUnit) {
            $res['service_unit'] = $this->serviceUnit;
        }
        if (null !== $this->serviceSubject) {
            $res['service_subject'] = $this->serviceSubject;
        }
        if (null !== $this->serviceBody) {
            $res['service_body'] = $this->serviceBody;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->buyerId) {
            $res['buyer_id'] = $this->buyerId;
        }
        if (null !== $this->sellerId) {
            $res['seller_id'] = $this->sellerId;
        }
        if (null !== $this->properties) {
            $res['properties'] = $this->properties;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushServiceMeterdataRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['biz_no'])) {
            $model->bizNo = $map['biz_no'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['channel'])) {
            $model->channel = $map['channel'];
        }
        if (isset($map['gmt_service'])) {
            $model->gmtService = $map['gmt_service'];
        }
        if (isset($map['service_code'])) {
            $model->serviceCode = $map['service_code'];
        }
        if (isset($map['service_amount'])) {
            $model->serviceAmount = $map['service_amount'];
        }
        if (isset($map['service_unit'])) {
            $model->serviceUnit = $map['service_unit'];
        }
        if (isset($map['service_subject'])) {
            $model->serviceSubject = $map['service_subject'];
        }
        if (isset($map['service_body'])) {
            $model->serviceBody = $map['service_body'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['buyer_id'])) {
            $model->buyerId = $map['buyer_id'];
        }
        if (isset($map['seller_id'])) {
            $model->sellerId = $map['seller_id'];
        }
        if (isset($map['properties'])) {
            $model->properties = $map['properties'];
        }

        return $model;
    }
}
