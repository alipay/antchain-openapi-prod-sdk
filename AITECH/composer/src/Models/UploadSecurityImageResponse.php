<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

use AntChain\AITECH\Models\ImageBlackWhiteResult;
use AntChain\AITECH\Models\TokenUsageSummary;

class UploadSecurityImageResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'actionCode' => 'action_code',
        'imageBlackWhiteResult' => 'image_black_white_result',
        'tokenUsage' => 'token_usage',
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
        if (null !== $this->actionCode) {
            $res['action_code'] = $this->actionCode;
        }
        if (null !== $this->imageBlackWhiteResult) {
            $res['image_black_white_result'] = null !== $this->imageBlackWhiteResult ? $this->imageBlackWhiteResult->toMap() : null;
        }
        if (null !== $this->tokenUsage) {
            $res['token_usage'] = null !== $this->tokenUsage ? $this->tokenUsage->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UploadSecurityImageResponse
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
        if(isset($map['action_code'])){
            $model->actionCode = $map['action_code'];
        }
        if(isset($map['image_black_white_result'])){
            $model->imageBlackWhiteResult = ImageBlackWhiteResult::fromMap($map['image_black_white_result']);
        }
        if(isset($map['token_usage'])){
            $model->tokenUsage = TokenUsageSummary::fromMap($map['token_usage']);
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

    // PASS/BLOCK
    /**
     * @var string
     */
    public $actionCode;

    // 黑白库命中明细（18 字段）
    /**
     * @var ImageBlackWhiteResult
     */
    public $imageBlackWhiteResult;

    // token 用量（11 字段）
    /**
     * @var TokenUsageSummary
     */
    public $tokenUsage;

}
