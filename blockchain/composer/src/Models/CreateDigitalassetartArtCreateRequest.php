<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateDigitalassetartArtCreateRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 艺术品锚定物
    /**
     * @var string
     */
    public $artAnchor;

    // 艺术品唯一id
    /**
     * @var string
     */
    public $artId;

    // 艺术品名称
    /**
     * @var string
     */
    public $artName;

    // 艺术品代码
    /**
     * @var string
     */
    public $code;

    // 创建时间
    /**
     * @var string
     */
    public $createDate;

    // 鉴定者账户
    /**
     * @var string[]
     */
    public $identifiers;

    // 艺术品图片哈希
    /**
     * @var string[]
     */
    public $imageHashes;

    // 一级分类
    /**
     * @var string
     */
    public $mainClass;

    // 拥有者链上账户地址
    /**
     * @var string
     */
    public $ownerAccountId;

    // 二级分类
    /**
     * @var string
     */
    public $subClass;

    // 艺术品视频哈希
    /**
     * @var string[]
     */
    public $vedioHashes;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'artAnchor'         => 'art_anchor',
        'artId'             => 'art_id',
        'artName'           => 'art_name',
        'code'              => 'code',
        'createDate'        => 'create_date',
        'identifiers'       => 'identifiers',
        'imageHashes'       => 'image_hashes',
        'mainClass'         => 'main_class',
        'ownerAccountId'    => 'owner_account_id',
        'subClass'          => 'sub_class',
        'vedioHashes'       => 'vedio_hashes',
    ];

    public function validate()
    {
        Model::validateRequired('artAnchor', $this->artAnchor, true);
        Model::validateRequired('artId', $this->artId, true);
        Model::validateRequired('artName', $this->artName, true);
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('createDate', $this->createDate, true);
        Model::validateRequired('identifiers', $this->identifiers, true);
        Model::validateRequired('imageHashes', $this->imageHashes, true);
        Model::validateRequired('mainClass', $this->mainClass, true);
        Model::validateRequired('ownerAccountId', $this->ownerAccountId, true);
        Model::validateRequired('subClass', $this->subClass, true);
        Model::validateRequired('vedioHashes', $this->vedioHashes, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->artAnchor) {
            $res['art_anchor'] = $this->artAnchor;
        }
        if (null !== $this->artId) {
            $res['art_id'] = $this->artId;
        }
        if (null !== $this->artName) {
            $res['art_name'] = $this->artName;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->createDate) {
            $res['create_date'] = $this->createDate;
        }
        if (null !== $this->identifiers) {
            $res['identifiers'] = $this->identifiers;
        }
        if (null !== $this->imageHashes) {
            $res['image_hashes'] = $this->imageHashes;
        }
        if (null !== $this->mainClass) {
            $res['main_class'] = $this->mainClass;
        }
        if (null !== $this->ownerAccountId) {
            $res['owner_account_id'] = $this->ownerAccountId;
        }
        if (null !== $this->subClass) {
            $res['sub_class'] = $this->subClass;
        }
        if (null !== $this->vedioHashes) {
            $res['vedio_hashes'] = $this->vedioHashes;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDigitalassetartArtCreateRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['art_anchor'])) {
            $model->artAnchor = $map['art_anchor'];
        }
        if (isset($map['art_id'])) {
            $model->artId = $map['art_id'];
        }
        if (isset($map['art_name'])) {
            $model->artName = $map['art_name'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['create_date'])) {
            $model->createDate = $map['create_date'];
        }
        if (isset($map['identifiers'])) {
            if (!empty($map['identifiers'])) {
                $model->identifiers = $map['identifiers'];
            }
        }
        if (isset($map['image_hashes'])) {
            if (!empty($map['image_hashes'])) {
                $model->imageHashes = $map['image_hashes'];
            }
        }
        if (isset($map['main_class'])) {
            $model->mainClass = $map['main_class'];
        }
        if (isset($map['owner_account_id'])) {
            $model->ownerAccountId = $map['owner_account_id'];
        }
        if (isset($map['sub_class'])) {
            $model->subClass = $map['sub_class'];
        }
        if (isset($map['vedio_hashes'])) {
            if (!empty($map['vedio_hashes'])) {
                $model->vedioHashes = $map['vedio_hashes'];
            }
        }

        return $model;
    }
}
