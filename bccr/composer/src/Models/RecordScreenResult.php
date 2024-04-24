<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class RecordScreenResult extends Model
{
    // 取证类型(SCREEN_RECORDING：录屏取证)
    /**
     * @example SCREEN_RECORDING
     *
     * @var string
     */
    public $evidenceType;

    // 取证状态
    /**
     * @example SUCCESS
     *
     * @var string
     */
    public $status;

    // 证据编号
    /**
     * @example 8240401000000013980
     *
     * @var string
     */
    public $evidenceId;

    // 存证编号
    /**
     * @example 8240401000000013980
     *
     * @var string
     */
    public $certificateNo;

    // 上链时间
    /**
     * @example 1713771170000
     *
     * @var int
     */
    public $certificateTime;

    // 证据hash
    /**
     * @example 2ed3532c4438f82eef7cdf6a54e7ac11
     *
     * @var string
     */
    public $evidenceHash;

    // 链上交易hash
    /**
     * @example b251a2d54ea254165c9baf13e8366635b1c90d4a449a35fcdce7b332054c8aac
     *
     * @var string
     */
    public $evidenceTxHash;

    // 证书文件下载地址
    /**
     * @example https://www.baidu.com
     *
     * @var string
     */
    public $certificateFileUrl;

    // 录屏取证文件列表
    /**
     * @example
     *
     * @var EvidenceFile[]
     */
    public $evidenceFiles;

    // 录屏开始时间
    /**
     * @example 1713770769000
     *
     * @var int
     */
    public $evidenceStartTime;

    // 录屏结束时间
    /**
     * @example 1713770944000
     *
     * @var int
     */
    public $evidenceEndTime;

    // 错误码
    /**
     * @example NOTARY_SCREENSHOT_ERROR
     *
     * @var string
     */
    public $errorCode;

    // 错误信息
    /**
     * @example 公证处网页取证存证失败
     *
     * @var string
     */
    public $errorMessage;
    protected $_name = [
        'evidenceType'       => 'evidence_type',
        'status'             => 'status',
        'evidenceId'         => 'evidence_id',
        'certificateNo'      => 'certificate_no',
        'certificateTime'    => 'certificate_time',
        'evidenceHash'       => 'evidence_hash',
        'evidenceTxHash'     => 'evidence_tx_hash',
        'certificateFileUrl' => 'certificate_file_url',
        'evidenceFiles'      => 'evidence_files',
        'evidenceStartTime'  => 'evidence_start_time',
        'evidenceEndTime'    => 'evidence_end_time',
        'errorCode'          => 'error_code',
        'errorMessage'       => 'error_message',
    ];

    public function validate()
    {
        Model::validateRequired('evidenceType', $this->evidenceType, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('evidenceId', $this->evidenceId, true);
        Model::validateRequired('certificateNo', $this->certificateNo, true);
        Model::validateRequired('certificateTime', $this->certificateTime, true);
        Model::validateRequired('evidenceHash', $this->evidenceHash, true);
        Model::validateRequired('evidenceTxHash', $this->evidenceTxHash, true);
        Model::validateRequired('evidenceStartTime', $this->evidenceStartTime, true);
        Model::validateRequired('evidenceEndTime', $this->evidenceEndTime, true);
        Model::validateRequired('errorMessage', $this->errorMessage, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->evidenceType) {
            $res['evidence_type'] = $this->evidenceType;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->evidenceId) {
            $res['evidence_id'] = $this->evidenceId;
        }
        if (null !== $this->certificateNo) {
            $res['certificate_no'] = $this->certificateNo;
        }
        if (null !== $this->certificateTime) {
            $res['certificate_time'] = $this->certificateTime;
        }
        if (null !== $this->evidenceHash) {
            $res['evidence_hash'] = $this->evidenceHash;
        }
        if (null !== $this->evidenceTxHash) {
            $res['evidence_tx_hash'] = $this->evidenceTxHash;
        }
        if (null !== $this->certificateFileUrl) {
            $res['certificate_file_url'] = $this->certificateFileUrl;
        }
        if (null !== $this->evidenceFiles) {
            $res['evidence_files'] = [];
            if (null !== $this->evidenceFiles && \is_array($this->evidenceFiles)) {
                $n = 0;
                foreach ($this->evidenceFiles as $item) {
                    $res['evidence_files'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->evidenceStartTime) {
            $res['evidence_start_time'] = $this->evidenceStartTime;
        }
        if (null !== $this->evidenceEndTime) {
            $res['evidence_end_time'] = $this->evidenceEndTime;
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
     *
     * @return RecordScreenResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['evidence_type'])) {
            $model->evidenceType = $map['evidence_type'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['evidence_id'])) {
            $model->evidenceId = $map['evidence_id'];
        }
        if (isset($map['certificate_no'])) {
            $model->certificateNo = $map['certificate_no'];
        }
        if (isset($map['certificate_time'])) {
            $model->certificateTime = $map['certificate_time'];
        }
        if (isset($map['evidence_hash'])) {
            $model->evidenceHash = $map['evidence_hash'];
        }
        if (isset($map['evidence_tx_hash'])) {
            $model->evidenceTxHash = $map['evidence_tx_hash'];
        }
        if (isset($map['certificate_file_url'])) {
            $model->certificateFileUrl = $map['certificate_file_url'];
        }
        if (isset($map['evidence_files'])) {
            if (!empty($map['evidence_files'])) {
                $model->evidenceFiles = [];
                $n                    = 0;
                foreach ($map['evidence_files'] as $item) {
                    $model->evidenceFiles[$n++] = null !== $item ? EvidenceFile::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['evidence_start_time'])) {
            $model->evidenceStartTime = $map['evidence_start_time'];
        }
        if (isset($map['evidence_end_time'])) {
            $model->evidenceEndTime = $map['evidence_end_time'];
        }
        if (isset($map['error_code'])) {
            $model->errorCode = $map['error_code'];
        }
        if (isset($map['error_message'])) {
            $model->errorMessage = $map['error_message'];
        }

        return $model;
    }
}
