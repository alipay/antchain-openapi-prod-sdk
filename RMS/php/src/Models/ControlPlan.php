<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class ControlPlan extends Model {
    protected $_name = [
        'actionId' => 'action_id',
        'name' => 'name',
        'pluginType' => 'plugin_type',
        'pluginId' => 'plugin_id',
        'fileId' => 'file_id',
        'dsName' => 'ds_name',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->actionId) {
            $res['action_id'] = $this->actionId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->pluginType) {
            $res['plugin_type'] = $this->pluginType;
        }
        if (null !== $this->pluginId) {
            $res['plugin_id'] = $this->pluginId;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->dsName) {
            $res['ds_name'] = $this->dsName;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ControlPlan
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['action_id'])){
            $model->actionId = $map['action_id'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['plugin_type'])){
            $model->pluginType = $map['plugin_type'];
        }
        if(isset($map['plugin_id'])){
            $model->pluginId = $map['plugin_id'];
        }
        if(isset($map['file_id'])){
            $model->fileId = $map['file_id'];
        }
        if(isset($map['ds_name'])){
            $model->dsName = $map['ds_name'];
        }
        return $model;
    }
    // action_id
    /**
     * @example action_id
     * @var int
     */
    public $actionId;

    // name
    /**
     * @example name
     * @var string
     */
    public $name;

    // plugin_type
    /**
     * @example plugin_type
     * @var string
     */
    public $pluginType;

    // plugin_id
    /**
     * @example plugin_id
     * @var string
     */
    public $pluginId;

    // file_id
    /**
     * @example file_id
     * @var int
     */
    public $fileId;

    // ds_name
    /**
     * @example ds_name
     * @var string
     */
    public $dsName;

}
