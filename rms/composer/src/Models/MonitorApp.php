<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class MonitorApp extends Model
{
    // 应用 ID
    /**
     * @example 1000305
     *
     * @var int
     */
    public $id;

    // 应用展示名称
    /**
     * @example rmstest
     *
     * @var string
     */
    public $displayName;

    // 来源
    /**
     * @example uniMeta
     *
     * @var string
     */
    public $sourceFrom;

    // 应用描述
    /**
     * @example description of the app
     *
     * @var string
     */
    public $description;

    // 拼接好的stack_universal_table_id
    /**
     * @example sofacloud*sofa_app*1*1*apconsole
     *
     * @var string
     */
    public $stackUniversalTableId;
    protected $_name = [
        'id'                    => 'id',
        'displayName'           => 'display_name',
        'sourceFrom'            => 'source_from',
        'description'           => 'description',
        'stackUniversalTableId' => 'stack_universal_table_id',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('displayName', $this->displayName, true);
        Model::validateRequired('sourceFrom', $this->sourceFrom, true);
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
        if (null !== $this->sourceFrom) {
            $res['source_from'] = $this->sourceFrom;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->stackUniversalTableId) {
            $res['stack_universal_table_id'] = $this->stackUniversalTableId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MonitorApp
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
        if (isset($map['source_from'])) {
            $model->sourceFrom = $map['source_from'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['stack_universal_table_id'])) {
            $model->stackUniversalTableId = $map['stack_universal_table_id'];
        }

        return $model;
    }
}
