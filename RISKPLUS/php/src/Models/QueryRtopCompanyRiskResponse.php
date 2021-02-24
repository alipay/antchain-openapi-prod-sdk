<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RISKPLUS\Models\RtopCompanyRiskFactor;

class QueryRtopCompanyRiskResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'riskFactors' => 'risk_factors',
        'riskLevel' => 'risk_level',
        'riskMessage' => 'risk_message',
        'riskScore' => 'risk_score',
        'riskTags' => 'risk_tags',
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
        if (null !== $this->riskFactors) {
            $res['risk_factors'] = [];
            if(null !== $this->riskFactors && is_array($this->riskFactors)){
                $n = 0;
                foreach($this->riskFactors as $item){
                    $res['risk_factors'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->riskLevel) {
            $res['risk_level'] = $this->riskLevel;
        }
        if (null !== $this->riskMessage) {
            $res['risk_message'] = $this->riskMessage;
        }
        if (null !== $this->riskScore) {
            $res['risk_score'] = $this->riskScore;
        }
        if (null !== $this->riskTags) {
            $res['risk_tags'] = $this->riskTags;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryRtopCompanyRiskResponse
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
        if(isset($map['risk_factors'])){
            if(!empty($map['risk_factors'])){
                $model->riskFactors = [];
                $n = 0;
                foreach($map['risk_factors'] as $item) {
                    $model->riskFactors[$n++] = null !== $item ? RtopCompanyRiskFactor::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['risk_level'])){
            $model->riskLevel = $map['risk_level'];
        }
        if(isset($map['risk_message'])){
            $model->riskMessage = $map['risk_message'];
        }
        if(isset($map['risk_score'])){
            $model->riskScore = $map['risk_score'];
        }
        if(isset($map['risk_tags'])){
            if(!empty($map['risk_tags'])){
                $model->riskTags = $map['risk_tags'];
            }
        }
        return $model;
    }
    /**
     * @var string
     */
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 风险维度
    /**
     * @var RtopCompanyRiskFactor[]
     */
    public $riskFactors;

    // 风险等级
    /**
     * @var string
     */
    public $riskLevel;

    // 风险报文
    /**
     * @var string
     */
    public $riskMessage;

    // 风险分数
    /**
     * @var int
     */
    public $riskScore;

    // 风险标签
    /**
     * @var string[]
     */
    public $riskTags;

}
