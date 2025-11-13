<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SubmitInnerFundmngdatadownloadResponse extends Model
{
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

    // 是否提交成功
    /**
     * @var bool
     */
    public $isSubmitDownload;

    // 线上；线下
    /**
     * @var string
     */
    public $downloadType;

    // 下载链接
    /**
     * @var string
     */
    public $downloadUrl;

    // 状态
    // TODO 待处理
    // FINISH 完成
    /**
     * @var string
     */
    public $status;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'isSubmitDownload' => 'is_submit_download',
        'downloadType'     => 'download_type',
        'downloadUrl'      => 'download_url',
        'status'           => 'status',
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
        if (null !== $this->isSubmitDownload) {
            $res['is_submit_download'] = $this->isSubmitDownload;
        }
        if (null !== $this->downloadType) {
            $res['download_type'] = $this->downloadType;
        }
        if (null !== $this->downloadUrl) {
            $res['download_url'] = $this->downloadUrl;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitInnerFundmngdatadownloadResponse
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
        if (isset($map['is_submit_download'])) {
            $model->isSubmitDownload = $map['is_submit_download'];
        }
        if (isset($map['download_type'])) {
            $model->downloadType = $map['download_type'];
        }
        if (isset($map['download_url'])) {
            $model->downloadUrl = $map['download_url'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
