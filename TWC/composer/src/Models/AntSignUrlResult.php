<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class AntSignUrlResult extends Model
{
    // 签署方名称
    /**
     * @example 某某
     *
     * @var string
     */
    public $signCertName;

    // 签署方证件号（脱敏）
    /**
     * @example 421011111111111111
     *
     * @var string
     */
    public $signCertNo;

    // 签署方 id
    /**
     * @example CA20220920000002
     *
     * @var string
     */
    public $signUserId;

    // 加密后的签署方证件号(用来关联签署方的签署链接)
    /**
     * @example 9***************3G
     *
     * @var string
     */
    public $encryptSignCertNo;

    // 签署链接：电子签任务为异步任务，请确保已处于签署中（SIGNNING）状态，再给用户发送签署链接，否则用户签署会不成功
    /**
     * @example https://p.tb.cn/_5He390eo6NzfmuCzcNhzwO
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
        Model::validateRequired('signCertName', $this->signCertName, true);
        Model::validateRequired('signCertNo', $this->signCertNo, true);
        Model::validateRequired('signUserId', $this->signUserId, true);
        Model::validateRequired('encryptSignCertNo', $this->encryptSignCertNo, true);
        Model::validateRequired('signUrl', $this->signUrl, true);
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
     * @return AntSignUrlResult
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
