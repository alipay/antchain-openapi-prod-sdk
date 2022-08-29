<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class QueryDciRegistrationResponse extends Model
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

    // 状态
    /**
     * @var string
     */
    public $contentStatus;

    // 登记证书txHash
    /**
     * @var string
     */
    public $registerCertTxHash;

    // 登记证书存证高度
    /**
     * @var string
     */
    public $registerCertBlockHeight;

    // 登记证书tsr
    /**
     * @var string
     */
    public $registerCertTsr;

    // 登记证书预览fileId
    /**
     * @var string
     */
    public $registerCertPngFileId;

    // 数登样本oss fileId
    /**
     * @var string
     */
    public $registerSampleFileId;

    // 数登样本预览oss fileId
    /**
     * @var string
     */
    public $registerSamplePngFileId;

    // 剩余下载次数
    /**
     * @var int
     */
    public $registerDownloadTimesLeft;

    // 错误原因
    /**
     * @var string
     */
    public $errorReason;

    // 发票oss fileId List
    /**
     * @var string[]
     */
    public $invoiceFileIdList;

    // 数登申请时间
    /**
     * @var string
     */
    public $applyRegisterTime;
    protected $_name = [
        'reqMsgId'                  => 'req_msg_id',
        'resultCode'                => 'result_code',
        'resultMsg'                 => 'result_msg',
        'contentStatus'             => 'content_status',
        'registerCertTxHash'        => 'register_cert_tx_hash',
        'registerCertBlockHeight'   => 'register_cert_block_height',
        'registerCertTsr'           => 'register_cert_tsr',
        'registerCertPngFileId'     => 'register_cert_png_file_id',
        'registerSampleFileId'      => 'register_sample_file_id',
        'registerSamplePngFileId'   => 'register_sample_png_file_id',
        'registerDownloadTimesLeft' => 'register_download_times_left',
        'errorReason'               => 'error_reason',
        'invoiceFileIdList'         => 'invoice_file_id_list',
        'applyRegisterTime'         => 'apply_register_time',
    ];

    public function validate()
    {
        Model::validatePattern('applyRegisterTime', $this->applyRegisterTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->contentStatus) {
            $res['content_status'] = $this->contentStatus;
        }
        if (null !== $this->registerCertTxHash) {
            $res['register_cert_tx_hash'] = $this->registerCertTxHash;
        }
        if (null !== $this->registerCertBlockHeight) {
            $res['register_cert_block_height'] = $this->registerCertBlockHeight;
        }
        if (null !== $this->registerCertTsr) {
            $res['register_cert_tsr'] = $this->registerCertTsr;
        }
        if (null !== $this->registerCertPngFileId) {
            $res['register_cert_png_file_id'] = $this->registerCertPngFileId;
        }
        if (null !== $this->registerSampleFileId) {
            $res['register_sample_file_id'] = $this->registerSampleFileId;
        }
        if (null !== $this->registerSamplePngFileId) {
            $res['register_sample_png_file_id'] = $this->registerSamplePngFileId;
        }
        if (null !== $this->registerDownloadTimesLeft) {
            $res['register_download_times_left'] = $this->registerDownloadTimesLeft;
        }
        if (null !== $this->errorReason) {
            $res['error_reason'] = $this->errorReason;
        }
        if (null !== $this->invoiceFileIdList) {
            $res['invoice_file_id_list'] = $this->invoiceFileIdList;
        }
        if (null !== $this->applyRegisterTime) {
            $res['apply_register_time'] = $this->applyRegisterTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDciRegistrationResponse
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
        if (isset($map['content_status'])) {
            $model->contentStatus = $map['content_status'];
        }
        if (isset($map['register_cert_tx_hash'])) {
            $model->registerCertTxHash = $map['register_cert_tx_hash'];
        }
        if (isset($map['register_cert_block_height'])) {
            $model->registerCertBlockHeight = $map['register_cert_block_height'];
        }
        if (isset($map['register_cert_tsr'])) {
            $model->registerCertTsr = $map['register_cert_tsr'];
        }
        if (isset($map['register_cert_png_file_id'])) {
            $model->registerCertPngFileId = $map['register_cert_png_file_id'];
        }
        if (isset($map['register_sample_file_id'])) {
            $model->registerSampleFileId = $map['register_sample_file_id'];
        }
        if (isset($map['register_sample_png_file_id'])) {
            $model->registerSamplePngFileId = $map['register_sample_png_file_id'];
        }
        if (isset($map['register_download_times_left'])) {
            $model->registerDownloadTimesLeft = $map['register_download_times_left'];
        }
        if (isset($map['error_reason'])) {
            $model->errorReason = $map['error_reason'];
        }
        if (isset($map['invoice_file_id_list'])) {
            if (!empty($map['invoice_file_id_list'])) {
                $model->invoiceFileIdList = $map['invoice_file_id_list'];
            }
        }
        if (isset($map['apply_register_time'])) {
            $model->applyRegisterTime = $map['apply_register_time'];
        }

        return $model;
    }
}
