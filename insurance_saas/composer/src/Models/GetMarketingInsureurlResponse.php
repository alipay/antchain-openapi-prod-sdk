<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class GetMarketingInsureurlResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 请求 id
    /**
     * @var string
     */
    public $requestId;

    // 一级渠道编码
    /**
     * @var string
     */
    public $firstChannel;

    // 二级渠道编码
    /**
     * @var string
     */
    public $secondChannel;

    // 三级渠道/广告版位
    /**
     * @var string
     */
    public $advertisingPosition;

    // 订单号
    /**
     * @var string
     */
    public $sceneOrderNo;

    // 特征编码
    /**
     * @var string
     */
    public $clickId;

    // 投保页面URL
    /**
     * @var string
     */
    public $insureUrl;
    protected $_name = [
        'reqMsgId'            => 'req_msg_id',
        'resultCode'          => 'result_code',
        'resultMsg'           => 'result_msg',
        'requestId'           => 'request_id',
        'firstChannel'        => 'first_channel',
        'secondChannel'       => 'second_channel',
        'advertisingPosition' => 'advertising_position',
        'sceneOrderNo'        => 'scene_order_no',
        'clickId'             => 'click_id',
        'insureUrl'           => 'insure_url',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->firstChannel) {
            $res['first_channel'] = $this->firstChannel;
        }
        if (null !== $this->secondChannel) {
            $res['second_channel'] = $this->secondChannel;
        }
        if (null !== $this->advertisingPosition) {
            $res['advertising_position'] = $this->advertisingPosition;
        }
        if (null !== $this->sceneOrderNo) {
            $res['scene_order_no'] = $this->sceneOrderNo;
        }
        if (null !== $this->clickId) {
            $res['click_id'] = $this->clickId;
        }
        if (null !== $this->insureUrl) {
            $res['insure_url'] = $this->insureUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetMarketingInsureurlResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['first_channel'])) {
            $model->firstChannel = $map['first_channel'];
        }
        if (isset($map['second_channel'])) {
            $model->secondChannel = $map['second_channel'];
        }
        if (isset($map['advertising_position'])) {
            $model->advertisingPosition = $map['advertising_position'];
        }
        if (isset($map['scene_order_no'])) {
            $model->sceneOrderNo = $map['scene_order_no'];
        }
        if (isset($map['click_id'])) {
            $model->clickId = $map['click_id'];
        }
        if (isset($map['insure_url'])) {
            $model->insureUrl = $map['insure_url'];
        }

        return $model;
    }
}
