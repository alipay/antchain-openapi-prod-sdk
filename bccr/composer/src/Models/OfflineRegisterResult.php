<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class OfflineRegisterResult extends Model
{
    // 取证文件
    /**
     * @example
     *
     * @var EvidenceFile
     */
    public $evidenceFile;

    // 线下取证ID
    /**
     * @example 123456
     *
     * @var string
     */
    public $offlineEvidenceId;

    // 错误码
    /**
     * @example NOTARY_OFFLINE_REGISTER_ERROR
     *
     * @var string
     */
    public $errorCode;

    // 错误信息
    /**
     * @example 公证处线下取证存证失败
     *
     * @var string
     */
    public $errorMessage;

    // 取证状态
    /**
     * @example SUCCESS
     *
     * @var string
     */
    public $status;

    // 取证时间
    /**
     * @example 1713770769000
     *
     * @var int
     */
    public $evidenceTime;

    // 委托取证ID
    /**
     * @example 123456
     *
     * @var string
     */
    public $evidenceAssignmentId;

    // 取证用户ID
    /**
     * @example 123456
     *
     * @var string
     */
    public $evidenceUserId;

    // 取证名称
    /**
     * @example 取证名称
     *
     * @var string
     */
    public $evidenceName;

    // 公证处code
    /**
     * @example LU_JIANG
     *
     * @var string
     */
    public $notaryOfficeCode;

    // 公证处名称
    /**
     * @example 鹭江公证处
     *
     * @var string
     */
    public $notaryOfficeName;

    // 经度
    /**
     * @example 23.35
     *
     * @var string
     */
    public $longitude;

    // 纬度
    /**
     * @example 23.35
     *
     * @var string
     */
    public $latitude;

    // 位置
    /**
     * @example xxxx
     *
     * @var string
     */
    public $location;

    // 取证开始时间
    /**
     * @example 1713770769000
     *
     * @var int
     */
    public $evidenceStartTime;

    // 取证结束时间
    /**
     * @example 1713770769000
     *
     * @var int
     */
    public $evidenceEndTime;

    // 取证类型
    /**
     * @example OFFLINE_PICTURE
     *
     * @var string
     */
    public $evidenceType;

    // 存证编号
    /**
     * @example 8240401000000013980
     *
     * @var string
     */
    public $certificateNo;

    //
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

    // 备注
    /**
     * @example 备注
     *
     * @var string
     */
    public $memo;
    protected $_name = [
        'evidenceFile'         => 'evidence_file',
        'offlineEvidenceId'    => 'offline_evidence_id',
        'errorCode'            => 'error_code',
        'errorMessage'         => 'error_message',
        'status'               => 'status',
        'evidenceTime'         => 'evidence_time',
        'evidenceAssignmentId' => 'evidence_assignment_id',
        'evidenceUserId'       => 'evidence_user_id',
        'evidenceName'         => 'evidence_name',
        'notaryOfficeCode'     => 'notary_office_code',
        'notaryOfficeName'     => 'notary_office_name',
        'longitude'            => 'longitude',
        'latitude'             => 'latitude',
        'location'             => 'location',
        'evidenceStartTime'    => 'evidence_start_time',
        'evidenceEndTime'      => 'evidence_end_time',
        'evidenceType'         => 'evidence_type',
        'certificateNo'        => 'certificate_no',
        'certificateTime'      => 'certificate_time',
        'evidenceHash'         => 'evidence_hash',
        'evidenceTxHash'       => 'evidence_tx_hash',
        'certificateFileUrl'   => 'certificate_file_url',
        'memo'                 => 'memo',
    ];

    public function validate()
    {
        Model::validateRequired('offlineEvidenceId', $this->offlineEvidenceId, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('evidenceType', $this->evidenceType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->evidenceFile) {
            $res['evidence_file'] = null !== $this->evidenceFile ? $this->evidenceFile->toMap() : null;
        }
        if (null !== $this->offlineEvidenceId) {
            $res['offline_evidence_id'] = $this->offlineEvidenceId;
        }
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        if (null !== $this->errorMessage) {
            $res['error_message'] = $this->errorMessage;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->evidenceTime) {
            $res['evidence_time'] = $this->evidenceTime;
        }
        if (null !== $this->evidenceAssignmentId) {
            $res['evidence_assignment_id'] = $this->evidenceAssignmentId;
        }
        if (null !== $this->evidenceUserId) {
            $res['evidence_user_id'] = $this->evidenceUserId;
        }
        if (null !== $this->evidenceName) {
            $res['evidence_name'] = $this->evidenceName;
        }
        if (null !== $this->notaryOfficeCode) {
            $res['notary_office_code'] = $this->notaryOfficeCode;
        }
        if (null !== $this->notaryOfficeName) {
            $res['notary_office_name'] = $this->notaryOfficeName;
        }
        if (null !== $this->longitude) {
            $res['longitude'] = $this->longitude;
        }
        if (null !== $this->latitude) {
            $res['latitude'] = $this->latitude;
        }
        if (null !== $this->location) {
            $res['location'] = $this->location;
        }
        if (null !== $this->evidenceStartTime) {
            $res['evidence_start_time'] = $this->evidenceStartTime;
        }
        if (null !== $this->evidenceEndTime) {
            $res['evidence_end_time'] = $this->evidenceEndTime;
        }
        if (null !== $this->evidenceType) {
            $res['evidence_type'] = $this->evidenceType;
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
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OfflineRegisterResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['evidence_file'])) {
            $model->evidenceFile = EvidenceFile::fromMap($map['evidence_file']);
        }
        if (isset($map['offline_evidence_id'])) {
            $model->offlineEvidenceId = $map['offline_evidence_id'];
        }
        if (isset($map['error_code'])) {
            $model->errorCode = $map['error_code'];
        }
        if (isset($map['error_message'])) {
            $model->errorMessage = $map['error_message'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['evidence_time'])) {
            $model->evidenceTime = $map['evidence_time'];
        }
        if (isset($map['evidence_assignment_id'])) {
            $model->evidenceAssignmentId = $map['evidence_assignment_id'];
        }
        if (isset($map['evidence_user_id'])) {
            $model->evidenceUserId = $map['evidence_user_id'];
        }
        if (isset($map['evidence_name'])) {
            $model->evidenceName = $map['evidence_name'];
        }
        if (isset($map['notary_office_code'])) {
            $model->notaryOfficeCode = $map['notary_office_code'];
        }
        if (isset($map['notary_office_name'])) {
            $model->notaryOfficeName = $map['notary_office_name'];
        }
        if (isset($map['longitude'])) {
            $model->longitude = $map['longitude'];
        }
        if (isset($map['latitude'])) {
            $model->latitude = $map['latitude'];
        }
        if (isset($map['location'])) {
            $model->location = $map['location'];
        }
        if (isset($map['evidence_start_time'])) {
            $model->evidenceStartTime = $map['evidence_start_time'];
        }
        if (isset($map['evidence_end_time'])) {
            $model->evidenceEndTime = $map['evidence_end_time'];
        }
        if (isset($map['evidence_type'])) {
            $model->evidenceType = $map['evidence_type'];
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
        if (isset($map['memo'])) {
            $model->memo = $map['memo'];
        }

        return $model;
    }
}
