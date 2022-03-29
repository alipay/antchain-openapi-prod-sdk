<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class AlarmTypeStatsVO extends Model
{
    // custom_plugin
    /**
     * @example custom_plugin
     *
     * @var int
     */
    public $customPlugin;

    // meta_group
    /**
     * @example meta_group
     *
     * @var int
     */
    public $metaGroup;

    // stack_universal_table
    /**
     * @example stack_universal_table
     *
     * @var int
     */
    public $stackUniversalTable;
    protected $_name = [
        'customPlugin'        => 'custom_plugin',
        'metaGroup'           => 'meta_group',
        'stackUniversalTable' => 'stack_universal_table',
    ];

    public function validate()
    {
        Model::validateRequired('customPlugin', $this->customPlugin, true);
        Model::validateRequired('metaGroup', $this->metaGroup, true);
        Model::validateRequired('stackUniversalTable', $this->stackUniversalTable, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->customPlugin) {
            $res['custom_plugin'] = $this->customPlugin;
        }
        if (null !== $this->metaGroup) {
            $res['meta_group'] = $this->metaGroup;
        }
        if (null !== $this->stackUniversalTable) {
            $res['stack_universal_table'] = $this->stackUniversalTable;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AlarmTypeStatsVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['custom_plugin'])) {
            $model->customPlugin = $map['custom_plugin'];
        }
        if (isset($map['meta_group'])) {
            $model->metaGroup = $map['meta_group'];
        }
        if (isset($map['stack_universal_table'])) {
            $model->stackUniversalTable = $map['stack_universal_table'];
        }

        return $model;
    }
}
