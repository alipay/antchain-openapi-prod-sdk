<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models;

use AlibabaCloud\Tea\Model;

class QueryBlockchainBccrDciRegistrationResponse extends Model
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

    // 废弃待删除
    /**
     * @var string
     */
    public $contentStatus;

    // 废弃待删除
    /**
     * @var string
     */
    public $registerCertTxHash;

    // 废弃待删除
    /**
     * @var string
     */
    public $registerCertBlockHeight;

    // 废弃待删除
    /**
     * @var string
     */
    public $registerCertTsr;

    // 废弃待删除
    /**
     * @var string
     */
    public $registerCertPngFileId;

    // 废弃待删除
    /**
     * @var string
     */
    public $registerSampleFileId;

    // 废弃待删除
    /**
     * @var string
     */
    public $registerSamplePngFileId;

    // 废弃待删除
    /**
     * @var int
     */
    public $registerDownloadTimesLeft;

    // 废弃待删除
    /**
     * @var string
     */
    public $errorReason;

    // 废弃待删除
    /**
     * @var string
     */
    public $errorReasonCn;

    // 废弃待删除
    /**
     * @var string[]
     */
    public $invoiceFileIdList;

    // 废弃待删除
    /**
     * @var string
     */
    public $applyRegisterTime;

    // 数登登记号
    /**
     * @var string
     */
    public $regNumber;

    // 数登id
    /**
     * @var string
     */
    public $digitalRegisterId;

    // dci申领id
    /**
     * @var string
     */
    public $dciContentId;

    // 数登状态
    /**
     * @var string
     */
    public $digitalRegisterStatus;

    // 数登申请时间
    /**
     * @var string
     */
    public $digitalRegisterApplyTime;

    // 数登完成时间
    /**
     * @var string
     */
    public $digitalRegisterCompletionTime;

    // 数登证书预览图url
    /**
     * @var string
     */
    public $digitalRegisterCertPngUrl;

    // 样本证书预览图url
    /**
     * @var string
     */
    public $digitalRegisterSamplePngUrl;

    // 证书本月剩余下载次数
    /**
     * @var int
     */
    public $downloadTimesLeft;

    // 发票下载链接list
    /**
     * @var string[]
     */
    public $invoiceUrlList;

    // 数登失败详情
    /**
     * @var string
     */
    public $failDetail;

    // 补正类型
    /**
     * @var string
     */
    public $amendType;

    // 用户申请表url
    /**
     * @var string
     */
    public $applyFormUrl;

    // 数登流水号
    /**
     * @var string
     */
    public $flowNumber;
    protected $_name = [
        'reqMsgId'                      => 'req_msg_id',
        'resultCode'                    => 'result_code',
        'resultMsg'                     => 'result_msg',
        'contentStatus'                 => 'content_status',
        'registerCertTxHash'            => 'register_cert_tx_hash',
        'registerCertBlockHeight'       => 'register_cert_block_height',
        'registerCertTsr'               => 'register_cert_tsr',
        'registerCertPngFileId'         => 'register_cert_png_file_id',
        'registerSampleFileId'          => 'register_sample_file_id',
        'registerSamplePngFileId'       => 'register_sample_png_file_id',
        'registerDownloadTimesLeft'     => 'register_download_times_left',
        'errorReason'                   => 'error_reason',
        'errorReasonCn'                 => 'error_reason_cn',
        'invoiceFileIdList'             => 'invoice_file_id_list',
        'applyRegisterTime'             => 'apply_register_time',
        'regNumber'                     => 'reg_number',
        'digitalRegisterId'             => 'digital_register_id',
        'dciContentId'                  => 'dci_content_id',
        'digitalRegisterStatus'         => 'digital_register_status',
        'digitalRegisterApplyTime'      => 'digital_register_apply_time',
        'digitalRegisterCompletionTime' => 'digital_register_completion_time',
        'digitalRegisterCertPngUrl'     => 'digital_register_cert_png_url',
        'digitalRegisterSamplePngUrl'   => 'digital_register_sample_png_url',
        'downloadTimesLeft'             => 'download_times_left',
        'invoiceUrlList'                => 'invoice_url_list',
        'failDetail'                    => 'fail_detail',
        'amendType'                     => 'amend_type',
        'applyFormUrl'                  => 'apply_form_url',
        'flowNumber'                    => 'flow_number',
    ];

    public function validate()
    {
        Model::validatePattern('applyRegisterTime', $this->applyRegisterTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('digitalRegisterApplyTime', $this->digitalRegisterApplyTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('digitalRegisterCompletionTime', $this->digitalRegisterCompletionTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->errorReasonCn) {
            $res['error_reason_cn'] = $this->errorReasonCn;
        }
        if (null !== $this->invoiceFileIdList) {
            $res['invoice_file_id_list'] = $this->invoiceFileIdList;
        }
        if (null !== $this->applyRegisterTime) {
            $res['apply_register_time'] = $this->applyRegisterTime;
        }
        if (null !== $this->regNumber) {
            $res['reg_number'] = $this->regNumber;
        }
        if (null !== $this->digitalRegisterId) {
            $res['digital_register_id'] = $this->digitalRegisterId;
        }
        if (null !== $this->dciContentId) {
            $res['dci_content_id'] = $this->dciContentId;
        }
        if (null !== $this->digitalRegisterStatus) {
            $res['digital_register_status'] = $this->digitalRegisterStatus;
        }
        if (null !== $this->digitalRegisterApplyTime) {
            $res['digital_register_apply_time'] = $this->digitalRegisterApplyTime;
        }
        if (null !== $this->digitalRegisterCompletionTime) {
            $res['digital_register_completion_time'] = $this->digitalRegisterCompletionTime;
        }
        if (null !== $this->digitalRegisterCertPngUrl) {
            $res['digital_register_cert_png_url'] = $this->digitalRegisterCertPngUrl;
        }
        if (null !== $this->digitalRegisterSamplePngUrl) {
            $res['digital_register_sample_png_url'] = $this->digitalRegisterSamplePngUrl;
        }
        if (null !== $this->downloadTimesLeft) {
            $res['download_times_left'] = $this->downloadTimesLeft;
        }
        if (null !== $this->invoiceUrlList) {
            $res['invoice_url_list'] = $this->invoiceUrlList;
        }
        if (null !== $this->failDetail) {
            $res['fail_detail'] = $this->failDetail;
        }
        if (null !== $this->amendType) {
            $res['amend_type'] = $this->amendType;
        }
        if (null !== $this->applyFormUrl) {
            $res['apply_form_url'] = $this->applyFormUrl;
        }
        if (null !== $this->flowNumber) {
            $res['flow_number'] = $this->flowNumber;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBlockchainBccrDciRegistrationResponse
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
        if (isset($map['error_reason_cn'])) {
            $model->errorReasonCn = $map['error_reason_cn'];
        }
        if (isset($map['invoice_file_id_list'])) {
            if (!empty($map['invoice_file_id_list'])) {
                $model->invoiceFileIdList = $map['invoice_file_id_list'];
            }
        }
        if (isset($map['apply_register_time'])) {
            $model->applyRegisterTime = $map['apply_register_time'];
        }
        if (isset($map['reg_number'])) {
            $model->regNumber = $map['reg_number'];
        }
        if (isset($map['digital_register_id'])) {
            $model->digitalRegisterId = $map['digital_register_id'];
        }
        if (isset($map['dci_content_id'])) {
            $model->dciContentId = $map['dci_content_id'];
        }
        if (isset($map['digital_register_status'])) {
            $model->digitalRegisterStatus = $map['digital_register_status'];
        }
        if (isset($map['digital_register_apply_time'])) {
            $model->digitalRegisterApplyTime = $map['digital_register_apply_time'];
        }
        if (isset($map['digital_register_completion_time'])) {
            $model->digitalRegisterCompletionTime = $map['digital_register_completion_time'];
        }
        if (isset($map['digital_register_cert_png_url'])) {
            $model->digitalRegisterCertPngUrl = $map['digital_register_cert_png_url'];
        }
        if (isset($map['digital_register_sample_png_url'])) {
            $model->digitalRegisterSamplePngUrl = $map['digital_register_sample_png_url'];
        }
        if (isset($map['download_times_left'])) {
            $model->downloadTimesLeft = $map['download_times_left'];
        }
        if (isset($map['invoice_url_list'])) {
            if (!empty($map['invoice_url_list'])) {
                $model->invoiceUrlList = $map['invoice_url_list'];
            }
        }
        if (isset($map['fail_detail'])) {
            $model->failDetail = $map['fail_detail'];
        }
        if (isset($map['amend_type'])) {
            $model->amendType = $map['amend_type'];
        }
        if (isset($map['apply_form_url'])) {
            $model->applyFormUrl = $map['apply_form_url'];
        }
        if (isset($map['flow_number'])) {
            $model->flowNumber = $map['flow_number'];
        }

        return $model;
    }
}
