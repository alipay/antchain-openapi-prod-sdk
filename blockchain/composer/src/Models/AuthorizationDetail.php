<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class AuthorizationDetail extends Model
{
    // 授权凭证ID
    /**
     * @example vc:private:0000:7bd647663cec087bc424941ad35cb588e96f38c2dcb512442410596c02e8ef681595560495530110
     *
     * @var string
     */
    public $authorityCertId;

    // 授权ID
    /**
     * @example 8c777cf9a71b660233215b6337dca78d66e10f25feca50a2761c09df7d4d0506
     *
     * @var string
     */
    public $authorizationId;

    // 区块号
    /**
     * @example 1324
     *
     * @var int
     */
    public $blockNum;

    // 过期时间
    /**
     * @example 1592810480442
     *
     * @var int
     */
    public $expire;

    // 授权时间
    /**
     * @example 1595574776000
     *
     * @var int
     */
    public $issuanceTime;

    // 授权人
    /**
     * @example
     *
     * @var Participant
     */
    public $issuer;

    // 被授权人
    /**
     * @example
     *
     * @var Participant
     */
    public $subject;

    // 哈希
    /**
     * @example d4dbde485203ed445b59fa7cf7976ecc56cf7494cca2d0185c1cac130463ac91
     *
     * @var string
     */
    public $txHash;

    // 资产所有者
    /**
     * @example
     *
     * @var Participant
     */
    public $owner;
    protected $_name = [
        'authorityCertId' => 'authority_cert_id',
        'authorizationId' => 'authorization_id',
        'blockNum'        => 'block_num',
        'expire'          => 'expire',
        'issuanceTime'    => 'issuance_time',
        'issuer'          => 'issuer',
        'subject'         => 'subject',
        'txHash'          => 'tx_hash',
        'owner'           => 'owner',
    ];

    public function validate()
    {
        Model::validateRequired('authorityCertId', $this->authorityCertId, true);
        Model::validateRequired('blockNum', $this->blockNum, true);
        Model::validateRequired('issuanceTime', $this->issuanceTime, true);
        Model::validateRequired('issuer', $this->issuer, true);
        Model::validateRequired('subject', $this->subject, true);
        Model::validateRequired('txHash', $this->txHash, true);
        Model::validateRequired('owner', $this->owner, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authorityCertId) {
            $res['authority_cert_id'] = $this->authorityCertId;
        }
        if (null !== $this->authorizationId) {
            $res['authorization_id'] = $this->authorizationId;
        }
        if (null !== $this->blockNum) {
            $res['block_num'] = $this->blockNum;
        }
        if (null !== $this->expire) {
            $res['expire'] = $this->expire;
        }
        if (null !== $this->issuanceTime) {
            $res['issuance_time'] = $this->issuanceTime;
        }
        if (null !== $this->issuer) {
            $res['issuer'] = null !== $this->issuer ? $this->issuer->toMap() : null;
        }
        if (null !== $this->subject) {
            $res['subject'] = null !== $this->subject ? $this->subject->toMap() : null;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->owner) {
            $res['owner'] = null !== $this->owner ? $this->owner->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthorizationDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['authority_cert_id'])) {
            $model->authorityCertId = $map['authority_cert_id'];
        }
        if (isset($map['authorization_id'])) {
            $model->authorizationId = $map['authorization_id'];
        }
        if (isset($map['block_num'])) {
            $model->blockNum = $map['block_num'];
        }
        if (isset($map['expire'])) {
            $model->expire = $map['expire'];
        }
        if (isset($map['issuance_time'])) {
            $model->issuanceTime = $map['issuance_time'];
        }
        if (isset($map['issuer'])) {
            $model->issuer = Participant::fromMap($map['issuer']);
        }
        if (isset($map['subject'])) {
            $model->subject = Participant::fromMap($map['subject']);
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['owner'])) {
            $model->owner = Participant::fromMap($map['owner']);
        }

        return $model;
    }
}
