<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class CouponCreate extends Model
{
    // 电子券批次ID
    /**
     * @example COLLECTIONID
     *
     * @var string
     */
    public $collectionId;

    // 电子券价值
    /**
     * @example 100.01
     *
     * @var string
     */
    public $value;

    // 电子券名称
    /**
     * @example 电子券
     *
     * @var string
     */
    public $couponName;

    // 用户脱敏ID
    /**
     * @example user***1
     *
     * @var string
     */
    public $desensitizedUid;

    // 扩展信息
    /**
     * @example 电子券附加信息
     *
     * @var string
     */
    public $extInfo;

    // 持有者ID
    /**
     * @example user0001
     *
     * @var string
     */
    public $holderUserAccount;

    // 电子券公钥
    /**
     * @example 387bcb4db010c177742ab5bd257c9827f90bd74806a388b5bc849e4b3867cf0b1cd694
     *
     * @var string
     */
    public $publicKey;

    // 时区（暂时固定为GMT+8）
    /**
     * @example GMT+8
     *
     * @var string
     */
    public $timeZone;

    // 用户公钥
    /**
     * @example 505148309a36375648765972645762365027465071fe009fcd694...
     *
     * @var string
     */
    public $uidPublicKey;

    // 有效开始时间
    /**
     * @example 1600000000000
     *
     * @var int
     */
    public $validAfter;

    // 有效结束时间
    /**
     * @example 1604889934081
     *
     * @var int
     */
    public $validBefore;
    protected $_name = [
        'collectionId'      => 'collection_id',
        'value'             => 'value',
        'couponName'        => 'coupon_name',
        'desensitizedUid'   => 'desensitized_uid',
        'extInfo'           => 'ext_info',
        'holderUserAccount' => 'holder_user_account',
        'publicKey'         => 'public_key',
        'timeZone'          => 'time_zone',
        'uidPublicKey'      => 'uid_public_key',
        'validAfter'        => 'valid_after',
        'validBefore'       => 'valid_before',
    ];

    public function validate()
    {
        Model::validateRequired('collectionId', $this->collectionId, true);
        Model::validateRequired('value', $this->value, true);
        Model::validateRequired('couponName', $this->couponName, true);
        Model::validateRequired('extInfo', $this->extInfo, true);
        Model::validateRequired('publicKey', $this->publicKey, true);
        Model::validateRequired('timeZone', $this->timeZone, true);
        Model::validateRequired('validAfter', $this->validAfter, true);
        Model::validateRequired('validBefore', $this->validBefore, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->collectionId) {
            $res['collection_id'] = $this->collectionId;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->couponName) {
            $res['coupon_name'] = $this->couponName;
        }
        if (null !== $this->desensitizedUid) {
            $res['desensitized_uid'] = $this->desensitizedUid;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }
        if (null !== $this->holderUserAccount) {
            $res['holder_user_account'] = $this->holderUserAccount;
        }
        if (null !== $this->publicKey) {
            $res['public_key'] = $this->publicKey;
        }
        if (null !== $this->timeZone) {
            $res['time_zone'] = $this->timeZone;
        }
        if (null !== $this->uidPublicKey) {
            $res['uid_public_key'] = $this->uidPublicKey;
        }
        if (null !== $this->validAfter) {
            $res['valid_after'] = $this->validAfter;
        }
        if (null !== $this->validBefore) {
            $res['valid_before'] = $this->validBefore;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CouponCreate
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['collection_id'])) {
            $model->collectionId = $map['collection_id'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['coupon_name'])) {
            $model->couponName = $map['coupon_name'];
        }
        if (isset($map['desensitized_uid'])) {
            $model->desensitizedUid = $map['desensitized_uid'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }
        if (isset($map['holder_user_account'])) {
            $model->holderUserAccount = $map['holder_user_account'];
        }
        if (isset($map['public_key'])) {
            $model->publicKey = $map['public_key'];
        }
        if (isset($map['time_zone'])) {
            $model->timeZone = $map['time_zone'];
        }
        if (isset($map['uid_public_key'])) {
            $model->uidPublicKey = $map['uid_public_key'];
        }
        if (isset($map['valid_after'])) {
            $model->validAfter = $map['valid_after'];
        }
        if (isset($map['valid_before'])) {
            $model->validBefore = $map['valid_before'];
        }

        return $model;
    }
}
