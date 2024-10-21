<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class InstitutionVO extends Model
{
    // 机构id
    /**
     * @example 1
     *
     * @var string
     */
    public $id;

    // 机构名称
    /**
     * @example ISSUER
     *
     * @var string
     */
    public $name;

    // 简介
    /**
     * @example about
     *
     * @var string
     */
    public $about;

    // 主页
    /**
     * @example home_page
     *
     * @var string
     */
    public $homePage;

    // 联系人信息
    /**
     * @example
     *
     * @var InstitutionContactInfo[]
     */
    public $contacts;

    // 机构类型
    /**
     * @example
     *
     * @var InstitutionType[]
     */
    public $types;

    // 机构用户信息
    /**
     * @example
     *
     * @var UserInfo[]
     */
    public $users;

    // 是否支持删除
    /**
     * @example true, false
     *
     * @var bool
     */
    public $deleteEnable;
    protected $_name = [
        'id'           => 'id',
        'name'         => 'name',
        'about'        => 'about',
        'homePage'     => 'home_page',
        'contacts'     => 'contacts',
        'types'        => 'types',
        'users'        => 'users',
        'deleteEnable' => 'delete_enable',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('types', $this->types, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->about) {
            $res['about'] = $this->about;
        }
        if (null !== $this->homePage) {
            $res['home_page'] = $this->homePage;
        }
        if (null !== $this->contacts) {
            $res['contacts'] = [];
            if (null !== $this->contacts && \is_array($this->contacts)) {
                $n = 0;
                foreach ($this->contacts as $item) {
                    $res['contacts'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->types) {
            $res['types'] = [];
            if (null !== $this->types && \is_array($this->types)) {
                $n = 0;
                foreach ($this->types as $item) {
                    $res['types'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->users) {
            $res['users'] = [];
            if (null !== $this->users && \is_array($this->users)) {
                $n = 0;
                foreach ($this->users as $item) {
                    $res['users'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->deleteEnable) {
            $res['delete_enable'] = $this->deleteEnable;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InstitutionVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['about'])) {
            $model->about = $map['about'];
        }
        if (isset($map['home_page'])) {
            $model->homePage = $map['home_page'];
        }
        if (isset($map['contacts'])) {
            if (!empty($map['contacts'])) {
                $model->contacts = [];
                $n               = 0;
                foreach ($map['contacts'] as $item) {
                    $model->contacts[$n++] = null !== $item ? InstitutionContactInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['types'])) {
            if (!empty($map['types'])) {
                $model->types = [];
                $n            = 0;
                foreach ($map['types'] as $item) {
                    $model->types[$n++] = null !== $item ? InstitutionType::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['users'])) {
            if (!empty($map['users'])) {
                $model->users = [];
                $n            = 0;
                foreach ($map['users'] as $item) {
                    $model->users[$n++] = null !== $item ? UserInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['delete_enable'])) {
            $model->deleteEnable = $map['delete_enable'];
        }

        return $model;
    }
}
