<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MORSERTA\Models;

use AlibabaCloud\Tea\Model;

class UserInfo extends Model
{
    // Android 设备填写，imei原值
    /**
     * @example Android 设备填写，imei原值
     *
     * @var string
     */
    public $originalImei;

    // Android 设备填写，imei md5值
    /**
     * @example Android 设备填写，imei md5值
     *
     * @var string
     */
    public $md5Imei;

    // Android 设备填写,android_id原值
    /**
     * @example Android 设备填写,android_id原值
     *
     * @var string
     */
    public $originalAndroidId;

    // Android 设备填写, md5 后的 android_id 设备号
    /**
     * @example Android 设备填写, md5 后的 android_id 设备号
     *
     * @var string
     */
    public $md5AndroidId;

    // Android 设备填写，oaid原值
    /**
     * @example Android 设备填写，oaid原值
     *
     * @var string
     */
    public $originalOaid;

    // Android 设备填写，oaid MD5值
    /**
     * @example Android 设备填写，oaid MD5值
     *
     * @var string
     */
    public $md5Oaid;

    // iOS 设备填写, idfa原值
    /**
     * @example iOS 设备填写, idfa原值
     *
     * @var string
     */
    public $originalIdfa;

    // iOS 设备填写, idfa md5值
    /**
     * @example iOS 设备填写, idfa md5值
     *
     * @var string
     */
    public $md5Idfa;

    // 客户电话原值
    /**
     * @example 客户电话原值
     *
     * @var string
     */
    public $originalPhone;

    // md5后的电话号码
    /**
     * @example md5后的电话号码
     *
     * @var string
     */
    public $md5Phone;

    // 客户联系方式的sha256
    /**
     * @example 客户联系方式的sha256
     *
     * @var string
     */
    public $sha256Phone;

    // iOS 设备填写,中国广告协会互联网广告标
    /**
     * @example iOS 设备填写,中国广告协会互联网广告标
     *
     * @var string
     */
    public $caid;

    // IOS设备填写，caid版本
    /**
     * @example IOS设备填写，caid版本
     *
     * @var string
     */
    public $caidVersion;

    // 仅腾讯渠道下，WECHAT, WECHAT_MINI_PROGRAM, WECHAT_MINI_GAME投放时传递，微信 openid 保持原值
    /**
     * @example 仅腾讯渠道下，WECHAT, WECHAT_MINI_PROGRAM, WECHAT_MINI_GAME投放时传递，微信 openid 保持原值
     *
     * @var string
     */
    public $wechatOpenid;

    // 仅腾讯渠道下，WECHAT, WECHAT_MINI_PROGRAM, WECHAT_MINI_GAME投放时传递，微信 unionid 保持原值
    /**
     * @example 仅腾讯渠道下，WECHAT, WECHAT_MINI_PROGRAM, WECHAT_MINI_GAME投放时传递，微信 unionid 保持原值
     *
     * @var string
     */
    public $wechatUnionid;

    // 仅腾讯渠道下，WECHAT, WECHAT_MINI_PROGRAM, WECHAT_MINI_GAME投放时传递，微信分配的 APPID
    /**
     * @example 仅腾讯渠道下，WECHAT, WECHAT_MINI_PROGRAM, WECHAT_MINI_GAME投放时传递，微信分配的 APPID
     *
     * @var string
     */
    public $wechatAppId;
    protected $_name = [
        'originalImei'      => 'original_imei',
        'md5Imei'           => 'md5_imei',
        'originalAndroidId' => 'original_android_id',
        'md5AndroidId'      => 'md5_android_id',
        'originalOaid'      => 'original_oaid',
        'md5Oaid'           => 'md5_oaid',
        'originalIdfa'      => 'original_idfa',
        'md5Idfa'           => 'md5_idfa',
        'originalPhone'     => 'original_phone',
        'md5Phone'          => 'md5_phone',
        'sha256Phone'       => 'sha256_phone',
        'caid'              => 'caid',
        'caidVersion'       => 'caid_version',
        'wechatOpenid'      => 'wechat_openid',
        'wechatUnionid'     => 'wechat_unionid',
        'wechatAppId'       => 'wechat_app_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->originalImei) {
            $res['original_imei'] = $this->originalImei;
        }
        if (null !== $this->md5Imei) {
            $res['md5_imei'] = $this->md5Imei;
        }
        if (null !== $this->originalAndroidId) {
            $res['original_android_id'] = $this->originalAndroidId;
        }
        if (null !== $this->md5AndroidId) {
            $res['md5_android_id'] = $this->md5AndroidId;
        }
        if (null !== $this->originalOaid) {
            $res['original_oaid'] = $this->originalOaid;
        }
        if (null !== $this->md5Oaid) {
            $res['md5_oaid'] = $this->md5Oaid;
        }
        if (null !== $this->originalIdfa) {
            $res['original_idfa'] = $this->originalIdfa;
        }
        if (null !== $this->md5Idfa) {
            $res['md5_idfa'] = $this->md5Idfa;
        }
        if (null !== $this->originalPhone) {
            $res['original_phone'] = $this->originalPhone;
        }
        if (null !== $this->md5Phone) {
            $res['md5_phone'] = $this->md5Phone;
        }
        if (null !== $this->sha256Phone) {
            $res['sha256_phone'] = $this->sha256Phone;
        }
        if (null !== $this->caid) {
            $res['caid'] = $this->caid;
        }
        if (null !== $this->caidVersion) {
            $res['caid_version'] = $this->caidVersion;
        }
        if (null !== $this->wechatOpenid) {
            $res['wechat_openid'] = $this->wechatOpenid;
        }
        if (null !== $this->wechatUnionid) {
            $res['wechat_unionid'] = $this->wechatUnionid;
        }
        if (null !== $this->wechatAppId) {
            $res['wechat_app_id'] = $this->wechatAppId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UserInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['original_imei'])) {
            $model->originalImei = $map['original_imei'];
        }
        if (isset($map['md5_imei'])) {
            $model->md5Imei = $map['md5_imei'];
        }
        if (isset($map['original_android_id'])) {
            $model->originalAndroidId = $map['original_android_id'];
        }
        if (isset($map['md5_android_id'])) {
            $model->md5AndroidId = $map['md5_android_id'];
        }
        if (isset($map['original_oaid'])) {
            $model->originalOaid = $map['original_oaid'];
        }
        if (isset($map['md5_oaid'])) {
            $model->md5Oaid = $map['md5_oaid'];
        }
        if (isset($map['original_idfa'])) {
            $model->originalIdfa = $map['original_idfa'];
        }
        if (isset($map['md5_idfa'])) {
            $model->md5Idfa = $map['md5_idfa'];
        }
        if (isset($map['original_phone'])) {
            $model->originalPhone = $map['original_phone'];
        }
        if (isset($map['md5_phone'])) {
            $model->md5Phone = $map['md5_phone'];
        }
        if (isset($map['sha256_phone'])) {
            $model->sha256Phone = $map['sha256_phone'];
        }
        if (isset($map['caid'])) {
            $model->caid = $map['caid'];
        }
        if (isset($map['caid_version'])) {
            $model->caidVersion = $map['caid_version'];
        }
        if (isset($map['wechat_openid'])) {
            $model->wechatOpenid = $map['wechat_openid'];
        }
        if (isset($map['wechat_unionid'])) {
            $model->wechatUnionid = $map['wechat_unionid'];
        }
        if (isset($map['wechat_app_id'])) {
            $model->wechatAppId = $map['wechat_app_id'];
        }

        return $model;
    }
}
