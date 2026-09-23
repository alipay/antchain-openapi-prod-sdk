<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryInnerSppdashboardtrafficResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'conversion' => 'conversion',
        'income' => 'income',
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
        if (null !== $this->conversion) {
            $res['conversion'] = $this->conversion;
        }
        if (null !== $this->income) {
            $res['income'] = $this->income;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryInnerSppdashboardtrafficResponse
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
        if(isset($map['conversion'])){
            $model->conversion = $map['conversion'];
        }
        if(isset($map['income'])){
            $model->income = $map['income'];
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

    // 流量转化看板，5 项流量指标 + 全链路转化率 + updateTime
    /**
     * @var string
     */
    public $conversion;

    // 收入结果看板，当日收入预估 + 平台收入 GAAP + updateTime
    /**
     * @var string
     */
    public $income;

}
