<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWOE\Models;

use AlibabaCloud\Tea\Model;

class EvidenceInfo extends Model
{
    // 取证类型
    // PHOTO 照片
    // VIDEO 视频
    // STREAM 流
    /**
     * @example PHOTO
     *
     * @var string
     */
    public $forensicType;

    // 取证时间戳
    /**
     * @example 1649992231
     *
     * @var int
     */
    public $forensicTimestamp;

    // 形成证据时间戳
    /**
     * @example 1649992287
     *
     * @var int
     */
    public $evidenceTimestamp;

    // 证据哈希值
    /**
     * @example 981efc44ba7bb830032fd404f86596d1f5e2d5a5c20f7b9286220b6698a41def
     *
     * @var string
     */
    public $evidenceFileHash;

    // 证据大小，byte
    /**
     * @example 256
     *
     * @var int
     */
    public $evidenceFileSize;

    // 证据视频/照片下载链接
    /**
     * @example https://lark-assets-prod-aliyun.oss-accelerate.aliyuncs.com/lark
     *
     * @var string
     */
    public $evidenceFileUrl;

    // 缩略图链接
    /**
     * @example https://lark-assets-prod-aliyun.oss-accelerate.aliyuncs.com/lark
     *
     * @var string
     */
    public $thumbnailUrl;

    // 取证经度，根据是否需要自清洁决定
    /**
     * @example 120.127767
     *
     * @var string
     */
    public $longitude;

    // 取证纬度，根据是否需要自清洁决定
    /**
     * @example 30.275871
     *
     * @var string
     */
    public $latitude;

    // 统一证据编号，根据是否需要上链决定
    /**
     * @example 0003a923a77dfea915f1ebd8fd2e9bf402470a3078da45b6e725099f14779893c1bf
     *
     * @var string
     */
    public $txHash;

    // 公证处，根据是否需要公证决定
    /**
     * @example LUJIANG
     *
     * @var string
     */
    public $notaryOffice;

    // 存证证明文件链接，根据是否需要公证决定
    /**
     * @example https://lark-assets-prod-aliyun.oss-accelerate.aliyuncs.com/lark/0/2021
     *
     * @var string
     */
    public $notaryUrl;

    // 存证证明文件编号，根据是否需要公证决定
    /**
     * @example BC20211229201845398853053
     *
     * @var string
     */
    public $notaryCertNo;

    // 可信时间戳，根据是否需要时间戳决定，JSON类型字符串
    /**
     * @example "{"code":"0","ctsr":"1f8d3b","hashAlgorithm":"sha256","hashedMessage":"61c","sn":"TTAS_S.0.2_7","ts":"1"}"
     *
     * @var string
     */
    public $tsr;
    protected $_name = [
        'forensicType'      => 'forensic_type',
        'forensicTimestamp' => 'forensic_timestamp',
        'evidenceTimestamp' => 'evidence_timestamp',
        'evidenceFileHash'  => 'evidence_file_hash',
        'evidenceFileSize'  => 'evidence_file_size',
        'evidenceFileUrl'   => 'evidence_file_url',
        'thumbnailUrl'      => 'thumbnail_url',
        'longitude'         => 'longitude',
        'latitude'          => 'latitude',
        'txHash'            => 'tx_hash',
        'notaryOffice'      => 'notary_office',
        'notaryUrl'         => 'notary_url',
        'notaryCertNo'      => 'notary_cert_no',
        'tsr'               => 'tsr',
    ];

    public function validate()
    {
        Model::validateRequired('forensicType', $this->forensicType, true);
        Model::validateRequired('forensicTimestamp', $this->forensicTimestamp, true);
        Model::validateRequired('evidenceTimestamp', $this->evidenceTimestamp, true);
        Model::validateRequired('evidenceFileHash', $this->evidenceFileHash, true);
        Model::validateRequired('evidenceFileSize', $this->evidenceFileSize, true);
        Model::validateRequired('evidenceFileUrl', $this->evidenceFileUrl, true);
        Model::validateRequired('thumbnailUrl', $this->thumbnailUrl, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->forensicType) {
            $res['forensic_type'] = $this->forensicType;
        }
        if (null !== $this->forensicTimestamp) {
            $res['forensic_timestamp'] = $this->forensicTimestamp;
        }
        if (null !== $this->evidenceTimestamp) {
            $res['evidence_timestamp'] = $this->evidenceTimestamp;
        }
        if (null !== $this->evidenceFileHash) {
            $res['evidence_file_hash'] = $this->evidenceFileHash;
        }
        if (null !== $this->evidenceFileSize) {
            $res['evidence_file_size'] = $this->evidenceFileSize;
        }
        if (null !== $this->evidenceFileUrl) {
            $res['evidence_file_url'] = $this->evidenceFileUrl;
        }
        if (null !== $this->thumbnailUrl) {
            $res['thumbnail_url'] = $this->thumbnailUrl;
        }
        if (null !== $this->longitude) {
            $res['longitude'] = $this->longitude;
        }
        if (null !== $this->latitude) {
            $res['latitude'] = $this->latitude;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->notaryOffice) {
            $res['notary_office'] = $this->notaryOffice;
        }
        if (null !== $this->notaryUrl) {
            $res['notary_url'] = $this->notaryUrl;
        }
        if (null !== $this->notaryCertNo) {
            $res['notary_cert_no'] = $this->notaryCertNo;
        }
        if (null !== $this->tsr) {
            $res['tsr'] = $this->tsr;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EvidenceInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['forensic_type'])) {
            $model->forensicType = $map['forensic_type'];
        }
        if (isset($map['forensic_timestamp'])) {
            $model->forensicTimestamp = $map['forensic_timestamp'];
        }
        if (isset($map['evidence_timestamp'])) {
            $model->evidenceTimestamp = $map['evidence_timestamp'];
        }
        if (isset($map['evidence_file_hash'])) {
            $model->evidenceFileHash = $map['evidence_file_hash'];
        }
        if (isset($map['evidence_file_size'])) {
            $model->evidenceFileSize = $map['evidence_file_size'];
        }
        if (isset($map['evidence_file_url'])) {
            $model->evidenceFileUrl = $map['evidence_file_url'];
        }
        if (isset($map['thumbnail_url'])) {
            $model->thumbnailUrl = $map['thumbnail_url'];
        }
        if (isset($map['longitude'])) {
            $model->longitude = $map['longitude'];
        }
        if (isset($map['latitude'])) {
            $model->latitude = $map['latitude'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['notary_office'])) {
            $model->notaryOffice = $map['notary_office'];
        }
        if (isset($map['notary_url'])) {
            $model->notaryUrl = $map['notary_url'];
        }
        if (isset($map['notary_cert_no'])) {
            $model->notaryCertNo = $map['notary_cert_no'];
        }
        if (isset($map['tsr'])) {
            $model->tsr = $map['tsr'];
        }

        return $model;
    }
}
