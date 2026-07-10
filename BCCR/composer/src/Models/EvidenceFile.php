<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class EvidenceFile extends Model
{
    // 证据文件名称
    /**
     * @example 文件名称
     *
     * @var string
     */
    public $evidenceFileName;

    // 证据文件备注
    /**
     * @example 备注
     *
     * @var string
     */
    public $memo;

    // 文件类型
    /**
     * @example RECORD_SCREEN
     *
     * @var string
     */
    public $evidenceFileType;

    // 文件大小
    /**
     * @example 100
     *
     * @var int
     */
    public $evidenceFileSize;

    // 文件时长（单位：秒）
    /**
     * @example 100
     *
     * @var int
     */
    public $duration;

    // 证据文件指纹
    /**
     * @example b99bd7628080f2ec55d68bfe15d62a2b
     *
     * @var string
     */
    public $evidenceFileHash;

    // 文件url
    /**
     * @example https://www.baidu.com
     *
     * @var string
     */
    public $fileUrl;
    protected $_name = [
        'evidenceFileName' => 'evidence_file_name',
        'memo'             => 'memo',
        'evidenceFileType' => 'evidence_file_type',
        'evidenceFileSize' => 'evidence_file_size',
        'duration'         => 'duration',
        'evidenceFileHash' => 'evidence_file_hash',
        'fileUrl'          => 'file_url',
    ];

    public function validate()
    {
        Model::validateRequired('evidenceFileName', $this->evidenceFileName, true);
        Model::validateRequired('memo', $this->memo, true);
        Model::validateRequired('evidenceFileType', $this->evidenceFileType, true);
        Model::validateRequired('evidenceFileSize', $this->evidenceFileSize, true);
        Model::validateRequired('duration', $this->duration, true);
        Model::validateRequired('evidenceFileHash', $this->evidenceFileHash, true);
        Model::validateRequired('fileUrl', $this->fileUrl, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->evidenceFileName) {
            $res['evidence_file_name'] = $this->evidenceFileName;
        }
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }
        if (null !== $this->evidenceFileType) {
            $res['evidence_file_type'] = $this->evidenceFileType;
        }
        if (null !== $this->evidenceFileSize) {
            $res['evidence_file_size'] = $this->evidenceFileSize;
        }
        if (null !== $this->duration) {
            $res['duration'] = $this->duration;
        }
        if (null !== $this->evidenceFileHash) {
            $res['evidence_file_hash'] = $this->evidenceFileHash;
        }
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EvidenceFile
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['evidence_file_name'])) {
            $model->evidenceFileName = $map['evidence_file_name'];
        }
        if (isset($map['memo'])) {
            $model->memo = $map['memo'];
        }
        if (isset($map['evidence_file_type'])) {
            $model->evidenceFileType = $map['evidence_file_type'];
        }
        if (isset($map['evidence_file_size'])) {
            $model->evidenceFileSize = $map['evidence_file_size'];
        }
        if (isset($map['duration'])) {
            $model->duration = $map['duration'];
        }
        if (isset($map['evidence_file_hash'])) {
            $model->evidenceFileHash = $map['evidence_file_hash'];
        }
        if (isset($map['file_url'])) {
            $model->fileUrl = $map['file_url'];
        }

        return $model;
    }
}
