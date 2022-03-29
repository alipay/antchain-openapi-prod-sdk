<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class ModelTreeNode extends Model
{
    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // id
    /**
     * @example id
     *
     * @var int
     */
    public $id;

    // plugin_name
    /**
     * @example plugin_name
     *
     * @var string
     */
    public $pluginName;

    // type
    /**
     * @example type
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'name'       => 'name',
        'id'         => 'id',
        'pluginName' => 'plugin_name',
        'type'       => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('pluginName', $this->pluginName, true);
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->pluginName) {
            $res['plugin_name'] = $this->pluginName;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ModelTreeNode
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['plugin_name'])) {
            $model->pluginName = $map['plugin_name'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
