<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryIotagentThingmodelrangeResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'hasData' => 'has_data',
        'firstReportTime' => 'first_report_time',
        'latestReportTime' => 'latest_report_time',
    ];
    public function validate() {
        Model::validatePattern('firstReportTime', $this->firstReportTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('latestReportTime', $this->latestReportTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }
    public function toMap() {
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
        if (null !== $this->hasData) {
            $res['has_data'] = $this->hasData;
        }
        if (null !== $this->firstReportTime) {
            $res['first_report_time'] = $this->firstReportTime;
        }
        if (null !== $this->latestReportTime) {
            $res['latest_report_time'] = $this->latestReportTime;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryIotagentThingmodelrangeResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['has_data'])){
            $model->hasData = $map['has_data'];
        }
        if(isset($map['first_report_time'])){
            $model->firstReportTime = $map['first_report_time'];
        }
        if(isset($map['latest_report_time'])){
            $model->latestReportTime = $map['latest_report_time'];
        }
        return $model;
    }
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

    /**
     * @var bool
     */
    public $hasData;

    /**
     * @var string
     */
    public $firstReportTime;

    /**
     * @var string
     */
    public $latestReportTime;

}
