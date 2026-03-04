<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class QueryTwevCarResponse extends Model
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

    // 中控号
    /**
     * @var string
     */
    public $tuid;

    // 车架号
    /**
     * @var string
     */
    public $frameNo;

    // 在线状态 在线：ON_LINE/离线：OFF_LINE
    /**
     * @var string
     */
    public $runningStatus;

    // 启动状态 启动：ON/熄火：OFF
    /**
     * @var string
     */
    public $powerStatus;

    // 经度
    /**
     * @var string
     */
    public $longitude;

    // 纬度
    /**
     * @var string
     */
    public $latitude;

    // 预留扩展字段 json
    /**
     * @var string
     */
    public $extraInfo;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'tuid'          => 'tuid',
        'frameNo'       => 'frame_no',
        'runningStatus' => 'running_status',
        'powerStatus'   => 'power_status',
        'longitude'     => 'longitude',
        'latitude'      => 'latitude',
        'extraInfo'     => 'extra_info',
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
        if (null !== $this->tuid) {
            $res['tuid'] = $this->tuid;
        }
        if (null !== $this->frameNo) {
            $res['frame_no'] = $this->frameNo;
        }
        if (null !== $this->runningStatus) {
            $res['running_status'] = $this->runningStatus;
        }
        if (null !== $this->powerStatus) {
            $res['power_status'] = $this->powerStatus;
        }
        if (null !== $this->longitude) {
            $res['longitude'] = $this->longitude;
        }
        if (null !== $this->latitude) {
            $res['latitude'] = $this->latitude;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTwevCarResponse
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
        if (isset($map['tuid'])) {
            $model->tuid = $map['tuid'];
        }
        if (isset($map['frame_no'])) {
            $model->frameNo = $map['frame_no'];
        }
        if (isset($map['running_status'])) {
            $model->runningStatus = $map['running_status'];
        }
        if (isset($map['power_status'])) {
            $model->powerStatus = $map['power_status'];
        }
        if (isset($map['longitude'])) {
            $model->longitude = $map['longitude'];
        }
        if (isset($map['latitude'])) {
            $model->latitude = $map['latitude'];
        }
        if (isset($map['extra_info'])) {
            $model->extraInfo = $map['extra_info'];
        }

        return $model;
    }
}
