<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models;

use AlibabaCloud\Tea\Model;

class CaSignUrlResult extends Model
{
    // 签署方名称
    /**
     * @example 李四
     *
     * @var string
     */
    public $signCertName;

    // 签署方证件号（脱敏）
    /**
     * @example 142632199302220111
     *
     * @var string
     */
    public $signCertNo;

    // 签署方id
    /**
     * @example C123232312312323
     *
     * @var string
     */
    public $signUserId;

    // 加密后的签署方证件号(用来关联签署方的签署链接)
    /**
     * @example 1443f5cff147e2c1c26e0e396f3c9a9f
     *
     * @var string
     */
    public $encryptSignCertNo;

    // 签署链接
    /**
     * @example https://p.tb.cn/_3EnEMCvJvztve7Nwb8RIxi
     *
     * @var string
     */
    public $signUrl;
    protected $_name = [
        'signCertName'      => 'sign_cert_name',
        'signCertNo'        => 'sign_cert_no',
        'signUserId'        => 'sign_user_id',
        'encryptSignCertNo' => 'encrypt_sign_cert_no',
        'signUrl'           => 'sign_url',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->signCertName) {
            $res['sign_cert_name'] = $this->signCertName;
        }
        if (null !== $this->signCertNo) {
            $res['sign_cert_no'] = $this->signCertNo;
        }
        if (null !== $this->signUserId) {
            $res['sign_user_id'] = $this->signUserId;
        }
        if (null !== $this->encryptSignCertNo) {
            $res['encrypt_sign_cert_no'] = $this->encryptSignCertNo;
        }
        if (null !== $this->signUrl) {
            $res['sign_url'] = $this->signUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CaSignUrlResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sign_cert_name'])) {
            $model->signCertName = $map['sign_cert_name'];
        }
        if (isset($map['sign_cert_no'])) {
            $model->signCertNo = $map['sign_cert_no'];
        }
        if (isset($map['sign_user_id'])) {
            $model->signUserId = $map['sign_user_id'];
        }
        if (isset($map['encrypt_sign_cert_no'])) {
            $model->encryptSignCertNo = $map['encrypt_sign_cert_no'];
        }
        if (isset($map['sign_url'])) {
            $model->signUrl = $map['sign_url'];
        }

        return $model;
    }
}
