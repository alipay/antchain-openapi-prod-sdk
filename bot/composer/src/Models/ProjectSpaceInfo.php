<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ProjectSpaceInfo extends Model
{
    // 项目名称
    /**
     * @example 温控节能
     *
     * @var string
     */
    public $projectName;

    // 项目编码
    /**
     * @example TEMP_CONTROL
     *
     * @var string
     */
    public $projectCode;

    // 项目描述
    /**
     * @example 这是描述
     *
     * @var string
     */
    public $projectDesc;
    protected $_name = [
        'projectName' => 'project_name',
        'projectCode' => 'project_code',
        'projectDesc' => 'project_desc',
    ];

    public function validate()
    {
        Model::validateRequired('projectName', $this->projectName, true);
        Model::validateRequired('projectCode', $this->projectCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->projectName) {
            $res['project_name'] = $this->projectName;
        }
        if (null !== $this->projectCode) {
            $res['project_code'] = $this->projectCode;
        }
        if (null !== $this->projectDesc) {
            $res['project_desc'] = $this->projectDesc;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProjectSpaceInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['project_name'])) {
            $model->projectName = $map['project_name'];
        }
        if (isset($map['project_code'])) {
            $model->projectCode = $map['project_code'];
        }
        if (isset($map['project_desc'])) {
            $model->projectDesc = $map['project_desc'];
        }

        return $model;
    }
}
