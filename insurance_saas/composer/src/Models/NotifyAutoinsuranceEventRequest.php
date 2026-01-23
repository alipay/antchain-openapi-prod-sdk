<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class NotifyAutoinsuranceEventRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 调用方生成的唯一编码，参考格式： yyyyMMdd_xxxxx，已接口请求的当前日期开头；
    /**
     * @var string
     */
    public $requestNo;

    // 车架号
    /**
     * @var string
     */
    public $vin;

    // 通知类型
    /**
     * @var string
     */
    public $noticeType;

    // 投保类型
    /**
     * @var string
     */
    public $insureType;

    // 发生时间yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $happenTime;

    // 附加信息，{"samePerson":true}  将会是一个JSON对象，samePerson表示车牌人和投保人是否同一个人，后续可能还会加其它附加信息。
    /**
     * @var string
     */
    public $extraInfo;
    protected $_name = [
        'authToken'  => 'auth_token',
        'requestNo'  => 'request_no',
        'vin'        => 'vin',
        'noticeType' => 'notice_type',
        'insureType' => 'insure_type',
        'happenTime' => 'happen_time',
        'extraInfo'  => 'extra_info',
    ];

    public function validate()
    {
        Model::validateRequired('requestNo', $this->requestNo, true);
        Model::validateRequired('vin', $this->vin, true);
        Model::validateRequired('noticeType', $this->noticeType, true);
        Model::validateRequired('insureType', $this->insureType, true);
        Model::validateRequired('happenTime', $this->happenTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->requestNo) {
            $res['request_no'] = $this->requestNo;
        }
        if (null !== $this->vin) {
            $res['vin'] = $this->vin;
        }
        if (null !== $this->noticeType) {
            $res['notice_type'] = $this->noticeType;
        }
        if (null !== $this->insureType) {
            $res['insure_type'] = $this->insureType;
        }
        if (null !== $this->happenTime) {
            $res['happen_time'] = $this->happenTime;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NotifyAutoinsuranceEventRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['request_no'])) {
            $model->requestNo = $map['request_no'];
        }
        if (isset($map['vin'])) {
            $model->vin = $map['vin'];
        }
        if (isset($map['notice_type'])) {
            $model->noticeType = $map['notice_type'];
        }
        if (isset($map['insure_type'])) {
            $model->insureType = $map['insure_type'];
        }
        if (isset($map['happen_time'])) {
            $model->happenTime = $map['happen_time'];
        }
        if (isset($map['extra_info'])) {
            $model->extraInfo = $map['extra_info'];
        }

        return $model;
    }
}
