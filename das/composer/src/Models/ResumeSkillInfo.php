<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class ResumeSkillInfo extends Model
{
    // 技能标签名字
    /**
     * @example 技能标签名字
     *
     * @var string
     */
    public $skillName;
    protected $_name = [
        'skillName' => 'skill_name',
    ];

    public function validate()
    {
        Model::validateMaxLength('skillName', $this->skillName, 128);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->skillName) {
            $res['skill_name'] = $this->skillName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ResumeSkillInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['skill_name'])) {
            $model->skillName = $map['skill_name'];
        }

        return $model;
    }
}
