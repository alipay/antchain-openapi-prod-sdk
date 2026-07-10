<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class VerifyUserData extends Model
{
    // 证件名称
    /**
     * @example 李四
     *
     * @var string
     */
    public $certName;

    // 证件号码
    /**
     * @example 111111
     *
     * @var string
     */
    public $certNo;

    // 证件类型
    /**
     * @example IDENTITY_CARD
     *
     * @var string
     */
    public $certType;

    // 登记人信息存证交易HASH
    /**
     * @example 0003fa8261d1cd6cb419264d516f9b586687e39a0dc31b2c74ff4948e8b951e61afd
     *
     * @var string
     */
    public $registerPersonTxHash;
    protected $_name = [
        'certName'             => 'cert_name',
        'certNo'               => 'cert_no',
        'certType'             => 'cert_type',
        'registerPersonTxHash' => 'register_person_tx_hash',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->certName) {
            $res['cert_name'] = $this->certName;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->registerPersonTxHash) {
            $res['register_person_tx_hash'] = $this->registerPersonTxHash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VerifyUserData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cert_name'])) {
            $model->certName = $map['cert_name'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['register_person_tx_hash'])) {
            $model->registerPersonTxHash = $map['register_person_tx_hash'];
        }

        return $model;
    }
}
