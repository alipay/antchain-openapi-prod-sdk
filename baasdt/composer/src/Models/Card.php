<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class Card extends Model
{
    // 计算理论上应该变为的状态
    /**
     * @example 0
     *
     * @var int
     */
    public $calStatus;

    // 卡密ID
    /**
     * @example JFB120041613102200071
     *
     * @var string
     */
    public $cardId;

    // 充值时间
    /**
     * @example 1587014822623
     *
     * @var int
     */
    public $chargeTime;

    // 数量
    /**
     * @example 100
     *
     * @var int
     */
    public $countOfMinUnit;

    // 卡密创建时间
    /**
     * @example 1587013822623
     *
     * @var int
     */
    public $createTime;

    // 创建卡密时的交易hash
    /**
     * @example 3dae198527e4303c2b187fe3946ec12017c15ae1e76614aaeeb30ad8c07c1c68
     *
     * @var string
     */
    public $createTxHash;

    // 脱敏手机信息
    /**
     * @example 149******92
     *
     * @var string
     */
    public $desensitizedUid;

    // 附加信息
    /**
     * @example {"card_description":"AlipayPoints"}
     *
     * @var string
     */
    public $extInfo;

    // 最小单位数量
    /**
     * @example 1
     *
     * @var int
     */
    public $minUnit;

    // 公钥
    /**
     * @example 04fe488725194810b28f7741f4df60af5bb1011b6282ce0efd7456fba41725391ac8ba4ce794c6a3171b14251ccffb0a8b1f0dbe5038993c27c747ecd4a11692a4
     *
     * @var string
     */
    public $publicKey;

    // 状态
    /**
     * @example 1
     *
     * @var int
     */
    public $status;

    // 公钥信息
    /**
     * @example 04f3bef4d273366bfb2182854707d2d8e71e059e2b6a7b5fc056a1e06b7f1ed673f7bfc6cbf22295e00dac35638379b5e4df39fc9d32acd2565144cc21b094de77
     *
     * @var string
     */
    public $uidPublicKey;

    // 卡密在该时间后有效
    /**
     * @example 1587013821641
     *
     * @var int
     */
    public $validAfter;

    // 卡密在该时间前有效
    /**
     * @example 1602604799000
     *
     * @var int
     */
    public $validBefore;

    // 有效天数
    /**
     * @example 180
     *
     * @var int
     */
    public $validDays;

    // 价值
    /**
     * @example 100
     *
     * @var int
     */
    public $value;

    // 卡密版本
    /**
     * @example 0
     *
     * @var int
     */
    public $version;
    protected $_name = [
        'calStatus'       => 'cal_status',
        'cardId'          => 'card_id',
        'chargeTime'      => 'charge_time',
        'countOfMinUnit'  => 'count_of_min_unit',
        'createTime'      => 'create_time',
        'createTxHash'    => 'create_tx_hash',
        'desensitizedUid' => 'desensitized_uid',
        'extInfo'         => 'ext_info',
        'minUnit'         => 'min_unit',
        'publicKey'       => 'public_key',
        'status'          => 'status',
        'uidPublicKey'    => 'uid_public_key',
        'validAfter'      => 'valid_after',
        'validBefore'     => 'valid_before',
        'validDays'       => 'valid_days',
        'value'           => 'value',
        'version'         => 'version',
    ];

    public function validate()
    {
        Model::validateRequired('calStatus', $this->calStatus, true);
        Model::validateRequired('cardId', $this->cardId, true);
        Model::validateRequired('chargeTime', $this->chargeTime, true);
        Model::validateRequired('countOfMinUnit', $this->countOfMinUnit, true);
        Model::validateRequired('createTime', $this->createTime, true);
        Model::validateRequired('createTxHash', $this->createTxHash, true);
        Model::validateRequired('desensitizedUid', $this->desensitizedUid, true);
        Model::validateRequired('extInfo', $this->extInfo, true);
        Model::validateRequired('minUnit', $this->minUnit, true);
        Model::validateRequired('publicKey', $this->publicKey, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('uidPublicKey', $this->uidPublicKey, true);
        Model::validateRequired('validAfter', $this->validAfter, true);
        Model::validateRequired('validBefore', $this->validBefore, true);
        Model::validateRequired('validDays', $this->validDays, true);
        Model::validateRequired('value', $this->value, true);
        Model::validateRequired('version', $this->version, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->calStatus) {
            $res['cal_status'] = $this->calStatus;
        }
        if (null !== $this->cardId) {
            $res['card_id'] = $this->cardId;
        }
        if (null !== $this->chargeTime) {
            $res['charge_time'] = $this->chargeTime;
        }
        if (null !== $this->countOfMinUnit) {
            $res['count_of_min_unit'] = $this->countOfMinUnit;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->createTxHash) {
            $res['create_tx_hash'] = $this->createTxHash;
        }
        if (null !== $this->desensitizedUid) {
            $res['desensitized_uid'] = $this->desensitizedUid;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }
        if (null !== $this->minUnit) {
            $res['min_unit'] = $this->minUnit;
        }
        if (null !== $this->publicKey) {
            $res['public_key'] = $this->publicKey;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
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
        if (null !== $this->validDays) {
            $res['valid_days'] = $this->validDays;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Card
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cal_status'])) {
            $model->calStatus = $map['cal_status'];
        }
        if (isset($map['card_id'])) {
            $model->cardId = $map['card_id'];
        }
        if (isset($map['charge_time'])) {
            $model->chargeTime = $map['charge_time'];
        }
        if (isset($map['count_of_min_unit'])) {
            $model->countOfMinUnit = $map['count_of_min_unit'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['create_tx_hash'])) {
            $model->createTxHash = $map['create_tx_hash'];
        }
        if (isset($map['desensitized_uid'])) {
            $model->desensitizedUid = $map['desensitized_uid'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }
        if (isset($map['min_unit'])) {
            $model->minUnit = $map['min_unit'];
        }
        if (isset($map['public_key'])) {
            $model->publicKey = $map['public_key'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
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
        if (isset($map['valid_days'])) {
            $model->validDays = $map['valid_days'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }

        return $model;
    }
}
