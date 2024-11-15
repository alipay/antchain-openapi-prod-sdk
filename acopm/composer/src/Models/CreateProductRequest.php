<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class CreateProductRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 产品码
    /**
     * @var string
     */
    public $prodCode;

    // 英文名
    /**
     * @var string
     */
    public $nameEn;

    // 中文名
    /**
     * @var string
     */
    public $nameCn;

    // 描述
    /**
     * @var string
     */
    public $description;

    // zoujili.zjl
    /**
     * @var string
     */
    public $ownerId;

    // 成员域账号，用于同步权限
    /**
     * @var string[]
     */
    public $memberList;
    protected $_name = [
        'authToken'   => 'auth_token',
        'prodCode'    => 'prod_code',
        'nameEn'      => 'name_en',
        'nameCn'      => 'name_cn',
        'description' => 'description',
        'ownerId'     => 'owner_id',
        'memberList'  => 'member_list',
    ];

    public function validate()
    {
        Model::validateRequired('prodCode', $this->prodCode, true);
        Model::validateRequired('nameEn', $this->nameEn, true);
        Model::validateRequired('nameCn', $this->nameCn, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('ownerId', $this->ownerId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->prodCode) {
            $res['prod_code'] = $this->prodCode;
        }
        if (null !== $this->nameEn) {
            $res['name_en'] = $this->nameEn;
        }
        if (null !== $this->nameCn) {
            $res['name_cn'] = $this->nameCn;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->ownerId) {
            $res['owner_id'] = $this->ownerId;
        }
        if (null !== $this->memberList) {
            $res['member_list'] = $this->memberList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateProductRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['prod_code'])) {
            $model->prodCode = $map['prod_code'];
        }
        if (isset($map['name_en'])) {
            $model->nameEn = $map['name_en'];
        }
        if (isset($map['name_cn'])) {
            $model->nameCn = $map['name_cn'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['owner_id'])) {
            $model->ownerId = $map['owner_id'];
        }
        if (isset($map['member_list'])) {
            if (!empty($map['member_list'])) {
                $model->memberList = $map['member_list'];
            }
        }

        return $model;
    }
}
