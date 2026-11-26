<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ResultDatalinkExportResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'fileUrl' => 'file_url',
        'rowCount' => 'row_count',
        'truncated' => 'truncated',
        'fileSize' => 'file_size',
        'expireTime' => 'expire_time',
        'sqlElapsedMs' => 'sql_elapsed_ms',
        'uploadElapsedMs' => 'upload_elapsed_ms',
        'status' => 'status',
        'errorCode' => 'error_code',
        'errorMessage' => 'error_message',
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
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }
        if (null !== $this->rowCount) {
            $res['row_count'] = $this->rowCount;
        }
        if (null !== $this->truncated) {
            $res['truncated'] = $this->truncated;
        }
        if (null !== $this->fileSize) {
            $res['file_size'] = $this->fileSize;
        }
        if (null !== $this->expireTime) {
            $res['expire_time'] = $this->expireTime;
        }
        if (null !== $this->sqlElapsedMs) {
            $res['sql_elapsed_ms'] = $this->sqlElapsedMs;
        }
        if (null !== $this->uploadElapsedMs) {
            $res['upload_elapsed_ms'] = $this->uploadElapsedMs;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        if (null !== $this->errorMessage) {
            $res['error_message'] = $this->errorMessage;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ResultDatalinkExportResponse
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
        if(isset($map['file_url'])){
            $model->fileUrl = $map['file_url'];
        }
        if(isset($map['row_count'])){
            $model->rowCount = $map['row_count'];
        }
        if(isset($map['truncated'])){
            $model->truncated = $map['truncated'];
        }
        if(isset($map['file_size'])){
            $model->fileSize = $map['file_size'];
        }
        if(isset($map['expire_time'])){
            $model->expireTime = $map['expire_time'];
        }
        if(isset($map['sql_elapsed_ms'])){
            $model->sqlElapsedMs = $map['sql_elapsed_ms'];
        }
        if(isset($map['upload_elapsed_ms'])){
            $model->uploadElapsedMs = $map['upload_elapsed_ms'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['error_code'])){
            $model->errorCode = $map['error_code'];
        }
        if(isset($map['error_message'])){
            $model->errorMessage = $map['error_message'];
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

    // excel oss 地址
    /**
     * @var string
     */
    public $fileUrl;

    // 返回数量列表
    /**
     * @var int
     */
    public $rowCount;

    // 是否截段
    /**
     * @var bool
     */
    public $truncated;

    // 文件大小
    /**
     * @var int
     */
    public $fileSize;

    // 过期时刻
    /**
     * @var int
     */
    public $expireTime;

    // sql 执行耗时 耗秒
    /**
     * @var int
     */
    public $sqlElapsedMs;

    // 上传OSS耗时 耗秒
    /**
     * @var int
     */
    public $uploadElapsedMs;

    // 运行状态 RUNNING： 运行中，SUCCESS： 成功，FAILED：失败
    /**
     * @var string
     */
    public $status;

    // 失败错误编码
    /**
     * @var string
     */
    public $errorCode;

    // 错误原因
    /**
     * @var string
     */
    public $errorMessage;

}
