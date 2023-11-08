<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTC\Models;

use AlibabaCloud\Tea\Model;

class AvatarDTO extends Model
{
    // 数字人基础身体白模
    /**
     * @example https://mdn.alipayobjects.com/huamei_n3jbep/afts/ab/A*eG-PSZRxPfwAAAAAAAAAAAAADgt8AA/original
     *
     * @var string
     */
    public $avatarBodyUrl;

    // 数字人基础脸部模型
    /**
     * @example https://mdn.alipayobjects.com/huamei_n3jbep/afts/ab/A*eG-PSZRxPfwAAAAAAAAAAAAADgt8AA/original
     *
     * @var string
     */
    public $avatarFaceUrl;

    // 数字人基础脸部Json配置
    /**
     * @example https://mdn.alipayobjects.com/huamei_n3jbep/afts/ab/A*eG-PSZRxPfwAAAAAAAAAAAAADgt8AA/original
     *
     * @var string
     */
    public $avatarFaceJson;

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

    // 配饰配置
    /**
     * @example
     *
     * @var AvatarMaterialDTO
     */
    public $accessory;

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
    protected $_name = [
        'avatarBodyUrl'  => 'avatar_body_url',
        'avatarFaceUrl'  => 'avatar_face_url',
        'avatarFaceJson' => 'avatar_face_json',
        'upcloth'        => 'upcloth',
        'downcloth'      => 'downcloth',
        'shoe'           => 'shoe',
        'suit'           => 'suit',
        'accessory'      => 'accessory',
        'hair'           => 'hair',
        'head'           => 'head',
        'eyebrow'        => 'eyebrow',
        'eye'            => 'eye',
        'lip'            => 'lip',
        'nose'           => 'nose',
        'rouge'          => 'rouge',
        'lens'           => 'lens',
        'eyelash'        => 'eyelash',
        'lipstick'       => 'lipstick',
        'eyeliner'       => 'eyeliner',
        'eyeshadow'      => 'eyeshadow',
    ];

    public function validate()
    {
        Model::validateRequired('avatarBodyUrl', $this->avatarBodyUrl, true);
        Model::validateRequired('avatarFaceUrl', $this->avatarFaceUrl, true);
        Model::validateRequired('avatarFaceJson', $this->avatarFaceJson, true);
        Model::validateRequired('upcloth', $this->upcloth, true);
        Model::validateRequired('downcloth', $this->downcloth, true);
        Model::validateRequired('shoe', $this->shoe, true);
        Model::validateRequired('suit', $this->suit, true);
        Model::validateRequired('accessory', $this->accessory, true);
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
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->avatarBodyUrl) {
            $res['avatar_body_url'] = $this->avatarBodyUrl;
        }
        if (null !== $this->avatarFaceUrl) {
            $res['avatar_face_url'] = $this->avatarFaceUrl;
        }
        if (null !== $this->avatarFaceJson) {
            $res['avatar_face_json'] = $this->avatarFaceJson;
        }
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
        if (null !== $this->accessory) {
            $res['accessory'] = null !== $this->accessory ? $this->accessory->toMap() : null;
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
        if (isset($map['avatar_body_url'])) {
            $model->avatarBodyUrl = $map['avatar_body_url'];
        }
        if (isset($map['avatar_face_url'])) {
            $model->avatarFaceUrl = $map['avatar_face_url'];
        }
        if (isset($map['avatar_face_json'])) {
            $model->avatarFaceJson = $map['avatar_face_json'];
        }
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
        if (isset($map['accessory'])) {
            $model->accessory = AvatarMaterialDTO::fromMap($map['accessory']);
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

        return $model;
    }
}
