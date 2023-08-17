<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_bc907d13969a4eb68852866122b96ffd\Models;

use AlibabaCloud\Tea\Model;

class ITagTaskWorkflowConfig extends Model
{
    // 标注阶段
    /**
     * @example MARK
     *
     * @var string
     */
    public $nodename;

    // 标注人员列表
    /**
     * @example
     *
     * @var User[]
     */
    public $users;

    // 分组
    /**
     * @example "groupId":1425378097070583808
     *
     * @var Groups[]
     */
    public $groups;

    // 扩展参数，例如质检抽样的比例，0~100 %
    /**
     * @example  "CheckRate":100
     *
     * @var Exif
     */
    public $exif;
    protected $_name = [
        'nodename' => 'nodename',
        'users'    => 'users',
        'groups'   => 'groups',
        'exif'     => 'exif',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->nodename) {
            $res['nodename'] = $this->nodename;
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
        if (null !== $this->groups) {
            $res['groups'] = [];
            if (null !== $this->groups && \is_array($this->groups)) {
                $n = 0;
                foreach ($this->groups as $item) {
                    $res['groups'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->exif) {
            $res['exif'] = null !== $this->exif ? $this->exif->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ITagTaskWorkflowConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['nodename'])) {
            $model->nodename = $map['nodename'];
        }
        if (isset($map['users'])) {
            if (!empty($map['users'])) {
                $model->users = [];
                $n            = 0;
                foreach ($map['users'] as $item) {
                    $model->users[$n++] = null !== $item ? User::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['groups'])) {
            if (!empty($map['groups'])) {
                $model->groups = [];
                $n             = 0;
                foreach ($map['groups'] as $item) {
                    $model->groups[$n++] = null !== $item ? Groups::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['exif'])) {
            $model->exif = Exif::fromMap($map['exif']);
        }

        return $model;
    }
}
