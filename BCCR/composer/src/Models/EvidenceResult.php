<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class EvidenceResult extends Model
{
    // 取证编号
    /**
     * @example 8240327000000001001
     *
     * @var string
     */
    public $evidenceId;

    // 取证类型（LIVE：直播，VOD：点播）
    /**
     * @example LIVE
     *
     * @var string
     */
    public $evidenceType;

    // 公证处code
    /**
     * @example LUJIANG
     *
     * @var string
     */
    public $notaryOffice;

    // 取证站点url信息
    /**
     * @example
     *
     * @var EvidenceWebUrlInfo
     */
    public $evidenceUrl;

    // 取证结果文件下载url（有效期3天）
    /**
     * @example https://www.baidu.com
     *
     * @var string
     */
    public $evidenceResultUrl;

    // 存证证明信息
    /**
     * @example
     *
     * @var EvidenceCertificateInfo
     */
    public $certificateInfo;

    // 取证开始时间戳
    /**
     * @example 1713589469000
     *
     * @var int
     */
    public $evidenceStartTime;

    // 取证状态(SUCCESS:成功, FAIL:取证失败)
    /**
     * @example SUCCESS
     *
     * @var string
     */
    public $status;

    // 处理结果码
    /**
     * @example 4188
     *
     * @var string
     */
    public $code;

    // 处理结果信息
    /**
     * @example 取证资源不足
     *
     * @var string
     */
    public $message;
    protected $_name = [
        'evidenceId'        => 'evidence_id',
        'evidenceType'      => 'evidence_type',
        'notaryOffice'      => 'notary_office',
        'evidenceUrl'       => 'evidence_url',
        'evidenceResultUrl' => 'evidence_result_url',
        'certificateInfo'   => 'certificate_info',
        'evidenceStartTime' => 'evidence_start_time',
        'status'            => 'status',
        'code'              => 'code',
        'message'           => 'message',
    ];

    public function validate()
    {
        Model::validateRequired('evidenceId', $this->evidenceId, true);
        Model::validateRequired('evidenceType', $this->evidenceType, true);
        Model::validateRequired('notaryOffice', $this->notaryOffice, true);
        Model::validateRequired('evidenceUrl', $this->evidenceUrl, true);
        Model::validateRequired('evidenceResultUrl', $this->evidenceResultUrl, true);
        Model::validateRequired('certificateInfo', $this->certificateInfo, true);
        Model::validateRequired('evidenceStartTime', $this->evidenceStartTime, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('message', $this->message, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->evidenceId) {
            $res['evidence_id'] = $this->evidenceId;
        }
        if (null !== $this->evidenceType) {
            $res['evidence_type'] = $this->evidenceType;
        }
        if (null !== $this->notaryOffice) {
            $res['notary_office'] = $this->notaryOffice;
        }
        if (null !== $this->evidenceUrl) {
            $res['evidence_url'] = null !== $this->evidenceUrl ? $this->evidenceUrl->toMap() : null;
        }
        if (null !== $this->evidenceResultUrl) {
            $res['evidence_result_url'] = $this->evidenceResultUrl;
        }
        if (null !== $this->certificateInfo) {
            $res['certificate_info'] = null !== $this->certificateInfo ? $this->certificateInfo->toMap() : null;
        }
        if (null !== $this->evidenceStartTime) {
            $res['evidence_start_time'] = $this->evidenceStartTime;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EvidenceResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['evidence_id'])) {
            $model->evidenceId = $map['evidence_id'];
        }
        if (isset($map['evidence_type'])) {
            $model->evidenceType = $map['evidence_type'];
        }
        if (isset($map['notary_office'])) {
            $model->notaryOffice = $map['notary_office'];
        }
        if (isset($map['evidence_url'])) {
            $model->evidenceUrl = EvidenceWebUrlInfo::fromMap($map['evidence_url']);
        }
        if (isset($map['evidence_result_url'])) {
            $model->evidenceResultUrl = $map['evidence_result_url'];
        }
        if (isset($map['certificate_info'])) {
            $model->certificateInfo = EvidenceCertificateInfo::fromMap($map['certificate_info']);
        }
        if (isset($map['evidence_start_time'])) {
            $model->evidenceStartTime = $map['evidence_start_time'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }

        return $model;
    }
}
