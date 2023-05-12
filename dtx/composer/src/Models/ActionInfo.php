<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class ActionInfo extends Model
{
    // action_mode
    /**
     * @example TCC
     *
     * @var string
     */
    public $actionMode;

    // action_name
    /**
     * @example action_name
     *
     * @var string
     */
    public $actionName;

    // app_name
    /**
     * @example app_name
     *
     * @var string
     */
    public $appName;

    // commit
    /**
     * @example commit
     *
     * @var string
     */
    public $commit;

    // rollback
    /**
     * @example rollback
     *
     * @var string
     */
    public $rollback;

    // ws_tr
    /**
     * @example ws_tr
     *
     * @var string
     */
    public $wsTr;
    protected $_name = [
        'actionMode' => 'action_mode',
        'actionName' => 'action_name',
        'appName'    => 'app_name',
        'commit'     => 'commit',
        'rollback'   => 'rollback',
        'wsTr'       => 'ws_tr',
    ];

    public function validate()
    {
        Model::validateRequired('actionName', $this->actionName, true);
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('commit', $this->commit, true);
        Model::validateRequired('rollback', $this->rollback, true);
        Model::validateRequired('wsTr', $this->wsTr, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->actionMode) {
            $res['action_mode'] = $this->actionMode;
        }
        if (null !== $this->actionName) {
            $res['action_name'] = $this->actionName;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->commit) {
            $res['commit'] = $this->commit;
        }
        if (null !== $this->rollback) {
            $res['rollback'] = $this->rollback;
        }
        if (null !== $this->wsTr) {
            $res['ws_tr'] = $this->wsTr;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ActionInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['action_mode'])) {
            $model->actionMode = $map['action_mode'];
        }
        if (isset($map['action_name'])) {
            $model->actionName = $map['action_name'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['commit'])) {
            $model->commit = $map['commit'];
        }
        if (isset($map['rollback'])) {
            $model->rollback = $map['rollback'];
        }
        if (isset($map['ws_tr'])) {
            $model->wsTr = $map['ws_tr'];
        }

        return $model;
    }
}
