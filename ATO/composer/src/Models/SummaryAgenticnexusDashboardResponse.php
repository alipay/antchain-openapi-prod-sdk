<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SummaryAgenticnexusDashboardResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'module' => 'module',
        'summary' => 'summary',
    ];
    public function validate() {}
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
        if (null !== $this->module) {
            $res['module'] = $this->module;
        }
        if (null !== $this->summary) {
            $res['summary'] = $this->summary;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SummaryAgenticnexusDashboardResponse
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
        if(isset($map['module'])){
            $model->module = $map['module'];
        }
        if(isset($map['summary'])){
            $model->summary = $map['summary'];
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

    // 回显目标领域: PREFILTER 前筛 / PURCHASE 采买 / DISTRIBUTION 分发 / SENTINEL 预警
    /**
     * @var string
     */
    public $module;

    // 领域总结
    /**
     * @var string
     */
    public $summary;

}
