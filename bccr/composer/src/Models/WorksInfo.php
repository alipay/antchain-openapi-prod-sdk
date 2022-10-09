<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class WorksInfo extends Model
{
    // 作品名称
    /**
     * @example 我的作品
     *
     * @var string
     */
    public $worksName;

    // 作品类型
    /**
     * @example 视频
     *
     * @var string
     */
    public $worksType;

    // 作品类型英文标识
    /**
     * @example MODEL
     *
     * @var string
     */
    public $worksTypeEn;
    protected $_name = [
        'worksName'   => 'works_name',
        'worksType'   => 'works_type',
        'worksTypeEn' => 'works_type_en',
    ];

    public function validate()
    {
        Model::validateRequired('worksName', $this->worksName, true);
        Model::validateRequired('worksType', $this->worksType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->worksName) {
            $res['works_name'] = $this->worksName;
        }
        if (null !== $this->worksType) {
            $res['works_type'] = $this->worksType;
        }
        if (null !== $this->worksTypeEn) {
            $res['works_type_en'] = $this->worksTypeEn;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return WorksInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['works_name'])) {
            $model->worksName = $map['works_name'];
        }
        if (isset($map['works_type'])) {
            $model->worksType = $map['works_type'];
        }
        if (isset($map['works_type_en'])) {
            $model->worksTypeEn = $map['works_type_en'];
        }

        return $model;
    }
}
