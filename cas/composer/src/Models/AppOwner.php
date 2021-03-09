<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class AppOwner extends Model
{
    // 研发负责人
    /**
     * @example
     *
     * @var UserInfo
     */
    public $devOwner;

    // backup开发人员
    /**
     * @example
     *
     * @var UserInfo[]
     */
    public $backupDevOwners;

    // 测试负责人
    /**
     * @example
     *
     * @var UserInfo
     */
    public $testOwner;

    // 备用测试人员
    /**
     * @example
     *
     * @var UserInfo[]
     */
    public $backupTestOwners;

    // 运维负责人
    /**
     * @example
     *
     * @var UserInfo
     */
    public $ops;

    // 备用SRE人员
    /**
     * @example
     *
     * @var UserInfo[]
     */
    public $backupOpses;

    // 开发architect负责人
    /**
     * @example
     *
     * @var UserInfo
     */
    public $devArchitect;

    // 备用Architects联系人
    /**
     * @example
     *
     * @var UserInfo[]
     */
    public $backupDevArchitects;

    // 测试architect
    /**
     * @example
     *
     * @var UserInfo
     */
    public $testArchitect;

    // 备用测试architects
    /**
     * @example
     *
     * @var UserInfo[]
     */
    public $backupTestArchitects;
    protected $_name = [
        'devOwner'             => 'dev_owner',
        'backupDevOwners'      => 'backup_dev_owners',
        'testOwner'            => 'test_owner',
        'backupTestOwners'     => 'backup_test_owners',
        'ops'                  => 'ops',
        'backupOpses'          => 'backup_opses',
        'devArchitect'         => 'dev_architect',
        'backupDevArchitects'  => 'backup_dev_architects',
        'testArchitect'        => 'test_architect',
        'backupTestArchitects' => 'backup_test_architects',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->devOwner) {
            $res['dev_owner'] = null !== $this->devOwner ? $this->devOwner->toMap() : null;
        }
        if (null !== $this->backupDevOwners) {
            $res['backup_dev_owners'] = [];
            if (null !== $this->backupDevOwners && \is_array($this->backupDevOwners)) {
                $n = 0;
                foreach ($this->backupDevOwners as $item) {
                    $res['backup_dev_owners'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->testOwner) {
            $res['test_owner'] = null !== $this->testOwner ? $this->testOwner->toMap() : null;
        }
        if (null !== $this->backupTestOwners) {
            $res['backup_test_owners'] = [];
            if (null !== $this->backupTestOwners && \is_array($this->backupTestOwners)) {
                $n = 0;
                foreach ($this->backupTestOwners as $item) {
                    $res['backup_test_owners'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->ops) {
            $res['ops'] = null !== $this->ops ? $this->ops->toMap() : null;
        }
        if (null !== $this->backupOpses) {
            $res['backup_opses'] = [];
            if (null !== $this->backupOpses && \is_array($this->backupOpses)) {
                $n = 0;
                foreach ($this->backupOpses as $item) {
                    $res['backup_opses'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->devArchitect) {
            $res['dev_architect'] = null !== $this->devArchitect ? $this->devArchitect->toMap() : null;
        }
        if (null !== $this->backupDevArchitects) {
            $res['backup_dev_architects'] = [];
            if (null !== $this->backupDevArchitects && \is_array($this->backupDevArchitects)) {
                $n = 0;
                foreach ($this->backupDevArchitects as $item) {
                    $res['backup_dev_architects'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->testArchitect) {
            $res['test_architect'] = null !== $this->testArchitect ? $this->testArchitect->toMap() : null;
        }
        if (null !== $this->backupTestArchitects) {
            $res['backup_test_architects'] = [];
            if (null !== $this->backupTestArchitects && \is_array($this->backupTestArchitects)) {
                $n = 0;
                foreach ($this->backupTestArchitects as $item) {
                    $res['backup_test_architects'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppOwner
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['dev_owner'])) {
            $model->devOwner = UserInfo::fromMap($map['dev_owner']);
        }
        if (isset($map['backup_dev_owners'])) {
            if (!empty($map['backup_dev_owners'])) {
                $model->backupDevOwners = [];
                $n                      = 0;
                foreach ($map['backup_dev_owners'] as $item) {
                    $model->backupDevOwners[$n++] = null !== $item ? UserInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['test_owner'])) {
            $model->testOwner = UserInfo::fromMap($map['test_owner']);
        }
        if (isset($map['backup_test_owners'])) {
            if (!empty($map['backup_test_owners'])) {
                $model->backupTestOwners = [];
                $n                       = 0;
                foreach ($map['backup_test_owners'] as $item) {
                    $model->backupTestOwners[$n++] = null !== $item ? UserInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['ops'])) {
            $model->ops = UserInfo::fromMap($map['ops']);
        }
        if (isset($map['backup_opses'])) {
            if (!empty($map['backup_opses'])) {
                $model->backupOpses = [];
                $n                  = 0;
                foreach ($map['backup_opses'] as $item) {
                    $model->backupOpses[$n++] = null !== $item ? UserInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['dev_architect'])) {
            $model->devArchitect = UserInfo::fromMap($map['dev_architect']);
        }
        if (isset($map['backup_dev_architects'])) {
            if (!empty($map['backup_dev_architects'])) {
                $model->backupDevArchitects = [];
                $n                          = 0;
                foreach ($map['backup_dev_architects'] as $item) {
                    $model->backupDevArchitects[$n++] = null !== $item ? UserInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['test_architect'])) {
            $model->testArchitect = UserInfo::fromMap($map['test_architect']);
        }
        if (isset($map['backup_test_architects'])) {
            if (!empty($map['backup_test_architects'])) {
                $model->backupTestArchitects = [];
                $n                           = 0;
                foreach ($map['backup_test_architects'] as $item) {
                    $model->backupTestArchitects[$n++] = null !== $item ? UserInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
