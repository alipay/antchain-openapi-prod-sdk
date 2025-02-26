<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models;

use AlibabaCloud\Tea\Model;

class GetBlockchainBccrDciRegistrationcertResponse extends Model
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
    public $certStatus;

    // 废弃待删除
    /**
     * @var string
     */
    public $certificateUrl;

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

    // 数登状态
    /**
     * @var string
     */
    public $digitalRegisterStatus;

    // 数登证书&样本证书压缩包url
    /**
     * @var string
     */
    public $downloadUrl;

    // 剩余下载次数
    /**
     * @var int
     */
    public $downloadTimesLeft;

    // 失败详情
    /**
     * @var string
     */
    public $failDetail;

    // 数登证书下载链接
    /**
     * @var string
     */
    public $digitalRegisterCertUrl;

    // 数登样本证书下载链接
    /**
     * @var string
     */
    public $digitalRegisterSampleUrl;
    protected $_name = [
        'reqMsgId'                 => 'req_msg_id',
        'resultCode'               => 'result_code',
        'resultMsg'                => 'result_msg',
        'certStatus'               => 'cert_status',
        'certificateUrl'           => 'certificate_url',
        'errorReason'              => 'error_reason',
        'errorReasonCn'            => 'error_reason_cn',
        'digitalRegisterStatus'    => 'digital_register_status',
        'downloadUrl'              => 'download_url',
        'downloadTimesLeft'        => 'download_times_left',
        'failDetail'               => 'fail_detail',
        'digitalRegisterCertUrl'   => 'digital_register_cert_url',
        'digitalRegisterSampleUrl' => 'digital_register_sample_url',
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
        if (null !== $this->certStatus) {
            $res['cert_status'] = $this->certStatus;
        }
        if (null !== $this->certificateUrl) {
            $res['certificate_url'] = $this->certificateUrl;
        }
        if (null !== $this->errorReason) {
            $res['error_reason'] = $this->errorReason;
        }
        if (null !== $this->errorReasonCn) {
            $res['error_reason_cn'] = $this->errorReasonCn;
        }
        if (null !== $this->digitalRegisterStatus) {
            $res['digital_register_status'] = $this->digitalRegisterStatus;
        }
        if (null !== $this->downloadUrl) {
            $res['download_url'] = $this->downloadUrl;
        }
        if (null !== $this->downloadTimesLeft) {
            $res['download_times_left'] = $this->downloadTimesLeft;
        }
        if (null !== $this->failDetail) {
            $res['fail_detail'] = $this->failDetail;
        }
        if (null !== $this->digitalRegisterCertUrl) {
            $res['digital_register_cert_url'] = $this->digitalRegisterCertUrl;
        }
        if (null !== $this->digitalRegisterSampleUrl) {
            $res['digital_register_sample_url'] = $this->digitalRegisterSampleUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetBlockchainBccrDciRegistrationcertResponse
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
        if (isset($map['cert_status'])) {
            $model->certStatus = $map['cert_status'];
        }
        if (isset($map['certificate_url'])) {
            $model->certificateUrl = $map['certificate_url'];
        }
        if (isset($map['error_reason'])) {
            $model->errorReason = $map['error_reason'];
        }
        if (isset($map['error_reason_cn'])) {
            $model->errorReasonCn = $map['error_reason_cn'];
        }
        if (isset($map['digital_register_status'])) {
            $model->digitalRegisterStatus = $map['digital_register_status'];
        }
        if (isset($map['download_url'])) {
            $model->downloadUrl = $map['download_url'];
        }
        if (isset($map['download_times_left'])) {
            $model->downloadTimesLeft = $map['download_times_left'];
        }
        if (isset($map['fail_detail'])) {
            $model->failDetail = $map['fail_detail'];
        }
        if (isset($map['digital_register_cert_url'])) {
            $model->digitalRegisterCertUrl = $map['digital_register_cert_url'];
        }
        if (isset($map['digital_register_sample_url'])) {
            $model->digitalRegisterSampleUrl = $map['digital_register_sample_url'];
        }

        return $model;
    }
}
