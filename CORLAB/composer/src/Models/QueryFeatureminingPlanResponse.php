<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CORLAB\Models;

use AlibabaCloud\Tea\Model;

use AntChain\CORLAB\Models\IvInfo;
use AntChain\CORLAB\Models\BestModelReport;

class QueryFeatureminingPlanResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'ivInfo' => 'iv_info',
        'bestModelReport' => 'best_model_report',
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
        if (null !== $this->ivInfo) {
            $res['iv_info'] = [];
            if(null !== $this->ivInfo && is_array($this->ivInfo)){
                $n = 0;
                foreach($this->ivInfo as $item){
                    $res['iv_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->bestModelReport) {
            $res['best_model_report'] = null !== $this->bestModelReport ? $this->bestModelReport->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryFeatureminingPlanResponse
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
        if(isset($map['iv_info'])){
            if(!empty($map['iv_info'])){
                $model->ivInfo = [];
                $n = 0;
                foreach($map['iv_info'] as $item) {
                    $model->ivInfo[$n++] = null !== $item ? IvInfo::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['best_model_report'])){
            $model->bestModelReport = BestModelReport::fromMap($map['best_model_report']);
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

    // IV信息，包含每轮信息和特征挖掘报告下载链接
    /**
     * @var IvInfo[]
     */
    public $ivInfo;

    // 最好模型效果报告
    /**
     * @var BestModelReport
     */
    public $bestModelReport;

}
