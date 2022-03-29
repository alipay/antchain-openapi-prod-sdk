<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class AlarmSubDTO extends Model
{
    // ID
    /**
     * @example 15
     *
     * @var int
     */
    public $id;

    // 告警展示名称
    /**
     * @example 中间件云产品
     *
     * @var string
     */
    public $displayName;

    // 修改人
    /**
     * @example antcloudcore@antfin.com
     *
     * @var string
     */
    public $modifier;

    // 修改时间
    /**
     * @example 1610357282854
     *
     * @var int
     */
    public $gmtModified;

    // 告警订阅类型(folder、customplugin)
    /**
     * @example folder
     *
     * @var string
     */
    public $subscriptionType;

    // 通知组列表
    /**
     * @example
     *
     * @var UserGroup[]
     */
    public $userGroups;

    // 联系人登录名数组
    /**
     * @example
     *
     * @var string[]
     */
    public $userLoginNames;
    protected $_name = [
        'id'               => 'id',
        'displayName'      => 'display_name',
        'modifier'         => 'modifier',
        'gmtModified'      => 'gmt_modified',
        'subscriptionType' => 'subscription_type',
        'userGroups'       => 'user_groups',
        'userLoginNames'   => 'user_login_names',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('displayName', $this->displayName, true);
        Model::validateRequired('modifier', $this->modifier, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('subscriptionType', $this->subscriptionType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->modifier) {
            $res['modifier'] = $this->modifier;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->subscriptionType) {
            $res['subscription_type'] = $this->subscriptionType;
        }
        if (null !== $this->userGroups) {
            $res['user_groups'] = [];
            if (null !== $this->userGroups && \is_array($this->userGroups)) {
                $n = 0;
                foreach ($this->userGroups as $item) {
                    $res['user_groups'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->userLoginNames) {
            $res['user_login_names'] = $this->userLoginNames;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AlarmSubDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }
        if (isset($map['modifier'])) {
            $model->modifier = $map['modifier'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['subscription_type'])) {
            $model->subscriptionType = $map['subscription_type'];
        }
        if (isset($map['user_groups'])) {
            if (!empty($map['user_groups'])) {
                $model->userGroups = [];
                $n                 = 0;
                foreach ($map['user_groups'] as $item) {
                    $model->userGroups[$n++] = null !== $item ? UserGroup::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['user_login_names'])) {
            if (!empty($map['user_login_names'])) {
                $model->userLoginNames = $map['user_login_names'];
            }
        }

        return $model;
    }
}
