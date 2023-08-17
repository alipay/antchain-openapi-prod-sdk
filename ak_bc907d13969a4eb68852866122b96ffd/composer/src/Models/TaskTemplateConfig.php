<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_bc907d13969a4eb68852866122b96ffd\Models;

use AlibabaCloud\Tea\Model;

class TaskTemplateConfig extends Model
{
    // templateoptionmap
    /**
     * @example templateoptionmap
     *
     * @var TemplateOptionMap
     */
    public $templateoptionmap;
    protected $_name = [
        'templateoptionmap' => 'templateoptionmap',
    ];

    public function validate()
    {
        Model::validateRequired('templateoptionmap', $this->templateoptionmap, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->templateoptionmap) {
            $res['templateoptionmap'] = null !== $this->templateoptionmap ? $this->templateoptionmap->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TaskTemplateConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['templateoptionmap'])) {
            $model->templateoptionmap = TemplateOptionMap::fromMap($map['templateoptionmap']);
        }

        return $model;
    }
}
