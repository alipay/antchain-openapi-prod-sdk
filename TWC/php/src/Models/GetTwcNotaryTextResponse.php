<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

use AntChain\TWC\Models\TsrResponse;

class GetTwcNotaryTextResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'content' => 'content',
        'hashAlgorithm' => 'hash_algorithm',
        'textNotaryType' => 'text_notary_type',
        'tsr' => 'tsr',
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
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->hashAlgorithm) {
            $res['hash_algorithm'] = $this->hashAlgorithm;
        }
        if (null !== $this->textNotaryType) {
            $res['text_notary_type'] = $this->textNotaryType;
        }
        if (null !== $this->tsr) {
            $res['tsr'] = null !== $this->tsr ? $this->tsr->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetTwcNotaryTextResponse
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
        if(isset($map['content'])){
            $model->content = $map['content'];
        }
        if(isset($map['hash_algorithm'])){
            $model->hashAlgorithm = $map['hash_algorithm'];
        }
        if(isset($map['text_notary_type'])){
            $model->textNotaryType = $map['text_notary_type'];
        }
        if(isset($map['tsr'])){
            $model->tsr = TsrResponse::fromMap($map['tsr']);
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

    // 存证信息
    /**
     * @var string
     */
    public $content;

    // 哈希算法
    /**
     * @var string
     */
    public $hashAlgorithm;

    // 文本存证类型
    /**
     * @var string
     */
    public $textNotaryType;

    // 可信信息
    /**
     * @var TsrResponse
     */
    public $tsr;

}
