<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class UpdateDiskStrategyRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // delete_with_computer
    /**
     * @var bool
     */
    public $deleteWithComputer;

    // delete_auto_snapshot
    /**
     * @var bool
     */
    public $deleteAutoSnapshot;

    // enable_auto_snapshot
    /**
     * @var bool
     */
    public $enableAutoSnapshot;

    // ids
    /**
     * @var string[]
     */
    public $ids;
    protected $_name = [
        'authToken'          => 'auth_token',
        'deleteWithComputer' => 'delete_with_computer',
        'deleteAutoSnapshot' => 'delete_auto_snapshot',
        'enableAutoSnapshot' => 'enable_auto_snapshot',
        'ids'                => 'ids',
    ];

    public function validate()
    {
        Model::validateRequired('ids', $this->ids, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->deleteWithComputer) {
            $res['delete_with_computer'] = $this->deleteWithComputer;
        }
        if (null !== $this->deleteAutoSnapshot) {
            $res['delete_auto_snapshot'] = $this->deleteAutoSnapshot;
        }
        if (null !== $this->enableAutoSnapshot) {
            $res['enable_auto_snapshot'] = $this->enableAutoSnapshot;
        }
        if (null !== $this->ids) {
            $res['ids'] = $this->ids;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateDiskStrategyRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['delete_with_computer'])) {
            $model->deleteWithComputer = $map['delete_with_computer'];
        }
        if (isset($map['delete_auto_snapshot'])) {
            $model->deleteAutoSnapshot = $map['delete_auto_snapshot'];
        }
        if (isset($map['enable_auto_snapshot'])) {
            $model->enableAutoSnapshot = $map['enable_auto_snapshot'];
        }
        if (isset($map['ids'])) {
            if (!empty($map['ids'])) {
                $model->ids = $map['ids'];
            }
        }

        return $model;
    }
}
