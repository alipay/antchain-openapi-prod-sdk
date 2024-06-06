<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DUANKA\Models;

use AlibabaCloud\Tea\Model;

class QueryAistudioModelResponse extends Model
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

    // 业务唯一id
    /**
     * @var string
     */
    public $bizCode;

    // 压测报告
    /**
     * @var string
     */
    public $pressureReport;

    // 运行态报告
    /**
     * @var string
     */
    public $runtimeReport;

    // 安全报告
    /**
     * @var string
     */
    public $safetyReport;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'bizCode'        => 'biz_code',
        'pressureReport' => 'pressure_report',
        'runtimeReport'  => 'runtime_report',
        'safetyReport'   => 'safety_report',
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
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }
        if (null !== $this->pressureReport) {
            $res['pressure_report'] = $this->pressureReport;
        }
        if (null !== $this->runtimeReport) {
            $res['runtime_report'] = $this->runtimeReport;
        }
        if (null !== $this->safetyReport) {
            $res['safety_report'] = $this->safetyReport;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAistudioModelResponse
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
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }
        if (isset($map['pressure_report'])) {
            $model->pressureReport = $map['pressure_report'];
        }
        if (isset($map['runtime_report'])) {
            $model->runtimeReport = $map['runtime_report'];
        }
        if (isset($map['safety_report'])) {
            $model->safetyReport = $map['safety_report'];
        }

        return $model;
    }
}
