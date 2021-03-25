<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class GetContractFileResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 业务码，0表示成功
    /**
     * @var int
     */
    public $code;

    // 业务码信息
    /**
     * @var string
     */
    public $message;

    // 文件id
    /**
     * @var string
     */
    public $fileId;

    // 文件名称
    /**
     * @var string
     */
    public $name;

    // 下载地址
    /**
     * @var string
     */
    public $downloadUrl;

    // 文件大小，单位byte
    /**
     * @var int
     */
    public $size;

    // 文件状态, 0:文件未上传；1:文件上传中 ；2：文件上传已完成,；3：文件上传失败 ；4：文件等待转pdf ；5：文件已转换pdf 。
    /**
     * @var int
     */
    public $status;

    // pdf文件总页数,仅当文件类型为pdf时有值
    /**
     * @var int
     */
    public $pdfTotalPages;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'code'          => 'code',
        'message'       => 'message',
        'fileId'        => 'file_id',
        'name'          => 'name',
        'downloadUrl'   => 'download_url',
        'size'          => 'size',
        'status'        => 'status',
        'pdfTotalPages' => 'pdf_total_pages',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
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
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->downloadUrl) {
            $res['download_url'] = $this->downloadUrl;
        }
        if (null !== $this->size) {
            $res['size'] = $this->size;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->pdfTotalPages) {
            $res['pdf_total_pages'] = $this->pdfTotalPages;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetContractFileResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['download_url'])) {
            $model->downloadUrl = $map['download_url'];
        }
        if (isset($map['size'])) {
            $model->size = $map['size'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['pdf_total_pages'])) {
            $model->pdfTotalPages = $map['pdf_total_pages'];
        }

        return $model;
    }
}
