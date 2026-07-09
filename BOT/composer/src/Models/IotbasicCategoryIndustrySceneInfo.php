<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class IotbasicCategoryIndustrySceneInfo extends Model
{
    // 行业
    /**
     * @example 工业
     *
     * @var string
     */
    public $industry;

    // 场景
    /**
     * @example 智能工业
     *
     * @var string
     */
    public $scene;
    protected $_name = [
        'industry' => 'industry',
        'scene'    => 'scene',
    ];

    public function validate()
    {
        Model::validateRequired('industry', $this->industry, true);
        Model::validateRequired('scene', $this->scene, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->industry) {
            $res['industry'] = $this->industry;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IotbasicCategoryIndustrySceneInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['industry'])) {
            $model->industry = $map['industry'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }

        return $model;
    }
}
