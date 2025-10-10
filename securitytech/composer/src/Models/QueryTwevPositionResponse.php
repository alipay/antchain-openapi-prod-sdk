<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class QueryTwevPositionResponse extends Model
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

    // 经度
    /**
     * @var string
     */
    public $lng;

    // 纬度
    /**
     * @var string
     */
    public $lat;

    // 定位时间
    /**
     * @var string
     */
    public $gpsTime;

    // json，扩展预留
    /**
     * @var string
     */
    public $extraInfo;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'lng'        => 'lng',
        'lat'        => 'lat',
        'gpsTime'    => 'gps_time',
        'extraInfo'  => 'extra_info',
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
        if (null !== $this->lng) {
            $res['lng'] = $this->lng;
        }
        if (null !== $this->lat) {
            $res['lat'] = $this->lat;
        }
        if (null !== $this->gpsTime) {
            $res['gps_time'] = $this->gpsTime;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTwevPositionResponse
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
        if (isset($map['lng'])) {
            $model->lng = $map['lng'];
        }
        if (isset($map['lat'])) {
            $model->lat = $map['lat'];
        }
        if (isset($map['gps_time'])) {
            $model->gpsTime = $map['gps_time'];
        }
        if (isset($map['extra_info'])) {
            $model->extraInfo = $map['extra_info'];
        }

        return $model;
    }
}
