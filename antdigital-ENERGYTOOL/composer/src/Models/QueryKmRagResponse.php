<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGYTOOL\Models;

use AlibabaCloud\Tea\Model;

class QueryKmRagResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'answer' => 'answer',
        'confidence' => 'confidence',
        'references' => 'references',
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
        if (null !== $this->answer) {
            $res['answer'] = $this->answer;
        }
        if (null !== $this->confidence) {
            $res['confidence'] = $this->confidence;
        }
        if (null !== $this->references) {
            $res['references'] = $this->references;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryKmRagResponse
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
        if(isset($map['answer'])){
            $model->answer = $map['answer'];
        }
        if(isset($map['confidence'])){
            $model->confidence = $map['confidence'];
        }
        if(isset($map['references'])){
            if(!empty($map['references'])){
                $model->references = $map['references'];
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

    // 答案
    /**
     * @var string
     */
    public $answer;

    // 置信度
    /**
     * @var int
     */
    public $confidence;

    // 引用来源
    /**
     * @var string[]
     */
    public $references;

}
