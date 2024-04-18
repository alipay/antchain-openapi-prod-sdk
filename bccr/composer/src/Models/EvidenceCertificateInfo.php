<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class EvidenceCertificateInfo extends Model
{
    // 证书编号
    /**
     * @example 5978355373
     *
     * @var string
     */
    public $certificateNo;

    // 上链时间
    /**
     * @example 2023-06-27T10:50:23+08:00
     *
     * @var string
     */
    public $certificateTime;

    // 链上交易hash
    /**
     * @example eh5a978s3553c73ee7e2cl22e
     *
     * @var string
     */
    public $certificateHash;

    // 证书下载url（有效期3天）
    /**
     * @example https://xxxx
     *
     * @var string
     */
    public $certificateUrl;
    protected $_name = [
        'certificateNo'   => 'certificate_no',
        'certificateTime' => 'certificate_time',
        'certificateHash' => 'certificate_hash',
        'certificateUrl'  => 'certificate_url',
    ];

    public function validate()
    {
        Model::validateRequired('certificateNo', $this->certificateNo, true);
        Model::validateRequired('certificateTime', $this->certificateTime, true);
        Model::validateRequired('certificateHash', $this->certificateHash, true);
        Model::validateRequired('certificateUrl', $this->certificateUrl, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->certificateNo) {
            $res['certificate_no'] = $this->certificateNo;
        }
        if (null !== $this->certificateTime) {
            $res['certificate_time'] = $this->certificateTime;
        }
        if (null !== $this->certificateHash) {
            $res['certificate_hash'] = $this->certificateHash;
        }
        if (null !== $this->certificateUrl) {
            $res['certificate_url'] = $this->certificateUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EvidenceCertificateInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['certificate_no'])) {
            $model->certificateNo = $map['certificate_no'];
        }
        if (isset($map['certificate_time'])) {
            $model->certificateTime = $map['certificate_time'];
        }
        if (isset($map['certificate_hash'])) {
            $model->certificateHash = $map['certificate_hash'];
        }
        if (isset($map['certificate_url'])) {
            $model->certificateUrl = $map['certificate_url'];
        }

        return $model;
    }
}
