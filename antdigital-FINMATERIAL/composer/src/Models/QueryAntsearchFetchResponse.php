<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\FINMATERIAL\Models;

use AlibabaCloud\Tea\Model;

use AntChain\FINMATERIAL\Models\ResponseMetadata;
use AntChain\FINMATERIAL\Models\FetchResult;

class QueryAntsearchFetchResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'isSuccess' => 'is_success',
        'errorCode' => 'error_code',
        'errorMessage' => 'error_message',
        'responseMetadata' => 'response_metadata',
        'result' => 'result',
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
        if (null !== $this->isSuccess) {
            $res['is_success'] = $this->isSuccess;
        }
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        if (null !== $this->errorMessage) {
            $res['error_message'] = $this->errorMessage;
        }
        if (null !== $this->responseMetadata) {
            $res['response_metadata'] = null !== $this->responseMetadata ? $this->responseMetadata->toMap() : null;
        }
        if (null !== $this->result) {
            $res['result'] = null !== $this->result ? $this->result->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAntsearchFetchResponse
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
        if(isset($map['is_success'])){
            $model->isSuccess = $map['is_success'];
        }
        if(isset($map['error_code'])){
            $model->errorCode = $map['error_code'];
        }
        if(isset($map['error_message'])){
            $model->errorMessage = $map['error_message'];
        }
        if(isset($map['response_metadata'])){
            $model->responseMetadata = ResponseMetadata::fromMap($map['response_metadata']);
        }
        if(isset($map['result'])){
            $model->result = FetchResult::fromMap($map['result']);
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

    // 网页读取和正文解析是否成功
    /**
     * @var bool
     */
    public $isSuccess;

    // 失败原因标识，仅失败时返回
    /**
     * @var string
     */
    public $errorCode;

    // 可读的失败原因，仅失败时返回
    /**
     * @var string
     */
    public $errorMessage;

    // 请求元信息
    /**
     * @var ResponseMetadata
     */
    public $responseMetadata;

    // 网页读取与正文解析成功时返回
    /**
     * @var FetchResult
     */
    public $result;

}
