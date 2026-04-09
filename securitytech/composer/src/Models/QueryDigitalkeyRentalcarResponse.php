<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class QueryDigitalkeyRentalcarResponse extends Model
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

    // 车架号
    /**
     * @var string
     */
    public $frameNo;

    // 中控编号
    /**
     * @var string
     */
    public $tuid;

    // 在线状态：online/offline
    /**
     * @var string
     */
    public $onlineStatus;

    // 经度（WGS84）
    /**
     * @var string
     */
    public $longitude;

    // 纬度（WGS84）
    /**
     * @var string
     */
    public $latitude;

    // 启动状态（0-断电; 1-上电）
    /**
     * @var string
     */
    public $runningStatus;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'frameNo'       => 'frame_no',
        'tuid'          => 'tuid',
        'onlineStatus'  => 'online_status',
        'longitude'     => 'longitude',
        'latitude'      => 'latitude',
        'runningStatus' => 'running_status',
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
        if (null !== $this->frameNo) {
            $res['frame_no'] = $this->frameNo;
        }
        if (null !== $this->tuid) {
            $res['tuid'] = $this->tuid;
        }
        if (null !== $this->onlineStatus) {
            $res['online_status'] = $this->onlineStatus;
        }
        if (null !== $this->longitude) {
            $res['longitude'] = $this->longitude;
        }
        if (null !== $this->latitude) {
            $res['latitude'] = $this->latitude;
        }
        if (null !== $this->runningStatus) {
            $res['running_status'] = $this->runningStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDigitalkeyRentalcarResponse
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
        if (isset($map['frame_no'])) {
            $model->frameNo = $map['frame_no'];
        }
        if (isset($map['tuid'])) {
            $model->tuid = $map['tuid'];
        }
        if (isset($map['online_status'])) {
            $model->onlineStatus = $map['online_status'];
        }
        if (isset($map['longitude'])) {
            $model->longitude = $map['longitude'];
        }
        if (isset($map['latitude'])) {
            $model->latitude = $map['latitude'];
        }
        if (isset($map['running_status'])) {
            $model->runningStatus = $map['running_status'];
        }

        return $model;
    }
}
