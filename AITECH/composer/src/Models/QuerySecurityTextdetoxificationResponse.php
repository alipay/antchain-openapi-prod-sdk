<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class QuerySecurityTextdetoxificationResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'safe' => 'safe',
        'riskCategory' => 'risk_category',
        'riskLabel' => 'risk_label',
        'riskScore' => 'risk_score',
        'riskWords' => 'risk_words',
        'riskWordsIndex' => 'risk_words_index',
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
        if (null !== $this->safe) {
            $res['safe'] = $this->safe;
        }
        if (null !== $this->riskCategory) {
            $res['risk_category'] = $this->riskCategory;
        }
        if (null !== $this->riskLabel) {
            $res['risk_label'] = $this->riskLabel;
        }
        if (null !== $this->riskScore) {
            $res['risk_score'] = $this->riskScore;
        }
        if (null !== $this->riskWords) {
            $res['risk_words'] = $this->riskWords;
        }
        if (null !== $this->riskWordsIndex) {
            $res['risk_words_index'] = $this->riskWordsIndex;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QuerySecurityTextdetoxificationResponse
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
        if(isset($map['safe'])){
            $model->safe = $map['safe'];
        }
        if(isset($map['risk_category'])){
            $model->riskCategory = $map['risk_category'];
        }
        if(isset($map['risk_label'])){
            $model->riskLabel = $map['risk_label'];
        }
        if(isset($map['risk_score'])){
            $model->riskScore = $map['risk_score'];
        }
        if(isset($map['risk_words'])){
            if(!empty($map['risk_words'])){
                $model->riskWords = $map['risk_words'];
            }
        }
        if(isset($map['risk_words_index'])){
            if(!empty($map['risk_words_index'])){
                $model->riskWordsIndex = $map['risk_words_index'];
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

    // 是否安全无风险
    /**
     * @var bool
     */
    public $safe;

    // 一级风险分类
    /**
     * @var string
     */
    public $riskCategory;

    // 二级风险明细分类
    /**
     * @var string
     */
    public $riskLabel;

    // 风险分数
    /**
     * @var int
     */
    public $riskScore;

    // 风险关键词列表
    /**
     * @var string[]
     */
    public $riskWords;

    // 关键词索引
    /**
     * @var string[]
     */
    public $riskWordsIndex;

}
