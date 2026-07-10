<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class SignDocument extends Model
{
    // 签署文件
    /**
     * @example xxx
     *
     * @var string
     */
    public $signFile;

    // 到期时间戳
    /**
     * @example
     *
     * @var int
     */
    public $expireTime;

    // 签署文件名
    /**
     * @example 在线公证申办过程记录.pdf
     *
     * @var string
     */
    public $signFileName;

    // 签署文件描述
    /**
     * @example 在线公证申办过程记录
     *
     * @var string
     */
    public $signFileDesc;

    // 签署文件哈希
    /**
     * @example 用于校验文件完整性，计算文件的SHA-256值
     *
     * @var string
     */
    public $signFileHash;

    // 签署文件类型
    /**
     * @example NOTARY_PAPER：公证申请表 ONLINE_NOTIFICATION：在线公证受理平台公证受理告知书 EVIDENCE_NOTIFICATION：保全证据通用告知书 ONLINE_RECORD：在线公证申办询问记录
     *
     * @var string
     */
    public $signFileType;
    protected $_name = [
        'signFile'     => 'sign_file',
        'expireTime'   => 'expire_time',
        'signFileName' => 'sign_file_name',
        'signFileDesc' => 'sign_file_desc',
        'signFileHash' => 'sign_file_hash',
        'signFileType' => 'sign_file_type',
    ];

    public function validate()
    {
        Model::validateRequired('signFile', $this->signFile, true);
        Model::validateRequired('expireTime', $this->expireTime, true);
        Model::validateRequired('signFileName', $this->signFileName, true);
        Model::validateRequired('signFileDesc', $this->signFileDesc, true);
        Model::validateRequired('signFileHash', $this->signFileHash, true);
        Model::validateRequired('signFileType', $this->signFileType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->signFile) {
            $res['sign_file'] = $this->signFile;
        }
        if (null !== $this->expireTime) {
            $res['expire_time'] = $this->expireTime;
        }
        if (null !== $this->signFileName) {
            $res['sign_file_name'] = $this->signFileName;
        }
        if (null !== $this->signFileDesc) {
            $res['sign_file_desc'] = $this->signFileDesc;
        }
        if (null !== $this->signFileHash) {
            $res['sign_file_hash'] = $this->signFileHash;
        }
        if (null !== $this->signFileType) {
            $res['sign_file_type'] = $this->signFileType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SignDocument
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sign_file'])) {
            $model->signFile = $map['sign_file'];
        }
        if (isset($map['expire_time'])) {
            $model->expireTime = $map['expire_time'];
        }
        if (isset($map['sign_file_name'])) {
            $model->signFileName = $map['sign_file_name'];
        }
        if (isset($map['sign_file_desc'])) {
            $model->signFileDesc = $map['sign_file_desc'];
        }
        if (isset($map['sign_file_hash'])) {
            $model->signFileHash = $map['sign_file_hash'];
        }
        if (isset($map['sign_file_type'])) {
            $model->signFileType = $map['sign_file_type'];
        }

        return $model;
    }
}
