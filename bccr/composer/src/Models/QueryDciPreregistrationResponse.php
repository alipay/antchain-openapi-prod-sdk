<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class QueryDciPreregistrationResponse extends Model
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

    // 预登记状态
    /**
     * @var string
     */
    public $status;

    // 文件哈希
    /**
     * @var string
     */
    public $fileHash;

    // 文件哈希存证txHash
    /**
     * @var string
     */
    public $fileHashTxHash;

    // 文件哈希存证区块高度
    /**
     * @var string
     */
    public $fileHashBlockHeight;

    // dci编码
    /**
     * @var string
     */
    public $dciCode;

    // DCI码存证txHash
    /**
     * @var string
     */
    public $dciCodeTxHash;

    // DCI码存证高度
    /**
     * @var string
     */
    public $dciCodeBlockHeight;

    // DCI码fileHash存证txHash
    /**
     * @var string
     */
    public $dciCodeFileTxHash;

    // DCI码fileHash存证高度
    /**
     * @var string
     */
    public $dciCodeFileBlockHeight;

    // 预登记证书txhash
    /**
     * @var string
     */
    public $preRegCertTxHash;

    // 预登记证书存证高度
    /**
     * @var string
     */
    public $preRegCertBlockHeight;

    // 预登记取消txHash
    /**
     * @var string
     */
    public $cancelTxHash;

    // 预登记取消存证高度
    /**
     * @var string
     */
    public $cancelBlockHeight;

    // dciCode的可信时间戳信息
    /**
     * @var string
     */
    public $dciCodeTsr;

    // dciCode fileHash的可信时间戳信息
    /**
     * @var string
     */
    public $dciCodeFileTsr;

    // 预登记证书可信时间戳信息
    /**
     * @var string
     */
    public $preRegCertTsr;

    // 预登记证书oss fileId
    /**
     * @var string
     */
    public $preRegCertFileId;

    // 预登记证书fileHash
    /**
     * @var string
     */
    public $preRegCertFileHash;

    // 预登记证书下载链接
    /**
     * @var string
     */
    public $preRegCertUrl;

    // 预览图oss fileId
    /**
     * @var string
     */
    public $pngFileId;

    // 申请发码时间
    /**
     * @var string
     */
    public $applyObtainDate;

    // DCI码创建时间
    /**
     * @var string
     */
    public $dciCodeObtainDate;

    // 错误原因
    /**
     * @var string
     */
    public $errorReason;

    // 公式地址
    /**
     * @var string
     */
    public $publicationUrl;
    protected $_name = [
        'reqMsgId'               => 'req_msg_id',
        'resultCode'             => 'result_code',
        'resultMsg'              => 'result_msg',
        'status'                 => 'status',
        'fileHash'               => 'file_hash',
        'fileHashTxHash'         => 'file_hash_tx_hash',
        'fileHashBlockHeight'    => 'file_hash_block_height',
        'dciCode'                => 'dci_code',
        'dciCodeTxHash'          => 'dci_code_tx_hash',
        'dciCodeBlockHeight'     => 'dci_code_block_height',
        'dciCodeFileTxHash'      => 'dci_code_file_tx_hash',
        'dciCodeFileBlockHeight' => 'dci_code_file_block_height',
        'preRegCertTxHash'       => 'pre_reg_cert_tx_hash',
        'preRegCertBlockHeight'  => 'pre_reg_cert_block_height',
        'cancelTxHash'           => 'cancel_tx_hash',
        'cancelBlockHeight'      => 'cancel_block_height',
        'dciCodeTsr'             => 'dci_code_tsr',
        'dciCodeFileTsr'         => 'dci_code_file_tsr',
        'preRegCertTsr'          => 'pre_reg_cert_tsr',
        'preRegCertFileId'       => 'pre_reg_cert_file_id',
        'preRegCertFileHash'     => 'pre_reg_cert_file_hash',
        'preRegCertUrl'          => 'pre_reg_cert_url',
        'pngFileId'              => 'png_file_id',
        'applyObtainDate'        => 'apply_obtain_date',
        'dciCodeObtainDate'      => 'dci_code_obtain_date',
        'errorReason'            => 'error_reason',
        'publicationUrl'         => 'publication_url',
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
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->fileHash) {
            $res['file_hash'] = $this->fileHash;
        }
        if (null !== $this->fileHashTxHash) {
            $res['file_hash_tx_hash'] = $this->fileHashTxHash;
        }
        if (null !== $this->fileHashBlockHeight) {
            $res['file_hash_block_height'] = $this->fileHashBlockHeight;
        }
        if (null !== $this->dciCode) {
            $res['dci_code'] = $this->dciCode;
        }
        if (null !== $this->dciCodeTxHash) {
            $res['dci_code_tx_hash'] = $this->dciCodeTxHash;
        }
        if (null !== $this->dciCodeBlockHeight) {
            $res['dci_code_block_height'] = $this->dciCodeBlockHeight;
        }
        if (null !== $this->dciCodeFileTxHash) {
            $res['dci_code_file_tx_hash'] = $this->dciCodeFileTxHash;
        }
        if (null !== $this->dciCodeFileBlockHeight) {
            $res['dci_code_file_block_height'] = $this->dciCodeFileBlockHeight;
        }
        if (null !== $this->preRegCertTxHash) {
            $res['pre_reg_cert_tx_hash'] = $this->preRegCertTxHash;
        }
        if (null !== $this->preRegCertBlockHeight) {
            $res['pre_reg_cert_block_height'] = $this->preRegCertBlockHeight;
        }
        if (null !== $this->cancelTxHash) {
            $res['cancel_tx_hash'] = $this->cancelTxHash;
        }
        if (null !== $this->cancelBlockHeight) {
            $res['cancel_block_height'] = $this->cancelBlockHeight;
        }
        if (null !== $this->dciCodeTsr) {
            $res['dci_code_tsr'] = $this->dciCodeTsr;
        }
        if (null !== $this->dciCodeFileTsr) {
            $res['dci_code_file_tsr'] = $this->dciCodeFileTsr;
        }
        if (null !== $this->preRegCertTsr) {
            $res['pre_reg_cert_tsr'] = $this->preRegCertTsr;
        }
        if (null !== $this->preRegCertFileId) {
            $res['pre_reg_cert_file_id'] = $this->preRegCertFileId;
        }
        if (null !== $this->preRegCertFileHash) {
            $res['pre_reg_cert_file_hash'] = $this->preRegCertFileHash;
        }
        if (null !== $this->preRegCertUrl) {
            $res['pre_reg_cert_url'] = $this->preRegCertUrl;
        }
        if (null !== $this->pngFileId) {
            $res['png_file_id'] = $this->pngFileId;
        }
        if (null !== $this->applyObtainDate) {
            $res['apply_obtain_date'] = $this->applyObtainDate;
        }
        if (null !== $this->dciCodeObtainDate) {
            $res['dci_code_obtain_date'] = $this->dciCodeObtainDate;
        }
        if (null !== $this->errorReason) {
            $res['error_reason'] = $this->errorReason;
        }
        if (null !== $this->publicationUrl) {
            $res['publication_url'] = $this->publicationUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDciPreregistrationResponse
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
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['file_hash'])) {
            $model->fileHash = $map['file_hash'];
        }
        if (isset($map['file_hash_tx_hash'])) {
            $model->fileHashTxHash = $map['file_hash_tx_hash'];
        }
        if (isset($map['file_hash_block_height'])) {
            $model->fileHashBlockHeight = $map['file_hash_block_height'];
        }
        if (isset($map['dci_code'])) {
            $model->dciCode = $map['dci_code'];
        }
        if (isset($map['dci_code_tx_hash'])) {
            $model->dciCodeTxHash = $map['dci_code_tx_hash'];
        }
        if (isset($map['dci_code_block_height'])) {
            $model->dciCodeBlockHeight = $map['dci_code_block_height'];
        }
        if (isset($map['dci_code_file_tx_hash'])) {
            $model->dciCodeFileTxHash = $map['dci_code_file_tx_hash'];
        }
        if (isset($map['dci_code_file_block_height'])) {
            $model->dciCodeFileBlockHeight = $map['dci_code_file_block_height'];
        }
        if (isset($map['pre_reg_cert_tx_hash'])) {
            $model->preRegCertTxHash = $map['pre_reg_cert_tx_hash'];
        }
        if (isset($map['pre_reg_cert_block_height'])) {
            $model->preRegCertBlockHeight = $map['pre_reg_cert_block_height'];
        }
        if (isset($map['cancel_tx_hash'])) {
            $model->cancelTxHash = $map['cancel_tx_hash'];
        }
        if (isset($map['cancel_block_height'])) {
            $model->cancelBlockHeight = $map['cancel_block_height'];
        }
        if (isset($map['dci_code_tsr'])) {
            $model->dciCodeTsr = $map['dci_code_tsr'];
        }
        if (isset($map['dci_code_file_tsr'])) {
            $model->dciCodeFileTsr = $map['dci_code_file_tsr'];
        }
        if (isset($map['pre_reg_cert_tsr'])) {
            $model->preRegCertTsr = $map['pre_reg_cert_tsr'];
        }
        if (isset($map['pre_reg_cert_file_id'])) {
            $model->preRegCertFileId = $map['pre_reg_cert_file_id'];
        }
        if (isset($map['pre_reg_cert_file_hash'])) {
            $model->preRegCertFileHash = $map['pre_reg_cert_file_hash'];
        }
        if (isset($map['pre_reg_cert_url'])) {
            $model->preRegCertUrl = $map['pre_reg_cert_url'];
        }
        if (isset($map['png_file_id'])) {
            $model->pngFileId = $map['png_file_id'];
        }
        if (isset($map['apply_obtain_date'])) {
            $model->applyObtainDate = $map['apply_obtain_date'];
        }
        if (isset($map['dci_code_obtain_date'])) {
            $model->dciCodeObtainDate = $map['dci_code_obtain_date'];
        }
        if (isset($map['error_reason'])) {
            $model->errorReason = $map['error_reason'];
        }
        if (isset($map['publication_url'])) {
            $model->publicationUrl = $map['publication_url'];
        }

        return $model;
    }
}
