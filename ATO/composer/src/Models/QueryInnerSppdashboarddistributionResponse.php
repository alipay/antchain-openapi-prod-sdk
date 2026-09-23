<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryInnerSppdashboarddistributionResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'total' => 'total',
        'distribution' => 'distribution',
        'logs' => 'logs',
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
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        if (null !== $this->distribution) {
            $res['distribution'] = $this->distribution;
        }
        if (null !== $this->logs) {
            $res['logs'] = $this->logs;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryInnerSppdashboarddistributionResponse
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
        if(isset($map['total'])){
            $model->total = $map['total'];
        }
        if(isset($map['distribution'])){
            $model->distribution = $map['distribution'];
        }
        if(isset($map['logs'])){
            $model->logs = $map['logs'];
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

    // 当日总进件量
    /**
     * @var int
     */
    public $total;

    // 商家承接量与占比
    /**
     * @var string
     */
    public $distribution;

    // 进件实时日志（当日最新 logLimit 条，按时间倒序）
    /**
     * @var string
     */
    public $logs;

}
