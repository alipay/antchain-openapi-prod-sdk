<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SP\Models;

use AlibabaCloud\Tea\Model;

class ApiChange extends Model
{
    // 变更类型，ADD-新增，DELETE-删除
    /**
     * @example ADD
     *
     * @var string
     */
    public $changeType;

    // API名称列表
    /**
     * @example
     *
     * @var string[]
     */
    public $apiNames;
    protected $_name = [
        'changeType' => 'change_type',
        'apiNames'   => 'api_names',
    ];

    public function validate()
    {
        Model::validateRequired('changeType', $this->changeType, true);
        Model::validateRequired('apiNames', $this->apiNames, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->changeType) {
            $res['change_type'] = $this->changeType;
        }
        if (null !== $this->apiNames) {
            $res['api_names'] = $this->apiNames;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiChange
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['change_type'])) {
            $model->changeType = $map['change_type'];
        }
        if (isset($map['api_names'])) {
            if (!empty($map['api_names'])) {
                $model->apiNames = $map['api_names'];
            }
        }

        return $model;
    }
}
