<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class ScreenshotCertificateResult extends Model
{
    // 证据类型
    /**
     * @example SCREENSHOT
     *
     * @var string
     */
    public $evidenceType;

    // 证据状态
    /**
     * @example SUCCESS
     *
     * @var string
     */
    public $status;

    // 网页截取编号
    /**
     * @example 8240419000000028693
     *
     * @var string
     */
    public $screenshotId;

    // 证据编号
    /**
     * @example 8240419000000028693
     *
     * @var string
     */
    public $evidenceId;

    // 存证编号
    /**
     * @example 20240422173407597000001
     *
     * @var string
     */
    public $certificateNo;

    // 上链时间
    /**
     * @example 1713779272000
     *
     * @var int
     */
    public $certificateTime;

    // 证据hash
    /**
     * @example dbdd234c35ca275a17b395ad58eff4c2
     *
     * @var string
     */
    public $evidenceHash;

    // 链上交易hash
    /**
     * @example fc044ac2c1d75ed1219b39db86398cc7cd1c67a43d6ea6c4b83f3a7f5b918a14
     *
     * @var string
     */
    public $evidenceTxHash;

    // 证书下载链接
    /**
     * @example https://www.baidu.com
     *
     * @var string
     */
    public $certificateFileUrl;

    // 截图文件下载链接
    /**
     * @example https://www.baidu.com
     *
     * @var string
     */
    public $screenshotFileUrl;

    // 证据文件大小
    /**
     * @example 100
     *
     * @var int
     */
    public $evidenceFileSize;

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
        'screenshotId'       => 'screenshot_id',
        'evidenceId'         => 'evidence_id',
        'certificateNo'      => 'certificate_no',
        'certificateTime'    => 'certificate_time',
        'evidenceHash'       => 'evidence_hash',
        'evidenceTxHash'     => 'evidence_tx_hash',
        'certificateFileUrl' => 'certificate_file_url',
        'screenshotFileUrl'  => 'screenshot_file_url',
        'evidenceFileSize'   => 'evidence_file_size',
        'errorCode'          => 'error_code',
        'errorMessage'       => 'error_message',
    ];

    public function validate()
    {
        Model::validateRequired('evidenceType', $this->evidenceType, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('screenshotId', $this->screenshotId, true);
        Model::validateRequired('evidenceId', $this->evidenceId, true);
        Model::validateRequired('certificateNo', $this->certificateNo, true);
        Model::validateRequired('certificateTime', $this->certificateTime, true);
        Model::validateRequired('evidenceHash', $this->evidenceHash, true);
        Model::validateRequired('evidenceTxHash', $this->evidenceTxHash, true);
        Model::validateRequired('certificateFileUrl', $this->certificateFileUrl, true);
        Model::validateRequired('screenshotFileUrl', $this->screenshotFileUrl, true);
        Model::validateRequired('evidenceFileSize', $this->evidenceFileSize, true);
        Model::validateRequired('errorCode', $this->errorCode, true);
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
        if (null !== $this->screenshotId) {
            $res['screenshot_id'] = $this->screenshotId;
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
        if (null !== $this->screenshotFileUrl) {
            $res['screenshot_file_url'] = $this->screenshotFileUrl;
        }
        if (null !== $this->evidenceFileSize) {
            $res['evidence_file_size'] = $this->evidenceFileSize;
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
     * @return ScreenshotCertificateResult
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
        if (isset($map['screenshot_id'])) {
            $model->screenshotId = $map['screenshot_id'];
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
        if (isset($map['screenshot_file_url'])) {
            $model->screenshotFileUrl = $map['screenshot_file_url'];
        }
        if (isset($map['evidence_file_size'])) {
            $model->evidenceFileSize = $map['evidence_file_size'];
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
