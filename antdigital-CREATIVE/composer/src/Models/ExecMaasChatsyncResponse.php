<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVE\Models;

use AlibabaCloud\Tea\Model;

use AntChain\CREATIVE\Models\ChatUsage;

class ExecMaasChatsyncResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'id' => 'id',
        'model' => 'model',
        'content' => 'content',
        'finishReason' => 'finish_reason',
        'usage' => 'usage',
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
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->model) {
            $res['model'] = $this->model;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->finishReason) {
            $res['finish_reason'] = $this->finishReason;
        }
        if (null !== $this->usage) {
            $res['usage'] = null !== $this->usage ? $this->usage->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecMaasChatsyncResponse
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
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['model'])){
            $model->model = $map['model'];
        }
        if(isset($map['content'])){
            $model->content = $map['content'];
        }
        if(isset($map['finish_reason'])){
            $model->finishReason = $map['finish_reason'];
        }
        if(isset($map['usage'])){
            $model->usage = ChatUsage::fromMap($map['usage']);
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

    // 本次模型调用 ID
    /**
     * @var string
     */
    public $id;

    // 实际使用的模型
    /**
     * @var string
     */
    public $model;

    // 完整文本
    /**
     * @var string
     */
    public $content;

    // 结束原因
    /**
     * @var string
     */
    public $finishReason;

    // 用量
    /**
     * @var ChatUsage
     */
    public $usage;

}
