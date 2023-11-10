<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ActionParamInfo extends Model
{
    // 触达媒介类型
    /**
     * @example ROBOT_CALL
     *
     * @var string
     */
    public $contentType;

    // 触达媒介参数列表
    /**
     * @example ["a","b"]
     *
     * @var string[]
     */
    public $actionParam;
    protected $_name = [
        'contentType' => 'content_type',
        'actionParam' => 'action_param',
    ];

    public function validate()
    {
        Model::validateRequired('contentType', $this->contentType, true);
        Model::validateRequired('actionParam', $this->actionParam, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->contentType) {
            $res['content_type'] = $this->contentType;
        }
        if (null !== $this->actionParam) {
            $res['action_param'] = $this->actionParam;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ActionParamInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['content_type'])) {
            $model->contentType = $map['content_type'];
        }
        if (isset($map['action_param'])) {
            if (!empty($map['action_param'])) {
                $model->actionParam = $map['action_param'];
            }
        }

        return $model;
    }
}
