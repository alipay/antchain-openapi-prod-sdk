<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryBaasPlusBaicorpInternalsearchlibraryResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'customId' => 'custom_id',
        'modelInfo' => 'model_info',
        'repeatInfo' => 'repeat_info',
        'similarityInfo' => 'similarity_info',
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
        if (null !== $this->customId) {
            $res['custom_id'] = $this->customId;
        }
        if (null !== $this->modelInfo) {
            $res['model_info'] = $this->modelInfo;
        }
        if (null !== $this->repeatInfo) {
            $res['repeat_info'] = $this->repeatInfo;
        }
        if (null !== $this->similarityInfo) {
            $res['similarity_info'] = $this->similarityInfo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryBaasPlusBaicorpInternalsearchlibraryResponse
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
        if(isset($map['custom_id'])){
            $model->customId = $map['custom_id'];
        }
        if(isset($map['model_info'])){
            $model->modelInfo = $map['model_info'];
        }
        if(isset($map['repeat_info'])){
            $model->repeatInfo = $map['repeat_info'];
        }
        if(isset($map['similarity_info'])){
            $model->similarityInfo = $map['similarity_info'];
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

    // NoucelId
    /**
     * @var string
     */
    public $customId;

    // 采用的模型以及版本说明
    /**
     * @var string
     */
    public $modelInfo;

    // 重复列表，json list格式
    /**
     * @var string
     */
    public $repeatInfo;

    // 相似度信息列表，json list格式
    /**
     * @var string
     */
    public $similarityInfo;

}
