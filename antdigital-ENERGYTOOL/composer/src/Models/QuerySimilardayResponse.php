<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGYTOOL\Models;

use AlibabaCloud\Tea\Model;

use AntChain\ENERGYTOOL\Models\SimilarDayAnalysisData;

class QuerySimilardayResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'similarDay' => 'similar_day',
        'analysisResult' => 'analysis_result',
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
        if (null !== $this->similarDay) {
            $res['similar_day'] = $this->similarDay;
        }
        if (null !== $this->analysisResult) {
            $res['analysis_result'] = [];
            if(null !== $this->analysisResult && is_array($this->analysisResult)){
                $n = 0;
                foreach($this->analysisResult as $item){
                    $res['analysis_result'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QuerySimilardayResponse
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
        if(isset($map['similar_day'])){
            $model->similarDay = $map['similar_day'];
        }
        if(isset($map['analysis_result'])){
            if(!empty($map['analysis_result'])){
                $model->analysisResult = [];
                $n = 0;
                foreach($map['analysis_result'] as $item) {
                    $model->analysisResult[$n++] = null !== $item ? SimilarDayAnalysisData::fromMap($item) : $item;
                }
            }
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

    // 查询范围内容的最接近相似日，格式：yyyy-MM-dd
    /**
     * @var string
     */
    public $similarDay;

    // 相似日分析结果
    /**
     * @var SimilarDayAnalysisData[]
     */
    public $analysisResult;

}
