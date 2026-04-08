<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MORSERTA\Models;

use AlibabaCloud\Tea\Model;

class SaveDataConversionRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 追踪ID，每次请求保持唯一
    /**
     * @var string
     */
    public $traceId;

    // 客户ID，广告主标识
    /**
     * @var string
     */
    public $sponsorCode;

    // 转化对应的产品id，由数科提供，建议填写
    /**
     * @var string
     */
    public $productId;

    // 唯一标识当前转化事件id，用于转化事件的去重避免重复统计，建议填写，可以是订单ID等业务唯一ID。
    /**
     * @var string
     */
    public $eventId;

    // 转化发生的unix事件戳,单位毫秒
    /**
     * @var int
     */
    public $eventTime;

    // 转化事件类型
    /**
     * @var string
     */
    public $eventCode;

    // json字符串，转化附加参数
    /**
     * @var string
     */
    public $eventParam;

    // 转化所属用户在客户系统中的用户id，如电话号码Md5 建议填写
    /**
     * @var string
     */
    public $userId;

    // json字段，格式： {"xxx": xxx, "yyyy":"yyyy"}，
    // H5/小程序类：为投放前与蚂蚁数科约定的在落地页URL中的埋点参数，包含转化对应的媒体侧返回信息，如click_id, gdt_vid, request_id 跳转链接等务必全量提供
    // App类：设备ID（ Android ID、OAID、OAID_MD5、IDFA、IDFA_MD5、CAID），点击ID、请求ID等
    // 数科侧会依据该信息与自行收集到的点击进行匹配归因，务必详尽提供。
    // 此部分字段信息需在接入前双方确认，主要与媒体平台、投放载体（H5、微信小程序、手机App等）有关，需要客户支持采集(如H5 URL拼接埋点参数、小程序path埋点参数）
    // 具体请参考文档
    /**
     * @var string
     */
    public $traceInfo;

    // json扩展字段。保险行业必填insurance_info，见文档
    /**
     * @var string
     */
    public $extInfo;
    protected $_name = [
        'authToken'   => 'auth_token',
        'traceId'     => 'trace_id',
        'sponsorCode' => 'sponsor_code',
        'productId'   => 'product_id',
        'eventId'     => 'event_id',
        'eventTime'   => 'event_time',
        'eventCode'   => 'event_code',
        'eventParam'  => 'event_param',
        'userId'      => 'user_id',
        'traceInfo'   => 'trace_info',
        'extInfo'     => 'ext_info',
    ];

    public function validate()
    {
        Model::validateRequired('traceId', $this->traceId, true);
        Model::validateRequired('sponsorCode', $this->sponsorCode, true);
        Model::validateRequired('eventTime', $this->eventTime, true);
        Model::validateRequired('eventCode', $this->eventCode, true);
        Model::validateRequired('traceInfo', $this->traceInfo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }
        if (null !== $this->sponsorCode) {
            $res['sponsor_code'] = $this->sponsorCode;
        }
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }
        if (null !== $this->eventId) {
            $res['event_id'] = $this->eventId;
        }
        if (null !== $this->eventTime) {
            $res['event_time'] = $this->eventTime;
        }
        if (null !== $this->eventCode) {
            $res['event_code'] = $this->eventCode;
        }
        if (null !== $this->eventParam) {
            $res['event_param'] = $this->eventParam;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->traceInfo) {
            $res['trace_info'] = $this->traceInfo;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaveDataConversionRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['trace_id'])) {
            $model->traceId = $map['trace_id'];
        }
        if (isset($map['sponsor_code'])) {
            $model->sponsorCode = $map['sponsor_code'];
        }
        if (isset($map['product_id'])) {
            $model->productId = $map['product_id'];
        }
        if (isset($map['event_id'])) {
            $model->eventId = $map['event_id'];
        }
        if (isset($map['event_time'])) {
            $model->eventTime = $map['event_time'];
        }
        if (isset($map['event_code'])) {
            $model->eventCode = $map['event_code'];
        }
        if (isset($map['event_param'])) {
            $model->eventParam = $map['event_param'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['trace_info'])) {
            $model->traceInfo = $map['trace_info'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }

        return $model;
    }
}
