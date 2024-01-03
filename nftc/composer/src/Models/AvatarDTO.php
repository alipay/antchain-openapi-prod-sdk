<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTC\Models;

use AlibabaCloud\Tea\Model;

class AvatarDTO extends Model
{
    // 上衣配置
    /**
     * @example
     *
     * @var AvatarMaterialDTO
     */
    public $upcloth;

    // 下衣配置
    /**
     * @example
     *
     * @var AvatarMaterialDTO
     */
    public $downcloth;

    // 鞋子配置
    /**
     * @example
     *
     * @var AvatarMaterialDTO
     */
    public $shoe;

    // 套装配置
    /**
     * @example
     *
     * @var AvatarMaterialDTO
     */
    public $suit;

    // 项链配置
    /**
     * @example
     *
     * @var AvatarMaterialDTO
     */
    public $necklace;

    // 帽子配置
    /**
     * @example
     *
     * @var AvatarMaterialDTO
     */
    public $hat;

    // 眼镜配置
    /**
     * @example
     *
     * @var AvatarMaterialDTO
     */
    public $glass;

    // 头发配置
    /**
     * @example
     *
     * @var AvatarMaterialDTO
     */
    public $hair;

    // 脸型配置
    /**
     * @example
     *
     * @var AvatarMaterialDTO
     */
    public $head;

    // 眉毛配置
    /**
     * @example
     *
     * @var AvatarMaterialDTO
     */
    public $eyebrow;

    // 眼睛配置
    /**
     * @example
     *
     * @var AvatarMaterialDTO
     */
    public $eye;

    // 嘴巴配置
    /**
     * @example
     *
     * @var AvatarMaterialDTO
     */
    public $lip;

    // 鼻子配置
    /**
     * @example
     *
     * @var AvatarMaterialDTO
     */
    public $nose;

    // 腮红配置
    /**
     * @example
     *
     * @var AvatarMaterialDTO
     */
    public $rouge;

    // 美瞳配置
    /**
     * @example
     *
     * @var AvatarMaterialDTO
     */
    public $lens;

    // 睫毛配置
    /**
     * @example
     *
     * @var AvatarMaterialDTO
     */
    public $eyelash;

    // 唇妆配置
    /**
     * @example
     *
     * @var AvatarMaterialDTO
     */
    public $lipstick;

    // 眼线配置
    /**
     * @example
     *
     * @var AvatarMaterialDTO
     */
    public $eyeliner;

    // 眼影配置
    /**
     * @example
     *
     * @var AvatarMaterialDTO
     */
    public $eyeshadow;

    // webgl ab包链接
    /**
     * @example https://mdn.alipayobjects.com/huamei_n3jbep/afts/ab/A*eG-PSZRxPfwAAAAAAAAAAAAADgt8AA/original
     *
     * @var string
     */
    public $avatarWebGlUnityBodyUrl;

    // ios ab包链接
    /**
     * @example https://mdn.alipayobjects.com/huamei_n3jbep/afts/ab/A*eG-PSZRxPfwAAAAAAAAAAAAADgt8AA/original
     *
     * @var string
     */
    public $avatarIosUnityBodyUrl;

    // android ab包链接
    /**
     * @example https://mdn.alipayobjects.com/huamei_n3jbep/afts/ab/A*eG-PSZRxPfwAAAAAAAAAAAAADgt8AA/original
     *
     * @var string
     */
    public $avatarAndroidUnityBodyUrl;

    // 默认Unity配置
    /**
     * @example 12345678
     *
     * @var string
     */
    public $defaultUnityConfig;

    // 袜子配置
    /**
     * @example
     *
     * @var AvatarMaterialDTO
     */
    public $sock;

    // 背持配置
    /**
     * @example
     *
     * @var AvatarMaterialDTO
     */
    public $backpack;

    // 手部配置
    /**
     * @example
     *
     * @var AvatarMaterialDTO
     */
    public $hand;

    // 耳环配置
    /**
     * @example
     *
     * @var AvatarMaterialDTO
     */
    public $earring;
    protected $_name = [
        'upcloth'                   => 'upcloth',
        'downcloth'                 => 'downcloth',
        'shoe'                      => 'shoe',
        'suit'                      => 'suit',
        'necklace'                  => 'necklace',
        'hat'                       => 'hat',
        'glass'                     => 'glass',
        'hair'                      => 'hair',
        'head'                      => 'head',
        'eyebrow'                   => 'eyebrow',
        'eye'                       => 'eye',
        'lip'                       => 'lip',
        'nose'                      => 'nose',
        'rouge'                     => 'rouge',
        'lens'                      => 'lens',
        'eyelash'                   => 'eyelash',
        'lipstick'                  => 'lipstick',
        'eyeliner'                  => 'eyeliner',
        'eyeshadow'                 => 'eyeshadow',
        'avatarWebGlUnityBodyUrl'   => 'avatar_web_gl_unity_body_url',
        'avatarIosUnityBodyUrl'     => 'avatar_ios_unity_body_url',
        'avatarAndroidUnityBodyUrl' => 'avatar_android_unity_body_url',
        'defaultUnityConfig'        => 'default_unity_config',
        'sock'                      => 'sock',
        'backpack'                  => 'backpack',
        'hand'                      => 'hand',
        'earring'                   => 'earring',
    ];

    public function validate()
    {
        Model::validateRequired('upcloth', $this->upcloth, true);
        Model::validateRequired('downcloth', $this->downcloth, true);
        Model::validateRequired('shoe', $this->shoe, true);
        Model::validateRequired('suit', $this->suit, true);
        Model::validateRequired('necklace', $this->necklace, true);
        Model::validateRequired('hat', $this->hat, true);
        Model::validateRequired('glass', $this->glass, true);
        Model::validateRequired('hair', $this->hair, true);
        Model::validateRequired('head', $this->head, true);
        Model::validateRequired('eyebrow', $this->eyebrow, true);
        Model::validateRequired('eye', $this->eye, true);
        Model::validateRequired('lip', $this->lip, true);
        Model::validateRequired('nose', $this->nose, true);
        Model::validateRequired('rouge', $this->rouge, true);
        Model::validateRequired('lens', $this->lens, true);
        Model::validateRequired('eyelash', $this->eyelash, true);
        Model::validateRequired('lipstick', $this->lipstick, true);
        Model::validateRequired('eyeliner', $this->eyeliner, true);
        Model::validateRequired('eyeshadow', $this->eyeshadow, true);
        Model::validateRequired('avatarWebGlUnityBodyUrl', $this->avatarWebGlUnityBodyUrl, true);
        Model::validateRequired('avatarIosUnityBodyUrl', $this->avatarIosUnityBodyUrl, true);
        Model::validateRequired('avatarAndroidUnityBodyUrl', $this->avatarAndroidUnityBodyUrl, true);
        Model::validateRequired('defaultUnityConfig', $this->defaultUnityConfig, true);
        Model::validateRequired('sock', $this->sock, true);
        Model::validateRequired('backpack', $this->backpack, true);
        Model::validateRequired('hand', $this->hand, true);
        Model::validateRequired('earring', $this->earring, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->upcloth) {
            $res['upcloth'] = null !== $this->upcloth ? $this->upcloth->toMap() : null;
        }
        if (null !== $this->downcloth) {
            $res['downcloth'] = null !== $this->downcloth ? $this->downcloth->toMap() : null;
        }
        if (null !== $this->shoe) {
            $res['shoe'] = null !== $this->shoe ? $this->shoe->toMap() : null;
        }
        if (null !== $this->suit) {
            $res['suit'] = null !== $this->suit ? $this->suit->toMap() : null;
        }
        if (null !== $this->necklace) {
            $res['necklace'] = null !== $this->necklace ? $this->necklace->toMap() : null;
        }
        if (null !== $this->hat) {
            $res['hat'] = null !== $this->hat ? $this->hat->toMap() : null;
        }
        if (null !== $this->glass) {
            $res['glass'] = null !== $this->glass ? $this->glass->toMap() : null;
        }
        if (null !== $this->hair) {
            $res['hair'] = null !== $this->hair ? $this->hair->toMap() : null;
        }
        if (null !== $this->head) {
            $res['head'] = null !== $this->head ? $this->head->toMap() : null;
        }
        if (null !== $this->eyebrow) {
            $res['eyebrow'] = null !== $this->eyebrow ? $this->eyebrow->toMap() : null;
        }
        if (null !== $this->eye) {
            $res['eye'] = null !== $this->eye ? $this->eye->toMap() : null;
        }
        if (null !== $this->lip) {
            $res['lip'] = null !== $this->lip ? $this->lip->toMap() : null;
        }
        if (null !== $this->nose) {
            $res['nose'] = null !== $this->nose ? $this->nose->toMap() : null;
        }
        if (null !== $this->rouge) {
            $res['rouge'] = null !== $this->rouge ? $this->rouge->toMap() : null;
        }
        if (null !== $this->lens) {
            $res['lens'] = null !== $this->lens ? $this->lens->toMap() : null;
        }
        if (null !== $this->eyelash) {
            $res['eyelash'] = null !== $this->eyelash ? $this->eyelash->toMap() : null;
        }
        if (null !== $this->lipstick) {
            $res['lipstick'] = null !== $this->lipstick ? $this->lipstick->toMap() : null;
        }
        if (null !== $this->eyeliner) {
            $res['eyeliner'] = null !== $this->eyeliner ? $this->eyeliner->toMap() : null;
        }
        if (null !== $this->eyeshadow) {
            $res['eyeshadow'] = null !== $this->eyeshadow ? $this->eyeshadow->toMap() : null;
        }
        if (null !== $this->avatarWebGlUnityBodyUrl) {
            $res['avatar_web_gl_unity_body_url'] = $this->avatarWebGlUnityBodyUrl;
        }
        if (null !== $this->avatarIosUnityBodyUrl) {
            $res['avatar_ios_unity_body_url'] = $this->avatarIosUnityBodyUrl;
        }
        if (null !== $this->avatarAndroidUnityBodyUrl) {
            $res['avatar_android_unity_body_url'] = $this->avatarAndroidUnityBodyUrl;
        }
        if (null !== $this->defaultUnityConfig) {
            $res['default_unity_config'] = $this->defaultUnityConfig;
        }
        if (null !== $this->sock) {
            $res['sock'] = null !== $this->sock ? $this->sock->toMap() : null;
        }
        if (null !== $this->backpack) {
            $res['backpack'] = null !== $this->backpack ? $this->backpack->toMap() : null;
        }
        if (null !== $this->hand) {
            $res['hand'] = null !== $this->hand ? $this->hand->toMap() : null;
        }
        if (null !== $this->earring) {
            $res['earring'] = null !== $this->earring ? $this->earring->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AvatarDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['upcloth'])) {
            $model->upcloth = AvatarMaterialDTO::fromMap($map['upcloth']);
        }
        if (isset($map['downcloth'])) {
            $model->downcloth = AvatarMaterialDTO::fromMap($map['downcloth']);
        }
        if (isset($map['shoe'])) {
            $model->shoe = AvatarMaterialDTO::fromMap($map['shoe']);
        }
        if (isset($map['suit'])) {
            $model->suit = AvatarMaterialDTO::fromMap($map['suit']);
        }
        if (isset($map['necklace'])) {
            $model->necklace = AvatarMaterialDTO::fromMap($map['necklace']);
        }
        if (isset($map['hat'])) {
            $model->hat = AvatarMaterialDTO::fromMap($map['hat']);
        }
        if (isset($map['glass'])) {
            $model->glass = AvatarMaterialDTO::fromMap($map['glass']);
        }
        if (isset($map['hair'])) {
            $model->hair = AvatarMaterialDTO::fromMap($map['hair']);
        }
        if (isset($map['head'])) {
            $model->head = AvatarMaterialDTO::fromMap($map['head']);
        }
        if (isset($map['eyebrow'])) {
            $model->eyebrow = AvatarMaterialDTO::fromMap($map['eyebrow']);
        }
        if (isset($map['eye'])) {
            $model->eye = AvatarMaterialDTO::fromMap($map['eye']);
        }
        if (isset($map['lip'])) {
            $model->lip = AvatarMaterialDTO::fromMap($map['lip']);
        }
        if (isset($map['nose'])) {
            $model->nose = AvatarMaterialDTO::fromMap($map['nose']);
        }
        if (isset($map['rouge'])) {
            $model->rouge = AvatarMaterialDTO::fromMap($map['rouge']);
        }
        if (isset($map['lens'])) {
            $model->lens = AvatarMaterialDTO::fromMap($map['lens']);
        }
        if (isset($map['eyelash'])) {
            $model->eyelash = AvatarMaterialDTO::fromMap($map['eyelash']);
        }
        if (isset($map['lipstick'])) {
            $model->lipstick = AvatarMaterialDTO::fromMap($map['lipstick']);
        }
        if (isset($map['eyeliner'])) {
            $model->eyeliner = AvatarMaterialDTO::fromMap($map['eyeliner']);
        }
        if (isset($map['eyeshadow'])) {
            $model->eyeshadow = AvatarMaterialDTO::fromMap($map['eyeshadow']);
        }
        if (isset($map['avatar_web_gl_unity_body_url'])) {
            $model->avatarWebGlUnityBodyUrl = $map['avatar_web_gl_unity_body_url'];
        }
        if (isset($map['avatar_ios_unity_body_url'])) {
            $model->avatarIosUnityBodyUrl = $map['avatar_ios_unity_body_url'];
        }
        if (isset($map['avatar_android_unity_body_url'])) {
            $model->avatarAndroidUnityBodyUrl = $map['avatar_android_unity_body_url'];
        }
        if (isset($map['default_unity_config'])) {
            $model->defaultUnityConfig = $map['default_unity_config'];
        }
        if (isset($map['sock'])) {
            $model->sock = AvatarMaterialDTO::fromMap($map['sock']);
        }
        if (isset($map['backpack'])) {
            $model->backpack = AvatarMaterialDTO::fromMap($map['backpack']);
        }
        if (isset($map['hand'])) {
            $model->hand = AvatarMaterialDTO::fromMap($map['hand']);
        }
        if (isset($map['earring'])) {
            $model->earring = AvatarMaterialDTO::fromMap($map['earring']);
        }

        return $model;
    }
}
